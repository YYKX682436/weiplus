package kw0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f394321a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f394322b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f394323c;

    public a(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        this.f394321a = info;
        this.f394322b = materialLoadState;
        this.f394323c = z17;
    }

    public static kw0.a a(kw0.a aVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = aVar.f394321a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = aVar.f394322b;
        }
        if ((i17 & 4) != 0) {
            z17 = aVar.f394323c;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        return new kw0.a(info, materialLoadState, z17);
    }

    /* renamed from: equals */
    public boolean m144464xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0.a)) {
            return false;
        }
        kw0.a aVar = (kw0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394321a, aVar.f394321a) && this.f394322b == aVar.f394322b && this.f394323c == aVar.f394323c;
    }

    /* renamed from: hashCode */
    public int m144465x8cdac1b() {
        return (((this.f394321a.hashCode() * 31) + this.f394322b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f394323c);
    }

    /* renamed from: toString */
    public java.lang.String m144466x9616526c() {
        return "StickerData(info=" + this.f394321a + ", materialLoadState=" + this.f394322b + ", isSelected=" + this.f394323c + ')';
    }
}
