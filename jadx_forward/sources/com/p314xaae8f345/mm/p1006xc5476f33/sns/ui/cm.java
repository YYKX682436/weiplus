package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class cm implements db5.c6 {
    public cm(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar) {
    }

    @Override // db5.c6
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasMenuShowed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        boolean z17 = ((java.util.HashSet) db5.c6.f309840a).size() > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMenuShowed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        return z17;
    }

    @Override // db5.c6
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeMenuWithoutAnim", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        java.util.Set set = db5.c6.f309840a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f) it.next();
            if (c21514xd47fe41f != null) {
                c21514xd47fe41f.c();
            }
        }
        ((java.util.HashSet) set).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeMenuWithoutAnim", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
    }

    @Override // db5.c6
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        java.util.Set set = db5.c6.f309840a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f) it.next();
            if (c21514xd47fe41f != null) {
                c21514xd47fe41f.d();
            }
        }
        ((java.util.HashSet) set).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
    }

    @Override // db5.c6
    public void d(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        java.util.Set set = db5.c6.f309840a;
        if (z17) {
            ((java.util.HashSet) set).add(c21514xd47fe41f);
        } else {
            ((java.util.HashSet) set).remove(c21514xd47fe41f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
    }
}
