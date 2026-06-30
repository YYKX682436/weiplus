package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes4.dex */
public final class s6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f217397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6 f217398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(android.util.SparseArray sparseArray, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6 u6Var) {
        super(0);
        this.f217397d = sparseArray;
        this.f217398e = u6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.util.SparseArray sparseArray = this.f217397d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            so2.w0 w0Var = (so2.w0) sparseArray.valueAt(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6 u6Var = this.f217398e;
            ((android.util.LruCache) ((jz5.n) u6Var.f217632g).mo141623x754a37bb()).put(w0Var.f492214c, w0Var);
            u6Var.Q6(w0Var);
        }
        return jz5.f0.f384359a;
    }
}
