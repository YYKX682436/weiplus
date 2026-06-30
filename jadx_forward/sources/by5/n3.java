package by5;

/* loaded from: classes13.dex */
public class n3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        com.p314xaae8f345.p3210x3857dc.m mVar;
        java.lang.String[] strArr;
        java.lang.String queryParameter = uri.getQueryParameter("set_force_use_office_reader");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            by5.a1.g(context, "强制设置OfficeReader失败，参数为空", false);
            return qx5.a.a();
        }
        java.lang.String[] split = queryParameter.split("_");
        if (queryParameter.length() < 2) {
            by5.a1.g(context, "强制设置OfficeReader失败，参数错误", false);
            return qx5.a.a();
        }
        java.lang.String str = split[split.length - 1];
        if ("yes".equalsIgnoreCase(str)) {
            mVar = com.p314xaae8f345.p3210x3857dc.m.yes;
        } else if ("no".equalsIgnoreCase(str)) {
            mVar = com.p314xaae8f345.p3210x3857dc.m.no;
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc.equalsIgnoreCase(str)) {
                by5.a1.g(context, "强制设置OfficeReader失败，类型错误", false);
                return qx5.a.a();
            }
            mVar = com.p314xaae8f345.p3210x3857dc.m.none;
        }
        if (split.length == 2 && com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18.equalsIgnoreCase(split[0])) {
            strArr = com.p314xaae8f345.p3210x3857dc.n.f301876c;
        } else {
            java.lang.String[] strArr2 = new java.lang.String[split.length - 1];
            for (int i17 = 0; i17 < split.length - 1; i17++) {
                strArr2[i17] = split[i17];
            }
            strArr = strArr2;
        }
        java.lang.String j17 = com.p314xaae8f345.p3210x3857dc.t0.f302127a.j(strArr, mVar);
        if (j17.isEmpty()) {
            by5.a1.g(context, "强制设置OfficeReader失败", false);
            return qx5.a.a();
        }
        by5.a1.g(context, "格式:" + j17 + "强制OfficeReader状态:" + mVar, false);
        return qx5.a.b();
    }
}
