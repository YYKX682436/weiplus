package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net;

/* renamed from: com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper */
/* loaded from: classes13.dex */
public class C27921xe8590214 {
    private static final java.lang.String TAG = "YtSDKKitNetHelper";

    /* renamed from: TIME_OUT */
    private static final int f62345xb2e77ebc = 10000;

    /* renamed from: _instane */
    private static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214 f62346x13dcc93;

    /* renamed from: conn */
    private javax.net.ssl.HttpsURLConnection f62347x2eaf2c;

    /* renamed from: networkThread */
    private java.lang.Thread f62348xc89a79d8;

    /* renamed from: runningMap */
    private java.util.HashMap<java.lang.Integer, java.lang.Thread> f62349xa314cb1d = new java.util.HashMap<>();

    private C27921xe8590214() {
    }

    /* renamed from: clearInstance */
    public static synchronized void m121041xf5161202() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.class) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214 c27921xe8590214 = f62346x13dcc93;
            if (c27921xe8590214 != null) {
                c27921xe8590214.m121044x98c8a923();
            }
            f62346x13dcc93 = null;
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214 m121042x9cf0d20b() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214 c27921xe8590214;
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.class) {
            if (f62346x13dcc93 == null) {
                f62346x13dcc93 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214();
            }
            c27921xe8590214 = f62346x13dcc93;
        }
        return c27921xe8590214;
    }

    /* renamed from: sendNetworkRequest */
    public void m121043xc6f9ce29(final java.lang.String str, final java.lang.String str2, final java.util.HashMap<java.lang.String, java.lang.String> hashMap, final com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.1
            @Override // java.lang.Runnable
            public void run() {
                int responseCode;
                try {
                    try {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62349xa314cb1d.put(java.lang.Integer.valueOf(android.os.Process.myTid()), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62348xc89a79d8);
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c = (javax.net.ssl.HttpsURLConnection) new java.net.URL(str).openConnection();
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.setRequestMethod("POST");
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.setConnectTimeout(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b().m120765x13230b10());
                        java.util.HashMap hashMap2 = hashMap;
                        if (hashMap2 != null) {
                            for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                            }
                        }
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Write buffer");
                        java.io.OutputStream outputStream = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.getOutputStream();
                        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                        bufferedWriter.write(str2);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        outputStream.close();
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Wait response");
                        responseCode = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.getResponseCode();
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Get response");
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Network response failed " + e17.getLocalizedMessage());
                        iYtSDKKitNetResponseParser.mo120776xd218dbca(null, e17);
                    }
                    if (!com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62349xa314cb1d.containsKey(java.lang.Integer.valueOf(android.os.Process.myTid()))) {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Exit network response handling");
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.disconnect();
                        return;
                    }
                    if (responseCode == 200) {
                        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.getInputStream()));
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("");
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            stringBuffer.append(readLine);
                        }
                        bufferedReader.close();
                        java.util.HashMap<java.lang.String, java.lang.String> hashMap3 = new java.util.HashMap<>();
                        hashMap3.put("response", stringBuffer.toString());
                        iYtSDKKitNetResponseParser.mo120776xd218dbca(hashMap3, null);
                    } else {
                        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.e(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Network response failed " + responseCode);
                        iYtSDKKitNetResponseParser.mo120776xd218dbca(null, new java.lang.Exception("Https Response Failed with code:" + responseCode));
                    }
                } finally {
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.TAG, "Network disconnected");
                    com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.net.C27921xe8590214.this.f62347x2eaf2c.disconnect();
                }
            }
        });
        this.f62348xc89a79d8 = thread;
        thread.setName("YtNetworkRequestThread");
        this.f62348xc89a79d8.start();
    }

    /* renamed from: stopNetworkRequest */
    public void m121044x98c8a923() {
        for (java.util.Map.Entry<java.lang.Integer, java.lang.Thread> entry : this.f62349xa314cb1d.entrySet()) {
            if (entry.getValue() == this.f62348xc89a79d8) {
                this.f62349xa314cb1d.remove(entry.getKey());
                com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "network remove " + entry.getKey());
                return;
            }
        }
    }
}
