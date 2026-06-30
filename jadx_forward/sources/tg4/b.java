package tg4;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d f500761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg4.c f500762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f500763f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d, tg4.c cVar, lc3.a0 a0Var) {
        super(0);
        this.f500761d = c10867x3e50a04d;
        this.f500762e = cVar;
        this.f500763f = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lc3.a0 data = this.f500763f;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = this.f500761d;
        wq0.a f150208e = c10867x3e50a04d.getF150208e();
        tg4.c cVar = this.f500762e;
        if (f150208e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBBaseOperateCoverViewJsApi", "MagicCardCustomViewContainer null");
            cVar.v("coverView null");
        } else {
            try {
                cVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
                cVar.w(data, c10867x3e50a04d, data.getInt("viewId"));
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBBaseOperateCoverViewJsApi", "invalid viewId");
                cVar.v("invalid viewId");
            }
        }
        return jz5.f0.f384359a;
    }
}
