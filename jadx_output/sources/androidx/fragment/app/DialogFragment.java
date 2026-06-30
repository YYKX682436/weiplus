package androidx.fragment.app;

/* loaded from: classes14.dex */
public class DialogFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private android.app.Dialog mDialog;
    private boolean mDismissed;
    private android.os.Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private java.lang.Runnable mDismissRunnable = new androidx.fragment.app.q(this);
    private android.content.DialogInterface.OnCancelListener mOnCancelListener = new androidx.fragment.app.r(this);
    private android.content.DialogInterface.OnDismissListener mOnDismissListener = new androidx.fragment.app.s(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.k0 mObserver = new androidx.fragment.app.t(this);
    private boolean mDialogCreated = false;

    @Override // androidx.fragment.app.Fragment
    public androidx.fragment.app.s0 createFragmentContainer() {
        return new androidx.fragment.app.u(this, super.createFragmentContainer());
    }

    public void dismiss() {
        j0(false, false);
    }

    public void dismissAllowingStateLoss() {
        j0(true, false);
    }

    public android.app.Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    public final void j0(boolean z17, boolean z18) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z18) {
                if (android.os.Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            getParentFragmentManager().popBackStack(this.mBackStackId, 1);
            this.mBackStackId = -1;
            return;
        }
        androidx.fragment.app.i2 beginTransaction = getParentFragmentManager().beginTransaction();
        beginTransaction.j(this);
        if (z17) {
            beginTransaction.e();
        } else {
            beginTransaction.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new android.os.Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        return new android.app.Dialog(requireContext(), getTheme());
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        j0(true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public android.view.View onFindViewById(int i17) {
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i17);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z17 = this.mShowsDialog;
        if (!z17 || this.mCreatingDialog) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                new java.lang.StringBuilder("getting layout inflater for DialogFragment ").append(this);
            }
            return onGetLayoutInflater;
        }
        if (z17 && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                android.app.Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    android.content.Context context = getContext();
                    if (context instanceof android.app.Activity) {
                        this.mDialog.setOwnerActivity((android.app.Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        android.app.Dialog dialog = this.mDialog;
        return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            android.os.Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i17 = this.mStyle;
        if (i17 != 0) {
            bundle.putInt(SAVED_STYLE, i17);
        }
        int i18 = this.mTheme;
        if (i18 != 0) {
            bundle.putInt(SAVED_THEME, i18);
        }
        boolean z17 = this.mCancelable;
        if (!z17) {
            bundle.putBoolean(SAVED_CANCELABLE, z17);
        }
        boolean z18 = this.mShowsDialog;
        if (!z18) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z18);
        }
        int i19 = this.mBackStackId;
        if (i19 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i19);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            android.view.View decorView = this.mDialog.getWindow().getDecorView();
            decorView.setTag(com.tencent.mm.R.id.p28, this);
            decorView.setTag(com.tencent.mm.R.id.p2_, this);
            o4.j.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final android.app.Dialog requireDialog() {
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new java.lang.IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z17) {
        this.mCancelable = z17;
        android.app.Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z17);
        }
    }

    public void setShowsDialog(boolean z17) {
        this.mShowsDialog = z17;
    }

    public void setStyle(int i17, int i18) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        this.mStyle = i17;
        if (i17 == 2 || i17 == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i18 != 0) {
            this.mTheme = i18;
        }
    }

    public void setupDialog(android.app.Dialog dialog, int i17) {
        if (i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                return;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.h(0, this, str, 1);
        beginTransaction.d();
    }

    public void showNow(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.h(0, this, str, 1);
        beginTransaction.f();
    }

    public int show(androidx.fragment.app.i2 i2Var, java.lang.String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        i2Var.h(0, this, str, 1);
        this.mViewDestroyed = false;
        int p17 = ((androidx.fragment.app.a) i2Var).p(false);
        this.mBackStackId = p17;
        return p17;
    }
}
