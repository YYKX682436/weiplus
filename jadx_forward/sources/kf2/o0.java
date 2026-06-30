package kf2;

/* loaded from: classes.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f388815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.util.ArrayList arrayList) {
        super(1);
        this.f388815d = arrayList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f388815d.add(new android.graphics.RectF(it.getInt("left"), it.getInt("top"), it.getInt("right"), it.getInt("bottom")));
        return jz5.f0.f384359a;
    }
}
