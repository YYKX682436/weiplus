package ef0;

/* loaded from: classes.dex */
public final class o2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f333825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(ef0.y2 y2Var) {
        super(0);
        this.f333825d = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int nj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2573x3652ee.C20769x7a4ab5b8());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingEntryConfigService", "tingConfig enableTingDiscoverEntryPlayState: " + nj6);
        return java.lang.Boolean.valueOf(nj6 == 1 && this.f333825d.Vi());
    }
}
