package kh5;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f389597a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f389598b;

    /* renamed from: c, reason: collision with root package name */
    public final jh5.a f389599c;

    public c(long j17, boolean z17, jh5.a ext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        this.f389597a = j17;
        this.f389598b = z17;
        this.f389599c = ext;
    }

    /* renamed from: equals */
    public boolean m143473xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh5.c)) {
            return false;
        }
        kh5.c cVar = (kh5.c) obj;
        return this.f389597a == cVar.f389597a && this.f389598b == cVar.f389598b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389599c, cVar.f389599c);
    }

    /* renamed from: hashCode */
    public int m143474x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f389597a) * 31) + java.lang.Boolean.hashCode(this.f389598b)) * 31) + this.f389599c.m140976x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m143475x9616526c() {
        return "MagicEggSendItem(sendTime=" + this.f389597a + ", clickable=" + this.f389598b + ", ext=" + this.f389599c + ')';
    }
}
