package b31;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f17601a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f17602b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f17603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17604d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17605e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17606f;

    public e(int i17, java.lang.String userName, java.lang.String voiceId, int i18, int i19, long j17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(voiceId, "voiceId");
        this.f17601a = i17;
        this.f17602b = userName;
        this.f17603c = voiceId;
        this.f17604d = i18;
        this.f17605e = i19;
        this.f17606f = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31.e)) {
            return false;
        }
        b31.e eVar = (b31.e) obj;
        return this.f17601a == eVar.f17601a && kotlin.jvm.internal.o.b(this.f17602b, eVar.f17602b) && kotlin.jvm.internal.o.b(this.f17603c, eVar.f17603c) && this.f17604d == eVar.f17604d && this.f17605e == eVar.f17605e && this.f17606f == eVar.f17606f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f17601a) * 31) + this.f17602b.hashCode()) * 31) + this.f17603c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f17604d)) * 31) + java.lang.Integer.hashCode(this.f17605e)) * 31) + java.lang.Long.hashCode(this.f17606f);
    }

    public java.lang.String toString() {
        return "StopParams(startScene=" + this.f17601a + ", userName=" + this.f17602b + ", voiceId=" + this.f17603c + ", textCount=" + this.f17604d + ", stopType=" + this.f17605e + ", recordLength=" + this.f17606f + ')';
    }
}
