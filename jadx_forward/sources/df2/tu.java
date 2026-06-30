package df2;

/* loaded from: classes3.dex */
public final class tu extends if2.b implements zn0.z {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f313006m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f313007n;

    /* renamed from: o, reason: collision with root package name */
    public int f313008o;

    /* renamed from: p, reason: collision with root package name */
    public int f313009p;

    /* renamed from: q, reason: collision with root package name */
    public int f313010q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f313011r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313006m = jz5.h.b(df2.ru.f312803d);
        this.f313007n = jz5.h.b(df2.su.f312906d);
    }

    public final boolean Z6() {
        return ((java.lang.Boolean) ((jz5.n) this.f313006m).mo141623x754a37bb()).booleanValue();
    }

    public final void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "onPerformanceClose performanceEnable: " + Z6() + " isPerformanceStart: " + this.f313011r);
        if (Z6() && this.f313011r) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("mic_total_size", java.lang.Integer.valueOf(this.f313008o));
            linkedHashMap.put("mic_video_size", java.lang.Integer.valueOf(this.f313009p));
            linkedHashMap.put("mic_audio_size", java.lang.Integer.valueOf(this.f313010q));
            linkedHashMap.put("is_anchor", java.lang.Integer.valueOf(zl2.r4.f555483a.x1() ? 1 : 0));
            linkedHashMap.put("trtc_performance", 1);
            ae2.in inVar = ae2.in.f85221a;
            linkedHashMap.put("trtc_op_switch", ((lb2.j) ((jz5.n) ae2.in.f85251d).mo141623x754a37bb()).r());
            this.f313011r = false;
            ts5.d dVar = (ts5.d) ((jz5.n) this.f313007n).mo141623x754a37bb();
            if (dVar != null) {
                dVar.a(linkedHashMap);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        super.mo8997x8001c97e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "onLiveActivate: " + hashCode());
        zn0.x.f555947a.f555952e = this;
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCPerformanceDetector", "onLiveDeactivate: " + hashCode());
        a7();
        zn0.x.f555947a.f555952e = null;
    }
}
