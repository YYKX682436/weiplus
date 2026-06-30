package fq0;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.n f346986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fq0.n nVar) {
        super(0);
        this.f346986d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f346986d.getClass();
        d95.b0 b0Var = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "MagicBrushScl.db";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(166680306, fq0.j.f346985a);
        if (!b0Var.S(str, hashMap, true, true)) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("mb scl db init failed");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushSclFeatureService", "[initMbSclDb path=" + str + ']');
        return b0Var;
    }
}
