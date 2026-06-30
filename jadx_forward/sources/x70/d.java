package x70;

/* loaded from: classes12.dex */
public final class d implements l70.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m11.b0 f533941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f533942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533943c;

    public d(m11.b0 b0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        this.f533941a = b0Var;
        this.f533942b = h0Var;
        this.f533943c = str;
    }

    @Override // l70.a
    public void a(l70.b event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event.f398328b == l70.c.f398331e) {
            l70.e eVar = event.f398329c;
            if ((eVar != null ? eVar.f398351a : null) == l70.f.f398353d) {
                int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k((java.lang.String) this.f533942b.f391656d);
                m11.b0 b0Var = this.f533941a;
                b0Var.F(k17);
                b0Var.z(b0Var.f404169d);
                b0Var.m(this.f533943c);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b1.Di().F4(java.lang.Long.valueOf(b0Var.f404166a), b0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgDownload.MsgImgSyncDownloadFSC", "update mid imgInfo: " + b0Var.f404180o + ", " + b0Var.f404178m + ' ' + b0Var.f404166a + ' ' + b0Var.f404168c + ' ' + b0Var.f404169d + ' ' + b0Var.f404170e);
            }
        }
    }
}
