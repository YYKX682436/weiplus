package aq3;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f94698a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Thread f94699b;

    /* renamed from: c, reason: collision with root package name */
    public final int f94700c;

    /* renamed from: d, reason: collision with root package name */
    public int f94701d;

    public c(long j17, java.lang.Thread thread, int i17) {
        this.f94698a = j17;
        this.f94699b = thread;
        this.f94700c = i17;
    }

    /* renamed from: equals */
    public boolean m8877xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3.c)) {
            return false;
        }
        aq3.c cVar = (aq3.c) obj;
        return this.f94698a == cVar.f94698a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94699b, cVar.f94699b) && this.f94700c == cVar.f94700c;
    }

    /* renamed from: hashCode */
    public int m8878x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f94698a) * 31;
        java.lang.Thread thread = this.f94699b;
        return ((hashCode + (thread == null ? 0 : thread.hashCode())) * 31) + java.lang.Integer.hashCode(this.f94700c);
    }

    /* renamed from: toString */
    public java.lang.String m8879x9616526c() {
        return "CheckInfo(time=" + this.f94698a + ", thread=" + this.f94699b + ", type=" + this.f94700c + ')';
    }
}
