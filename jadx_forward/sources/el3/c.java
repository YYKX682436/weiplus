package el3;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f335497f;

    public c(el3.h hVar, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f335495d = str;
        this.f335496e = str2;
        this.f335497f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f335495d + "-" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f335496e);
        synchronized (el3.h.f335529i) {
            if (el3.h.f335529i.containsKey(str)) {
                el3.h.f335529i.put(str, java.lang.Integer.valueOf(((java.lang.Integer) el3.h.f335529i.get(str)).intValue() + 1));
            } else {
                el3.h.f335529i.put(str, 1);
            }
            if (this.f335497f) {
                el3.h.f335524d++;
            } else {
                el3.h.f335525e++;
            }
        }
    }
}
