package com.tencent.kinda.framework.app;

/* loaded from: classes5.dex */
public class KindaFileServiceImpl implements com.tencent.kinda.gen.KFileService {
    @Override // com.tencent.kinda.gen.KFileService
    public byte[] getData(java.lang.String str) {
        byte[] bArr = new byte[0];
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("kinda-strings/" + str), java.nio.charset.StandardCharsets.UTF_8));
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
            com.tencent.mars.xlog.Log.e("kinda KindaFileServiceImpl", "kinda打开json资源文件时出错，错误信息是：" + e17.getMessage());
            return bArr;
        }
    }
}
