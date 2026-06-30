package dv2;

/* loaded from: classes5.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.m0 f325420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f325421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(dv2.m0 m0Var, yz5.a aVar) {
        super(1);
        this.f325420d = m0Var;
        this.f325421e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        dv2.m0.O6(this.f325420d, it);
        boolean z17 = false;
        if (it instanceof org.json.JSONObject) {
            try {
                boolean optBoolean = ((org.json.JSONObject) it).optBoolean("postDirectly", false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostAddTagUIC", "needPostDirectly: data:" + it + ", postDirectly:" + optBoolean);
                z17 = optBoolean;
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPostAddTagUIC", java.lang.String.valueOf(e17.getMessage()));
            }
        }
        if (z17) {
            this.f325421e.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
