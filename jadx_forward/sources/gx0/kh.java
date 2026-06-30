package gx0;

/* loaded from: classes5.dex */
public final class kh extends ou0.p {

    /* renamed from: r, reason: collision with root package name */
    public ex0.a0 f358175r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f358176s;

    /* renamed from: t, reason: collision with root package name */
    public final float f358177t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f358178u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f358179v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f358180w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358176s = new p012xc85e97e9.p093xedfae76a.j0();
        this.f358177t = activity.getResources().getDisplayMetrics().density;
        this.f358178u = jz5.h.b(new gx0.jh(this));
        this.f358179v = jz5.h.b(new gx0.eh(this));
    }

    public static final void Y6(gx0.kh khVar) {
        int i17 = khVar.m80379x76847179().getResources().getDisplayMetrics().widthPixels;
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        float qj6 = (float) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20394x6a10126d());
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        float qj7 = (float) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20400xac05ee31());
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).getClass();
        float f17 = i17;
        float f18 = f17 / qj6;
        float f19 = f17 / qj7;
        float qj8 = f17 / ((float) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).qj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2546x5be56f80.C20391x2868202d()));
        ex0.a0 a0Var = khVar.f358175r;
        if (a0Var != null) {
            a0Var.f338642s.mo523x53d8522f(java.lang.Float.valueOf(f18));
            a0Var.f338643t.mo523x53d8522f(java.lang.Float.valueOf(f19));
            a0Var.f338644u.mo523x53d8522f(java.lang.Float.valueOf(qj8));
            a0Var.f338645v.mo523x53d8522f(java.lang.Float.valueOf(qj8));
        }
    }

    public final void Z6(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 elementSegment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elementSegment, "elementSegment");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return;
        }
        android.graphics.PointF m07 = elementSegment.m0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m07, "getLayerPosition(...)");
        float n07 = elementSegment.n0();
        android.graphics.PointF o07 = elementSegment.o0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o07, "getLayerScale(...)");
        ug.m C = elementSegment.C();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
        java.util.List list = a0Var.f338630g.f338711f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((ex0.r) next).f338702c == C) {
                arrayList.add(next);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = ((ex0.r) it6.next()).f338700a;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) c4190xd8dd3713 : null;
            if (c4183xefcb50b7 != null) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4183xefcb50b7.D();
                if (D != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.Z(c4183xefcb50b7, m07, D);
                }
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4183xefcb50b7.D();
                if (D2 != null) {
                    com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7.J(c4183xefcb50b7, n07, D2);
                }
                c4183xefcb50b7.t0(o07);
            }
        }
    }

    public final java.lang.Object a7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.ch(this, null), interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentId, "segmentId");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = o7();
        if (o76 != null) {
            return o76.m(segmentId);
        }
        return null;
    }

    public final java.util.List c7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713[] l17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = o7();
        if (o76 == null || (c4160xdd704649 = o76.f129947a) == null || (l17 = c4160xdd704649.l()) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 : l17) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 != null) {
                arrayList.add(c4181x2248e1a3);
            }
        }
        return arrayList;
    }

    public final java.util.List d7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713[] l17;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = o7();
        if (o76 == null || (c4160xdd704649 = o76.f129947a) == null || (l17 = c4160xdd704649.l()) == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 : l17) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4182xb2a3bd49 h07 = c4181x2248e1a3 != null ? c4181x2248e1a3.h0() : null;
            if (h07 != null) {
                arrayList.add(h07);
            }
        }
        return arrayList;
    }

    public final ex0.b e7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.v vVar = a0Var.f338630g;
        vVar.getClass();
        java.util.Iterator it = ((java.util.ArrayList) vVar.f338713h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ex0.b) obj).f338700a.B().m34002x805f158c(time)) {
                break;
            }
        }
        ex0.r rVar = (ex0.r) obj;
        if (rVar instanceof ex0.b) {
            return (ex0.b) rVar;
        }
        return null;
    }

    public final ex0.c f7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f338630g.g(segmentID);
        ex0.c cVar = g17 instanceof ex0.c ? (ex0.c) g17 : null;
        if (cVar != null) {
            return cVar;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    public final ex0.c g7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a time) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        return ex0.i0.d(a0Var, time);
    }

    public final int h7() {
        ex0.a0 a0Var = this.f358175r;
        if (a0Var != null) {
            return a0Var.f338624a.c();
        }
        return 0;
    }

    public final ex0.k i7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f338630g.g(segmentID);
        ex0.k kVar = g17 instanceof ex0.k ? (ex0.k) g17 : null;
        if (kVar != null) {
            return kVar;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    public final int k7() {
        ex0.a0 a0Var = this.f358175r;
        if (a0Var != null) {
            return a0Var.f338624a.d();
        }
        return 0;
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb l7() {
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null || !q7()) {
            return null;
        }
        final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649 = a0Var.f338625b.f129947a;
        c4160xdd704649.getClass();
        return (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb) c4160xdd704649.k(null, new r.a() { // from class: com.tencent.maas.moviecomposing.Storyline$$d
            @Override // r.a
            /* renamed from: apply */
            public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
                return com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649.i(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649.this, (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861) obj);
            }
        });
    }

    public final ex0.o m7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f338630g.g(segmentID);
        ex0.o oVar = g17 instanceof ex0.o ? (ex0.o) g17 : null;
        if (oVar != null) {
            return oVar;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    public final ex0.q n7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        return ex0.i0.f(a0Var, segmentID);
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o7() {
        ex0.a0 a0Var = this.f358175r;
        if (a0Var != null) {
            return a0Var.f338625b;
        }
        return null;
    }

    public final ex0.k0 p7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return null;
        }
        ex0.r g17 = a0Var.f338630g.g(segmentID);
        ex0.k0 k0Var = g17 instanceof ex0.k0 ? (ex0.k0) g17 : null;
        if (k0Var != null) {
            return k0Var;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return null;
    }

    public final boolean q7() {
        boolean m34216xc0691448;
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4160xdd704649 c4160xdd704649 = a0Var.f338625b.f129947a;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861) c4160xdd704649.f129936a.get();
        if (c4167x88133861 != null) {
            m34216xc0691448 = c4160xdd704649.m34216xc0691448(c4167x88133861);
            bool = java.lang.Boolean.valueOf(m34216xc0691448);
        }
        return bool.booleanValue();
    }

    public final void r7(java.lang.String actionDesc, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionDesc, "actionDesc");
        ex0.a0 a0Var = this.f358175r;
        if (a0Var == null) {
            return;
        }
        if (c4128x879fba0a == null && (c4128x879fba0a = (com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a) a0Var.f338639p.mo3195x754a37bb()) == null) {
            c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
        }
        ex0.r n17 = a0Var.n();
        a0Var.f338624a.h(new com.p314xaae8f345.p457x3304c6.p479x4179489f.C4169xe31f3fd3(actionDesc, c4128x879fba0a, (n17 == null || (c3971x241f78 = n17.f338701b) == null) ? null : c3971x241f78.m32425x6ac9171()));
        a0Var.S();
    }
}
