package x91;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static x91.b f534162d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f534163a = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f534165c = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f534164b = new java.util.HashMap();

    public static x91.b b() {
        if (f534162d == null) {
            synchronized (x91.b.class) {
                if (f534162d == null) {
                    f534162d = new x91.b();
                }
            }
        }
        return f534162d;
    }

    public void a() {
        ((java.util.HashMap) this.f534164b).clear();
        f534162d = null;
    }

    public void c(x91.a aVar) {
        if (this.f534163a) {
            return;
        }
        java.util.List list = this.f534165c;
        if (((java.util.ArrayList) list).contains(aVar)) {
            return;
        }
        ((java.util.ArrayList) list).add(aVar);
    }

    public void d(java.lang.String str) {
        if (this.f534163a) {
            return;
        }
        x91.h hVar = (x91.h) ((java.util.HashMap) this.f534164b).remove(str);
        int i17 = 0;
        while (true) {
            java.util.List list = this.f534165c;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            x91.a aVar = (x91.a) ((java.util.ArrayList) list).get(i17);
            if (aVar != null) {
                aVar.q2(hVar);
                i17++;
            } else {
                ((java.util.ArrayList) list).remove(i17);
            }
        }
    }

    public void e(x91.a aVar) {
        ((java.util.ArrayList) this.f534165c).remove(aVar);
    }
}
