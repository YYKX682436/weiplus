package ju1;

/* loaded from: classes9.dex */
public final class c1 implements vl1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383236a;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76) {
        this.f383236a = activityC13077xb3b83e76;
    }

    @Override // vl1.o
    public final boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383236a;
        ju1.j jVar = activityC13077xb3b83e76.f176959o;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 == null) {
            return false;
        }
        int i18 = x17.f383221a;
        if (i18 != 3 && i18 != 4 && i18 != 5) {
            return false;
        }
        rl5.r rVar = new rl5.r(activityC13077xb3b83e76.mo55332x76847179(), view);
        rVar.f478884u = new ju1.g1(activityC13077xb3b83e76);
        rVar.f478887x = new ju1.h1(activityC13077xb3b83e76, x17, i17);
        android.graphics.Point a17 = lu1.b0.a(view);
        rVar.n(a17.x, a17.y);
        return false;
    }
}
