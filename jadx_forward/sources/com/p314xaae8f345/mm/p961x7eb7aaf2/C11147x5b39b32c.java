package com.p314xaae8f345.mm.p961x7eb7aaf2;

/* renamed from: com.tencent.mm.modelvideo.AdLandingMMVideoView */
/* loaded from: classes4.dex */
public class C11147x5b39b32c extends com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 {
    public boolean O1;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 P1;

    public C11147x5b39b32c(android.content.Context context) {
        super(context);
        this.f271271d = "VideoView.AdLandingMMVideoView";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e
    public java.lang.String N() {
        return this.f153183y0 + " ";
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19637x95a2b3f5, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e, com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    public boolean a(double d17, boolean z17) {
        try {
            boolean z18 = this.O1;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "seekTo adjust needPause[%b]", java.lang.Boolean.valueOf(z18));
                z17 = false;
            }
            return j0((int) d17, z17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, th6.toString());
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, t21.h0
    public void o(java.lang.String str, int i17) {
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str) && this.f153182x1 != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s download finish [%d] needPause[%b]", N(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.O1));
                if (i17 == 0) {
                    this.f153182x1 = 3;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 a1Var = this.P1;
                if (a1Var != null) {
                    a1Var.r(this.f153178l1, this.f153184y1 > 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onFinish");
                if (!this.O1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onFinish, startTimer, needPause is false");
                    U(true);
                }
                this.H1 = false;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, th6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800, t21.h0
    /* renamed from: onDataAvailable */
    public void mo48220x9bb59ea0(java.lang.String str, long j17, long j18) {
        try {
            this.H1 = false;
            if (j17 > -1 && j18 > -1) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.f153183y0, str)) {
                    try {
                        this.E1 = this.f153185z1.d((int) j17, (int) j18);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, "%s deal data available file pos to video time error[%s] ", N(), e17.toString());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s deal data available. offset[%d] length[%d] cachePlayTime[%d] needPause[%b]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.E1), java.lang.Boolean.valueOf(this.O1));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onDataAvailable");
                    if (this.O1) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onDataAvailable, startTimer, needPause is false");
                    U(true);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s deal data available error offset[%d], length[%d]", N(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f271272e, th6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800
    /* renamed from: setIMMDownloadFinish */
    public void mo48221xf83edb22(com.p314xaae8f345.mm.p2470x93e71c27.ui.a1 a1Var) {
        this.P1 = a1Var;
    }

    /* renamed from: setNeedPause */
    public void m48222x9b0eccbe(boolean z17) {
        this.O1 = z17;
    }

    public C11147x5b39b32c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f271271d = "VideoView.AdLandingMMVideoView";
    }

    public C11147x5b39b32c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271271d = "VideoView.AdLandingMMVideoView";
    }
}
