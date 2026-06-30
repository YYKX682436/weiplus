package f25;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f340625a;

    /* renamed from: b, reason: collision with root package name */
    public volatile f25.m0 f340626b;

    public e(boolean z17, f25.m0 m0Var) {
        this.f340625a = z17;
        this.f340626b = m0Var;
    }

    /* renamed from: equals */
    public boolean m128913xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f25.e)) {
            return false;
        }
        f25.e eVar = (f25.e) obj;
        return this.f340625a == eVar.f340625a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340626b, eVar.f340626b);
    }

    /* renamed from: hashCode */
    public int m128914x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f340625a) * 31) + (this.f340626b == null ? 0 : this.f340626b.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m128915x9616526c() {
        return "CurrentFocusState(hasFocus:" + this.f340625a + ",focusSession:" + this.f340626b + ')';
    }
}
