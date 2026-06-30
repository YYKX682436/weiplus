package lo0;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f401621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401622e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.util.HashMap hashMap, java.util.List list) {
        super(1);
        this.f401621d = hashMap;
        this.f401622e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject groupObj = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupObj, "groupObj");
        try {
            lo0.m mVar = new lo0.m(groupObj, this.f401621d);
            if (!mVar.f401580c.isEmpty()) {
                this.f401622e.add(mVar);
            }
        } catch (lo0.u unused) {
        }
        return jz5.f0.f384359a;
    }
}
