package yw;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.c0 f547811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547812e;

    public b0(yw.c0 c0Var, int i17) {
        this.f547811d = c0Var;
        this.f547812e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.e eVar = this.f547811d.f547817a;
        if (eVar != null) {
            eVar.h(this.f547812e);
        }
    }
}
