package zv0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: d, reason: collision with root package name */
    public static final zv0.r f557753d = new zv0.r(new com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2(11, "Blank", -1, "无", "", "", new java.util.HashMap()), zu0.i.f557209f, true);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f557754a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f557755b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f557756c;

    public r(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        this.f557754a = info;
        this.f557755b = materialLoadState;
        this.f557756c = z17;
    }

    public static zv0.r a(zv0.r rVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = rVar.f557754a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = rVar.f557755b;
        }
        if ((i17 & 4) != 0) {
            z17 = rVar.f557756c;
        }
        rVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        return new zv0.r(info, materialLoadState, z17);
    }

    /* renamed from: equals */
    public boolean m179715xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv0.r)) {
            return false;
        }
        zv0.r rVar = (zv0.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557754a, rVar.f557754a) && this.f557755b == rVar.f557755b && this.f557756c == rVar.f557756c;
    }

    /* renamed from: hashCode */
    public int m179716x8cdac1b() {
        return (((this.f557754a.hashCode() * 31) + this.f557755b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f557756c);
    }

    /* renamed from: toString */
    public java.lang.String m179717x9616526c() {
        return "TransitionMaterialInfo(info=" + this.f557754a + ", materialLoadState=" + this.f557755b + ", isSelected=" + this.f557756c + ')';
    }
}
