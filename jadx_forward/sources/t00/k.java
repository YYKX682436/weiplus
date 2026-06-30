package t00;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f495836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495837e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.LinkedList linkedList, c00.n3 n3Var) {
        super(0);
        this.f495836d = linkedList;
        this.f495837e = n3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("kvData", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeleteEcsSectionDataActionHandler", "onSuccess, sectionList: " + this.f495836d);
        this.f495837e.b(jSONObject);
        return jz5.f0.f384359a;
    }
}
