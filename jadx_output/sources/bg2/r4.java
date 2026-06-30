package bg2;

/* loaded from: classes2.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f20457a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.AnimationSet f20458b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.animation.AnimationSet f20459c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20460d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f20461e;

    public r4(android.view.View view, android.view.animation.AnimationSet inAnim, android.view.animation.AnimationSet outAnim, long j17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(inAnim, "inAnim");
        kotlin.jvm.internal.o.g(outAnim, "outAnim");
        this.f20457a = view;
        this.f20458b = inAnim;
        this.f20459c = outAnim;
        this.f20460d = j17;
        this.f20461e = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof bg2.r4) && kotlin.jvm.internal.o.b(((bg2.r4) obj).f20457a, this.f20457a);
    }

    public int hashCode() {
        return this.f20457a.hashCode();
    }

    public java.lang.String toString() {
        return "Config(view=" + this.f20457a + ", inAnim=" + this.f20458b + ", outAnim=" + this.f20459c + ", stayDuration=" + this.f20460d + ", afterToastOut=" + this.f20461e + ')';
    }
}
