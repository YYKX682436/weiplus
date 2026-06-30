package c13;

/* loaded from: classes11.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f119424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f119425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f119427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f119428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119429i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f119430m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3 f119431n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(y03.f fVar, int i17, int i18, int i19, int i27, int i28, int i29, com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3 c24115x44252fc3) {
        super(1);
        this.f119424d = fVar;
        this.f119425e = i17;
        this.f119426f = i18;
        this.f119427g = i19;
        this.f119428h = i27;
        this.f119429i = i28;
        this.f119430m = i29;
        this.f119431n = c24115x44252fc3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value) ? null : value, java.lang.Boolean.TRUE);
        int i17 = this.f119427g;
        int i18 = this.f119429i;
        int i19 = this.f119428h;
        y03.f fVar = this.f119424d;
        if (b17) {
            fVar.f540174d = this.f119425e;
            fVar.f540175e = this.f119426f;
            fVar.f540176f = i17;
        } else {
            fVar.f540174d = i19;
            fVar.f540175e = i18;
            fVar.f540176f = this.f119430m;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback onTextureInfoChanged textureId:");
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3 c24115x44252fc3 = this.f119431n;
        sb6.append(c24115x44252fc3.m89350xc2ca74e0());
        sb6.append(", width:");
        sb6.append(c24115x44252fc3.m89351x755bd410());
        sb6.append(", height:");
        sb6.append(c24115x44252fc3.m89347x1c4fb41d());
        sb6.append(", orientation:");
        sb6.append(i17);
        sb6.append(", oldWidth:");
        sb6.append(i19);
        sb6.append(", oldHeight:");
        sb6.append(i18);
        sb6.append(", ret:");
        sb6.append((java.lang.Object) p3321xbce91901.C29043x91b2b43d.m143904x7003d4e1(value));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipService", sb6.toString());
        return jz5.f0.f384359a;
    }
}
