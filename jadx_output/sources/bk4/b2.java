package bk4;

/* loaded from: classes11.dex */
public final class b2 extends u4.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21406d;

    public b2(bk4.c2 c2Var) {
        this.f21406d = c2Var;
    }

    @Override // u4.d1, u4.b1
    public void b(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        this.f21406d.f21431v = true;
    }

    @Override // u4.b1
    public void d(androidx.transition.Transition transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        this.f21406d.f21431v = false;
    }
}
