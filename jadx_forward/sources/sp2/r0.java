package sp2;

/* loaded from: classes2.dex */
public final class r0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492726a;

    public r0(sp2.o2 o2Var) {
        this.f492726a = o2Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        sp2.o2 o2Var = this.f492726a;
        if (z17) {
            o2Var.y(true, "rv-auto-refresh", true);
        } else {
            o2Var.y(true, "rv-refresh", false);
        }
    }

    @Override // qn5.c
    /* renamed from: onLoadMore */
    public boolean mo15402x1318b45a() {
        this.f492726a.y(false, "rv-load-more", false);
        return true;
    }
}
