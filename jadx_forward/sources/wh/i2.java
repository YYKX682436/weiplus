package wh;

/* loaded from: classes12.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public long f527335a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f527336b = java.util.Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f527337c = true;

    public int a(java.lang.String str) {
        for (wh.h2 h2Var : this.f527336b) {
            java.lang.String str2 = h2Var.f527329a;
            if (str2 != null && str2.equals(str)) {
                return h2Var.f527330b;
            }
        }
        return 0;
    }

    public wh.h2 b() {
        if (this.f527336b.size() >= 1) {
            return (wh.h2) this.f527336b.get(0);
        }
        return null;
    }

    public wh.h2 c() {
        if (this.f527336b.size() >= 2) {
            return (wh.h2) this.f527336b.get(1);
        }
        return null;
    }
}
