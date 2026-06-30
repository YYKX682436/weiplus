package nk2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final nk2.l f419554a = new nk2.l();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.Set f419555b = new java.util.LinkedHashSet();

    public final org.json.JSONArray a() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = f419555b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((nk2.a) it.next()).ordinal());
        }
        return jSONArray;
    }

    public final void b(nk2.a action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        f419555b.add(action);
    }
}
