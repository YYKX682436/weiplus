package pr;

/* loaded from: classes4.dex */
public final class i implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439249a;

    public i(java.lang.String str, yz5.l lVar) {
        this.f439249a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.v75 v75Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "CgiGetEmotionDetail end: " + i17 + ", " + i18);
        r45.se3 se3Var = (r45.se3) fVar.f152151d;
        if (i17 == 0 && i18 == 0) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().d().z0(this.f439249a, se3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            r45.qj0 qj0Var = se3Var.f467185d;
            if (qj0Var != null && (v75Var = qj0Var.E) != null) {
                int intValue = java.lang.Integer.valueOf(v75Var.f469497d).intValue();
                com.p314xaae8f345.mm.p2621x8fb0427b.e5 a17 = com.p314xaae8f345.mm.p2621x8fb0427b.d5.f275369a.a(intValue);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPack: checkDesigner ");
                sb6.append(intValue);
                sb6.append(' ');
                java.util.LinkedList linkedList = a17.f275391b;
                sb6.append(linkedList.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", sb6.toString());
                if (linkedList.isEmpty()) {
                    new pr.d(intValue, null).b();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
