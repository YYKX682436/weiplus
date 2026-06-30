package yc1;

/* loaded from: classes7.dex */
public final class l implements uh1.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f542326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc1.m f542328c;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, yc1.m mVar) {
        this.f542326a = lVar;
        this.f542327b = i17;
        this.f542328c = mVar;
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiBindSocketToNetwork", "invoke, success: " + z17);
        this.f542326a.a(this.f542327b, this.f542328c.r(null, z17 ? jc1.f.f380445a : jc1.f.f380448d, null));
    }
}
