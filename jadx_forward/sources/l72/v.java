package l72;

/* loaded from: classes11.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f398398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f398400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 f398402h;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61, int i17, int i18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, java.lang.String str) {
        this.f398402h = activityC13535x2550df61;
        this.f398398d = i17;
        this.f398399e = i18;
        this.f398400f = m1Var;
        this.f398401g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f398399e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61 = this.f398402h;
        int i18 = this.f398398d;
        if (i18 != 0 || i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 72L, 1L, false);
            activityC13535x2550df61.f181739r = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceAgreementUIError", "[cgi-ret]net ret error, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), this.f398401g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61.T6(activityC13535x2550df61);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("err_msg", "fail");
            intent.putExtra("err_code", 90110);
            vz2.c.h(90110);
            activityC13535x2550df61.setResult(1, intent);
            activityC13535x2550df61.finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61.T6(activityC13535x2550df61);
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f398400f;
        int i19 = ((j72.d) m1Var).f379579e.f463752f;
        java.lang.String str = ((j72.d) m1Var).f379579e.f463753g;
        activityC13535x2550df61.f181733i = ((j72.d) m1Var).f379579e.f463754h;
        activityC13535x2550df61.f181734m = ((j72.d) m1Var).f379579e.f463755i;
        activityC13535x2550df61.f181735n = ((j72.d) m1Var).f379579e.f463756m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "[cgi-ret]contractRet:%s  tip:%s url:%s contractTitle:%s contractDesc:%s", java.lang.Integer.valueOf(i19), str, activityC13535x2550df61.f181733i, activityC13535x2550df61.f181734m, activityC13535x2550df61.f181735n);
        if (i19 == 1) {
            activityC13535x2550df61.f181739r = false;
            activityC13535x2550df61.f181729e.setEnabled(true);
        } else if (android.text.TextUtils.isEmpty(activityC13535x2550df61.f181733i)) {
            activityC13535x2550df61.f181739r = false;
            activityC13535x2550df61.f181730f.setVisibility(4);
            activityC13535x2550df61.f181729e.setEnabled(true);
        } else {
            activityC13535x2550df61.f181739r = true;
            k72.u.B.f386301z = true;
        }
        if (activityC13535x2550df61.f181739r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 62L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 61L, 1L, false);
        }
        activityC13535x2550df61.f181731g.setText(str);
    }
}
