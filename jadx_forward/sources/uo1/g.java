package uo1;

/* loaded from: classes5.dex */
public final class g implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f511096a;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f511096a = f0Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f511096a;
        f0Var.f391649d = z17 ? f0Var.f391649d | 2 : f0Var.f391649d & (-3);
    }
}
