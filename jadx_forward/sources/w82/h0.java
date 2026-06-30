package w82;

/* loaded from: classes3.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f525404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.b7 f525405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w82.m0 f525406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rl5.r f525407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 f525408h;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5, java.util.List list, db5.b7 b7Var, w82.m0 m0Var, rl5.r rVar) {
        this.f525408h = c13623x735f56a5;
        this.f525404d = list;
        this.f525405e = b7Var;
        this.f525406f = m0Var;
        this.f525407g = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        o72.z4 uj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
        final db5.b7 b7Var = this.f525405e;
        final w82.m0 m0Var = this.f525406f;
        final rl5.r rVar = this.f525407g;
        yz5.l lVar = new yz5.l() { // from class: w82.h0$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                final w82.h0 h0Var = w82.h0.this;
                h0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagPanel", "delete tag result = " + bool);
                if (bool.booleanValue()) {
                    final db5.b7 b7Var2 = b7Var;
                    final w82.m0 m0Var2 = m0Var;
                    final rl5.r rVar2 = rVar;
                    ik1.h0.b(new java.lang.Runnable() { // from class: w82.h0$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            w82.h0 h0Var2 = w82.h0.this;
                            h0Var2.getClass();
                            db5.b7 b7Var3 = b7Var2;
                            h0Var2.f525408h.removeView(b7Var3.f309829b);
                            m0Var2.b(b7Var3.f309828a);
                            rVar2.a();
                        }
                    });
                }
                jx3.f.INSTANCE.d(29434, 6);
                return null;
            }
        };
        t72.l lVar2 = (t72.l) uj6;
        java.util.List list = this.f525404d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        v65.i.b(lVar2.Y6(), null, new t72.f(lVar2, list, lVar, null), 1, null);
    }
}
