package bz;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f36647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.j f36648e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, dn.j jVar) {
        super(1);
        this.f36647d = z17;
        this.f36648e = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadUrlRes user-direct invokeOnCancellation isCanCancel: ");
        boolean z17 = this.f36647d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Download.SuperDownloaderWrapCore", sb6.toString());
        dn.j jVar = this.f36648e;
        dn.k kVar = jVar.f241787f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f241763d = null;
        }
        if (z17) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(jVar.field_mediaId);
        }
        return jz5.f0.f302826a;
    }
}
