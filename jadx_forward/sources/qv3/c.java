package qv3;

/* loaded from: classes5.dex */
public final class c implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv3.d f448485a;

    public c(qv3.d dVar) {
        this.f448485a = dVar;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgmList, "bgmList");
        qv3.d dVar = this.f448485a;
        dVar.f530938n = false;
        wt3.i0 i0Var = dVar.f448487p;
        if (i0Var != null) {
            i0Var.a(bgmList, z17, z18, j17);
        }
    }

    @Override // wt3.i0
    /* renamed from: getActivity */
    public android.app.Activity mo68371x19263085() {
        wt3.i0 i0Var = this.f448485a.f448487p;
        if (i0Var != null) {
            return i0Var.mo68371x19263085();
        }
        return null;
    }
}
