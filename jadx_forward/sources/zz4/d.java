package zz4;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f559245a = new java.util.concurrent.ConcurrentHashMap();

    public d(zz4.a aVar) {
    }

    public void a(java.lang.String str, java.lang.String str2, long j17) {
        zz4.c cVar = (zz4.c) ((java.util.concurrent.ConcurrentHashMap) this.f559245a).remove(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str + str2));
        if (cVar != null) {
            int i17 = cVar.f559243a - 1;
            cVar.f559243a = i17;
            long j18 = cVar.f559244b + j17;
            cVar.f559244b = j18;
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.BatchUpdateReporter", "batch update size: %s", java.lang.Long.valueOf(j18));
                jj0.a.a().b(1, "", java.lang.String.valueOf(cVar.f559244b), 0L);
            }
        }
    }
}
