package df2;

/* loaded from: classes3.dex */
public final class a9 extends if2.b implements if2.e {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 A;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311220m;

    /* renamed from: n, reason: collision with root package name */
    public int f311221n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f311222o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f311223p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f311224q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f311225r;

    /* renamed from: s, reason: collision with root package name */
    public final int f311226s;

    /* renamed from: t, reason: collision with root package name */
    public r45.yb4 f311227t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f311228u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f311229v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f311230w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 f311231x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 f311232y;

    /* renamed from: z, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311233z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311220m = "GiftFundingDataController";
        this.f311222o = new byte[0];
        this.f311223p = jz5.h.b(df2.v8.f313121d);
        this.f311224q = "fund_uv_task_record";
        this.f311225r = "fund_uv_task_record_save_time";
        this.f311226s = 86400;
        this.f311228u = jz5.h.b(df2.u8.f313038d);
        this.f311229v = jz5.h.b(df2.w8.f313204d);
        this.f311230w = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17(null, 1, null);
        c14226x69ca5d17.f193192e = new df2.t8(this);
        this.f311231x = c14226x69ca5d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d172 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17(null, 1, null);
        c14226x69ca5d172.f193192e = new df2.z8(this);
        this.f311232y = c14226x69ca5d172;
        this.A = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44();
    }

    public final boolean Z6(java.lang.String taskId) {
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        byte[] j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        java.lang.Object obj = null;
        if (this.f311227t == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a76 = a7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a76, "<get-mmkv>(...)");
            java.lang.String str = this.f311224q;
            if (a76.f(str) && (j17 = a76.j(str)) != null) {
                if (!(j17.length == 0)) {
                    try {
                        java.lang.Object newInstance = r45.yb4.class.newInstance();
                        ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance).mo11468x92b714fd(j17);
                        fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                    }
                    this.f311227t = (r45.yb4) fVar;
                }
            }
            fVar = null;
            this.f311227t = (r45.yb4) fVar;
        }
        r45.yb4 yb4Var = this.f311227t;
        if (yb4Var != null && (m75941xfb821914 = yb4Var.m75941xfb821914(0)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.cd4) next).m75945x2fec8307(1), taskId)) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.cd4) obj;
        }
        return obj != null;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a7() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f311223p).mo141623x754a37bb();
    }

    public final boolean b7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311233z;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311220m, "[isFundingSucAnimPlaying] result = " + z17);
        return z17;
    }

    public final void c7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311220m, "[updateLastSendGiftTime] time = " + i17);
        synchronized (this.f311222o) {
            this.f311221n = i17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        this.f311230w.clear();
        ((ku5.t0) ku5.t0.f394148d).q(new df2.y8(true, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStartFromWindow */
    public void mo14864x95cdef51() {
        super.mo14864x95cdef51();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311233z;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }
}
