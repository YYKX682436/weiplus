package qu3;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f448356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f448358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str, java.util.List list) {
        super(1);
        this.f448356d = r6Var;
        this.f448357e = str;
        this.f448358f = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject jsonObject = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(this.f448356d, jsonObject.optString("icon")).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.String optString = jsonObject.optString(this.f448357e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        this.f448358f.add(new qu3.e(o17, optString));
        return jz5.f0.f384359a;
    }
}
