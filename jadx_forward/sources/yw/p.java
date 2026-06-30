package yw;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1 f547953f;

    public p(yw.y yVar, int i17, com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1 l1Var) {
        this.f547951d = yVar;
        this.f547952e = i17;
        this.f547953f = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = this.f547951d.f548042a;
        if (cVar != null) {
            cVar.u0(this.f547952e, this.f547953f);
        }
    }
}
