package wt3;

/* loaded from: classes5.dex */
public final class d0 implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.e0 f530923a;

    public d0(wt3.e0 e0Var) {
        this.f530923a = e0Var;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgmList, "bgmList");
        wt3.e0 e0Var = this.f530923a;
        e0Var.f530938n = false;
        wt3.i0 i0Var = e0Var.f530940t;
        if (i0Var != null) {
            i0Var.a(bgmList, z17, z18, j17);
        }
    }

    @Override // wt3.i0
    /* renamed from: getActivity */
    public android.app.Activity mo68371x19263085() {
        wt3.i0 i0Var = this.f530923a.f530940t;
        if (i0Var != null) {
            return i0Var.mo68371x19263085();
        }
        return null;
    }
}
