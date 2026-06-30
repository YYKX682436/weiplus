package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f242593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f f242595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f242596g;

    public g1(android.graphics.Bitmap bitmap, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17370xd188836f activityC17370xd188836f, yz5.a aVar) {
        this.f242593d = bitmap;
        this.f242594e = str;
        this.f242595f = activityC17370xd188836f;
        this.f242596g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (this.f242593d != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            this.f242593d.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            h0Var.f391656d = byteArrayOutputStream.toByteArray();
        }
        java.lang.Object obj = h0Var.f391656d;
        if (obj == null || ((byte[]) obj).length <= 0) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f242594e);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.e1(h0Var);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(r6Var.o(), e1Var);
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f1(this.f242596g));
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            java.lang.String o17 = r6Var.o();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f242595f.mo55332x76847179();
            ((ub0.r) oVar).getClass();
            q75.c.f(o17, mo55332x76847179);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ColorfulChatroomQRCodeUI", e17, "", new java.lang.Object[0]);
        }
    }
}
