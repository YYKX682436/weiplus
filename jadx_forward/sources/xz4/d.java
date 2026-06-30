package xz4;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile xz4.d f539798b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f539799c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f539800a = new java.util.concurrent.ConcurrentHashMap();

    public static xz4.d a() {
        if (f539798b == null) {
            synchronized (f539799c) {
                if (f539798b == null) {
                    f539798b = new xz4.d();
                }
            }
        }
        return f539798b;
    }

    public boolean b() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f539800a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return false;
        }
        java.util.Collection values = concurrentHashMap.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add((xz4.c) it.next());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            xz4.c cVar = (xz4.c) it6.next();
            xz4.k kVar = cVar.f539786d;
            if (kVar.f539819j && concurrentHashMap.containsKey(kVar.f539810a)) {
                cVar.f539795p = true;
                try {
                    java.net.HttpURLConnection httpURLConnection = cVar.f539788f;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgDownloadTask", e17.getMessage());
                        }
                        cVar.f539788f.disconnect();
                    }
                    java.util.concurrent.Future future = cVar.f539787e;
                    if (future != null) {
                        future.cancel(false);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgDownloadTask", "stop, " + e18.getMessage());
                }
                concurrentHashMap.remove(cVar.f539786d.f539810a);
            }
        }
        arrayList.clear();
        return true;
    }
}
