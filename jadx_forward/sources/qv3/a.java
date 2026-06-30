package qv3;

/* loaded from: classes5.dex */
public final class a implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv3.b f448482a;

    public a(qv3.b bVar) {
        this.f448482a = bVar;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgmList, "bgmList");
        qv3.b bVar = this.f448482a;
        bVar.f530938n = false;
        wt3.i0 i0Var = bVar.f448484q;
        if (i0Var != null) {
            i0Var.a(bgmList, z17, z18, j17);
        }
    }

    @Override // wt3.i0
    /* renamed from: getActivity */
    public android.app.Activity mo68371x19263085() {
        wt3.i0 i0Var = this.f448482a.f448484q;
        if (i0Var != null) {
            return i0Var.mo68371x19263085();
        }
        return null;
    }
}
