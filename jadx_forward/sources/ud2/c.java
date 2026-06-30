package ud2;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.d f508121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f508122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ud2.d dVar, yz5.p pVar) {
        super(0);
        this.f508121d = dVar;
        this.f508122e = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ud2.c0 c0Var = this.f508121d.f508145c;
        c0Var.getClass();
        yz5.p onPlayEventCallback = this.f508122e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPlayEventCallback, "onPlayEventCallback");
        java.lang.String str = c0Var.f508128f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, c0Var + " init");
        c0Var.f508142t = onPlayEventCallback;
        c0Var.f508136n = true;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c0Var.f508124b;
        if (c19792x256d2725 != null) {
            c0Var.f508129g = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec, c19792x256d2725, 0, 2, null);
            c0Var.d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "finderObject is null!");
        }
        return jz5.f0.f384359a;
    }
}
