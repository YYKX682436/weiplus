package t00;

/* loaded from: classes.dex */
public interface r0 {
    t00.m a();

    default boolean b() {
        return false;
    }

    void c(int i17, android.content.Context context, org.json.JSONObject jSONObject, c00.n3 n3Var, org.json.JSONObject jSONObject2);

    default boolean d(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        return false;
    }

    default void e(int i17, org.json.JSONObject data, org.json.JSONObject jSONObject, c00.q3 envHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envHandler, "envHandler");
    }

    default org.json.JSONObject f(int i17, android.content.Context context, org.json.JSONObject data, c00.q3 envHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(envHandler, "envHandler");
        return null;
    }

    default boolean g() {
        return this instanceof t00.h;
    }
}
