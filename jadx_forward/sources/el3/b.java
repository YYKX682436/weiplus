package el3;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335494e;

    public b(el3.h hVar, java.lang.String str, java.lang.String str2) {
        this.f335493d = str;
        this.f335494e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f335493d + "-" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f335494e);
        synchronized (el3.h.f335529i) {
            if (el3.h.f335528h.containsKey(str)) {
                el3.h.f335528h.put(str, java.lang.Integer.valueOf(((java.lang.Integer) el3.h.f335528h.get(str)).intValue() + 1));
            } else {
                el3.h.f335528h.put(str, 1);
            }
            el3.h.f335522b++;
        }
    }
}
