package s23;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s23.x f483862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.d2 f483863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.i2 f483864f;

    public s(s23.x xVar, r45.d2 d2Var, r45.i2 i2Var) {
        this.f483862d = xVar;
        this.f483863e = d2Var;
        this.f483864f = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.i2 i2Var;
        s23.x xVar;
        int i17;
        s23.x xVar2 = this.f483862d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo126862x19263085 = xVar2.f483876d.mo126862x19263085();
        if (!((mo126862x19263085.isFinishing() || mo126862x19263085.isDestroyed()) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "checkShowActivityTemplateTip: state failed");
            return;
        }
        r45.d2 d2Var = this.f483863e;
        s23.o oVar = xVar2.f483876d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo126862x192630852 = oVar.mo126862x19263085();
        ((ez0.f) xVar2.a()).getClass();
        r45.e2 e2Var = new r45.e2();
        e2Var.f454453d = com.p314xaae8f345.mm.R.C30864xbddafb2a.dm8;
        e2Var.f454454e = android.graphics.Color.parseColor("#C49600");
        e2Var.f454455f = android.graphics.Color.parseColor("#FBF2D1");
        e2Var.f454456g = e2Var.f454454e;
        r23.m mVar = new r23.m(mo126862x192630852, d2Var, e2Var, 0, new s23.p(xVar2), new s23.q(xVar2), 8, null);
        mVar.f385395g = -i65.a.h(oVar.mo126862x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        mVar.f385394f = true;
        xVar2.f483890u = mVar;
        r45.i2 i2Var2 = this.f483864f;
        android.widget.LinearLayout linearLayout = xVar2.f483878f;
        if (linearLayout == null) {
            xVar = xVar2;
            i2Var = i2Var2;
        } else {
            mVar.getContentView().measure(0, 0);
            int measuredWidth = mVar.getContentView().getMeasuredWidth();
            int measuredHeight = mVar.getContentView().getMeasuredHeight();
            int[] iArr = new int[2];
            linearLayout.getLocationInWindow(iArr);
            android.graphics.Rect rect = mVar.f385393e;
            linearLayout.getGlobalVisibleRect(rect);
            int width = rect.width();
            int i18 = (iArr[1] - mVar.f385395g) - measuredHeight;
            int i19 = mVar.f385394f ? (iArr[0] + (width / 2)) - (measuredWidth / 2) : iArr[0];
            int h17 = com.p314xaae8f345.mm.ui.bl.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int c17 = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            i2Var = i2Var2;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWithTop: [");
            sb6.append(i19);
            sb6.append(", ");
            sb6.append(i18);
            xVar = xVar2;
            sb6.append("], ");
            sb6.append(mVar.f385394f);
            sb6.append(", bottomMargin=");
            sb6.append(mVar.f385395g);
            sb6.append(", pop size=[");
            sb6.append(measuredWidth);
            sb6.append(", ");
            sb6.append(measuredHeight);
            sb6.append("], anchorWidth=");
            sb6.append(width);
            sb6.append(", loc=[");
            sb6.append(iArr[0]);
            sb6.append(',');
            sb6.append(iArr[1]);
            sb6.append("], rect=");
            sb6.append(rect);
            sb6.append(", screen=[");
            sb6.append(b17.x);
            sb6.append(',');
            sb6.append(b17.y);
            sb6.append("], statusBarHeight=");
            sb6.append(h17);
            sb6.append(", navHeight=");
            sb6.append(c17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", sb6.toString());
            mVar.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576144y3);
            mVar.f385397i = 200L;
            if (mVar.getBackground() == null) {
                i17 = 0;
                mVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            } else {
                i17 = 0;
            }
            mVar.showAtLocation(linearLayout, i17, i19, i18);
            mVar.b();
        }
        long j17 = mVar.f385397i;
        long j18 = this.f483863e.f453537m;
        s23.x xVar3 = xVar;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = xVar3.f483887r;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new s23.w(j17, xVar3, i2Var, j18, null), 2, null);
    }
}
