package kw4;

/* loaded from: classes8.dex */
public class z extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394743h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lw4.a f394744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f394745j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f394746k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17, lw4.a aVar, boolean z17) {
        super(j17, bool);
        this.f394746k = c0Var;
        this.f394743h = i17;
        this.f394744i = aVar;
        this.f394745j = z17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        kw4.b0 e17;
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        android.view.ViewGroup c17;
        kw4.c0 c0Var = this.f394746k;
        int i17 = c0Var.f394691d;
        int i18 = this.f394743h;
        boolean z17 = false;
        if (i18 != i17 && (e17 = c0Var.e(i18)) != null && (weakReference = e17.f394679a) != null && (view = (android.view.View) weakReference.get()) != null) {
            c0Var.f394692e = i18;
            int i19 = e17.f394681c;
            android.view.ViewGroup c18 = c0Var.c(i19);
            kw4.b0 e18 = c0Var.e(i19);
            if (e18 != null && (c17 = c0Var.c(e18.f394681c)) != null) {
                android.view.View view2 = (android.view.View) weakReference.get();
                if (view2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    view2.setLayoutParams(layoutParams);
                }
                c0Var.f394692e = e18.f394680b;
                e17 = e18;
                c18 = c17;
            }
            if (c18 != null) {
                view = (android.view.View) e17.f394679a.get();
                c18.addView(c0Var.f394694g, c18.indexOfChild(view));
                c18.removeView(view);
            }
            c0Var.f394693f = new float[]{view.getX(), view.getY(), view.getWidth(), view.getHeight(), e17.f394682d};
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) c0Var.f394696i;
            abstractActivityC19367xd1ae8c74.J9();
            abstractActivityC19367xd1ae8c74.V3 = view;
            android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams(-1, -1);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) abstractActivityC19367xd1ae8c74.getWindow().getDecorView();
            viewGroup.addView(view, layoutParams2);
            view.setX(0.0f);
            view.setY(0.0f);
            if (fp.h.a(19)) {
                viewGroup.setSystemUiVisibility(2);
            } else {
                viewGroup.setSystemUiVisibility(4098);
            }
            abstractActivityC19367xd1ae8c74.getWindow().addFlags(1024);
            if (this.f394745j) {
                abstractActivityC19367xd1ae8c74.setRequestedOrientation(0);
            }
            c0Var.f394691d = i18;
            c0Var.f394695h = this.f394744i;
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
