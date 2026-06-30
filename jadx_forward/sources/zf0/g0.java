package zf0;

/* loaded from: classes11.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, zf0.v0 v0Var, java.lang.String str2) {
        super(1);
        this.f553953d = str;
        this.f553954e = v0Var;
        this.f553955f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        a82.u1 u1Var = (a82.u1) ((o72.q4) i95.n0.c(o72.q4.class));
        java.lang.String str = this.f553953d;
        u1Var.Ri(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f553954e.id() + " stopFavDownload reason:" + reason + " tag:" + this.f553955f + " path:" + str);
        return jz5.f0.f384359a;
    }
}
