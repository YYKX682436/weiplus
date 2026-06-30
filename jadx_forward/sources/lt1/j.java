package lt1;

/* loaded from: classes4.dex */
public final class j extends lt1.e {
    @Override // lt1.e
    public int b() {
        return 20;
    }

    @Override // lt1.e
    public int c() {
        return 22246;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.ChatroomAvatarSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/chatroomheadimgsync";
    }

    @Override // lt1.e
    public boolean h() {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableRoomHeadImgSyncAfterAutoAuth", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "isSyncOnAuth called EnableRoomHeadImgSyncAfterAutoAuth:" + z17);
        return z17;
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncItems, "syncItems");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "process() called with: syncItems = " + syncItems.size());
        if (syncItems.isEmpty()) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int size = syncItems.size();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : syncItems) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.lt5 lt5Var = new r45.lt5();
            lt5Var.mo11468x92b714fd(((r45.go5) obj).f456930e.g());
            com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
            r0Var.f152062a = lt5Var.f461353d;
            r0Var.f152065d = lt5Var.f461354e;
            r0Var.f152063b = 3;
            r0Var.f152067f = 0;
            arrayList.add(r0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "process chatroom: " + lt5Var.f461353d + ", avatar: " + lt5Var.f461354e + ", update diff:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " index:" + i17 + " size:" + size);
            i17 = i18;
        }
        Ni.m0(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "process() end called");
    }
}
