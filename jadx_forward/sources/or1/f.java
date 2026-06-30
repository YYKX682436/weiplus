package or1;

/* loaded from: classes12.dex */
public class f extends pr1.a {

    /* renamed from: k, reason: collision with root package name */
    public static fb5.b f429018k;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f429019h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f429020i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f429021j;

    public f(java.lang.Object obj, java.lang.String str) {
        super(6, obj);
        this.f429021j = str;
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        java.lang.Object obj;
        if (this.f342416c) {
            return;
        }
        if (context == null || aVar == null || (obj = this.f342415b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "The DataItem is not a instance of BizProductViewHolder.");
            return;
        }
        if (!(obj instanceof r45.fx5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizRecommDataItem", "The data is not a instance of SearchOrRecommendItem.");
            return;
        }
        or1.e eVar = (or1.e) aVar;
        r45.fx5 fx5Var = (r45.fx5) obj;
        r45.du5 du5Var = fx5Var.f456235e;
        java.lang.String str = du5Var != null ? du5Var.f454289d : "";
        try {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = eVar.f429010c.getTextSize();
            ((ke0.e) xVar).getClass();
            this.f429019h = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize);
        } catch (java.lang.Exception unused) {
            this.f429019h = "";
        }
        this.f429020i = fx5Var.f456234d.f454289d;
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.e();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f429018k == null) {
            f429018k = new or1.d(this);
        }
        return f429018k;
    }
}
