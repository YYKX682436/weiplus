package sl4;

/* loaded from: classes11.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl4.l f490807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f490808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sl4.l lVar, bw5.jq0 jq0Var) {
        super(0);
        this.f490807d = lVar;
        this.f490808e = jq0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bw5.lp0 b17;
        sl4.a aVar;
        bw5.cp0 b18;
        bw5.lp0 b19;
        sl4.l lVar = this.f490807d;
        if (lVar.f490813g == null) {
            lVar.d();
        }
        bl4.b bVar = lVar.f490814h;
        bw5.o50 o50Var = null;
        bw5.jq0 jq0Var = this.f490808e;
        if (bVar == null) {
            bw5.eq0 eq0Var = lVar.f490810d;
            java.lang.String b27 = (jq0Var == null || (b19 = jq0Var.b()) == null) ? null : b19.b();
            java.lang.String str = b27 == null ? "" : b27;
            int i17 = jq0Var.f110643e;
            java.lang.String m13171x7531c8a2 = jq0Var.b().d().m13171x7531c8a2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13171x7531c8a2, "getTitle(...)");
            java.lang.String f17 = jq0Var.b().d().f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getCover(...)");
            lVar.f490814h = new bl4.b(eq0Var, str, i17, m13171x7531c8a2, f17, null, 32, null);
        } else {
            bw5.eq0 eq0Var2 = lVar.f490810d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eq0Var2, "<set-?>");
            bVar.f103265a = eq0Var2;
            java.lang.String b28 = (jq0Var == null || (b17 = jq0Var.b()) == null) ? null : b17.b();
            bVar.f103266b = b28 != null ? b28 : "";
            bVar.f103267c = jq0Var.f110643e;
            java.lang.String m13171x7531c8a22 = jq0Var.b().d().m13171x7531c8a2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m13171x7531c8a22, "getTitle(...)");
            bVar.f103268d = m13171x7531c8a22;
            java.lang.String f18 = jq0Var.b().d().f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f18, "getCover(...)");
            bVar.f103269e = f18;
        }
        bl4.b bVar2 = lVar.f490814h;
        if (bVar2 != null) {
            bVar2.f103270f = jq0Var.b();
        }
        bl4.b bVar3 = lVar.f490814h;
        if (bVar3 != null) {
            bw5.dr0 c17 = jq0Var.c();
            if (c17 != null && (b18 = c17.b()) != null) {
                o50Var = b18.b();
            }
            bVar3.f103271g = o50Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMinimizeModule", "onViewInfoUpdate info: " + lVar.f490814h);
        sl4.a aVar2 = lVar.f490813g;
        if (aVar2 != null) {
            bl4.b bVar4 = lVar.f490814h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar4);
            aVar2.c(bVar4);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f490815i, java.lang.Boolean.TRUE) && jq0Var.f110643e == 1 && (aVar = lVar.f490813g) != null) {
            ((sl4.g) aVar).e0();
        }
        return jz5.f0.f384359a;
    }
}
