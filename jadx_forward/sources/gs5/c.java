package gs5;

/* loaded from: classes13.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f356700a = new java.util.HashMap();

    public static void a(tr5.g0 g0Var) {
        java.lang.String[] split;
        if (g0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        tr5.q qVar = g0Var.f503026e;
        if (!(qVar instanceof fs5.c)) {
            or5.b.e("lookupResult.stat is not instanceof StatisticsMerge", new java.lang.Object[0]);
            return;
        }
        fs5.c cVar = (fs5.c) qVar;
        if (cVar.f347896r) {
            java.lang.String[] split2 = cVar.f347886e.split(",");
            java.lang.String[] split3 = cVar.f347887f.split(",");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List asList = java.util.Arrays.asList(split3);
            for (java.lang.String str : split2) {
                if (!asList.contains(str)) {
                    arrayList.add(str);
                }
            }
            split = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        } else {
            split = cVar.f347886e.split(",");
        }
        for (java.lang.String str2 : split) {
            java.util.HashMap hashMap = (java.util.HashMap) f356700a;
            if (hashMap.containsKey(str2)) {
                java.lang.Object[] objArr = (java.lang.Object[]) hashMap.get(str2);
                objArr[0] = java.lang.Integer.valueOf(((java.lang.Integer) objArr[0]).intValue() + cVar.f347891m.f347882f);
                if (cVar.f347893o) {
                    objArr[2] = java.lang.Integer.valueOf(((java.lang.Integer) objArr[2]).intValue() + 1);
                } else {
                    objArr[1] = java.lang.Integer.valueOf(((java.lang.Integer) objArr[1]).intValue() + 1);
                }
                hashMap.put(str2, objArr);
            } else if (cVar.f347893o) {
                hashMap.put(str2, new java.lang.Object[]{java.lang.Integer.valueOf(cVar.f347891m.f347882f), 0, 1});
            } else {
                hashMap.put(str2, new java.lang.Object[]{java.lang.Integer.valueOf(cVar.f347891m.f347882f), 1, 0});
            }
        }
    }
}
