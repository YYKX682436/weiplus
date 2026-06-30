package zt5;

/* loaded from: classes14.dex */
public abstract class a {
    public static void a(java.security.cert.X509Certificate x509Certificate, zt5.r rVar) {
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new java.lang.Exception("Couldn't find the keystore attestation extension data.");
        }
        byte b17 = "{".getBytes()[0];
        byte b18 = "}".getBytes()[0];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < extensionValue.length; i19++) {
            byte b19 = extensionValue[i19];
            if (b19 == b17) {
                i17 = i19;
            } else if (b19 == b18) {
                i18 = i19;
            }
        }
        if (i17 <= 0 || i17 >= i18) {
            return;
        }
        int i27 = (i18 - i17) + 1;
        if (extensionValue[i17 - 1] != i27) {
            zt5.h.f("Soter.CertUtil", "read extension lenght error", new java.lang.Object[0]);
        }
        byte[] bArr = new byte[i27];
        java.lang.System.arraycopy(extensionValue, i17, bArr, 0, i27);
        java.lang.String str = new java.lang.String(bArr);
        zt5.h.c("Soter.CertUtil", "soter: challenge json in attestation certificate ".concat(str), new java.lang.Object[0]);
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        rVar.f557148c = jSONObject.getString("cpu_id");
        rVar.f557147b = jSONObject.getInt("uid");
        rVar.f557146a = jSONObject.getLong("counter");
    }

    public static java.lang.String b(java.security.cert.Certificate certificate) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(stringWriter);
        bufferedWriter.write("-----BEGIN CERTIFICATE-----");
        bufferedWriter.write("\n");
        byte[] encode = android.util.Base64.encode(certificate.getEncoded(), 2);
        char[] cArr = new char[64];
        for (int i17 = 0; i17 < encode.length; i17 += 64) {
            int i18 = 0;
            while (i18 != 64) {
                int i19 = i17 + i18;
                if (i19 >= encode.length) {
                    break;
                }
                cArr[i18] = (char) encode[i19];
                i18++;
            }
            bufferedWriter.write(cArr, 0, i18);
            bufferedWriter.write("\n");
        }
        bufferedWriter.write("-----END CERTIFICATE-----");
        bufferedWriter.write("\n");
        bufferedWriter.close();
        return stringWriter.toString();
    }
}
