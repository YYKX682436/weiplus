package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.uic.z f67382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.feature.openmsg.uic.z zVar) {
        super(1);
        this.f67382d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nm5.b wi6;
        com.tencent.mm.plugin.appbrand.service.k5 k5Var;
        hb0.a state = (hb0.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof eb0.c)) {
            com.tencent.mm.storage.f9 f9Var = ((eb0.c) dVar).f250705b;
            if (f9Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgByOtherAppUIC", "msgInfo is null, return");
            } else if (f9Var.n2() && (wi6 = ((ud5.e) ((fb0.i) i95.n0.c(fb0.i.class))).wi(f9Var)) != null) {
                java.lang.String str = (java.lang.String) wi6.a(0);
                java.lang.String str2 = (java.lang.String) wi6.a(1);
                if (!com.tencent.mm.sdk.platformtools.t8.G0(str2)) {
                    com.tencent.mm.feature.openmsg.uic.z zVar = this.f67382d;
                    em.a aVar = (em.a) ((jz5.n) zVar.f67384d).getValue();
                    if (aVar.f254038c == null) {
                        aVar.f254038c = (android.widget.LinearLayout) aVar.f254036a.findViewById(com.tencent.mm.R.id.unt);
                    }
                    aVar.f254038c.setVisibility(0);
                    if (zVar.f67385e == null && (k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class)) != null) {
                        zVar.f67385e = ((zh1.p) k5Var).Ui(state.f280020p, state.f280018n, null, state.f280019o);
                    }
                    zh1.w0 w0Var = zVar.f67385e;
                    if (w0Var != null) {
                        ((di1.f) w0Var).i(3L, null, null, 0L);
                    }
                    em.a aVar2 = (em.a) ((jz5.n) zVar.f67384d).getValue();
                    if (aVar2.f254038c == null) {
                        aVar2.f254038c = (android.widget.LinearLayout) aVar2.f254036a.findViewById(com.tencent.mm.R.id.unt);
                    }
                    aVar2.f254038c.setOnClickListener(new com.tencent.mm.feature.openmsg.uic.w(zVar, str, str2));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
