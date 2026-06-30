package hy4;

/* loaded from: classes7.dex */
public abstract class f {
    public static boolean a(hy4.e eVar) {
        java.lang.String str = (java.lang.String) ((java.util.HashMap) eVar.f367631b).get("Content-Type");
        if (str == null) {
            java.util.Map map = eVar.f367631b;
            str = (java.lang.String) ((java.util.HashMap) map).get("Content-type");
            if (str == null && (str = (java.lang.String) ((java.util.HashMap) map).get("content-type")) == null) {
                return false;
            }
        }
        java.lang.String lowerCase = str.toLowerCase();
        return lowerCase.startsWith("image/") || lowerCase.startsWith("video/") || lowerCase.startsWith("audio/");
    }

    public static void b(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e17);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e18);
            }
        }
    }

    public static byte[] c(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                        return byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", "convertStreamToBytes: " + e17);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                throw th6;
            }
        }
    }

    public static java.lang.String d(java.io.InputStream inputStream) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(inputStreamReader, 512);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            try {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        b(inputStreamReader);
                        b(bufferedReader);
                        return sb6.toString();
                    }
                    sb6.append(readLine + "\n");
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e17);
                    return null;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e18);
                    return null;
                }
            } finally {
                b(inputStreamReader);
                b(bufferedReader);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static hy4.e e(java.lang.String r6, java.util.Map r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hy4.f.e(java.lang.String, java.util.Map, java.lang.String):hy4.e");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x014c -> B:69:0x0153). Please report as a decompilation issue!!! */
    public static hy4.e f(java.lang.String str, java.util.Map map, java.lang.String str2) {
        java.net.HttpURLConnection httpURLConnection;
        java.io.InputStream inputStream;
        ?? r27 = 0;
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
            r27 = str;
        }
        try {
            try {
                httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e17.getMessage());
                return null;
            }
            try {
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                int i17 = 0;
                httpURLConnection.setUseCaches(false);
                if (map != 0 && map.size() > 0) {
                    for (java.lang.String str3 : map.keySet()) {
                        httpURLConnection.setRequestProperty(str3, (java.lang.String) map.get(str3));
                    }
                }
                byte[] bytes = str2.getBytes();
                httpURLConnection.connect();
                java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(bytes);
                dataOutputStream.flush();
                hy4.e eVar = new hy4.e();
                int responseCode = httpURLConnection.getResponseCode();
                eVar.f367630a = responseCode;
                if (responseCode == 200) {
                    try {
                        inputStream = h(httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
                    } catch (java.io.IOException unused) {
                        inputStream = null;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        inputStream = null;
                    }
                    try {
                        eVar.f367632c = d(inputStream);
                        b(inputStream);
                    } catch (java.io.IOException unused2) {
                        b(inputStream);
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e18.getMessage());
                        }
                        try {
                            httpURLConnection.disconnect();
                        } catch (java.lang.Exception e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e19.getMessage());
                        }
                        return null;
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        b(inputStream);
                        throw th;
                    }
                }
                while (true) {
                    java.lang.String headerFieldKey = httpURLConnection.getHeaderFieldKey(i17);
                    java.lang.String headerField = httpURLConnection.getHeaderField(i17);
                    if (headerFieldKey == null && headerField == null) {
                        try {
                            break;
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e27.getMessage());
                        }
                    } else {
                        ((java.util.HashMap) eVar.f367631b).put(headerFieldKey, headerField);
                        i17++;
                    }
                }
                httpURLConnection.getInputStream().close();
                try {
                    httpURLConnection.disconnect();
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e28.getMessage());
                }
                return eVar;
            } catch (java.net.MalformedURLException e29) {
                e = e29;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (java.lang.Exception e37) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e37.getMessage());
                    }
                    httpURLConnection.disconnect();
                }
                return null;
            } catch (java.io.IOException e38) {
                e = e38;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (java.lang.Exception e39) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e39.getMessage());
                    }
                    httpURLConnection.disconnect();
                }
                return null;
            } catch (java.lang.Exception e47) {
                e = e47;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.RequestUtil", "", e);
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (java.lang.Exception e48) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e48.getMessage());
                    }
                    httpURLConnection.disconnect();
                }
                return null;
            }
        } catch (java.net.MalformedURLException e49) {
            e = e49;
            httpURLConnection = null;
        } catch (java.io.IOException e57) {
            e = e57;
            httpURLConnection = null;
        } catch (java.lang.Exception e58) {
            e = e58;
            httpURLConnection = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            if (r27 != 0) {
                try {
                    r27.getInputStream().close();
                } catch (java.lang.Exception e59) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e59.getMessage());
                }
                try {
                    r27.disconnect();
                } catch (java.lang.Exception e66) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RequestUtil", e66.getMessage());
                }
            }
            throw th;
        }
    }

    public static void g(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if ((key instanceof java.lang.String) && (value instanceof java.util.Map)) {
                java.util.Map map2 = (java.util.Map) value;
                g(map2);
                map.put(key, new org.json.JSONObject(map2));
            }
        }
    }

    public static java.io.InputStream h(java.lang.String str, java.io.InputStream inputStream) {
        if (str == null || "identity".equalsIgnoreCase(str)) {
            return inputStream;
        }
        if ("gzip".equalsIgnoreCase(str)) {
            return new java.util.zip.GZIPInputStream(inputStream);
        }
        if ("deflate".equalsIgnoreCase(str)) {
            return new java.util.zip.InflaterInputStream(inputStream, new java.util.zip.Inflater(false), 512);
        }
        throw new java.lang.RuntimeException("unsupported content-encoding: ".concat(str));
    }
}
