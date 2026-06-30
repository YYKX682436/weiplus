package x51;

/* loaded from: classes5.dex */
public abstract class x1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    public static boolean a(android.content.Context context, java.util.ArrayList arrayList, boolean z17) {
        boolean z18;
        java.lang.String a17;
        java.lang.String str;
        boolean z19 = false;
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x51.w1 w1Var = (x51.w1) it.next();
            java.lang.String str2 = w1Var.f533638a;
            int i17 = w1Var.f533639b;
            java.lang.String str3 = w1Var.f533640c;
            if (android.text.TextUtils.isEmpty(str2)) {
                z18 = z19;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.String packageResourcePath = context.getPackageResourcePath();
                java.lang.String[] split = packageResourcePath.split("/");
                java.lang.String str4 = w1Var.f533638a;
                if (split != null) {
                    ?? r07 = z19;
                    while (true) {
                        if (r07 >= split.length) {
                            str = "";
                            break;
                        }
                        if (split[r07].contains(context.getPackageName())) {
                            str = split[r07];
                            break;
                        }
                        r07++;
                    }
                    if (!android.text.TextUtils.isEmpty(str)) {
                        java.lang.String replace = packageResourcePath.replace(str, str4 + "-1");
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(replace);
                        java.lang.String str5 = a18.f294812f;
                        if (str5 != null) {
                            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, z19, z19);
                            if (!str5.equals(l17)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a18, null);
                        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                            arrayList2.add(replace);
                        }
                        java.lang.String replace2 = packageResourcePath.replace(str, str4 + "-2");
                        com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(replace2);
                        java.lang.String str6 = a19.f294812f;
                        if (str6 != null) {
                            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                            if (!str6.equals(l18)) {
                                a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l18, a19.f294813g, a19.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a19, null);
                        if (!m18.a() ? false : m18.f294799a.F(m18.f294800b)) {
                            arrayList2.add(replace2);
                        }
                    }
                }
                if (arrayList2.size() > 0) {
                    java.util.Iterator it6 = arrayList2.iterator();
                    while (it6.hasNext()) {
                        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6((java.lang.String) it6.next());
                        if (r6Var.m()) {
                            try {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                if (z17) {
                                    android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo(str4, 64).signatures;
                                    a17 = signatureArr.length >= 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(signatureArr[signatureArr.length - 1].toCharsString()) : "";
                                } else {
                                    a17 = x51.v1.a(r6Var.n());
                                }
                                java.lang.Object[] objArr = new java.lang.Object[6];
                                objArr[0] = java.lang.Boolean.valueOf(z17);
                                objArr[1] = str4;
                                objArr[2] = str3;
                                objArr[3] = a17;
                                objArr[4] = java.lang.Boolean.valueOf(!android.text.TextUtils.isEmpty(a17) && a17.equalsIgnoreCase(str3));
                                objArr[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YYBMarketVerify", "summertoken containLowerMarket usesSystemApi[%b], infopkg[%s], infoMD5[%s], sigMD5[%s], equal[%b], takes[%d]ms", objArr);
                            } catch (java.lang.Exception e17) {
                                e = e17;
                            }
                            if (!android.text.TextUtils.isEmpty(a17) && a17.equalsIgnoreCase(str3)) {
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                int a27 = z17 ? context.getPackageManager().getPackageInfo(str4, 0).versionCode : x51.u1.a(context, str4);
                                java.lang.Object[] objArr2 = new java.lang.Object[6];
                                objArr2[0] = java.lang.Boolean.valueOf(z17);
                                objArr2[1] = str4;
                                objArr2[2] = java.lang.Integer.valueOf(i17);
                                objArr2[3] = java.lang.Integer.valueOf(a27);
                                try {
                                    objArr2[4] = java.lang.Boolean.valueOf(a27 <= i17);
                                    objArr2[5] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YYBMarketVerify", "summertoken containLowerMarket usesSystemApi[%b], infopkg[%s], infovc[%d], versionCode[%d], less[%b], takes[%d]ms", objArr2);
                                    if (a27 <= i17) {
                                        return true;
                                    }
                                } catch (java.lang.Exception e18) {
                                    e = e18;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.YYBMarketVerify", e, "", new java.lang.Object[0]);
                                }
                            }
                        }
                    }
                }
                z18 = false;
            }
            z19 = z18;
        }
        return z19;
    }
}
