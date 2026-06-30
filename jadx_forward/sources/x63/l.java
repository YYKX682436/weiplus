package x63;

/* loaded from: classes5.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y63.a f533787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y63.a f533788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f533789f;

    public l(x63.p pVar, y63.a aVar, y63.a aVar2, int i17) {
        this.f533787d = aVar;
        this.f533788e = aVar2;
        this.f533789f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int size;
        java.lang.String str;
        y63.a aVar = this.f533788e;
        y63.a aVar2 = this.f533787d;
        if (aVar2 == null) {
            i17 = aVar.N.size();
            str = aVar.K;
            size = 0;
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i18 = 1; i18 <= aVar2.N.size(); i18++) {
                y63.b bVar = (y63.b) aVar2.N.get(java.lang.Integer.valueOf(i18));
                if (bVar != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(bVar.f541185a, c01.z1.r())) {
                    hashSet.add(bVar);
                    hashMap.put(bVar.f541189e, bVar);
                }
            }
            int i19 = 0;
            java.lang.String str2 = "";
            i17 = 0;
            for (int i27 = 1; i27 <= aVar.N.size(); i27++) {
                y63.b bVar2 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i27));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(bVar2.f541185a, c01.z1.r())) {
                    if (hashSet.contains(bVar2)) {
                        i19++;
                    } else {
                        i17++;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            str2 = bVar2.f541187c;
                        }
                    }
                }
            }
            java.lang.String str3 = str2;
            size = hashSet.size() - i19;
            str = str3;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = aVar.K;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6916x34c31478 c6916x34c31478 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6916x34c31478();
        c6916x34c31478.f142352j = c6916x34c31478.b("Identifier", aVar.f66138x4b6e619a, true);
        c6916x34c31478.f142346d = c6916x34c31478.b("ChatName", aVar.f66142xdec927b, true);
        c6916x34c31478.f142347e = c6916x34c31478.b("LaunchUserName", aVar.f66136xb1e12de7, true);
        c6916x34c31478.f142348f = aVar.f66140xd09be28e;
        c6916x34c31478.f142349g = size;
        c6916x34c31478.f142350h = i17;
        c6916x34c31478.f142351i = this.f533789f;
        c6916x34c31478.f142353k = c6916x34c31478.b("Punctuation", android.util.Base64.encodeToString(str.getBytes(), 0), true);
        android.util.Base64.encodeToString(str.getBytes(), 0);
        c6916x34c31478.k();
    }
}
