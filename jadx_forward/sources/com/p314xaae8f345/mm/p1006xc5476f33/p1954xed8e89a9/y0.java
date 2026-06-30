package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public class y0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.z0 f236273b;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.z0 z0Var, java.lang.String str) {
        this.f236273b = z0Var;
        this.f236272a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.z0 z0Var = this.f236273b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, z0Var.f236279e.f234913d.f234965s, java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.String f27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true).f2();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = z0Var.f236279e.f234913d;
            e0Var.r(e0Var.f234955f, e0Var.f234953d, this.f236272a, f27, e0Var.f234954e, e0Var.f234964r);
        }
    }
}
