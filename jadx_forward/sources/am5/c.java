package am5;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final am5.c f90353b = new am5.c();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f90354a = new java.util.HashMap();

    public void a(am5.b bVar, am5.a aVar) {
        if (aVar != null) {
            aVar.f90347a = bVar.name();
            ((java.util.HashMap) this.f90354a).put(bVar, aVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HeavyUserLabelerCenter", "register %s %d", aVar.f90347a, java.lang.Integer.valueOf(aVar.hashCode()));
        }
    }
}
