package sw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 f494955a;

    /* renamed from: b, reason: collision with root package name */
    public final zu0.i f494956b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f494957c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f494958d;

    public d(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        this.f494955a = info;
        this.f494956b = materialLoadState;
        this.f494957c = z17;
        this.f494958d = str;
    }

    public static sw0.d a(sw0.d dVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 info, zu0.i materialLoadState, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            info = dVar.f494955a;
        }
        if ((i17 & 2) != 0) {
            materialLoadState = dVar.f494956b;
        }
        if ((i17 & 4) != 0) {
            z17 = dVar.f494957c;
        }
        if ((i17 & 8) != 0) {
            str = dVar.f494958d;
        }
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialLoadState, "materialLoadState");
        return new sw0.d(info, materialLoadState, z17, str);
    }

    /* renamed from: equals */
    public boolean m165397xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.d)) {
            return false;
        }
        sw0.d dVar = (sw0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494955a, dVar.f494955a) && this.f494956b == dVar.f494956b && this.f494957c == dVar.f494957c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494958d, dVar.f494958d);
    }

    /* renamed from: hashCode */
    public int m165398x8cdac1b() {
        int hashCode = ((((this.f494955a.hashCode() * 31) + this.f494956b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f494957c)) * 31;
        java.lang.String str = this.f494958d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m165399x9616526c() {
        return "TextMaterialInfo(info=" + this.f494955a + ", materialLoadState=" + this.f494956b + ", isSelected=" + this.f494957c + ", previewGifPath=" + this.f494958d + ')';
    }
}
