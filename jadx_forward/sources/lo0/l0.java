package lo0;

/* loaded from: classes14.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f401577d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.util.Map map) {
        super(1);
        this.f401577d = map;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject badgeObj = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badgeObj, "badgeObj");
        try {
            lo0.b bVar = new lo0.b(badgeObj);
            this.f401577d.put(bVar.f401493a, bVar);
        } catch (lo0.u unused) {
        }
        return jz5.f0.f384359a;
    }
}
