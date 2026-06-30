package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes2.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f93822a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f93823b = 0;

    public void a() {
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f93822a;
            if (i17 >= sparseArray.size()) {
                return;
            }
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.x2) sparseArray.valueAt(i17)).f93805a.clear();
            i17++;
        }
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 b(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x2 x2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.x2) this.f93822a.get(i17);
        if (x2Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = x2Var.f93805a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.remove(arrayList.size() - 1);
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.x2 c(int i17) {
        android.util.SparseArray sparseArray = this.f93822a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x2 x2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.x2) sparseArray.get(i17);
        if (x2Var != null) {
            return x2Var;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x2 x2Var2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.x2();
        sparseArray.put(i17, x2Var2);
        return x2Var2;
    }

    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int m8185xcdaf1228 = k3Var.m8185xcdaf1228();
        java.util.ArrayList arrayList = c(m8185xcdaf1228).f93805a;
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.x2) this.f93822a.get(m8185xcdaf1228)).f93806b <= arrayList.size()) {
            return;
        }
        k3Var.m8203xd801892c();
        arrayList.add(k3Var);
    }

    public void e(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.x2 c17 = c(i17);
        c17.f93806b = i18;
        java.util.ArrayList arrayList = c17.f93805a;
        while (arrayList.size() > i18) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
