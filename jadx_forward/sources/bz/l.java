package bz;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f118180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.j f118181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, dn.j jVar) {
        super(1);
        this.f118180d = z17;
        this.f118181e = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadUrlRes user-direct invokeOnCancellation isCanCancel: ");
        boolean z17 = this.f118180d;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", sb6.toString());
        dn.j jVar = this.f118181e;
        dn.k kVar = jVar.f323320f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f323296d = null;
        }
        if (z17) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(jVar.f69601xaca5bdda);
        }
        return jz5.f0.f384359a;
    }
}
