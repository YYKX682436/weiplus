package zf0;

/* loaded from: classes11.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f553944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553946f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yz5.a aVar, zf0.v0 v0Var, java.lang.String str) {
        super(1);
        this.f553944d = aVar;
        this.f553945e = v0Var;
        this.f553946f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.lang.String str = (java.lang.String) this.f553944d.mo152xb9724478();
        if (str != null) {
            java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
            if (str2 != null) {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Bi = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Bi(str2);
                gm0.b bVar = gm0.j1.b().f354778h;
                if (bVar != null && (c20976x6ba6452a = bVar.f354678e) != null) {
                    v65.i.b(c20976x6ba6452a, null, new zf0.e0(Bi, this.f553945e, reason, this.f553946f, str2, null), 1, null);
                }
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f553945e.id() + " skip cancel upload reason:" + reason + " tag:" + this.f553946f + " clientId empty");
        return jz5.f0.f384359a;
    }
}
