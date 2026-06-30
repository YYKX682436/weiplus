package c74;

/* loaded from: classes4.dex */
public class b extends v64.b {

    /* renamed from: a, reason: collision with root package name */
    public int f121166a;

    public b(android.content.Context context) {
        super(context);
        this.f121166a = 0;
    }

    @Override // v64.b, v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        this.f121166a = i17;
        boolean a17 = super.a(view, i17, c17933xe8d1b226, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        return a17;
    }

    @Override // v64.b
    public v64.c d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        d74.a aVar = null;
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        } else {
            try {
                m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(this.f121166a);
            } catch (java.lang.Throwable unused) {
            }
            if (m70347x10413e67 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
            } else {
                if (m70347x10413e67.f38067xf8d8cf13 == 11) {
                    d74.a aVar2 = new d74.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
                    aVar = aVar2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        return aVar;
    }
}
