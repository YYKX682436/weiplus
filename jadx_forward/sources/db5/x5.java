package db5;

/* loaded from: classes4.dex */
public class x5 implements db5.c6 {
    @Override // db5.c6
    public boolean a() {
        return ((java.util.HashSet) db5.c6.f309840a).size() > 0;
    }

    @Override // db5.c6
    public void b() {
        java.util.Set set = db5.c6.f309840a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f) it.next();
            if (c21514xd47fe41f != null) {
                c21514xd47fe41f.c();
            }
        }
        ((java.util.HashSet) set).clear();
    }

    @Override // db5.c6
    public void c() {
        java.util.Set set = db5.c6.f309840a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f) it.next();
            if (c21514xd47fe41f != null) {
                c21514xd47fe41f.d();
            }
        }
        ((java.util.HashSet) set).clear();
    }

    @Override // db5.c6
    public void d(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f c21514xd47fe41f, boolean z17) {
        java.util.Set set = db5.c6.f309840a;
        if (z17) {
            ((java.util.HashSet) set).add(c21514xd47fe41f);
        } else {
            ((java.util.HashSet) set).remove(c21514xd47fe41f);
        }
    }
}
