package od;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final od.p f426049a;

    /* renamed from: b, reason: collision with root package name */
    public final od.k f426050b;

    /* renamed from: c, reason: collision with root package name */
    public final od.f f426051c;

    /* renamed from: d, reason: collision with root package name */
    public final od.m f426052d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f426053e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f426054f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f426055g = new java.util.concurrent.ConcurrentHashMap();

    public l(od.p pVar) {
        new java.util.concurrent.atomic.AtomicInteger(1);
        this.f426049a = pVar;
        od.k kVar = new od.k(this);
        this.f426050b = kVar;
        this.f426051c = new od.f(pVar);
        this.f426052d = new od.n(this);
        pVar.mo32257x74041feb(new od.o(kVar), "_luggageBridgeNative");
    }

    public void a() {
        od.p pVar = this.f426049a;
        char[] cArr = new char[4096];
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.InputStreamReader inputStreamReader = null;
        try {
            try {
                java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(pVar.mo32261x76847179().getAssets().open("LuggageBridge.js"));
                while (true) {
                    try {
                        int read = inputStreamReader2.read(cArr);
                        if (-1 != read) {
                            stringWriter.write(cArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (java.lang.Exception e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "injectJavascript: close error, %s", e17);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        inputStreamReader = inputStreamReader2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "injectJavascript: read error, %s", e);
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                                return;
                            } catch (java.lang.Exception e19) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "injectJavascript: close error, %s", e19);
                                return;
                            }
                        }
                        return;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        inputStreamReader = inputStreamReader2;
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (java.lang.Exception e27) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LuggageBridge", "injectJavascript: close error, %s", e27);
                            }
                        }
                        throw th;
                    }
                }
                inputStreamReader2.close();
                pVar.mo32260x738236e6(stringWriter.toString(), null);
            } catch (java.lang.Exception e28) {
                e = e28;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
