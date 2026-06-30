package f4;

/* loaded from: classes15.dex */
public class e extends f4.d {

    /* renamed from: e, reason: collision with root package name */
    public final long f340916e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.FrameMetrics f340917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, long j18, long j19, boolean z17, java.util.List states) {
        super(j17, j18, z17, states);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(states, "states");
        this.f340916e = j19;
    }

    @Override // f4.d
    /* renamed from: equals */
    public boolean mo129008xb2c87fbf(java.lang.Object obj) {
        if ((obj instanceof f4.e) && super.mo129008xb2c87fbf(obj)) {
            if (this.f340916e == ((f4.e) obj).f340916e) {
                return true;
            }
        }
        return false;
    }

    @Override // f4.d
    /* renamed from: hashCode */
    public int mo129009x8cdac1b() {
        return (super.mo129009x8cdac1b() * 31) + java.lang.Long.hashCode(this.f340916e);
    }

    /* renamed from: toString */
    public java.lang.String mo129010x9616526c() {
        return "FrameData(frameStartNanos=" + this.f340912a + ", frameDurationUiNanos=" + this.f340913b + ", frameDurationCpuNanos=" + this.f340916e + ", isJank=" + this.f340914c + ", states=" + this.f340915d + ')';
    }
}
