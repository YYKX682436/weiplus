package xf1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf1.e f535759e;

    public b(java.lang.String str, xf1.e eVar) {
        this.f535758d = str;
        this.f535759e = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = xf1.f.f535767b;
        java.lang.String str = this.f535758d;
        if (!((java.util.HashMap) map).containsKey(str)) {
            ((java.util.HashMap) map).put(str, new java.util.ArrayList());
        }
        ((java.util.List) ((java.util.HashMap) map).get(str)).add(this.f535759e);
    }
}
