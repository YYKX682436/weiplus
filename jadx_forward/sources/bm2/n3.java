package bm2;

/* loaded from: classes3.dex */
public final class n3 extends bm2.p3 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f103661e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f103662f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f103663g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f103664h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f103665i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f103666m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f103667n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f103668o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f103669p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b f103670q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f103671r;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x01ad
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01e1  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01b8 -> B:12:0x01b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n3(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bm2.n3.<init>(android.view.View):void");
    }

    public final void i(java.lang.String giftId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftItemPreview", "start show pag animate");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14321x140d228b c14321x140d228b = this.f103670q;
        android.view.ViewGroup.LayoutParams layoutParams = c14321x140d228b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f103753d.getHeight();
        }
        c14321x140d228b.c(giftId, i17);
        c14321x140d228b.setVisibility(0);
    }
}
