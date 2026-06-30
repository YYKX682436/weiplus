package gm0;

/* loaded from: classes7.dex */
public class x implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.IGetHostIps {

    /* renamed from: a, reason: collision with root package name */
    public static gm0.x f354818a;

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.IGetHostIps
    /* renamed from: getNewDnsIps */
    public java.lang.String[] mo37977xc1fe6d4d(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MMKernel.CoreNetwork", "current not it MM proc");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "try resolve host %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(str, false, arrayList);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreNetwork", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(f17), java.util.Arrays.toString(strArr));
        return strArr;
    }
}
