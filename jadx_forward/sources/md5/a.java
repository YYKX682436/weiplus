package md5;

/* loaded from: classes8.dex */
public class a extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public boolean f407412q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f407413r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f407414s;

    public a(android.app.Activity activity) {
        super(activity);
        this.f407412q = false;
        this.f407413r = false;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo2158x12501425() {
        if (al3.a.f87378a.a(4)) {
            return null;
        }
        if (!this.f407412q) {
            if (this.f407413r) {
                return super.mo2158x12501425();
            }
            return null;
        }
        return al3.b.f87382a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir().getAbsolutePath() + "//" + this.f407414s, null);
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        android.view.View mo2159xc2a54588 = super.mo2159xc2a54588();
        if (mo2159xc2a54588 != null) {
            return mo2159xc2a54588;
        }
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }
}
