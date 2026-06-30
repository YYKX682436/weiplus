package gs5;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        java.util.Map map = gs5.c.f356700a;
        synchronized (map) {
            java.util.HashMap hashMap2 = (java.util.HashMap) map;
            if (hashMap2.isEmpty()) {
                hashMap = new java.util.HashMap();
            } else {
                java.util.HashMap hashMap3 = new java.util.HashMap(map);
                hashMap2.clear();
                hashMap = hashMap3;
            }
        }
        if (gs5.f.f356701a.f393088j && !hashMap.isEmpty()) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.lang.Object[] objArr = (java.lang.Object[]) entry.getValue();
                int intValue = ((java.lang.Integer) objArr[1]).intValue();
                int intValue2 = ((java.lang.Integer) objArr[2]).intValue();
                int intValue3 = ((java.lang.Integer) objArr[0]).intValue() / (intValue + intValue2);
                java.lang.String b17 = kr5.c.c().b();
                if (intValue > 0) {
                    lr5.f fVar = lr5.e.f402302b;
                    kr5.g gVar = gs5.f.f356701a;
                    ((lr5.c) fVar).execute(gs5.b.a("", gVar.f393081c.f105589b, gVar.f393080b, gVar.f393087i, "HDNSLookupCached", java.lang.System.currentTimeMillis(), b17, intValue3, 0L, (java.lang.String) entry.getKey(), "", gs5.f.f356701a.f393082d, null, 3L, 0, true, intValue, null, null));
                }
                if (intValue2 > 0) {
                    lr5.f fVar2 = lr5.e.f402302b;
                    kr5.g gVar2 = gs5.f.f356701a;
                    ((lr5.c) fVar2).execute(gs5.b.a("", gVar2.f393081c.f105589b, gVar2.f393080b, gVar2.f393087i, "HDNSLookupCached", java.lang.System.currentTimeMillis(), b17, intValue3, 0L, (java.lang.String) entry.getKey(), "", gs5.f.f356701a.f393082d, null, 0L, 0, true, intValue2, null, null));
                }
            }
        }
        lr5.f fVar3 = lr5.e.f402302b;
        java.lang.Runnable runnable = gs5.f.f356702b;
        lr5.c cVar = (lr5.c) fVar3;
        cVar.a(runnable);
        cVar.b(runnable, 300000L);
    }
}
