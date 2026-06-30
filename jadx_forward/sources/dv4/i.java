package dv4;

/* loaded from: classes11.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f325546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.List list) {
        super(1);
        this.f325546d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f325546d.add(new dv4.o((float) it.optDouble("x1", 0.0d), (float) it.optDouble("y1", 0.0d), (float) it.optDouble("x2", 0.0d), (float) it.optDouble("y2", 0.0d)));
        return jz5.f0.f384359a;
    }
}
