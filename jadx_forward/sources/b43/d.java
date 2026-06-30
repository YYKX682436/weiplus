package b43;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public u33.e f99335d;

    /* renamed from: e, reason: collision with root package name */
    public final s33.i f99336e;

    /* renamed from: f, reason: collision with root package name */
    public v33.h f99337f;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f99341m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f99342n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99338g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f99339h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f99340i = false;

    /* renamed from: o, reason: collision with root package name */
    public int f99343o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f99344p = new java.util.LinkedList();

    public d(s33.i iVar, u33.e eVar) {
        this.f99336e = iVar;
        this.f99335d = eVar;
    }

    public final synchronized void a(java.util.List list, java.lang.String str, java.lang.String str2) {
        boolean z17 = this.f99340i;
        if (!z17 && this.f99338g) {
            this.f99342n = str2;
            ((java.util.LinkedList) this.f99344p).clear();
            if (list != null) {
                ((java.util.LinkedList) this.f99344p).addAll(list);
            }
            this.f99340i = true;
            this.f99337f = new v33.h(list, str, str2, this.f99343o, hashCode());
            gm0.j1.d().g(this.f99337f);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "mIsRunning：%b, mIsAlive: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f99338g));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 4989) {
            v33.h hVar = (v33.h) m1Var;
            if (hVar.f514649f != hashCode()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "instanceId is diff");
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar = hVar.f514648e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa c15773xdaadaafa = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15773xdaadaafa) oVar.f152243a.f152217a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 c15774x7e2f6936 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936) oVar.f152244b.f152233a;
            boolean z17 = true;
            if (i17 == 0 && i18 == 0 && c15774x7e2f6936 != null) {
                java.lang.String str2 = c15773xdaadaafa.f36724x14f51cd8;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                if (!str2.equals(c15774x7e2f6936.f36727x5f83ab8c)) {
                    c15773xdaadaafa.f36724x14f51cd8 = c15774x7e2f6936.f36727x5f83ab8c;
                    synchronized (this) {
                        if (this.f99335d != null && c15774x7e2f6936.f36725xcf9821f6 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15788x7bba8bca c15788x7bba8bca = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15788x7bba8bca();
                            c15788x7bba8bca.f36757xcf9821f6.addAll(c15774x7e2f6936.f36725xcf9821f6);
                            c15788x7bba8bca.f36758x75467d1 = c15774x7e2f6936.f36726x75467d1;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "before reorder size:%d, after reorder size:%d", java.lang.Integer.valueOf(c15774x7e2f6936.f36725xcf9821f6.size()), java.lang.Integer.valueOf(c15788x7bba8bca.f36757xcf9821f6.size()));
                            this.f99335d.w3(this.f99336e, c15788x7bba8bca);
                        }
                    }
                    z17 = false;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "hashcode = %d, newVersion:%s, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(hashCode()), c15773xdaadaafa.f36724x14f51cd8, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            ((ku5.t0) ku5.t0.f394148d).k(new b43.c(this, c15773xdaadaafa), z17 ? 2000L : 0L);
        }
    }
}
