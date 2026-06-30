package oi1;

/* loaded from: classes7.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi1.e f427126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f427127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f427128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.b f427129g;

    public c(oi1.e eVar, java.lang.Runnable runnable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, fl1.b bVar) {
        this.f427126d = eVar;
        this.f427127e = runnable;
        this.f427128f = c11510xdd90c2f2;
        this.f427129g = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f427127e;
        if (runnable != null) {
            runnable.run();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "dialog confirm to navigate back");
        oi1.a aVar = (oi1.a) this.f427126d;
        aVar.getClass();
        ze.n runtime = (ze.n) this.f427128f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        aVar.c(runtime, 2);
        this.f427129g.dismiss();
    }
}
