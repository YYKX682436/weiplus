package ek5;

/* loaded from: classes9.dex */
public final class f extends ek5.c {
    @Override // ek5.b
    public android.content.Intent c(android.content.Context context, int i17, java.lang.String content, android.content.Intent retransmitIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retransmitIntent, "retransmitIntent");
        if (i17 == 8) {
            com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(content);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277891a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ForwardCardConfig", "getView : parse possible friend msg failed");
            }
            int i18 = D3.f277907q;
            java.util.Set set = c01.e2.f118650a;
            boolean D32 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.D3(i18);
            long longExtra = retransmitIntent.getLongExtra("Retr_Msg_Id", -1L);
            if (!D32 && longExtra > 0) {
                android.content.Intent Ri = ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).Ri(context);
                Ri.putExtra("Select_Conv_Type", 7);
                return Ri;
            }
        }
        return super.c(context, i17, content, retransmitIntent);
    }

    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        pb5.a aVar = new pb5.a();
        param.a(aVar);
        java.lang.String stringExtra = intent.getStringExtra("Select_Talker_Name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.n(stringExtra);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(param.d())) {
            m15.a aVar2 = new m15.a();
            aVar2.m126728xdc93280d(param.d());
            aVar.l(aVar2);
        }
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return k50.g.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return l50.g.class;
    }

    @Override // ek5.b
    public int g() {
        return 42;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return pb5.a.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(8);
    }

    @Override // ek5.b
    public void k(android.content.Intent retransmitIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retransmitIntent, "retransmitIntent");
        if (retransmitIntent.getBooleanExtra("Select_Send_Card", false)) {
            retransmitIntent.putExtra("Retr_Msg_Type", 8);
        }
    }
}
