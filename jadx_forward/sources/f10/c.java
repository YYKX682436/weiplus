package f10;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f340078a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f340079b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f340080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f340081d;

    public c(int i17, java.lang.String str, boolean z17, int i18) {
        this.f340078a = i17;
        this.f340079b = str;
        this.f340080c = z17;
        this.f340081d = i18;
    }

    /* renamed from: equals */
    public boolean m128694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f10.c)) {
            return false;
        }
        f10.c cVar = (f10.c) obj;
        return this.f340078a == cVar.f340078a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340079b, cVar.f340079b) && this.f340080c == cVar.f340080c && this.f340081d == cVar.f340081d;
    }

    /* renamed from: hashCode */
    public int m128695x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f340078a) * 31;
        java.lang.String str = this.f340079b;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f340080c)) * 31) + java.lang.Integer.hashCode(this.f340081d);
    }

    /* renamed from: toString */
    public java.lang.String m128696x9616526c() {
        return "EcsOrderAndCardEntranceInfo(showType=" + this.f340078a + ", iconUrl=" + this.f340079b + ", needPreload=" + this.f340080c + ", titleType=" + this.f340081d + ')';
    }
}
