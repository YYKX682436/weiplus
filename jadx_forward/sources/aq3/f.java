package aq3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f94704a;

    /* renamed from: b, reason: collision with root package name */
    public final long f94705b;

    /* renamed from: c, reason: collision with root package name */
    public long f94706c;

    /* renamed from: d, reason: collision with root package name */
    public ku5.q f94707d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94708e;

    public f(long j17, long j18, long j19, ku5.q state, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f94704a = j17;
        this.f94705b = j18;
        this.f94706c = j19;
        this.f94707d = state;
        this.f94708e = str;
    }

    /* renamed from: equals */
    public boolean m8884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3.f)) {
            return false;
        }
        aq3.f fVar = (aq3.f) obj;
        return this.f94704a == fVar.f94704a && this.f94705b == fVar.f94705b && this.f94706c == fVar.f94706c && this.f94707d == fVar.f94707d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94708e, fVar.f94708e);
    }

    /* renamed from: hashCode */
    public int m8885x8cdac1b() {
        int hashCode = ((((((java.lang.Long.hashCode(this.f94704a) * 31) + java.lang.Long.hashCode(this.f94705b)) * 31) + java.lang.Long.hashCode(this.f94706c)) * 31) + this.f94707d.hashCode()) * 31;
        java.lang.String str = this.f94708e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m8886x9616526c() {
        return "TaskStatusInfo(startTime=" + this.f94704a + ", delayTime=" + this.f94705b + ", runningTime=" + this.f94706c + ", state=" + this.f94707d + ", pool=" + this.f94708e + ')';
    }
}
