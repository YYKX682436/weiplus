package sc2;

/* loaded from: classes2.dex */
public final class k2 extends sc2.d6 {
    public static final java.lang.Object D = new java.lang.Object();
    public final java.lang.String C = "FeedDynamicCarouseCardJumperObserver";

    @Override // ad2.h
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.lang.String str;
        java.lang.Object obj;
        r45.bg0 bg0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.A(holder, jumpView, infoEx);
        sc2.q8 q8Var = infoEx.f534766J;
        int i17 = q8Var != null ? q8Var.f487712c : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onVideoFinish: jumperState=");
        sb6.append(i17);
        sb6.append(", jumpId=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb6.append(c19786x6a1e2862.m76501xf2fd2296());
        sb6.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
        sb6.append(pm0.v.u(abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : 0L));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        int i18 = 2;
        if (i17 == 2 || (abstractC14490x69736cb5 = infoEx.f534777f) == null || (str = infoEx.f534780i) == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(i18) == 24) {
                break;
            } else {
                i18 = 2;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (bg0Var = (r45.bg0) wf6Var.m75936x14adae67(32)) == null) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("tryFinishExpand: finish_change=");
        sb8.append(bg0Var.m75939xb282bd08(3));
        sb8.append(", jumpId=");
        sb8.append(c19786x6a1e2862.m76501xf2fd2296());
        sb8.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = infoEx.f534777f;
        sb8.append(pm0.v.u(abstractC14490x69736cb53 != null ? abstractC14490x69736cb53.mo2128x1ed62e84() : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
        if (bg0Var.m75939xb282bd08(3) > 0) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(D);
            }
            I(abstractC14490x69736cb5, holder, jumpView, infoEx, str, M(infoEx), true);
            G(jumpView, P(infoEx), M(infoEx));
            Y(holder, jumpView, "tryFinishExpand");
            xc2.z2 z2Var = this.f84684o;
            xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
            if (bVar == null || infoEx.f534794w != 0 || bVar.f534602m <= 0) {
                return;
            }
            infoEx.f534794w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
        }
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        java.lang.String str;
        java.lang.Object obj;
        r45.bg0 bg0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
        sc2.q8 q8Var = infoEx.f534766J;
        int i17 = q8Var != null ? q8Var.f487712c : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRealShow: jumperState=");
        sb6.append(i17);
        sb6.append(", jumpId=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        sb6.append(c19786x6a1e2862.m76501xf2fd2296());
        sb6.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        sb6.append(pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.C;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (i17 != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
            if (abstractC14490x69736cb52 == null || (str = infoEx.f534780i) == null) {
                return;
            }
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).m75939xb282bd08(2) == 24) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null && (bg0Var = (r45.bg0) wf6Var.m75936x14adae67(32)) != null) {
                long m75939xb282bd08 = bg0Var.m75939xb282bd08(2) * 1000;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("tryDelayExpand: delayExpandMs=");
                sb8.append(m75939xb282bd08);
                sb8.append(", jumpId=");
                sb8.append(c19786x6a1e2862.m76501xf2fd2296());
                sb8.append(", feedId=");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = infoEx.f534777f;
                sb8.append(pm0.v.u(abstractC14490x69736cb53 != null ? abstractC14490x69736cb53.mo2128x1ed62e84() : 0L));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8.toString());
                if (m75939xb282bd08 > 0) {
                    android.content.Context context = holder.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(sc2.a8.class);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = a8Var != null ? a8Var.f487742e : null;
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() + m75939xb282bd08;
                    java.lang.Object obj2 = D;
                    if (n3Var != null) {
                        n3Var.mo50302x6b17ad39(obj2);
                    }
                    if (n3Var != null) {
                        n3Var.mo50296x41bd0e60(new sc2.j2(this, abstractC14490x69736cb52, holder, jumpView, infoEx, str), obj2, uptimeMillis);
                    }
                }
            }
        }
        xc2.z2 z2Var = this.f84684o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || infoEx.f534793v != 0 || bVar.f534602m <= 0) {
            return;
        }
        infoEx.f534793v = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f534602m) / 1000);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.C;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        r45.i55 P = P(infoEx);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(P != null ? P.m75945x2fec8307(1) : null)) {
            r45.i55 M = M(infoEx);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(M != null ? M.m75945x2fec8307(1) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // sc2.d6, ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.Object obj = holder.f374658i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        android.content.Context context = holder.f374654e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (j5Var != null) {
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            if (c19786x6a1e2862.m76480xe2ee1ca3() == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
                if (c15447x4ebc90c2 != null) {
                    c15447x4ebc90c2.d7(mo2128x1ed62e84, 128);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeType: ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
        sb6.append(m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.C, sb6.toString());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa02 = c19786x6a1e2862.m76506x42318aa0();
        boolean z17 = false;
        if (m76506x42318aa02 != null && m76506x42318aa02.m77224x4236b52c() == 14) {
            z17 = true;
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            so2.o2.f492050f.a().g(this.f84678f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, so2.h2.f491922i);
        }
        sc2.q8 q8Var = infoEx.f534766J;
        if ((q8Var != null ? q8Var.f487712c : 1) == 2) {
            I(feed, holder, jumpView, infoEx, source, M(infoEx), false);
        } else {
            J(feed, holder, jumpView, infoEx, P(infoEx), source);
        }
    }

    @Override // ad2.h
    public void u(boolean z17, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.u(z17, holder, jumpView, infoEx);
        if (z17) {
            if (((java.lang.Number) ae2.in.f85221a.u().r()).intValue() == 1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = infoEx.f534767a.m76506x42318aa0();
                if (!(m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 14) || (abstractC14490x69736cb5 = infoEx.f534777f) == null) {
                    return;
                }
                so2.k2 k2Var = so2.o2.f492050f;
                so2.o2 a17 = k2Var.a();
                so2.o2 a18 = k2Var.a();
                long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                a17.h(0, a18.c(m59251x5db1b11, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n), null, null, jumpView);
            }
        }
    }
}
