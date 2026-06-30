package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaFileServiceImpl */
/* loaded from: classes5.dex */
public class C3128x7762786c implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3460x8be5a04e {
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3460x8be5a04e
    /* renamed from: getData */
    public byte[] mo25143xfb7e5820(java.lang.String str) {
        byte[] bArr = new byte[0];
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("kinda-strings/" + str), java.nio.charset.StandardCharsets.UTF_8));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb6.toString().getBytes();
                }
                sb6.append(readLine);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("kinda KindaFileServiceImpl", "kinda打开json资源文件时出错，错误信息是：" + e17.getMessage());
            return bArr;
        }
    }
}
