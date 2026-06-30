package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 f231072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c f231073e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var) {
        this.f231073e = cVar;
        this.f231072d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = this.f231073e;
        if (cVar.f231047a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onEnterMultiTalk");
            com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a a17 = cVar.a(this.f231072d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = cVar.f231047a;
            v0Var.getClass();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_voip_mutex_adjust, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk: %s checkInVoip %b isIPCallStarted %b isIPCallStarted %b", com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.b(a17), java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
            if (fj6) {
                boolean z17 = vq4.p0.c() || vq4.p0.d();
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MT.MultiTalkManager", "onEnterMultiTalk isInVoip %b ipcall %b voip %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(vq4.p0.c()), java.lang.Boolean.valueOf(vq4.p0.d()));
                    v0Var.f(false, false);
                    return;
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5896x6b6f0c84 c5896x6b6f0c84 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5896x6b6f0c84();
            c5896x6b6f0c84.f136204g.f88891a = 1;
            c5896x6b6f0c84.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.d(true);
            if (v0Var.f231709s != sj3.e4.Inviting) {
                v0Var.D(sj3.e4.Starting);
                v0Var.e(a17, java.lang.Boolean.TRUE);
            }
            if (v0Var.x() && v0Var.c0(a17)) {
                zj3.g gVar = zj3.g.f554835a;
                gVar.a(v0Var.v());
                if (!android.text.TextUtils.isEmpty(a17.f153139d)) {
                    java.lang.String groupId = a17.f153139d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
                    zj3.g.f554841g = groupId;
                }
                java.util.List list = a17.f153144i;
                if (list != null) {
                    gVar.c(list);
                }
                v0Var.H();
            }
        }
    }
}
