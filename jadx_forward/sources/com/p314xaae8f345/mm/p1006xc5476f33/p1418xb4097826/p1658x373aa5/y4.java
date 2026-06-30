package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214909d;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        this.f214909d = c15260x406bbe1b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214909d;
        c15260x406bbe1b.getColumnFeedSelectorAdapter().d(false);
        ey2.u uVar = c15260x406bbe1b.f212447r;
        if (uVar != null) {
            int lastSnappedPosition = c15260x406bbe1b.getLastSnappedPosition();
            jz5.l lVar = (jz5.l) uVar.f339075x.mo3195x754a37bb();
            java.lang.String str = uVar.f339062h;
            if (lVar == null || (c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Current feed list is null");
                return;
            }
            if (lastSnappedPosition < 0 || lastSnappedPosition >= c13920xa5f564aa.size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Invalid index: " + lastSnappedPosition + ", list size: " + c13920xa5f564aa.size());
                return;
            }
            java.lang.Object obj = c13920xa5f564aa.get(lastSnappedPosition);
            jz5.f0 f0Var = null;
            f0Var = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Feed at index " + lastSnappedPosition + " is not a BaseFinderFeed");
                return;
            }
            ((ey2.i2) ((jz5.n) uVar.f339067p).mo141623x754a37bb()).N6(20, kz5.b0.c(abstractC14490x69736cb5));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13917xbf9dc158 c13917xbf9dc158 = uVar.f339061g;
            if (c13917xbf9dc158 != null && (m56387xe6796cde = c13917xbf9dc158.m56387xe6796cde()) != 0) {
                java.util.Iterator it = m56387xe6796cde.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it.next();
                    if (((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && j5Var.d(abstractC14490x69736cb5) == 0) == true) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i17 != -1) {
                    m56387xe6796cde.remove(i17);
                    java.lang.ref.WeakReference weakReference = c13917xbf9dc158.f189187m;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = weakReference instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) weakReference : null;
                    if (c13728x20aad6ea != null) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c13728x20aad6ea.mo7946xf939df19();
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                        if (c22848x6ddd90cf != null) {
                            c22848x6ddd90cf.m8154xdb81fc7f(i17, 1);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "Removed duplicate feed at index " + i17 + ": " + abstractC14490x69736cb5);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "No duplicate found for feed at index " + lastSnappedPosition + ": " + abstractC14490x69736cb5);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "FeedLoader dataList is null");
            }
        }
    }
}
