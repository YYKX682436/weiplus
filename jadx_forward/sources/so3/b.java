package so3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so3.c f492277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492278e;

    public b(so3.c cVar, java.lang.String str) {
        this.f492277d = cVar;
        this.f492278e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        so3.c cVar = this.f492277d;
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "require sync contact");
        c01.p8 a17 = c01.n8.a();
        ((c01.k7) a17).b(this.f492278e, 5, new so3.a(cVar));
    }
}
