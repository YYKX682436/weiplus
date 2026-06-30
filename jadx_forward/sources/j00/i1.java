package j00;

/* loaded from: classes9.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.ecs.C23649xe87ad48d f378324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378326f;

    public i1(com.p314xaae8f345.p2845xc516c4b6.ecs.C23649xe87ad48d c23649xe87ad48d, java.lang.String str, j00.k1 k1Var) {
        this.f378324d = c23649xe87ad48d;
        this.f378325e = str;
        this.f378326f = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateEcsGiftMsgStatus, status:");
        com.p314xaae8f345.p2845xc516c4b6.ecs.C23649xe87ad48d c23649xe87ad48d = this.f378324d;
        sb6.append(c23649xe87ad48d.m87644x2fe4f2e8());
        sb6.append(", wording:");
        sb6.append(c23649xe87ad48d.m87647xa6350c90());
        sb6.append(", version:");
        sb6.append(c23649xe87ad48d.m87646x60452cd0());
        sb6.append(", style:");
        sb6.append(c23649xe87ad48d.m87645xa40ecba9());
        sb6.append(", detail wording:");
        sb6.append(c23649xe87ad48d.m87643x7e8e103f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", sb6.toString());
        if (c23649xe87ad48d.m87644x2fe4f2e8() == null || c23649xe87ad48d.m87645xa40ecba9() == null || c23649xe87ad48d.m87646x60452cd0() == null || c23649xe87ad48d.m87647xa6350c90() == null || c23649xe87ad48d.m87643x7e8e103f() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus failed");
            return;
        }
        n00.f a17 = n00.d.f415348a.a();
        java.lang.String str = this.f378325e;
        n00.e y07 = a17.y0(str);
        long j17 = y07.f67884x9a279b8a;
        java.lang.String str2 = y07.f67885x3e123854;
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(str2, j17);
        if (k17 != null) {
            l15.c cVar = new l15.c();
            java.lang.String j18 = k17.j();
            if (j18 == null) {
                j18 = "";
            }
            cVar.m126728xdc93280d(j18);
            v05.b k18 = cVar.k();
            w05.d dVar = k18 != null ? (w05.d) k18.m75936x14adae67(k18.f513848e + 66) : null;
            if (dVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, ecsGiftAppMsgInfo is null");
                return;
            }
            if (dVar.s().size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, gift app msg gift list size is empty");
                return;
            }
            w05.e eVar = (w05.e) dVar.s().get(0);
            java.lang.Long m87644x2fe4f2e8 = c23649xe87ad48d.m87644x2fe4f2e8();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m87644x2fe4f2e8);
            eVar.z(m87644x2fe4f2e8.longValue());
            w05.e eVar2 = (w05.e) dVar.s().get(0);
            java.lang.Long m87646x60452cd0 = c23649xe87ad48d.m87646x60452cd0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m87646x60452cd0);
            eVar2.B(m87646x60452cd0.longValue());
            w05.e eVar3 = (w05.e) dVar.s().get(0);
            java.lang.Long m87645xa40ecba9 = c23649xe87ad48d.m87645xa40ecba9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m87645xa40ecba9);
            eVar3.A(m87645xa40ecba9.longValue());
            w05.e eVar4 = (w05.e) dVar.s().get(0);
            java.lang.String m87647xa6350c90 = c23649xe87ad48d.m87647xa6350c90();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m87647xa6350c90);
            eVar4.C(m87647xa6350c90);
            w05.e eVar5 = (w05.e) dVar.s().get(0);
            java.lang.String m87643x7e8e103f = c23649xe87ad48d.m87643x7e8e103f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m87643x7e8e103f);
            eVar5.y(m87643x7e8e103f);
            java.lang.String m126748x696739c = cVar.m126748x696739c(false);
            j00.k1 k1Var = this.f378326f;
            k17.d1(k1Var.hj(k17, m126748x696739c));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, giftMsgId:" + str);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 k19 = e0Var.k(str2, j17);
            if (k19 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, gift app msg gift list size is empty");
                return;
            }
            if (!k1Var.Ni(k19, k17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, update failed");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "updateEcsGiftMsgStatus, update msg by id: " + ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(k17.m124847x74d37ac6(), k17, true));
        }
    }
}
