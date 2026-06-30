package dw0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f325616e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f325617f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f325618g;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f325619a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 f325620b;

    /* renamed from: c, reason: collision with root package name */
    public final zu0.i f325621c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f325622d;

    static {
        new dw0.b(null);
        dw0.a aVar = dw0.a.f325611e;
        f325616e = new com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2(9, "OriginTimbre", -1L, "无", "", "", new java.util.HashMap());
        f325617f = new com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2(12, "OriginTimbre", -1L, "原声", "", "", new java.util.HashMap());
        f325618g = new com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2(-1, "", -1L, "无", "", "", new java.util.HashMap());
    }

    public c(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, zu0.i materialLoadState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        this.f325619a = info;
        this.f325620b = c4190xd8dd3713;
        this.f325621c = materialLoadState;
        this.f325622d = z17;
    }

    public static dw0.c a(dw0.c cVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713, zu0.i materialLoadState, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = cVar.f325619a;
        }
        if ((i17 & 2) != 0) {
            c4190xd8dd3713 = cVar.f325620b;
        }
        if ((i17 & 4) != 0) {
            materialLoadState = cVar.f325621c;
        }
        if ((i17 & 8) != 0) {
            z17 = cVar.f325622d;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        return new dw0.c(info, c4190xd8dd3713, materialLoadState, z17);
    }

    public final boolean b() {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = this.f325619a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c4104x6d422cb2, "<this>");
        java.lang.String str = c4104x6d422cb2.f129757b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
        dw0.a aVar = dw0.a.f325611e;
        return r26.i0.y(str, "OriginTimbre", false);
    }

    /* renamed from: equals */
    public boolean m126316xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0.c)) {
            return false;
        }
        dw0.c cVar = (dw0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325619a, cVar.f325619a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325620b, cVar.f325620b) && this.f325621c == cVar.f325621c && this.f325622d == cVar.f325622d;
    }

    /* renamed from: hashCode */
    public int m126317x8cdac1b() {
        int hashCode = this.f325619a.hashCode() * 31;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = this.f325620b;
        return ((((hashCode + (c4190xd8dd3713 == null ? 0 : c4190xd8dd3713.hashCode())) * 31) + this.f325621c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f325622d);
    }

    /* renamed from: toString */
    public java.lang.String m126318x9616526c() {
        return "TimbreMaterialInfo(info=" + this.f325619a + ", segment=" + this.f325620b + ", materialLoadState=" + this.f325621c + ", isSelected=" + this.f325622d + ')';
    }
}
