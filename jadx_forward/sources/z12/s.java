package z12;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z12.t f550892d;

    public s(z12.t tVar) {
        this.f550892d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z12.t tVar = this.f550892d;
        java.util.ArrayList arrayList = tVar.f550901o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList: %s", java.lang.Integer.valueOf(arrayList.size()));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        z85.d b17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList failed. get emoji group info storage failed.");
            return;
        }
        b17.p1(arrayList);
        if (!tVar.f550900n) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().b();
            return;
        }
        if (arrayList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d force", java.lang.Integer.valueOf(arrayList.size()));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.zj0 zj0Var = (r45.zj0) it.next();
                if (zj0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj0Var.f473661d)) {
                    if (zj0Var.f473661d.equals(java.lang.String.valueOf(17))) {
                        arrayList2.add(new b22.b("com.tencent.xin.emoticon.tusiji"));
                    } else {
                        arrayList2.add(new b22.a(zj0Var.f473661d, true));
                    }
                }
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.b(arrayList2);
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f179165c) {
                return;
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ai().f179149a.f();
        }
    }
}
