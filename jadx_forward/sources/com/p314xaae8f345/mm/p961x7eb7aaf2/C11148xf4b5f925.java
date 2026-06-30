package com.p314xaae8f345.mm.p961x7eb7aaf2;

/* renamed from: com.tencent.mm.modelvideo.FullScreenMMVideoView */
/* loaded from: classes4.dex */
public class C11148xf4b5f925 extends com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 {
    public java.lang.String O1;

    public C11148xf4b5f925(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getRootPath */
    private java.lang.String m48223x71e6559d() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.O1)) {
            return this.O1;
        }
        return lp0.b.D() + "video/";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public java.lang.String N() {
        return this.f153183y0 + " ";
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    public void d0() {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.T)) {
                return;
            }
            this.f153183y0 = "MMVideo_FullScreen" + this.T.hashCode();
            java.lang.String str = m48223x71e6559d() + "MMVideo_FullScreen_" + this.T.hashCode() + ".mp4";
            this.f153178l1 = str;
            com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenMMVideoView", "%s set video path [%s %s]", N(), this.f153183y0, this.f153178l1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullScreenMMVideoView", th6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        try {
            super.h(z17, str, i17);
            d0();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullScreenMMVideoView", th6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        t21.i0 i0Var;
        try {
            if (this.L1) {
                Y();
            } else {
                super.mo9755xa6db431b();
                java.lang.String str = this.f153183y0;
                if (str != null && (i0Var = this.f153181x0) != null) {
                    i0Var.c(str);
                }
                i0();
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
                if (f4Var != null) {
                    f4Var.mo69303x360802();
                }
            }
            this.f153185z1.mo123590x41012807();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FullScreenMMVideoView", th6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    /* renamed from: setRootPath */
    public void mo48224x6c9eb6a9(java.lang.String str) {
        this.O1 = str;
    }

    public C11148xf4b5f925(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
