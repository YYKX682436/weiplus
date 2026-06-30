package a74;

/* loaded from: classes4.dex */
public class b extends v64.b {

    /* renamed from: a, reason: collision with root package name */
    public int f83471a;

    public b(android.content.Context context) {
        super(context);
        this.f83471a = 0;
    }

    @Override // v64.b, v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        this.f83471a = i17;
        boolean a17 = super.a(view, i17, c17933xe8d1b226, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        return a17;
    }

    @Override // v64.b
    public v64.c d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67;
        v64.c aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        v64.c cVar = null;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        } else {
            try {
                m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(this.f83471a);
            } catch (java.lang.Throwable unused) {
            }
            if (m70347x10413e67 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
            } else {
                int i17 = m70347x10413e67.f38067xf8d8cf13;
                if (i17 == 10) {
                    aVar = new b74.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                } else {
                    if (i17 == 11) {
                        aVar = new b74.a();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                }
                cVar = aVar;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        return cVar;
    }
}
