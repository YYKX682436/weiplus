package iq2;

/* loaded from: classes2.dex */
public final class g implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375279a;

    public g(iq2.d0 d0Var) {
        this.f375279a = d0Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        iq2.d0 d0Var = this.f375279a;
        if (z17) {
            d0Var.j(true, "rv-auto-refresh", true);
        } else {
            d0Var.j(true, "rv-refresh", false);
        }
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        this.f375279a.j(false, "rv-load-more", false);
        return true;
    }
}
