package sm4;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491489d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f491490e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.un6 f491491f;

    public k(r45.un6 un6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryVideo", "Create NetSceneTopStory Video contextId:%s searchId:%s", un6Var.f469045r, un6Var.f469040m);
        this.f491491f = un6Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1943;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/mmwebrecommend";
        lVar.f152197a = new r45.r97();
        lVar.f152198b = new r45.s97();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491490e = a17;
        r45.r97 r97Var = (r45.r97) a17.f152243a.f152217a;
        r97Var.f466196d = un6Var.f469046s;
        r97Var.f466197e = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1);
        r97Var.f466199g = un6Var.f469041n;
        r97Var.f466200h = su4.r2.i();
        r97Var.f466201i = un6Var.f469039i;
        r97Var.f466202m = un6Var.f469040m;
        java.util.LinkedList linkedList = r97Var.f466205p;
        linkedList.addAll(un6Var.f469044q);
        r97Var.f466208s = (int) un6Var.f469038h;
        r45.x50 x50Var = new r45.x50();
        x50Var.f471321d = "client_system_version";
        x50Var.f471322e = android.os.Build.VERSION.SDK_INT;
        linkedList.add(x50Var);
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f471321d = com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37;
        x50Var2.f471323f = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b();
        linkedList.add(x50Var2);
        r45.x50 x50Var3 = new r45.x50();
        x50Var3.f471321d = "client_request_time";
        x50Var3.f471323f = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        linkedList.add(x50Var3);
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.x50 x50Var4 = (r45.x50) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryVideo", "key: %s unit_value %s text_value %s", x50Var4.f471321d, java.lang.Long.valueOf(x50Var4.f471322e), x50Var4.f471323f);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f491489d = u0Var;
        return mo9409x10f9447a(sVar, this.f491490e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1943;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneTopStoryVideo", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f491489d.mo815x76e0bfae(i18, i19, str, this);
    }
}
