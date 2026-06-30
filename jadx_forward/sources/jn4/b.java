package jn4;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f382329d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f382330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn4.m f382331f;

    public b(jn4.m mVar, java.lang.String str, java.util.Set set) {
        this.f382331f = mVar;
        this.f382329d = str;
        this.f382330e = set;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.net.Socket socket;
        boolean z17;
        java.lang.String str = this.f382329d;
        java.lang.String format = java.lang.String.format("connect %s: ", str);
        jn4.m mVar = this.f382331f;
        mVar.c(str, format, 1);
        java.util.Iterator it = this.f382330e.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            mVar.getClass();
            try {
                socket = new java.net.Socket();
                try {
                    try {
                        socket.setSoTimeout(5000);
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        socket.connect(new java.net.InetSocketAddress(str, intValue));
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTraceRoute", "connect success" + str + ":" + intValue);
                        mVar.c(str, java.lang.String.format("port = %d, time = %dms ", java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis)), 1);
                        try {
                            socket.close();
                        } catch (java.io.IOException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "close err: " + e17.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e17, "", new java.lang.Object[0]);
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        java.lang.Throwable th7 = th;
                        if (socket == null) {
                            throw th7;
                        }
                        try {
                            socket.close();
                            throw th7;
                        } catch (java.io.IOException e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "close err: " + e18.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e18, "", new java.lang.Object[0]);
                            throw th7;
                        }
                    }
                } catch (java.net.UnknownHostException e19) {
                    e = e19;
                    z17 = true;
                    mVar.c(str, java.lang.String.format("connect err; UnknownHostException: port = %d, errmsg: %s", java.lang.Integer.valueOf(intValue), e.toString()), 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "connect err: " + e.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e, "", new java.lang.Object[0]);
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (java.io.IOException e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "close err: " + e27.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e27, "", new java.lang.Object[0]);
                        }
                    }
                } catch (java.io.IOException e28) {
                    e = e28;
                    mVar.c(str, java.lang.String.format("connect err; IOException: port = %d, errmsg: %s", java.lang.Integer.valueOf(intValue), e.toString()), 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "connect err:" + e.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e, "", new java.lang.Object[0]);
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (java.io.IOException e29) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "close err: " + e29.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e29, "", new java.lang.Object[0]);
                        }
                    }
                    z17 = true;
                } catch (java.lang.Exception e37) {
                    e = e37;
                    mVar.c(str, java.lang.String.format("connect err; Exception: port = %d, errmsg: %s", java.lang.Integer.valueOf(intValue), e.toString()), 1);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "connect err:" + e.toString());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e, "", new java.lang.Object[0]);
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (java.io.IOException e38) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "close err: " + e38.getMessage());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMTraceRoute", e38, "", new java.lang.Object[0]);
                        }
                    }
                    z17 = true;
                }
            } catch (java.net.UnknownHostException e39) {
                e = e39;
                socket = null;
            } catch (java.io.IOException e47) {
                e = e47;
                socket = null;
            } catch (java.lang.Exception e48) {
                e = e48;
                socket = null;
            } catch (java.lang.Throwable th8) {
                th = th8;
                socket = null;
            }
            z17 = true;
        }
        mVar.c(str, "\n", 1);
    }
}
