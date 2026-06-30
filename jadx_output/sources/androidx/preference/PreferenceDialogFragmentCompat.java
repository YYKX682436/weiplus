package androidx.preference;

/* loaded from: classes13.dex */
public abstract class PreferenceDialogFragmentCompat extends androidx.fragment.app.DialogFragment implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public androidx.preference.DialogPreference f11767d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f11768e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f11769f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f11770g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f11771h;

    /* renamed from: i, reason: collision with root package name */
    public int f11772i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f11773m;

    /* renamed from: n, reason: collision with root package name */
    public int f11774n;

    public androidx.preference.DialogPreference l0() {
        if (this.f11767d == null) {
            this.f11767d = (androidx.preference.DialogPreference) ((androidx.preference.PreferenceFragmentCompat) ((androidx.preference.e) getTargetFragment())).j0(getArguments().getString("key"));
        }
        return this.f11767d;
    }

    public void m0(android.view.View view) {
        int i17;
        android.view.View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            java.lang.CharSequence charSequence = this.f11771h;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                i17 = 8;
            } else {
                if (findViewById instanceof android.widget.TextView) {
                    ((android.widget.TextView) findViewById).setText(charSequence);
                }
                i17 = 0;
            }
            if (findViewById.getVisibility() != i17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "androidx/preference/PreferenceDialogFragmentCompat", "onBindDialogView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "androidx/preference/PreferenceDialogFragmentCompat", "onBindDialogView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public abstract void n0(boolean z17);

    public void o0(androidx.appcompat.app.l lVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f11774n = i17;
    }

    @Override // androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.m1 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof androidx.preference.e)) {
            throw new java.lang.IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        androidx.preference.e eVar = (androidx.preference.e) targetFragment;
        java.lang.String string = getArguments().getString("key");
        if (bundle != null) {
            this.f11768e = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f11769f = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f11770g = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f11771h = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f11772i = bundle.getInt("PreferenceDialogFragment.layout", 0);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f11773m = new android.graphics.drawable.BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        androidx.preference.DialogPreference dialogPreference = (androidx.preference.DialogPreference) ((androidx.preference.PreferenceFragmentCompat) eVar).j0(string);
        this.f11767d = dialogPreference;
        this.f11768e = dialogPreference.R;
        this.f11769f = dialogPreference.U;
        this.f11770g = dialogPreference.V;
        this.f11771h = dialogPreference.S;
        this.f11772i = dialogPreference.W;
        android.graphics.drawable.Drawable drawable = dialogPreference.T;
        if (drawable == null || (drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            this.f11773m = (android.graphics.drawable.BitmapDrawable) drawable;
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intrinsicHeight));
        arrayList.add(java.lang.Integer.valueOf(intrinsicWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/preference/PreferenceDialogFragmentCompat", "onCreate", "(Landroid/os/Bundle;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/preference/PreferenceDialogFragmentCompat", "onCreate", "(Landroid/os/Bundle;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f11773m = new android.graphics.drawable.BitmapDrawable(getResources(), createBitmap);
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        this.f11774n = -2;
        androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(activity);
        java.lang.CharSequence charSequence = this.f11768e;
        androidx.appcompat.app.h hVar = lVar.f9193a;
        hVar.f9132d = charSequence;
        hVar.f9131c = this.f11773m;
        hVar.f9135g = this.f11769f;
        hVar.f9136h = this;
        hVar.f9137i = this.f11770g;
        hVar.f9138j = this;
        int i17 = this.f11772i;
        android.view.View inflate = i17 != 0 ? android.view.LayoutInflater.from(activity).inflate(i17, (android.view.ViewGroup) null) : null;
        if (inflate != null) {
            m0(inflate);
            hVar.f9144p = inflate;
        } else {
            hVar.f9134f = this.f11771h;
        }
        o0(lVar);
        androidx.appcompat.app.m a17 = lVar.a();
        if (this instanceof androidx.preference.EditTextPreferenceDialogFragmentCompat) {
            a17.getWindow().setSoftInputMode(5);
        }
        return a17;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        n0(this.f11774n == -1);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f11768e);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f11769f);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f11770g);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f11771h);
        bundle.putInt("PreferenceDialogFragment.layout", this.f11772i);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f11773m;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
