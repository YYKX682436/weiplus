package ju1;

/* loaded from: classes9.dex */
public final class x implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383334a;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1) {
        this.f383334a = activityC13076xc17cada1;
    }

    @Override // vl1.o
    public final boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1 = this.f383334a;
        ju1.j jVar = activityC13076xc17cada1.f176952p;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCardsCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 == null) {
            return false;
        }
        int i18 = x17.f383221a;
        if (i18 != 1 && i18 != 2) {
            return false;
        }
        rl5.r rVar = new rl5.r(activityC13076xc17cada1.mo55332x76847179(), view);
        rVar.f478884u = new ju1.z(activityC13076xc17cada1);
        rVar.f478887x = new ju1.a0(activityC13076xc17cada1, x17);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 3, 3);
        return false;
    }
}
