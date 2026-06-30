package bm2;

/* loaded from: classes3.dex */
public final class n3 extends bm2.p3 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f22128e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f22129f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f22130g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f22131h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f22132i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f22133m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f22134n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f22135o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f22136p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView f22137q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f22138r;

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
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mars.xlog.Log.i("GiftItemPreview", "start show pag animate");
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView finderLiveGiftPreviewView = this.f22137q;
        android.view.ViewGroup.LayoutParams layoutParams = finderLiveGiftPreviewView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f22220d.getHeight();
        }
        finderLiveGiftPreviewView.c(giftId, i17);
        finderLiveGiftPreviewView.setVisibility(0);
    }
}
