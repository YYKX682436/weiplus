package oy;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f431363a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f431364b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f431365c;

    public m(java.lang.String text, java.lang.Boolean bool, java.util.List consumedMessages) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumedMessages, "consumedMessages");
        this.f431363a = text;
        this.f431364b = bool;
        this.f431365c = consumedMessages;
    }

    /* renamed from: equals */
    public boolean m157348xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy.m)) {
            return false;
        }
        oy.m mVar = (oy.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431363a, mVar.f431363a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431364b, mVar.f431364b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431365c, mVar.f431365c);
    }

    /* renamed from: hashCode */
    public int m157349x8cdac1b() {
        int hashCode = this.f431363a.hashCode() * 31;
        java.lang.Boolean bool = this.f431364b;
        return ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.f431365c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157350x9616526c() {
        return "ReadableMessageResult(text=" + this.f431363a + ", isSaid=" + this.f431364b + ", consumedMessages=" + this.f431365c + ')';
    }
}
