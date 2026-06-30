package dl1;

/* loaded from: classes8.dex */
public class f extends dl1.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f316710a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f316711b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f316712c;

    /* renamed from: d, reason: collision with root package name */
    public dl1.a f316713d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f316714e;

    /* renamed from: f, reason: collision with root package name */
    public final dl1.g f316715f;

    /* renamed from: g, reason: collision with root package name */
    public int f316716g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f316717h = 0;

    public f(android.widget.FrameLayout frameLayout, java.util.List list, dl1.g gVar) {
        this.f316710a = frameLayout;
        this.f316712c = list;
        this.f316715f = gVar;
    }

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, float f17, float f18, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, float f19, float f27) {
        if (view == null) {
            return;
        }
        view.setTranslationX(view.getTranslationX() - f17);
        view.setTranslationY(view.getTranslationY() - f18);
        dl1.a aVar = this.f316713d;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = ((cl1.h) aVar).f124404a;
            if (c12766x2cdb734f.H != null) {
                view.getGlobalVisibleRect(c12766x2cdb734f.M);
                c12766x2cdb734f.H.a(f19, f27);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r19, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r20, int r21, boolean r22, boolean r23, java.lang.Runnable r24) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl1.f.b(androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.k3, int, boolean, boolean, java.lang.Runnable):void");
    }

    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2, int i17, int i18) {
        dl1.a aVar = this.f316713d;
        if (aVar == null) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = ((cl1.h) aVar).f124404a;
        if (c12766x2cdb734f.I != null) {
            if (c12766x2cdb734f.K) {
                if (k3Var2.m8185xcdaf1228() == 2 || k3Var2.m8185xcdaf1228() == 5) {
                    return true;
                }
                ((rh4.f0) c12766x2cdb734f.I).getClass();
                if (c1163xf1deaba4.getId() == com.p314xaae8f345.mm.R.id.f568765nz0) {
                    return true;
                }
            }
        } else if (c12766x2cdb734f.K && (k3Var2.m8185xcdaf1228() == 2 || k3Var2.m8185xcdaf1228() == 5)) {
            return true;
        }
        return false;
    }
}
