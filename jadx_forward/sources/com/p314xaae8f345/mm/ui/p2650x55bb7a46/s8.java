package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class s8 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f284199d;

    public s8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea) {
        this.f284199d = c21628xcedb13ea;
    }

    @Override // yb5.n
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f284199d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[finish] isCurrentActivity:%s", java.lang.Boolean.valueOf(c21628xcedb13ea.f39298x5262fd1e));
        if (c21628xcedb13ea.f39298x5262fd1e) {
            super/*com.tencent.mm.ui.MMFragment*/.mo78641xb4098c93();
            return;
        }
        if (c21628xcedb13ea.mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) {
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) c21628xcedb13ea.mo78409x676b27cd();
            if (activityC21387x976b8e54 != null) {
                activityC21387x976b8e54.m78444xa05a445e(!c21628xcedb13ea.m78668x4e2d2008());
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUIFragment", "LauncherUI is null!???");
                return;
            }
        }
        if (c21628xcedb13ea.mo78409x676b27cd() instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8) c21628xcedb13ea.mo78409x676b27cd();
            if (activityC22359x66709fa8 != null) {
                activityC22359x66709fa8.m80479xa05a445e(!c21628xcedb13ea.m78668x4e2d2008());
                return;
            }
            return;
        }
        if (c21628xcedb13ea.mo78409x676b27cd() instanceof wn.s) {
            ((wn.s) c21628xcedb13ea.mo78409x676b27cd()).d6();
            return;
        }
        if (c21628xcedb13ea.mo78409x676b27cd().mo7595x9cdc264().m7675x1626d96d().size() > 0) {
            java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = c21628xcedb13ea.mo78409x676b27cd().mo7595x9cdc264().m7675x1626d96d();
            for (int i17 = 0; i17 < m7675x1626d96d.size(); i17++) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m7675x1626d96d.get(i17);
                if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951) {
                    ((com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951) componentCallbacksC1101xa17d4670).f146271u.d6();
                    return;
                }
            }
        }
    }
}
