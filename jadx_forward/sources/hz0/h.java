package hz0;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc f367796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc c4041xf31b2ebc) {
        super(0);
        this.f367795d = str;
        this.f367796e = c4041xf31b2ebc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doWork: start ");
        java.lang.String workTagId = this.f367795d;
        sb6.append(workTagId);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWork", sb6.toString());
        az0.i5 i5Var = az0.i5.f97090a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workTagId, "workTagId");
        com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4041xf31b2ebc c4041xf31b2ebc = this.f367796e;
        if (c4041xf31b2ebc == null) {
            return null;
        }
        i5Var.v();
        return c4041xf31b2ebc.c(new com.p314xaae8f345.p457x3304c6.p464xb32913b4.c(workTagId));
    }
}
