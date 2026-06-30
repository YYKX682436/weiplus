package com.tencent.mm.modelvideo;

/* loaded from: classes4.dex */
public class FullScreenMMVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    public java.lang.String O1;

    public FullScreenMMVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private java.lang.String getRootPath() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.O1)) {
            return this.O1;
        }
        return lp0.b.D() + "video/";
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String N() {
        return this.f71650y0 + " ";
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void d0() {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.T)) {
                return;
            }
            this.f71650y0 = "MMVideo_FullScreen" + this.T.hashCode();
            java.lang.String str = getRootPath() + "MMVideo_FullScreen_" + this.T.hashCode() + ".mp4";
            this.f71645l1 = str;
            com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(str));
            com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenMMVideoView", "%s set video path [%s %s]", N(), this.f71650y0, this.f71645l1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullScreenMMVideoView", th6.toString());
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.f1
    public void h(boolean z17, java.lang.String str, int i17) {
        try {
            super.h(z17, str, i17);
            d0();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullScreenMMVideoView", th6.toString());
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        t21.i0 i0Var;
        try {
            if (this.L1) {
                Y();
            } else {
                super.onCompletion();
                java.lang.String str = this.f71650y0;
                if (str != null && (i0Var = this.f71648x0) != null) {
                    i0Var.c(str);
                }
                i0();
                com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f189748q;
                if (f4Var != null) {
                    f4Var.stop();
                }
            }
            this.f71652z1.release();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FullScreenMMVideoView", th6.toString());
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void setRootPath(java.lang.String str) {
        this.O1 = str;
    }

    public FullScreenMMVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
