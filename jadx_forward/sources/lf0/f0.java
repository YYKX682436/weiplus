package lf0;

@j95.b
/* loaded from: classes.dex */
public final class f0 extends i95.w implements pm4.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f399741d = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: e, reason: collision with root package name */
    public boolean f399742e;

    public android.content.Context wi() {
        java.util.Set set = this.f399741d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
        android.app.Activity activity = (android.app.Activity) kz5.n0.j0(set);
        if (activity != null) {
            return activity;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }
}
