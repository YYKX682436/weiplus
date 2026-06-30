package ab1;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab1.l f84251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974 f84253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f84254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f84255h;

    public i(ab1.l lVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974 c11955x784e8974, yz5.l lVar2, yz5.a aVar) {
        this.f84251d = lVar;
        this.f84252e = context;
        this.f84253f = c11955x784e8974;
        this.f84254g = lVar2;
        this.f84255h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f84251d.Ai(this.f84252e, this.f84253f, this.f84254g, this.f84255h);
    }
}
