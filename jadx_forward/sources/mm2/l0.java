package mm2;

/* loaded from: classes3.dex */
public final class l0 extends mm2.e {

    /* renamed from: s, reason: collision with root package name */
    public static final mm2.h0 f410739s = new mm2.h0(null);

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f410740f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f410741g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f410742h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410743i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f410744m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410745n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f410746o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 f410747p;

    /* renamed from: q, reason: collision with root package name */
    public mm2.i0 f410748q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f410749r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410740f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("cheer_animation_preload")));
        this.f410742h = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410743i = c14227x4262fb44;
        this.f410744m = c14227x4262fb44;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
        this.f410745n = c14227x4262fb442;
        this.f410746o = c14227x4262fb442;
        this.f410747p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
    }

    public final java.lang.String N6(r45.i30 i30Var) {
        if (i30Var != null) {
            java.lang.String m75945x2fec8307 = i30Var.m75945x2fec8307(0);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(i30Var.m75945x2fec8307(0));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
                return ((c61.p2) ybVar).bj("ec_cheer_animation_dir", a17);
            }
        }
        return "";
    }

    public final void O6(mm2.i0 originCheerInfo, java.util.LinkedList linkedList) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originCheerInfo, "originCheerInfo");
        this.f410748q = originCheerInfo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCheerAnimationInfo: ");
        if (linkedList != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[ ");
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb7.append(f410739s.b((r45.nn1) it.next()));
            }
            sb7.append(" ]");
            str = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCheerAnimationSlice", sb6.toString());
        if (linkedList != null) {
            java.util.ArrayList arrayList = this.f410742h;
            arrayList.clear();
            arrayList.addAll(linkedList);
            boolean z17 = false;
            r45.nn1 nn1Var = (r45.nn1) kz5.n0.a0(linkedList, 0);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f410741g;
            if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
                z17 = true;
            }
            if (z17 || nn1Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCheerAnimationSlice", "checkPreload is doing, return");
            } else {
                this.f410741g = p3325xe03a0797.p3326xc267989b.l.d(this.f410740f, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new mm2.k0(nn1Var, this, null), 2, null);
            }
        }
    }

    public final void P6(r45.lk1 lk1Var) {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCheerSwitch isPluginActive: ");
        sb6.append(this.f410749r);
        sb6.append(" info: ");
        if (lk1Var != null) {
            str = "can_display: " + lk1Var.m75933x41a8a7f2(0) + " resource_id: " + lk1Var.m75942xfb822ef2(1) + " speed: " + lk1Var.m75937x160e9ec7(2);
        } else {
            str = null;
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCheerAnimationSlice", sb6.toString());
        if (this.f410749r && lk1Var != null) {
            java.util.Iterator it = this.f410742h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.nn1) obj).m75942xfb822ef2(6) == lk1Var.m75942xfb822ef2(1)) {
                        break;
                    }
                }
            }
            r45.nn1 nn1Var = (r45.nn1) obj;
            this.f410743i.mo7808x76db6cb1(nn1Var != null ? new mm2.j0(nn1Var, lk1Var.m75933x41a8a7f2(0), lk1Var.m75937x160e9ec7(2), lk1Var.m75942xfb822ef2(3)) : null);
        }
    }
}
