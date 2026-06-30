package am5;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final am5.c f8820b = new am5.c();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f8821a = new java.util.HashMap();

    public void a(am5.b bVar, am5.a aVar) {
        if (aVar != null) {
            aVar.f8814a = bVar.name();
            ((java.util.HashMap) this.f8821a).put(bVar, aVar);
            com.tencent.mars.xlog.Log.i("HeavyUserLabelerCenter", "register %s %d", aVar.f8814a, java.lang.Integer.valueOf(aVar.hashCode()));
        }
    }
}
