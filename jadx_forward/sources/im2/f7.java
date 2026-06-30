package im2;

/* loaded from: classes2.dex */
public final class f7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: m, reason: collision with root package name */
    public static long f373858m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f373859n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f373860o;

    /* renamed from: d, reason: collision with root package name */
    public dk2.x4 f373861d;

    /* renamed from: e, reason: collision with root package name */
    public int f373862e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f373863f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f373864g;

    /* renamed from: h, reason: collision with root package name */
    public int f373865h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f373866i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f373862e = -1;
        this.f373866i = new im2.e7(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.f7.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        if (this.f373863f) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39 c5494xbcbdbc39 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39();
            c5494xbcbdbc39.f135827g.f89982a = 2L;
            c5494xbcbdbc39.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onPreDestroyed */
    public void mo47482x6fa9d635() {
        super.mo47482x6fa9d635();
        pm0.v.C(this.f373866i);
        if (this.f373864g) {
            ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Di();
        }
        if (this.f373863f) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39 c5494xbcbdbc39 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39();
            c5494xbcbdbc39.f135827g.f89982a = 1L;
            c5494xbcbdbc39.e();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWatchCountDownUIC", "onDestroy isEnableRecom: " + this.f373864g + " isFromRed: 4isFromRed");
    }
}
