package cd0;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40549e;

    public l(com.tencent.mm.storage.f9 f9Var, java.lang.ref.WeakReference weakReference) {
        this.f40548d = f9Var;
        this.f40549e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.d dVar;
        android.content.res.Resources s17;
        com.tencent.mm.storage.f9 f9Var = this.f40548d;
        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "delete invoke message! msg:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
        f9Var.setType(10002);
        java.lang.ref.WeakReference weakReference = this.f40549e;
        com.tencent.mm.modelsimple.d1.J((weakReference == null || (dVar = (yb5.d) weakReference.get()) == null || (s17 = dVar.s()) == null) ? null : s17.getString(com.tencent.mm.R.string.b5s), "", f9Var, "");
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
    }
}
