package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class qo implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ro f251884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so f251885b;

    public qo(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ro roVar) {
        this.f251885b = soVar;
        this.f251884a = roVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoadStarData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar = this.f251885b;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so.J(soVar) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so.J(soVar).b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoadStarData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo
    public void b(java.util.List list, java.util.Map map, java.util.Map map2, java.util.Map map3, int i17, int i18) {
        java.util.List list2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar = this.f251885b;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so.H(soVar)) {
            this.f251885b.R(list, map, map2, map3, i17, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            soVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSearchScrollOffsetByLineSep", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (soVar.f486995n && (list2 = soVar.f486989e) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246208c != 0) {
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) list2;
                    if (i19 >= arrayList.size()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) arrayList.get(i19);
                    if (c17933xe8d1b226.f68891x29d1292e != com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246208c) {
                        i19++;
                    } else if (i19 > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) arrayList.get(i19 - 1);
                        int m70359xfb803656 = c17933xe8d1b226.m70359xfb803656();
                        int m70359xfb8036562 = c17933xe8d1b2262.m70359xfb803656();
                        android.app.Activity activity = soVar.f486988d;
                        if (m70359xfb803656 == m70359xfb8036562) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d += com.p314xaae8f345.mm.ui.zk.a(activity, 27);
                        } else {
                            int i27 = m70359xfb803656 / 10000;
                            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f() != i27 && i27 != m70359xfb8036562 / 10000) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d += (com.p314xaae8f345.mm.ui.zk.a(activity, -20) - com.p314xaae8f345.mm.ui.zk.a(activity, 10)) - soVar.f487004w;
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSearchScrollOffsetByLineSep", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so soVar = this.f251885b;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so.H(soVar)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.so.I(soVar);
            soVar.notifyDataSetChanged();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ro roVar = this.f251884a;
            if (roVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.su) roVar).a();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }
}
