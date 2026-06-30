package kn;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f391005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.e8 f391006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f391007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dd3 f391008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f391009h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.ya4 f391010i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kn.w f391011m;

    public v(kn.w wVar, java.util.LinkedList linkedList, com.p314xaae8f345.mm.p2621x8fb0427b.e8 e8Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, r45.dd3 dd3Var, java.util.List list, r45.ya4 ya4Var) {
        this.f391011m = wVar;
        this.f391005d = linkedList;
        this.f391006e = e8Var;
        this.f391007f = a3Var;
        this.f391008g = dd3Var;
        this.f391009h = list;
        this.f391010i = ya4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f391005d.size() < 25 ? this.f391005d.size() : 25;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg list size:%d, loopCount:%d", this.f391011m.f391014f, java.lang.Integer.valueOf(this.f391005d.size()), java.lang.Integer.valueOf(size));
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg done loopCount is 0", this.f391011m.f391014f);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            for (int i17 = 0; i17 < size; i17++) {
                android.util.Pair pair = (android.util.Pair) this.f391005d.poll();
                java.lang.Object obj = pair.second;
                if (obj == null || ((int) ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj).E2) != 0) {
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) this.f391006e).p0((java.lang.String) pair.first, (com.p314xaae8f345.mm.p2621x8fb0427b.z3) obj);
                } else {
                    ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Bi(((com.p314xaae8f345.mm.p2621x8fb0427b.z3) pair.second).Q0(), ((com.p314xaae8f345.mm.p2621x8fb0427b.z3) pair.second).G0(), 0);
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) this.f391006e).l0((com.p314xaae8f345.mm.p2621x8fb0427b.z3) pair.second);
                }
            }
            gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg loopCount:%d, take time:%d(ms), img list size:%d", this.f391011m.f391014f, java.lang.Integer.valueOf(size), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.f391005d.size()));
            if (!this.f391005d.isEmpty()) {
                ((ku5.t0) ku5.t0.f394148d).l(this, 100L, "chatroom_member_detail");
                return;
            }
        }
        kn.w wVar = this.f391011m;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f391007f;
        java.lang.String str = wVar.f391014f;
        r45.dd3 dd3Var = this.f391008g;
        kn.w.H(wVar, a3Var, 2, str, dd3Var.f453852e, this.f391009h, this.f391010i, wVar.I(dd3Var.f453856i), this.f391011m.I(this.f391008g.f453858n));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update ctg done updateList is empty", this.f391011m.f391014f);
    }
}
