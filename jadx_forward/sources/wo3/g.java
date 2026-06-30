package wo3;

/* loaded from: classes9.dex */
public class g extends wo3.h {
    public g(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("buss_type", str);
        hashMap.put(ya.b.f77491x8758c4e1, str2);
        hashMap.put("network", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wifi" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "2g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40091x5fd3d5c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wap" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "4g" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        hashMap.put("transactionid", str3);
        m174273xb4c13117(hashMap);
    }

    @Override // wo3.h
    /* renamed from: getFuncId */
    public int mo174269x19c9adf5() {
        return 1602;
    }

    @Override // wo3.h
    /* renamed from: getTenpayCgicmd */
    public int mo174270x46809856() {
        return 122;
    }

    @Override // wo3.h
    /* renamed from: getUri */
    public java.lang.String mo174271xb5887636() {
        return "/cgi-bin/mmpay-bin/tenpay/datareport";
    }

    @Override // wo3.h
    /* renamed from: onGYNetEnd */
    public void mo174272x5f9cdc6f(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
