package fd4;

/* loaded from: classes4.dex */
public class b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f342818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fd4.c f342819e;

    public b(fd4.c cVar, u74.d dVar) {
        this.f342819e = cVar;
        this.f342818d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$2");
        u74.d dVar = this.f342818d;
        if (!dVar.f506698z.isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$2");
            return true;
        }
        int width = dVar.f506698z.getWidth();
        int height = dVar.f506698z.getHeight();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFullCardAdBusiness", "onPreDraw, w=" + width + ", h=" + height);
        fd4.c cVar = this.f342819e;
        cVar.q(width, height);
        if (cVar.f342828o != null) {
            android.view.View findViewById = cVar.m() ? dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.afc) : dVar.f506696x.findViewById(com.p314xaae8f345.mm.R.id.f564201kq);
            if (findViewById != null) {
                int[] iArr = new int[2];
                dVar.f506696x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                findViewById.getLocationOnScreen(iArr2);
                int height2 = (iArr2[1] + findViewById.getHeight()) - iArr[1];
                int width2 = dVar.f506697y.getWidth();
                android.view.ViewGroup.LayoutParams layoutParams = cVar.f342828o.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = height2;
                cVar.f342828o.setLayoutParams(layoutParams);
                cVar.p(cVar.f342828o, width2, height2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "onPreDraw, commentLayout==null");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BaseFullCardAdBusiness", "onPreDraw, breakFrameContainer==null");
        }
        if (width > 0 && height > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseFullCardAdBusiness", "onPreDraw, removeOnPreDrawListener, isAttached=true, hash=" + hashCode());
            dVar.f506698z.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$2");
        return true;
    }
}
