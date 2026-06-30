package uu2;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f512800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d f512801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        super(1);
        this.f512800d = i17;
        this.f512801e = c11120x15dce88d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cl0.d it = (cl0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        org.json.JSONObject jSONObject = it.f124379a;
        if (jSONObject.optInt("count", -1) == this.f512800d) {
            int optInt = jSONObject.optInt("width", 0);
            int optInt2 = jSONObject.optInt("height", 0);
            int optInt3 = jSONObject.optInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15517x245ebd1, 0);
            if (optInt > 0 && optInt2 > 0 && optInt3 > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderVideoEditorConfig", "change width:" + optInt + " height:" + optInt2 + " fps:" + optInt3);
                com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.f512801e;
                c11120x15dce88d.f152724d = optInt;
                c11120x15dce88d.f152725e = optInt2;
                c11120x15dce88d.f152726f = optInt3;
            }
        }
        return jz5.f0.f384359a;
    }
}
