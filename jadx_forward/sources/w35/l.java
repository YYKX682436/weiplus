package w35;

/* loaded from: classes8.dex */
public final class l extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params, w35.a aVar) {
        super(params, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f524273e = "MicroMsg.OpenWayControllerDevice";
    }

    @Override // w35.b
    public void a() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = this.f524256a;
        if (g2Var.f270845e > 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("msgId", g2Var.f270845e);
                bundle.putString("msgTalker", g2Var.f270846f);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, w35.h.class, new w35.k(this));
                return;
            }
            java.util.ArrayList<com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2> wi6 = ((gb0.i) ((j30.m) i95.n0.c(j30.m.class))).wi(g2Var.f270845e, g2Var.f270846f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 : wi6) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
                wVar.f272549f = c10597xb1f0d2;
                arrayList.add(wVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f524273e, "get device open way count: " + arrayList.size());
            w35.a aVar = this.f524257b;
            if (aVar != null) {
                aVar.a(arrayList);
            }
        }
    }

    @Override // w35.b
    public void b(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        w35.a aVar = this.f524257b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a.a(info.b(), this.f524258c);
        boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = this.f524256a;
        if (n17) {
            ((gb0.i) ((j30.m) i95.n0.c(j30.m.class))).Bi(context, g2Var.f270845e, g2Var.f270846f, info.f272549f);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("msgId", g2Var.f270845e);
            bundle.putString("msgTalker", g2Var.f270846f);
            bundle.putParcelable("deviceInfo", info.f272549f);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, w35.i.class, null);
        }
    }
}
