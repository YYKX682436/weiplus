package dv4;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final dv4.n f325532a;

    /* renamed from: b, reason: collision with root package name */
    public final double f325533b;

    public b(org.json.JSONObject data) {
        dv4.n nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        dv4.m mVar = dv4.n.f325550e;
        java.lang.String optString = data.optString("screenType", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        mVar.getClass();
        int hashCode = optString.hashCode();
        if (hashCode == -1078030475) {
            if (optString.equals(ya.b.f77490x87518375)) {
                nVar = dv4.n.f325553h;
            }
            nVar = dv4.n.f325551f;
        } else if (hashCode != 107348) {
            if (hashCode == 3202466 && optString.equals("high")) {
                nVar = dv4.n.f325554i;
            }
            nVar = dv4.n.f325551f;
        } else {
            if (optString.equals("low")) {
                nVar = dv4.n.f325552g;
            }
            nVar = dv4.n.f325551f;
        }
        this.f325532a = nVar;
        this.f325533b = data.optDouble("animationDuration", 0.25d);
    }
}
