package w33;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f524246a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f524247b;

    public d(boolean z17, boolean z18, boolean z19) {
        this.f524246a = z18;
        this.f524247b = z19;
    }

    /* renamed from: equals */
    public boolean m173190xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.d)) {
            return false;
        }
        w33.d dVar = (w33.d) obj;
        dVar.getClass();
        return this.f524246a == dVar.f524246a && this.f524247b == dVar.f524247b;
    }

    /* renamed from: hashCode */
    public int m173191x8cdac1b() {
        return (((java.lang.Boolean.hashCode(true) * 31) + java.lang.Boolean.hashCode(this.f524246a)) * 31) + java.lang.Boolean.hashCode(this.f524247b);
    }

    /* renamed from: toString */
    public java.lang.String m173192x9616526c() {
        return "MyRoomFooterDataWrapper(isShowFooter=true, isExpanded=" + this.f524246a + ", hasUnreadMsg=" + this.f524247b + ')';
    }
}
