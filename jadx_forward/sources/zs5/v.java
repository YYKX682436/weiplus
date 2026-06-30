package zs5;

/* loaded from: classes15.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f557027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(zs5.y yVar) {
        super(0);
        this.f557027d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zs5.y yVar = this.f557027d;
        yVar.f557044l = false;
        yVar.f557043k = false;
        if (yVar.f557046n) {
            yVar.f557046n = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "stopSession finish and try startSession");
            zs5.c cVar = this.f557027d.f557049q;
            if (cVar != null) {
                this.f557027d.c(cVar.f556859a, cVar.f556860b, cVar.f556861c, cVar.f556862d);
            }
        }
        return jz5.f0.f384359a;
    }
}
