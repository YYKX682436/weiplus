package h34;

/* renamed from: h34.a$$b */
/* loaded from: classes15.dex */
public final /* synthetic */ class RunnableC28437x2ca3e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.a f360008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.js5 f360009e;

    public /* synthetic */ RunnableC28437x2ca3e1(h34.a aVar, r45.js5 js5Var) {
        this.f360008d = aVar;
        this.f360009e = js5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h34.a aVar = this.f360008d;
        if (aVar.f360002s) {
            return;
        }
        aVar.f360002s = true;
        aVar.f359997n.a(this.f360009e, 0L, false);
    }
}
