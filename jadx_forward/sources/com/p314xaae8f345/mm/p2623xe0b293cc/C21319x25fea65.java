package com.p314xaae8f345.mm.p2623xe0b293cc;

/* renamed from: com.tencent.mm.storagebase.IMEISave */
/* loaded from: classes12.dex */
public class C21319x25fea65 {
    public static java.util.Collection a() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(wo.w0.g(true));
        linkedHashSet.add(wo.w0.g(false));
        java.io.BufferedReader bufferedReader = null;
        try {
            try {
                javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec("_wEcHAT_".getBytes(), "RC4");
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RC4");
                cipher.init(2, secretKeySpec);
                java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(new java.io.InputStreamReader(new javax.crypto.CipherInputStream(context.openFileInput("KeyInfo.bin"), cipher)));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        linkedHashSet.add(readLine);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        bufferedReader = bufferedReader2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IMEISave", e, "Failed to load key information.", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                        linkedHashSet.add("1234567890ABCDEF");
                        return linkedHashSet;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedReader = bufferedReader2;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader);
                        throw th;
                    }
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedReader2);
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
        linkedHashSet.add("1234567890ABCDEF");
        return linkedHashSet;
    }
}
