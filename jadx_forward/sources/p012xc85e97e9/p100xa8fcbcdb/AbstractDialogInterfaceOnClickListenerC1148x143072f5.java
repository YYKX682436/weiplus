package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.PreferenceDialogFragmentCompat */
/* loaded from: classes13.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC1148x143072f5 extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063 f93300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f93301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f93302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f93303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f93304h;

    /* renamed from: i, reason: collision with root package name */
    public int f93305i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f93306m;

    /* renamed from: n, reason: collision with root package name */
    public int f93307n;

    public p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063 l0() {
        if (this.f93300d == null) {
            this.f93300d = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063) ((p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd) ((p012xc85e97e9.p100xa8fcbcdb.e) m7470x2d5563f7())).j0(m7436x8619eaa0().getString("key"));
        }
        return this.f93300d;
    }

    public void m0(android.view.View view) {
        int i17;
        android.view.View findViewById = view.findViewById(android.R.id.message);
        if (findViewById != null) {
            java.lang.CharSequence charSequence = this.f93304h;
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
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "androidx/preference/PreferenceDialogFragmentCompat", "onBindDialogView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "androidx/preference/PreferenceDialogFragmentCompat", "onBindDialogView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public abstract void n0(boolean z17);

    public void o0(p012xc85e97e9.p016x746ad0e3.app.l lVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f93307n = i17;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        p012xc85e97e9.p093xedfae76a.m1 m7470x2d5563f7 = m7470x2d5563f7();
        if (!(m7470x2d5563f7 instanceof p012xc85e97e9.p100xa8fcbcdb.e)) {
            throw new java.lang.IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        p012xc85e97e9.p100xa8fcbcdb.e eVar = (p012xc85e97e9.p100xa8fcbcdb.e) m7470x2d5563f7;
        java.lang.String string = m7436x8619eaa0().getString("key");
        if (bundle != null) {
            this.f93301e = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f93302f = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f93303g = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f93304h = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f93305i = bundle.getInt("PreferenceDialogFragment.layout", 0);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f93306m = new android.graphics.drawable.BitmapDrawable(m7460x893a2f6f(), bitmap);
                return;
            }
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063 abstractC1138x57e6e063 = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063) ((p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd) eVar).j0(string);
        this.f93300d = abstractC1138x57e6e063;
        this.f93301e = abstractC1138x57e6e063.R;
        this.f93302f = abstractC1138x57e6e063.U;
        this.f93303g = abstractC1138x57e6e063.V;
        this.f93304h = abstractC1138x57e6e063.S;
        this.f93305i = abstractC1138x57e6e063.W;
        android.graphics.drawable.Drawable drawable = abstractC1138x57e6e063.T;
        if (drawable == null || (drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            this.f93306m = (android.graphics.drawable.BitmapDrawable) drawable;
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        this.f93306m = new android.graphics.drawable.BitmapDrawable(m7460x893a2f6f(), createBitmap);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: onCreateDialog */
    public android.app.Dialog mo2553xb69168e3(android.os.Bundle bundle) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        this.f93307n = -2;
        p012xc85e97e9.p016x746ad0e3.app.l lVar = new p012xc85e97e9.p016x746ad0e3.app.l(mo7430x19263085);
        java.lang.CharSequence charSequence = this.f93301e;
        p012xc85e97e9.p016x746ad0e3.app.h hVar = lVar.f90726a;
        hVar.f90665d = charSequence;
        hVar.f90664c = this.f93306m;
        hVar.f90668g = this.f93302f;
        hVar.f90669h = this;
        hVar.f90670i = this.f93303g;
        hVar.f90671j = this;
        int i17 = this.f93305i;
        android.view.View inflate = i17 != 0 ? android.view.LayoutInflater.from(mo7430x19263085).inflate(i17, (android.view.ViewGroup) null) : null;
        if (inflate != null) {
            m0(inflate);
            hVar.f90677p = inflate;
        } else {
            hVar.f90667f = this.f93304h;
        }
        o0(lVar);
        p012xc85e97e9.p016x746ad0e3.app.m a17 = lVar.a();
        if (this instanceof p012xc85e97e9.p100xa8fcbcdb.C1141x49ca7f2c) {
            a17.getWindow().setSoftInputMode(5);
        }
        return a17;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        n0(this.f93307n == -1);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onSaveInstanceState */
    public void mo7404xa71a2260(android.os.Bundle bundle) {
        super.mo7404xa71a2260(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f93301e);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f93302f);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f93303g);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f93304h);
        bundle.putInt("PreferenceDialogFragment.layout", this.f93305i);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f93306m;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
