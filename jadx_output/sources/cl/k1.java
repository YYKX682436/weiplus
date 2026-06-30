package cl;

/* loaded from: classes7.dex */
public class k1 extends com.eclipsesource.mmv8.ExecuteDetails {

    /* renamed from: a, reason: collision with root package name */
    public long f42675a;

    /* renamed from: b, reason: collision with root package name */
    public long f42676b;

    /* renamed from: c, reason: collision with root package name */
    public int f42677c;

    public static void a(cl.k1 k1Var) {
        k1Var.getClass();
        k1Var.f42676b = java.lang.System.currentTimeMillis();
    }

    public java.lang.String toString() {
        return "ExecuteDetails{evaluateJSStartTimestampMs=" + this.f42675a + ", evaluateJSEndTimestampMs=" + this.f42676b + ", cacheType=" + this.f42677c + ", codeCacheStatus=" + this.codeCacheStatus + ", flatJSCompileCost=" + this.flatJSCompileCost + ", flatJSRunCost=" + this.flatJSRunCost + ", sourceLength=" + this.sourceLength + '}';
    }
}
