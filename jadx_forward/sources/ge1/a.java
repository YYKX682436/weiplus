package ge1;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final he1.h f352457a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f352458b;

    /* renamed from: c, reason: collision with root package name */
    public final long f352459c;

    public a(he1.h command, yz5.l callback, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 4) != 0 ? java.lang.System.currentTimeMillis() : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f352457a = command;
        this.f352458b = callback;
        this.f352459c = j17;
    }

    /* renamed from: equals */
    public boolean m131341xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge1.a)) {
            return false;
        }
        ge1.a aVar = (ge1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352457a, aVar.f352457a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352458b, aVar.f352458b) && this.f352459c == aVar.f352459c;
    }

    /* renamed from: hashCode */
    public int m131342x8cdac1b() {
        return (((this.f352457a.hashCode() * 31) + this.f352458b.hashCode()) * 31) + java.lang.Long.hashCode(this.f352459c);
    }

    /* renamed from: toString */
    public java.lang.String m131343x9616526c() {
        return "PendingTask(command=" + this.f352457a + ", callback=" + this.f352458b + ", enqueuedAt=" + this.f352459c + ')';
    }
}
