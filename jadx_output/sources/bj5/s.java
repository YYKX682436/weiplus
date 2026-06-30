package bj5;

/* loaded from: classes.dex */
public final class s implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f21230e;

    public s(bj5.y yVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList) {
        this.f21229d = yVar;
        this.f21230e = mvvmList;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((ym3.o) obj).f463177a == ym3.p.f463181f) {
            ((em.l2) ((jz5.n) this.f21229d.f21246e).getValue()).l().setAlphabet((java.lang.String[]) ((com.tencent.mm.ui.mvvm.list.SelectContactMvvmList) this.f21230e).A.toArray(new java.lang.String[0]));
        }
    }
}
