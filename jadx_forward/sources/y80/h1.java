package y80;

/* loaded from: classes8.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f541390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z80.s0 f541392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y80.n1 f541393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23, android.content.Context context, z80.s0 s0Var, y80.n1 n1Var) {
        super(1);
        this.f541390d = c16279x64cea23;
        this.f541391e = context;
        this.f541392f = s0Var;
        this.f541393g = n1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        id5.a aVar = new id5.a();
        o15.b bVar = new o15.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f541390d;
        java.lang.String b17 = va3.w.b(c16279x64cea23);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getLocationContent(...)");
        bVar.m126728xdc93280d(b17);
        aVar.k(bVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(username);
        android.content.Context context = this.f541391e;
        final y80.g1 g1Var = new y80.g1(context, this.f541393g, username, c16279x64cea23);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j(g1Var) { // from class: y80.m1

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yz5.q f541417a;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g1Var, "function");
                this.f541417a = g1Var;
            }

            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
            public final /* synthetic */ void a(boolean z17, java.lang.String str, int i17) {
                this.f541417a.mo147xb9724478(java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i17));
            }
        };
        n13.t tVar = new n13.t();
        tVar.f415666a = jVar;
        ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).Ai(context, aVar, arrayList, tVar);
        yz5.l lVar = this.f541392f.f552207f;
        if (lVar != null) {
            lVar.mo146xb9724478(username);
        }
        return jz5.f0.f384359a;
    }
}
