package kn;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f390998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.j0 f390999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f391000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dd3 f391001g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f391002h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.ya4 f391003i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kn.w f391004m;

    public u(kn.w wVar, java.util.LinkedList linkedList, kv.j0 j0Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, r45.dd3 dd3Var, java.util.List list, r45.ya4 ya4Var) {
        this.f391004m = wVar;
        this.f390998d = linkedList;
        this.f390999e = j0Var;
        this.f391000f = a3Var;
        this.f391001g = dd3Var;
        this.f391002h = list;
        this.f391003i = ya4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f390998d.size() < 25 ? this.f390998d.size() : 25;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img list size:%d, loopCount:%d", this.f391004m.f391014f, java.lang.Integer.valueOf(this.f390998d.size()), java.lang.Integer.valueOf(size));
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done loopCount is 0", this.f391004m.f391014f);
        } else if (this.f390998d.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done newImgFlagList is empty", this.f391004m.f391014f);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = (com.p314xaae8f345.mm.p943x351df9c2.r0) this.f390998d.poll();
                if (r0Var == null) {
                    break;
                }
                ((com.p314xaae8f345.mm.p943x351df9c2.s0) this.f390999e).y0(r0Var);
            }
            gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img loopCount:%d, take time:%d(ms), img list size:%d", this.f391004m.f391014f, java.lang.Integer.valueOf(size), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.f390998d.size()));
            if (!this.f390998d.isEmpty()) {
                ((ku5.t0) ku5.t0.f394148d).l(this, 100L, "chatroom_member_detail");
                return;
            }
        }
        kn.w wVar = this.f391004m;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f391000f;
        java.lang.String str = wVar.f391014f;
        r45.dd3 dd3Var = this.f391001g;
        kn.w.H(wVar, a3Var, 1, str, dd3Var.f453852e, this.f391002h, this.f391003i, wVar.I(dd3Var.f453856i), this.f391004m.I(this.f391001g.f453858n));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom(%s) update img done newImgFlagList is empty", this.f391004m.f391014f);
    }
}
