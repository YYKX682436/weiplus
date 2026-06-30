package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class w implements androidx.compose.foundation.lazy.layout.t {

    /* renamed from: a, reason: collision with root package name */
    public final int f10430a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10431b;

    /* renamed from: c, reason: collision with root package name */
    public s1.g2 f10432c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10433d;

    public w(int i17, long j17, kotlin.jvm.internal.i iVar) {
        this.f10430a = i17;
        this.f10431b = j17;
    }

    @Override // androidx.compose.foundation.lazy.layout.t
    public void cancel() {
        if (this.f10433d) {
            return;
        }
        this.f10433d = true;
        s1.g2 g2Var = this.f10432c;
        if (g2Var != null) {
            s1.o0 o0Var = (s1.o0) g2Var;
            s1.q0 q0Var = o0Var.f402048a;
            q0Var.b();
            u1.w wVar = (u1.w) q0Var.f402068h.remove(o0Var.f402049b);
            if (wVar != null) {
                if (!(q0Var.f402071k > 0)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                u1.w wVar2 = q0Var.f402061a;
                int indexOf = ((o0.f) wVar2.o()).indexOf(wVar);
                int i17 = ((o0.f) wVar2.o()).f341844d.f341852f;
                int i18 = q0Var.f402071k;
                if (!(indexOf >= i17 - i18)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                q0Var.f402070j++;
                q0Var.f402071k = i18 - 1;
                int i19 = (((o0.f) wVar2.o()).f341844d.f341852f - q0Var.f402071k) - q0Var.f402070j;
                wVar2.f423693q = true;
                wVar2.B(indexOf, i19, 1);
                wVar2.f423693q = false;
                q0Var.a(i19);
            }
        }
        this.f10432c = null;
    }
}
