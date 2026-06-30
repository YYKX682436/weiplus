package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2 f236278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.C16820xddc1f29c f236279e;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.C16820xddc1f29c c16820xddc1f29c, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2 c5242x5950d3a2) {
        this.f236279e = c16820xddc1f29c;
        this.f236278d = c5242x5950d3a2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5242x5950d3a2 c5242x5950d3a2 = this.f236278d;
        java.lang.String str = c5242x5950d3a2.f135575g.f88263b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.C16820xddc1f29c c16820xddc1f29c = this.f236279e;
        c16820xddc1f29c.f234913d.f234953d.getIntent().putExtra("inviteer", str);
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f(c16820xddc1f29c.f234913d.f234964r, c5242x5950d3a2.f135575g.f88263b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] inviter:%s inviterDisplayName:%s", str, f17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = c16820xddc1f29c.f234913d;
            e0Var.r(e0Var.f234955f, e0Var.f234953d, str, f17, e0Var.f234954e, e0Var.f234964r);
            return;
        }
        ((java.util.LinkedList) c16820xddc1f29c.f234913d.f234968v).add(str);
        c01.p8 a17 = c01.n8.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var2 = c16820xddc1f29c.f234913d;
        ((c01.k7) a17).g(str, e0Var2.f234965s, r35.s.a(java.lang.Integer.valueOf(e0Var2.f234956g)), new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.y0(this, str));
    }
}
