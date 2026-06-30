package r01;

/* loaded from: classes9.dex */
public class y implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f449810d;

    public y(java.util.List list) {
        this.f449810d = list;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        java.util.List list = this.f449810d;
        if (list != null) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                java.lang.String str = (java.lang.String) list.get(i17);
                if (r01.z.g(str)) {
                    s01.r.b(str, true, null);
                }
                r01.q3.cj().d(str);
            }
        }
    }
}
