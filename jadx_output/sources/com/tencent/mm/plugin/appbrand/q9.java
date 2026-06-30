package com.tencent.mm.plugin.appbrand;

@j95.b
/* loaded from: classes7.dex */
public class q9 extends i95.w implements m01.e {
    public android.content.Intent wi(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr, java.lang.String str4, int i18, int i19) {
        boolean z17 = android.os.Build.VERSION.SDK_INT >= 26;
        java.lang.String Di = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Di(str2, z17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Di)) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            str2 = str3;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str5 : strArr) {
            sb6.append(str5);
        }
        java.lang.String g17 = kk.k.g(("" + str2 + sb6.toString()).getBytes());
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.action.WX_SHORTCUT");
        intent.putExtra("type", i19);
        intent.putExtra(dm.i4.COL_ID, Di);
        intent.putExtra("ext_info", ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Di(str4, z17));
        intent.putExtra("token", ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(str4, "" + i18));
        intent.putExtra("digest", g17);
        intent.putExtra("ext_info_1", i17);
        intent.setPackage(str);
        intent.addFlags(67108864);
        return intent;
    }
}
