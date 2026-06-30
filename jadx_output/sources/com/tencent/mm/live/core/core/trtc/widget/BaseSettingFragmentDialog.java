package com.tencent.mm.live.core.core.trtc.widget;

/* loaded from: classes10.dex */
public abstract class BaseSettingFragmentDialog extends androidx.fragment.app.DialogFragment {
    public abstract int getLayoutId();

    @Override // androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(getLayoutId(), viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.view.Window window = getDialog().getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
            window.setAttributes(attributes);
            android.app.Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.getWindow().setLayout((int) (r2.widthPixels * 0.9d), (int) (r2.heightPixels * 0.8d));
            }
        }
    }
}
