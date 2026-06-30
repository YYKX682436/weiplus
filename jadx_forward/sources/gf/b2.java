package gf;

/* loaded from: classes.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f352559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.util.LinkedList linkedList) {
        super(1);
        this.f352559d = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it instanceof org.json.JSONObject) {
            java.lang.String optString = ((org.json.JSONObject) it).optString("param_name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            if (r26.i0.y(optString, "wx_wxapp_expt_skyline", false)) {
                this.f352559d.add(it);
            }
        }
        return jz5.f0.f384359a;
    }
}
