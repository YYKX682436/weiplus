package f4;

/* loaded from: classes15.dex */
public final class f extends f4.e {

    /* renamed from: g, reason: collision with root package name */
    public final long f340918g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j17, long j18, long j19, long j27, boolean z17, java.util.List states) {
        super(j17, j18, j19, z17, states);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(states, "states");
        this.f340918g = j27;
    }

    @Override // f4.e, f4.d
    /* renamed from: equals */
    public boolean mo129008xb2c87fbf(java.lang.Object obj) {
        if ((obj instanceof f4.f) && super.mo129008xb2c87fbf(obj)) {
            if (this.f340918g == ((f4.f) obj).f340918g) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.e, f4.d
    /* renamed from: hashCode */
    public int mo129009x8cdac1b() {
        return (super.mo129009x8cdac1b() * 31) + java.lang.Long.hashCode(this.f340918g);
    }

    @Override // f4.e
    /* renamed from: toString */
    public java.lang.String mo129010x9616526c() {
        return "FrameData(frameStartNanos=" + this.f340912a + ", frameDurationUiNanos=" + this.f340913b + ", frameDurationCpuNanos=" + this.f340916e + ", frameOverrunNanos=" + this.f340918g + ", isJank=" + this.f340914c + ", states=" + this.f340915d + ')';
    }
}
