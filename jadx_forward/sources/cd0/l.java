package cd0;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122082e;

    public l(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.ref.WeakReference weakReference) {
        this.f122081d = f9Var;
        this.f122082e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar;
        android.content.res.Resources s17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f122081d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "delete invoke message! msg:%s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        f9Var.m124850x7650bebc(10002);
        java.lang.ref.WeakReference weakReference = this.f122082e;
        com.p314xaae8f345.mm.p957x53236a1b.d1.J((weakReference == null || (dVar = (yb5.d) weakReference.get()) == null || (s17 = dVar.s()) == null) ? null : s17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5s), "", f9Var, "");
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).bb(f9Var.m124847x74d37ac6(), f9Var);
    }
}
