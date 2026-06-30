package ix1;

/* loaded from: classes12.dex */
public abstract class d extends ix1.a {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f376856l = "";

    /* renamed from: m, reason: collision with root package name */
    public r45.gp0 f376857m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gp0 f376858n;

    /* renamed from: o, reason: collision with root package name */
    public long f376859o;

    /* renamed from: p, reason: collision with root package name */
    public int f376860p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f376861q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f376862r;

    @Override // ix1.a
    public void c() {
        if (this.f376857m == null && this.f376858n == null) {
            return;
        }
        l75.k0 Q4 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.s.f156238e.Q4();
        java.lang.String str = this.f376844a;
        p75.i0 i17 = dm.a2.f317097i.i();
        i17.f434190d = dm.a2.f317099n.j(str);
        i17.f434189c = "MicroMsg.SDK.BaseChatroomNoticeAttachIndex";
        if (((java.util.ArrayList) i17.a().k(Q4, dm.a2.class)).size() < 1) {
            r45.gp0 gp0Var = this.f376857m;
            if (gp0Var == null) {
                gp0Var = this.f376858n;
            }
            java.lang.String c17 = hx1.b.c(gp0Var);
            java.lang.String e17 = hx1.b.e(gp0Var);
            com.p314xaae8f345.mm.vfs.w6.h(c17);
            com.p314xaae8f345.mm.vfs.w6.h(e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorDataItem", "del attach. type:%d, dataPath:%s thumbPath:%s", java.lang.Integer.valueOf(gp0Var.I), c17, e17);
        }
    }
}
