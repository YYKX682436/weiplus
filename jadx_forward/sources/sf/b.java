package sf;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f488468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f488469b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f488470c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f488471d;

    public b(int i17, int i18, java.lang.Integer num, yz5.a aVar) {
        this.f488468a = i17;
        this.f488469b = i18;
        this.f488470c = num;
        this.f488471d = aVar;
    }

    /* renamed from: equals */
    public boolean m164366xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf.b)) {
            return false;
        }
        sf.b bVar = (sf.b) obj;
        return this.f488468a == bVar.f488468a && this.f488469b == bVar.f488469b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488470c, bVar.f488470c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488471d, bVar.f488471d);
    }

    /* renamed from: hashCode */
    public int m164367x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f488468a) * 31) + java.lang.Integer.hashCode(this.f488469b)) * 31;
        java.lang.Integer num = this.f488470c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        yz5.a aVar = this.f488471d;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m164368x9616526c() {
        return "KeyboardHeightDispatchContent(keyboardHeight=" + this.f488468a + ", keyboardPanelHeight=" + this.f488469b + ", viewId=" + this.f488470c + ", dispatchCallback=" + this.f488471d + ')';
    }
}
