package yd2;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f542562a;

    /* renamed from: b, reason: collision with root package name */
    public final long f542563b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f542564c;

    /* renamed from: d, reason: collision with root package name */
    public final long f542565d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f542566e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f542567f;

    public b(long j17, long j18, java.lang.String sessionId, long j19, java.lang.String toolCallId, java.lang.String anchorUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toolCallId, "toolCallId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        this.f542562a = j17;
        this.f542563b = j18;
        this.f542564c = sessionId;
        this.f542565d = j19;
        this.f542566e = toolCallId;
        this.f542567f = anchorUsername;
    }

    /* renamed from: equals */
    public boolean m176842xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd2.b)) {
            return false;
        }
        yd2.b bVar = (yd2.b) obj;
        return this.f542562a == bVar.f542562a && this.f542563b == bVar.f542563b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542564c, bVar.f542564c) && this.f542565d == bVar.f542565d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542566e, bVar.f542566e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542567f, bVar.f542567f);
    }

    /* renamed from: hashCode */
    public int m176843x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f542562a) * 31) + java.lang.Long.hashCode(this.f542563b)) * 31) + this.f542564c.hashCode()) * 31) + java.lang.Long.hashCode(this.f542565d)) * 31) + this.f542566e.hashCode()) * 31) + this.f542567f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176844x9616526c() {
        return "AiAssistantToolContext(taskId=" + this.f542562a + ", objectId=" + this.f542563b + ", sessionId=" + this.f542564c + ", requestId=" + this.f542565d + ", toolCallId=" + this.f542566e + ", anchorUsername=" + this.f542567f + ')';
    }
}
