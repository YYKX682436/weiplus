package vy3;

/* loaded from: classes.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f523018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f523019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f523020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f523018d = hashMap;
        this.f523019e = kVar;
        this.f523020f = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f523018d.put("retCode", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowAddressPickerView", "showAddressPickerView user cancel");
        this.f523019e.f422396d.e(this.f523020f.f422546c, "showAddressPickerView:cancel", null);
        return jz5.f0.f384359a;
    }
}
