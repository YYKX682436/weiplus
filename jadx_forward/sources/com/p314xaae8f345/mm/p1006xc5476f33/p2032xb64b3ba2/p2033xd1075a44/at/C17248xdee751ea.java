package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.at;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/at/RingtoneAtSomeoneSearchDataSource;", "Lym3/b;", "Ldy3/p;", "", "Landroidx/lifecycle/x;", "Ljz5/f0;", "destroy", "<init>", "()V", "dy3/q", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneSearchDataSource */
/* loaded from: classes.dex */
public final class C17248xdee751ea extends ym3.b implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f240112d = jz5.h.b(dy3.r.f326139d);

    /* renamed from: e, reason: collision with root package name */
    public p13.c f240113e;

    @Override // ym3.b
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j d(v65.i scope, xm3.v0 dataRequest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataRequest, "dataRequest");
        u26.k0 k0Var = new u26.k0();
        p13.u uVar = new p13.u();
        uVar.f432674c = (java.lang.String) dataRequest.f536923e;
        uVar.f432673b = 16;
        ((u50.x) i95.n0.c(u50.x.class)).getClass();
        uVar.f432683l = r13.b.f450135d;
        uVar.f432678g = new int[]{131072};
        uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f240112d).mo141623x754a37bb();
        uVar.f432684m = new dy3.q(this, dataRequest, k0Var);
        uVar.f432681j.add(c01.z1.r());
        uVar.f432681j.add("blogapp");
        uVar.f432681j.add("tmessage");
        uVar.f432681j.add("officialaccounts");
        uVar.f432681j.add("service_officialaccounts");
        uVar.f432681j.add("BrandEcsTemplateMsg@fakeuser");
        uVar.f432681j.add("helper_entry");
        uVar.f432681j.add("filehelper");
        uVar.f432681j.add("weixin");
        if (this.f240113e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f240113e);
        }
        this.f240113e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: destroy */
    public final void m68504x5cd39ffa() {
        if (this.f240113e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f240113e);
        }
        this.f240113e = null;
    }

    @Override // ym3.b
    public void e() {
        if (this.f240113e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f240113e);
        }
    }
}
