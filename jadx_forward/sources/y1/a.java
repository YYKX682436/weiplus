package y1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f540225a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.b f540226b;

    public a(java.lang.String str, jz5.b bVar) {
        this.f540225a = str;
        this.f540226b = bVar;
    }

    /* renamed from: equals */
    public boolean m176314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.a)) {
            return false;
        }
        y1.a aVar = (y1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540225a, aVar.f540225a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540226b, aVar.f540226b);
    }

    /* renamed from: hashCode */
    public int m176315x8cdac1b() {
        java.lang.String str = this.f540225a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        jz5.b bVar = this.f540226b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m176316x9616526c() {
        return "AccessibilityAction(label=" + this.f540225a + ", action=" + this.f540226b + ')';
    }
}
