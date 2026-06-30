package zg0;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f554313a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f554314b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f554315c;

    /* renamed from: d, reason: collision with root package name */
    public double f554316d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f554317e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a f554318f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.zc f554319g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f554320h;

    public s3(android.content.Context context, android.content.Intent intent, boolean z17, double d17, boolean z18, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar, com.p314xaae8f345.mm.ui.zc zcVar, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f554313a = context;
        this.f554314b = intent;
        this.f554315c = z17;
        this.f554316d = d17;
        this.f554317e = z18;
        this.f554318f = aVar;
        this.f554319g = zcVar;
        this.f554320h = z19;
    }

    /* renamed from: equals */
    public boolean m178916xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg0.s3)) {
            return false;
        }
        zg0.s3 s3Var = (zg0.s3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554313a, s3Var.f554313a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554314b, s3Var.f554314b) && this.f554315c == s3Var.f554315c && java.lang.Double.compare(this.f554316d, s3Var.f554316d) == 0 && this.f554317e == s3Var.f554317e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554318f, s3Var.f554318f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554319g, s3Var.f554319g) && this.f554320h == s3Var.f554320h;
    }

    /* renamed from: hashCode */
    public int m178917x8cdac1b() {
        int hashCode = ((((((((this.f554313a.hashCode() * 31) + this.f554314b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f554315c)) * 31) + java.lang.Double.hashCode(this.f554316d)) * 31) + java.lang.Boolean.hashCode(this.f554317e)) * 31;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = this.f554318f;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.p314xaae8f345.mm.ui.zc zcVar = this.f554319g;
        return ((hashCode2 + (zcVar != null ? zcVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f554320h);
    }

    /* renamed from: toString */
    public java.lang.String m178918x9616526c() {
        return "StartWebSearchHalfScreenParams(context=" + this.f554313a + ", intent=" + this.f554314b + ", showHeader=" + this.f554315c + ", heightRatio=" + this.f554316d + ", enableDrag=" + this.f554317e + ", drawerListener=" + this.f554318f + ", onActivityResult=" + this.f554319g + ", hideMask=" + this.f554320h + ')';
    }

    public /* synthetic */ s3(android.content.Context context, android.content.Intent intent, boolean z17, double d17, boolean z18, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar, com.p314xaae8f345.mm.ui.zc zcVar, boolean z19, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, intent, (i17 & 4) != 0 ? true : z17, (i17 & 8) != 0 ? 0.7d : d17, (i17 & 16) != 0 ? true : z18, (i17 & 32) != 0 ? null : aVar, (i17 & 64) != 0 ? null : zcVar, (i17 & 128) != 0 ? false : z19);
    }
}
