package th5;

/* loaded from: classes10.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.j f500908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.lang.String str, dn.j jVar) {
        super(1);
        this.f500907d = str;
        this.f500908e = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = this.f500907d;
        if (str.length() == 0) {
            str = "-";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPhotoUrlDownloader", "downloadToPath invokeOnCancellation scene=".concat(str));
        dn.j jVar = this.f500908e;
        dn.k kVar = jVar.f323320f;
        dn.d dVar = kVar instanceof dn.d ? (dn.d) kVar : null;
        if (dVar != null) {
            dVar.f323296d = null;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(jVar.f69601xaca5bdda);
        return jz5.f0.f384359a;
    }
}
