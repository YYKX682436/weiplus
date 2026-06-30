package z84;

/* loaded from: classes4.dex */
public class a implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f552295d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f552296e;

    public a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3) {
        this.f552295d = new android.os.Handler(context.getMainLooper(), this);
        this.f552296e = new java.lang.ref.WeakReference(c17808x428917d3);
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancel", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        android.os.Handler handler = this.f552295d;
        if (handler != null) {
            handler.removeMessages(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancel", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
    }

    public final boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        java.lang.ref.WeakReference weakReference = this.f552296e;
        if (weakReference == null || (c17808x428917d3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3) weakReference.get()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        z84.c cVar = c17808x428917d3.f245327u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (cVar != null) {
            cVar.c((c17808x428917d3.p() + 1) % c17808x428917d3.m8020x7e414b06());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        c17808x428917d3.F();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        if (message == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            return false;
        }
        if (message.what == 0) {
            try {
                boolean b17 = b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                return b17;
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        return false;
    }
}
