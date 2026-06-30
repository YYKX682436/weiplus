package tm2;

/* loaded from: classes3.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(tm2.s2 s2Var) {
        super(0);
        this.f502105d = s2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
        tm2.s2 s2Var = this.f502105d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s2Var.f101133b;
        java.lang.String str = ((mm2.c1) s2Var.c(mm2.c1.class)).f410316b5;
        if (str == null && (str = ((mm2.e1) s2Var.c(mm2.e1.class)).f410521r.m75945x2fec8307(22)) == null) {
            str = "";
        }
        int i17 = ((mm2.c1) s2Var.c(mm2.c1.class)).f410321c5;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((h63.g1) s1Var).Di(activityC0065xcd7aa112, str, i17, bool, bool, java.lang.Long.valueOf(((mm2.e1) s2Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
        fm2.b bVar = s2Var.f101134c;
        if (bVar != null) {
            bVar.mo57479x2f73c7d7(false);
        }
        ((mm2.c1) s2Var.c(mm2.c1.class)).O1 = false;
        fm2.b bVar2 = s2Var.f101134c;
        if (bVar2 != null) {
            bVar2.postDelayed(new tm2.p2(s2Var), 200L);
        }
        return jz5.f0.f384359a;
    }
}
