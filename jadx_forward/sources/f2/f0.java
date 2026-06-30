package f2;

/* loaded from: classes13.dex */
public final class f0 implements f2.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f340334d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f340335e;

    public f0(java.lang.Object value, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f340334d = value;
        this.f340335e = z17;
    }

    @Override // f2.g0
    public boolean a() {
        return this.f340335e;
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        return this.f340334d;
    }

    public /* synthetic */ f0(java.lang.Object obj, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(obj, (i17 & 2) != 0 ? true : z17);
    }
}
