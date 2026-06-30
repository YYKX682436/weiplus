package fd4;

/* loaded from: classes4.dex */
public class q implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fd4.r f342857d;

    public q(fd4.r rVar) {
        this.f342857d = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        fd4.r rVar = this.f342857d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
        try {
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "resizeBreakFrameContainer, onPreDraw exp is " + th6);
        }
        if (!rVar.f342822f.f506698z.isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
            return true;
        }
        int width = rVar.f342822f.f506698z.getWidth();
        int height = rVar.f342822f.f506698z.getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeAdBusiness", "onPreDraw, w=" + width + ", h=" + height);
        rVar.q(width, height);
        if (rVar.f342828o != null) {
            android.view.View findViewById = rVar.m() ? rVar.f342822f.f506696x.findViewById(com.p314xaae8f345.mm.R.id.afc) : rVar.f342822f.f506696x.findViewById(com.p314xaae8f345.mm.R.id.f564201kq);
            if (findViewById != null) {
                int[] iArr = new int[2];
                rVar.f342822f.f506696x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                findViewById.getLocationOnScreen(iArr2);
                int height2 = (iArr2[1] + findViewById.getHeight()) - iArr[1];
                int width2 = rVar.f342822f.f506697y.getWidth();
                android.view.ViewGroup.LayoutParams layoutParams = rVar.f342828o.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = height2;
                rVar.f342828o.setLayoutParams(layoutParams);
                rVar.p(rVar.f342828o, width2, height2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onPreDraw, commentLayout==null");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onPreDraw, breakFrameContainer==null");
        }
        if (width > 0 && height > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeAdBusiness", "onPreDraw, removeOnPreDrawListener, isAttached=true, hash=" + hashCode());
            rVar.f342822f.f506698z.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        rVar.A = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
        return true;
    }
}
