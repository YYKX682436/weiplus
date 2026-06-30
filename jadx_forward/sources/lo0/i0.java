package lo0;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f401544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lo0.r0 f401545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, java.util.Map map, lo0.r0 r0Var, java.util.List list, java.util.List list2) {
        super(1);
        this.f401543d = str;
        this.f401544e = map;
        this.f401545f = r0Var;
        this.f401546g = list;
        this.f401547h = list2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject detailItemObj = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detailItemObj, "detailItemObj");
        try {
            lo0.h0 h0Var = new lo0.h0(detailItemObj, this.f401543d, this.f401544e, this.f401545f);
            this.f401546g.add(h0Var);
            lo0.b bVar = h0Var.f401538i;
            if (bVar != null) {
                this.f401547h.add(bVar);
            }
        } catch (lo0.u unused) {
        }
        return jz5.f0.f384359a;
    }
}
