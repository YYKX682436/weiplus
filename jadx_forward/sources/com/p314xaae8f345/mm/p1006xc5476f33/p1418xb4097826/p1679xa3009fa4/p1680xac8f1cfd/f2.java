package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class f2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h f215849d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.yj4 f215850e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f215851f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f215852g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f215853h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f215854i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f215855m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f215856n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a2 f215857o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215850e = new r45.yj4();
        this.f215851f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.r1.f217289d);
        this.f215852g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v1.f217728d);
        this.f215853h = new java.util.concurrent.ConcurrentHashMap();
        this.f215856n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x1.f217918d);
        this.f215857o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a2(this);
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2 f2Var, so2.u1 u1Var, int i17) {
        java.lang.String m59226x730bcac6;
        boolean z17;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        f2Var.getClass();
        int i18 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u1Var.getFeedObject().m59226x730bcac6())) {
            android.content.res.Resources resources = f2Var.m80379x76847179().getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity m80379x76847179 = f2Var.m80379x76847179();
            ya2.b2 contact = u1Var.getContact();
            java.lang.String w07 = contact != null ? contact.w0() : null;
            ((ke0.e) xVar).getClass();
            objArr[0] = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, w07);
            m59226x730bcac6 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cw6, objArr);
        } else {
            m59226x730bcac6 = u1Var.getFeedObject().m59226x730bcac6();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m59226x730bcac6);
        f2Var.f215850e.set(5, 0);
        f2Var.f215850e.set(3, java.lang.Integer.valueOf(i17));
        java.util.LinkedList m75941xfb821914 = f2Var.f215850e.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            m75941xfb821914.clear();
        }
        java.util.LinkedList m75941xfb8219142 = f2Var.f215850e.m75941xfb821914(6);
        if (m75941xfb8219142 != null) {
            m75941xfb8219142.clear();
        }
        java.util.LinkedList m75941xfb8219143 = f2Var.f215850e.m75941xfb821914(6);
        if (m75941xfb8219143 != null) {
            m75941xfb8219143.add(u1Var.getFeedObject().getFeedObject());
        }
        f2Var.f215850e.set(7, java.lang.Long.valueOf(u1Var.getFeedObject().getTimestamps() + (u1Var.getFeedObject().getFeedObject().m76835x9191e3f7() * 1000)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) f2Var.f215853h.get(java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()));
        if (c16601x7ed0e40c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = f2Var.f215849d;
            if (hVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            hVar.f381610a = c16601x7ed0e40c;
            z17 = true;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar2 = f2Var.f215849d;
            if (hVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            hVar2.f381610a = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar3 = f2Var.f215849d;
            if (hVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = hVar3.f381610a;
            if (c16601x7ed0e40c2 != null) {
                c16601x7ed0e40c2.f66794xa783a79b = c01.id.c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar4 = f2Var.f215849d;
            if (hVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c3 = hVar4.f381610a;
            if (c16601x7ed0e40c3 != null) {
                c16601x7ed0e40c3.f66791xc8a07680 = pm0.v.u(u1Var.mo2128x1ed62e84());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar5 = f2Var.f215849d;
            if (hVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c4 = hVar5.f381610a;
            if (c16601x7ed0e40c4 != null) {
                c16601x7ed0e40c4.f66793x2262335f = 22;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f2Var.f215853h;
            java.lang.Long valueOf = java.lang.Long.valueOf(u1Var.mo2128x1ed62e84());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar6 = f2Var.f215849d;
            if (hVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c5 = hVar6.f381610a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16601x7ed0e40c5);
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar7 = f2Var.f215849d;
        if (hVar7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c6 = hVar7.f381610a;
        if (c16601x7ed0e40c6 != null) {
            c16601x7ed0e40c6.f66791xc8a07680 = pm0.v.u(u1Var.mo2128x1ed62e84());
            c16601x7ed0e40c6.v0().set(1, m59226x730bcac6);
            r45.lr4 v07 = c16601x7ed0e40c6.v0();
            ya2.b2 contact2 = u1Var.getContact();
            v07.set(5, contact2 != null ? contact2.m176700xe5e0d2a0() : "");
            r45.yj4 yj4Var = f2Var.f215850e;
            c16601x7ed0e40c6.f66790x225a93cf = yj4Var != null ? yj4Var.mo14344x5f01b1f6() : null;
            ya2.b2 contact3 = u1Var.getContact();
            if (contact3 != null) {
                c16601x7ed0e40c6.v0().set(0, contact3.w0());
                c16601x7ed0e40c6.v0().set(10, contact3.D0());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = contact3.f69300x731cac1b;
                if (c19780xceb4c4dc != null) {
                    if (!(c19780xceb4c4dc.m76027x1cbb0791() > 0)) {
                        c19780xceb4c4dc = null;
                    }
                    if (c19780xceb4c4dc != null) {
                        c16601x7ed0e40c6.v0().set(6, java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791()));
                        c16601x7ed0e40c6.v0().set(2, c19780xceb4c4dc.m76028x11716638());
                    }
                }
            }
            if (hc2.o0.G(u1Var.getFeedObject().getFeedObject())) {
                r45.lr4 v08 = c16601x7ed0e40c6.v0();
                r45.f1 b17 = hc2.g0.b(u1Var.getFeedObject().getFeedObject());
                if (b17 == null || (m75945x2fec8307 = b17.m75945x2fec8307(0)) == null) {
                    m75945x2fec8307 = c16601x7ed0e40c6.v0().m75945x2fec8307(0);
                }
                v08.set(0, m75945x2fec8307);
                r45.lr4 v09 = c16601x7ed0e40c6.v0();
                r45.f1 b18 = hc2.g0.b(u1Var.getFeedObject().getFeedObject());
                if (b18 == null || (m75945x2fec83072 = b18.m75945x2fec8307(1)) == null) {
                    m75945x2fec83072 = c16601x7ed0e40c6.v0().m75945x2fec8307(5);
                }
                v09.set(5, m75945x2fec83072);
                c16601x7ed0e40c6.v0().set(6, 0);
                c16601x7ed0e40c6.v0().set(2, "");
            }
            r45.lr4 v010 = c16601x7ed0e40c6.v0();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = u1Var.getFeedObject().getFeedObject().m76802x2dd01666();
            if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                i18 = c19788xd7cfd73e.m76629x36bbd779();
            }
            v010.set(3, java.lang.Integer.valueOf(i18));
        }
        if (f2Var.f215854i) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar8 = f2Var.f215849d;
        if (hVar8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.d(hVar8));
        if (z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "addToTaskbar: add to history, playTime = " + i17 + ", feedId = " + pm0.v.u(u1Var.mo2128x1ed62e84()));
    }

    public final boolean P6() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 R6 = R6();
        if (R6 == null) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = R6.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = R6.p0(c1162x665295de.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        if (s0Var == null) {
            return false;
        }
        java.lang.Object obj = s0Var.f374658i;
        if (!(obj instanceof so2.u1)) {
            return false;
        }
        so2.u1 u1Var = (so2.u1) obj;
        if ((!u1Var.getFeedObject().m59314x4d5c4d55() || u1Var.f492164e) && !this.f215854i) {
            return false;
        }
        if (this.f215854i && u1Var.mo2128x1ed62e84() != m158359x1e885992().getLongExtra("KEY_CACHE_OBJECT_ID", 0L)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "addOrUpdateHistory: return for multi task, curr feed id=".concat(pm0.v.u(u1Var.mo2128x1ed62e84())));
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        pm0.v.L("addHistory", true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.q1(this, obj, c15196x85976f5f != null ? c15196x85976f5f.m61470x3db12880() : 0));
        return true;
    }

    public final void Q6(in5.s0 holder, boolean z17) {
        java.lang.String m59226x730bcac6;
        android.graphics.Bitmap bitmap;
        java.lang.String m75945x2fec8307;
        int i17;
        java.lang.String m75945x2fec83072;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "addToMultiTask: item is not BaseFinderFeed");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "addToMultiTask: item=" + abstractC14490x69736cb5 + ", isFromSwipe=" + z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC14490x69736cb5.getFeedObject().m59226x730bcac6())) {
            android.content.res.Resources resources = m80379x76847179().getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity m80379x76847179 = m80379x76847179();
            ya2.b2 contact = abstractC14490x69736cb5.getContact();
            java.lang.String w07 = contact != null ? contact.w0() : null;
            ((ke0.e) xVar).getClass();
            objArr[0] = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, w07);
            m59226x730bcac6 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cw6, objArr);
        } else {
            m59226x730bcac6 = abstractC14490x69736cb5.getFeedObject().m59226x730bcac6();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m59226x730bcac6);
        r45.yj4 yj4Var = new r45.yj4();
        yj4Var.set(3, 0);
        java.util.LinkedList m75941xfb821914 = yj4Var.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            m75941xfb821914.clear();
        }
        java.util.LinkedList m75941xfb8219142 = yj4Var.m75941xfb821914(6);
        if (m75941xfb8219142 != null) {
            m75941xfb8219142.clear();
        }
        java.util.LinkedList m75941xfb8219143 = yj4Var.m75941xfb821914(6);
        if (m75941xfb8219143 != null) {
            m75941xfb8219143.add(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        }
        r45.hl2 m76756xf0f8a852 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76756xf0f8a852();
        yj4Var.set(7, java.lang.Long.valueOf(m76756xf0f8a852 != null ? m76756xf0f8a852.m75942xfb822ef2(0) : c01.id.c()));
        abstractC14490x69736cb5.getFeedObject().getFeedObject().m76835x9191e3f7();
        long c17 = c01.id.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = this.f215849d;
        if (hVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = hVar.f381610a;
        if (c16601x7ed0e40c != null) {
            c16601x7ed0e40c.f66791xc8a07680 = pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            c16601x7ed0e40c.f66792x98981ec = new r45.lr4();
            c16601x7ed0e40c.v0().set(1, m59226x730bcac6);
            ya2.b2 contact2 = abstractC14490x69736cb5.getContact();
            if (contact2 != null) {
                c16601x7ed0e40c.v0().set(5, contact2.m176700xe5e0d2a0());
                c16601x7ed0e40c.v0().set(0, contact2.w0());
                c16601x7ed0e40c.v0().set(10, contact2.D0());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc = contact2.f69300x731cac1b;
                if (c19780xceb4c4dc != null) {
                    if (!(c19780xceb4c4dc.m76027x1cbb0791() > 0)) {
                        c19780xceb4c4dc = null;
                    }
                    if (c19780xceb4c4dc != null) {
                        c16601x7ed0e40c.v0().set(6, java.lang.Integer.valueOf(c19780xceb4c4dc.m76027x1cbb0791()));
                        c16601x7ed0e40c.v0().set(2, c19780xceb4c4dc.m76028x11716638());
                    }
                }
            }
            c16601x7ed0e40c.f66790x225a93cf = yj4Var.mo14344x5f01b1f6();
            r45.lr4 v07 = c16601x7ed0e40c.v0();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76802x2dd01666();
            v07.set(3, java.lang.Integer.valueOf((m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) ? 0 : c19788xd7cfd73e.m76629x36bbd779()));
            c16601x7ed0e40c.f66789xac3be4e = c17;
            if (hc2.o0.G(abstractC14490x69736cb5.getFeedObject().getFeedObject())) {
                r45.lr4 v08 = c16601x7ed0e40c.v0();
                r45.f1 b17 = hc2.g0.b(abstractC14490x69736cb5.getFeedObject().getFeedObject());
                if (b17 == null || (m75945x2fec8307 = b17.m75945x2fec8307(0)) == null) {
                    m75945x2fec8307 = c16601x7ed0e40c.v0().m75945x2fec8307(0);
                }
                v08.set(0, m75945x2fec8307);
                r45.lr4 v09 = c16601x7ed0e40c.v0();
                r45.f1 b18 = hc2.g0.b(abstractC14490x69736cb5.getFeedObject().getFeedObject());
                if (b18 == null || (m75945x2fec83072 = b18.m75945x2fec8307(1)) == null) {
                    i17 = 5;
                    m75945x2fec83072 = c16601x7ed0e40c.v0().m75945x2fec8307(5);
                } else {
                    i17 = 5;
                }
                v09.set(i17, m75945x2fec83072);
                c16601x7ed0e40c.v0().set(6, 0);
                c16601x7ed0e40c.v0().set(2, "");
            }
        }
        if (S6()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
            c16601x7ed0e40c2.f66791xc8a07680 = pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            c16601x7ed0e40c2.f66793x2262335f = 22;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).Ri(c16601x7ed0e40c2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar2 = this.f215849d;
                if (hVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                    throw null;
                }
                hVar2.B(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "addToMultiTask: item=" + abstractC14490x69736cb5 + ", isFromSwipe=" + z17 + " return for removeTaskInfoAndCoverImg");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar3 = this.f215849d;
        if (hVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
        r45.kr4 kr4Var = hVar3.f381612c;
        r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.m75936x14adae67(6) : null;
        if (er4Var != null) {
            er4Var.set(0, java.lang.Long.valueOf(z17 ? 7L : 8L));
        }
        pf5.u uVar = pf5.u.f435469a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po) uVar.c(m158354x19263085()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po.class)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar4 = this.f215849d;
            if (hVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h.c0(hVar4, c15196x85976f5f.m61467x12501425(), pm0.v.t(c15196x85976f5f), false, 4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) uVar.b(m80379x76847179()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
            if (g1Var != null) {
                g1Var.f215989e = false;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar5 = this.f215849d;
                if (hVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                    throw null;
                }
                hVar5.B(true);
            }
        } else {
            if (z17) {
                bitmap = null;
            } else {
                bitmap = uj5.g.d(holder.f3639x46306858, (int) (r2.getWidth() / 1.0f), (int) (holder.f3639x46306858.getHeight() / 1.0f), false, android.graphics.Bitmap.Config.ARGB_8888);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar6 = this.f215849d;
            if (hVar6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h.c0(hVar6, bitmap, null, z17, 2, null);
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1 g1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1) uVar.b(m80379x76847179()).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.g1.class);
                if (g1Var2 != null) {
                    g1Var2.f215989e = false;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar7 = this.f215849d;
                if (hVar7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                    throw null;
                }
                if (S6()) {
                    hVar7.V(true, 8, jk3.c.f381614e);
                } else {
                    ak3.c cVar = hVar7.f381644d;
                    if (cVar != null) {
                        ck3.q.f124046a.a(cVar, ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Bi(), null, true, -1.0f, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.g(hVar7), false, false);
                    }
                }
                if (!S6()) {
                    pm0.v.V(500L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s1(this));
                }
            }
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("view_id", "button_float_frame");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[2] = new jz5.l("behaviour_session_id", V6 != null ? V6.m75945x2fec8307(0) : null);
        lVarArr[3] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[4] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[5] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 R6() {
        android.view.View mo144222x4ff8c0f0;
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c().m7474xfb86a31b();
            mo144222x4ff8c0f0 = m7474xfb86a31b != null ? m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e) : null;
        } else {
            mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.m6e);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = mo144222x4ff8c0f0 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) mo144222x4ff8c0f0 : null;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00.m82555x4905e9fa();
        }
        return null;
    }

    public final boolean S6() {
        return ((java.lang.Boolean) ((jz5.n) this.f215856n).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (this.f215854i) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216038d) {
                boolean P6 = P6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAddHistoryUIC", "onBackPressed: update ret=" + P6);
                if (P6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = this.f215849d;
                    if (hVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
                        throw null;
                    }
                    if (hVar.U(2, false)) {
                        this.f215855m = true;
                        return true;
                    }
                } else {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 2, null, 0, null, 14, null);
                }
            }
        }
        return super.mo2274xbdc3c5dc();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if ((r11 != null && r11.i7()) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        r11 = r10.f215849d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cb, code lost:
    
        if (r11 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        r11.d0(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d1, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c7, code lost:
    
        if ((r11 != null && (r11 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe)) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo739xfd763ae1(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.mo739xfd763ae1(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = this.f215849d;
        if (hVar != null) {
            hVar.A();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1558xb81dc63e.h hVar = this.f215849d;
        if (hVar != null) {
            hVar.z();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("multiTaskHelper");
            throw null;
        }
    }
}
