package th5;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.d f500887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(th5.d dVar) {
        super(1);
        this.f500887d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        int i18;
        com.p314xaae8f345.mm.ui.ah a17;
        int i19;
        int i27;
        lf3.k kVar = (lf3.k) obj;
        if (kVar == null || (i17 = kVar.f399855a) <= 0 || (i18 = kVar.f399856b) <= 0 || (i19 = (a17 = com.p314xaae8f345.mm.ui.bh.a(null)).f278668a) <= 0 || (i27 = a17.f278669b) <= 0) {
            return null;
        }
        float max = java.lang.Math.max(i17 / i19, i18 / i27);
        float max2 = java.lang.Math.max(5.0f, max * 2.0f);
        float max3 = java.lang.Math.max(2.0f, java.lang.Math.min(0.5f * max, 4.0f));
        this.f500887d.Q("init scaleConfigProvider: pixelPerfectScale: " + max + ", dynamicMax: " + max2 + ", dynamicDoubleTap: " + max3, new java.lang.Object[0]);
        return new mg3.l(0.0f, 0.0f, max2, max3, 3, null);
    }
}
