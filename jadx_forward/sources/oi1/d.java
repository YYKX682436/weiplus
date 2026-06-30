package oi1;

/* loaded from: classes7.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi1.e f427130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f427131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fl1.b f427132f;

    public d(oi1.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, fl1.b bVar) {
        this.f427130d = eVar;
        this.f427131e = c11510xdd90c2f2;
        this.f427132f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAppBrandPageNavigateBackInterceptor", "keep staying current page");
        oi1.a aVar = (oi1.a) this.f427130d;
        aVar.getClass();
        ze.n runtime = (ze.n) this.f427131e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        aVar.c(runtime, 3);
        this.f427132f.dismiss();
    }
}
