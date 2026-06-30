package ot0;

/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f430288a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f430289b = new java.util.HashMap();

    public static ot0.h a(int i17) {
        pq5.d dVar = (pq5.d) f430289b.get(java.lang.Integer.valueOf(i17));
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMessage", "get for type(%s) is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        ot0.h hVar = (ot0.h) dVar.get();
        hVar.getClass();
        return hVar;
    }
}
