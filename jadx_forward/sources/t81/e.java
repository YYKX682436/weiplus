package t81;

/* loaded from: classes4.dex */
public class e extends qj1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f497890e = {l75.n0.m145250x3fdc6f77(t81.f.f497892y, "PredownloadIssueLaunchWxaAppResponse")};

    public e(l75.k0 k0Var) {
        super(k0Var, t81.f.f497892y, "PredownloadIssueLaunchWxaAppResponse", dm.p9.f320752n);
    }

    public boolean y0(byte[] bArr, java.lang.String str, java.util.List list, long j17, long j18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, invalid input %s", str);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, empty sceneList", str);
            return false;
        }
        java.util.Iterator it = list.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            t81.f fVar = new t81.f();
            fVar.f67930x28d45f97 = str;
            fVar.f67934x29cbf907 = intValue;
            boolean z18 = get(fVar, new java.lang.String[0]);
            fVar.f67932x435571ed = bArr;
            fVar.f67935x1bb3b54a = j17;
            fVar.f67931x14c61803 = j18;
            z17 &= z18 ? mo9952xce0038c9(fVar, new java.lang.String[0]) : mo880xb970c2b9(fVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, sceneList %d, setOk %b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
