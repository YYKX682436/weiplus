package com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8;

/* renamed from: com.tencent.youtu.ytcommon.auth.HttpUtil */
/* loaded from: classes7.dex */
public class C27956xfbec4cca {

    /* renamed from: CHARSET_UTF8 */
    private static final java.lang.String f62581xed2b0ec4 = "UTF-8";

    /* renamed from: DEFAULT_TIMEOUT_MILLIS */
    private static final int f62582xb0e35ce2 = 10000;

    /* renamed from: com.tencent.youtu.ytcommon.auth.HttpUtil$HttpResponseListener */
    /* loaded from: classes7.dex */
    public interface HttpResponseListener {
        /* renamed from: onFail */
        void mo121217xc399519d(int i17);

        /* renamed from: onSuccess */
        void mo121218xe05b4124(java.lang.String str);
    }

    /* renamed from: buildConnection */
    private static java.net.HttpURLConnection m121214x24f76fec(java.lang.String str, int i17) {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setConnectTimeout(i17);
        httpURLConnection.setReadTimeout(i17);
        return httpURLConnection;
    }

    /* renamed from: getResponse */
    private static java.lang.String m121215x679151b7(java.net.HttpURLConnection httpURLConnection, com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.HttpResponseListener httpResponseListener) {
        int responseCode;
        try {
            responseCode = httpURLConnection.getResponseCode();
        } catch (java.lang.Exception unused) {
        }
        if (responseCode != 200) {
            if (httpResponseListener != null) {
                httpResponseListener.mo121217xc399519d(responseCode);
            }
            return null;
        }
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            sb6.append(new java.lang.String(bArr, 0, read));
        }
        inputStream.close();
        java.lang.String sb7 = sb6.toString();
        if (httpResponseListener != null) {
            httpResponseListener.mo121218xe05b4124(sb7);
        }
        return sb7;
    }

    /* renamed from: post */
    public static java.lang.String m121216x3498a0(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3223x6dd56e0.p3237xc10038c6.p3238x2ddda8.C27956xfbec4cca.HttpResponseListener httpResponseListener) {
        java.net.HttpURLConnection m121214x24f76fec = m121214x24f76fec(str, 10000);
        m121214x24f76fec.setRequestProperty("Content-Type", "application/json");
        m121214x24f76fec.setRequestMethod("POST");
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.io.OutputStream outputStream = m121214x24f76fec.getOutputStream();
            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
        }
        return m121215x679151b7(m121214x24f76fec, httpResponseListener);
    }
}
