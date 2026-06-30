package y11;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly11/q;", "Lg75/f0;", "Ly11/g;", "Lj75/b;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class q extends g75.f0<y11.g, j75.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        long j17;
        java.lang.String str;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = ((y11.g) bVar).f540347b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "SendMsgInsertStgPPC: content.size=" + f9Var.j().length() + " , time=" + f9Var.mo78012x3fdd41df() + " ,  pipeline:" + this.f350934a.hashCode());
        try {
            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 255L, 1L, false);
            if (!r26.n0.D(e17.toString(), "UNIQUE constraint failed", false, 2, null)) {
                throw e17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "fallback to insert");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
        } catch (java.lang.IllegalStateException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", e18, "", new java.lang.Object[0]);
            j17 = 0;
        }
        if (j17 != -1) {
            if (((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(j().f523660b)) {
                vg3.v3 v3Var = (vg3.v3) i95.n0.c(vg3.v3.class);
                java.lang.String str2 = j().f523660b;
                java.lang.String r17 = c01.z1.r();
                java.lang.String str3 = j().f523662d;
                java.lang.String Q0 = f9Var.Q0();
                u63.e eVar = (u63.e) v3Var;
                eVar.getClass();
                eVar.Bi(str2, r17, str3, j17, c01.id.e(), Q0);
            }
        }
        if (j().f523668j.f118760b > 0) {
            dh3.c.f314022a.d(f9Var, new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j().f523668j.f118760b, j().f523668j.f118762d));
        } else {
            java.lang.String str4 = j().f523673o;
            if (!(str4 == null || str4.length() == 0) && (str = j().f523673o) != null) {
                dh3.c.f314022a.b(f9Var.Q0(), f9Var, str);
            }
        }
        iz5.a.g(null, j17 != -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendMsgPPC.SendMsgInsertStgPPC", "new msg inserted to db , local id = " + j17);
        return new y11.h(j17);
    }

    public final w11.r1 j() {
        java.lang.Object d17 = h().d("PPCKey_Params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        return (w11.r1) d17;
    }
}
