package com.tencent.mm.modelvideo;

/* loaded from: classes4.dex */
public class AdLandingMMVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    public boolean O1;
    public com.tencent.mm.pluginsdk.ui.a1 P1;

    public AdLandingMMVideoView(android.content.Context context) {
        super(context);
        this.f189738d = "VideoView.AdLandingMMVideoView";
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String N() {
        return this.f71650y0 + " ";
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.CommonVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.f1
    public boolean a(double d17, boolean z17) {
        try {
            boolean z18 = this.O1;
            if (z18) {
                com.tencent.mars.xlog.Log.i(this.f189739e, "seekTo adjust needPause[%b]", java.lang.Boolean.valueOf(z18));
                z17 = false;
            }
            return j0((int) d17, z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f189739e, th6.toString());
            return false;
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, t21.h0
    public void o(java.lang.String str, int i17) {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str) && this.f71649x1 != 3) {
                com.tencent.mars.xlog.Log.i(this.f189739e, "%s download finish [%d] needPause[%b]", N(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.O1));
                if (i17 == 0) {
                    this.f71649x1 = 3;
                }
                com.tencent.mm.pluginsdk.ui.a1 a1Var = this.P1;
                if (a1Var != null) {
                    a1Var.r(this.f71645l1, this.f71651y1 > 0);
                }
                com.tencent.mars.xlog.Log.i(this.f189738d, "onFinish");
                if (!this.O1) {
                    com.tencent.mars.xlog.Log.i(this.f189738d, "onFinish, startTimer, needPause is false");
                    U(true);
                }
                this.H1 = false;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f189739e, th6.toString());
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, t21.h0
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        try {
            this.H1 = false;
            if (j17 > -1 && j18 > -1) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(this.f71650y0, str)) {
                    try {
                        this.E1 = this.f71652z1.d((int) j17, (int) j18);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e(this.f189739e, "%s deal data available file pos to video time error[%s] ", N(), e17.toString());
                    }
                    com.tencent.mars.xlog.Log.i(this.f189739e, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d] needPause[%b]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.E1), java.lang.Boolean.valueOf(this.O1));
                    com.tencent.mars.xlog.Log.i(this.f189738d, "onDataAvailable");
                    if (this.O1) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i(this.f189738d, "onDataAvailable, startTimer, needPause is false");
                    U(true);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.w(this.f189739e, "%s deal data available error offset[%d], length[%d]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(this.f189739e, th6.toString());
        }
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void setIMMDownloadFinish(com.tencent.mm.pluginsdk.ui.a1 a1Var) {
        this.P1 = a1Var;
    }

    public void setNeedPause(boolean z17) {
        this.O1 = z17;
    }

    public AdLandingMMVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189738d = "VideoView.AdLandingMMVideoView";
    }

    public AdLandingMMVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189738d = "VideoView.AdLandingMMVideoView";
    }
}
