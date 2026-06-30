package androidx.recyclerview.widget;

/* loaded from: classes2.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f12289a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f12290b = 0;

    public void a() {
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f12289a;
            if (i17 >= sparseArray.size()) {
                return;
            }
            ((androidx.recyclerview.widget.x2) sparseArray.valueAt(i17)).f12272a.clear();
            i17++;
        }
    }

    public androidx.recyclerview.widget.k3 b(int i17) {
        androidx.recyclerview.widget.x2 x2Var = (androidx.recyclerview.widget.x2) this.f12289a.get(i17);
        if (x2Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = x2Var.f12272a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (androidx.recyclerview.widget.k3) arrayList.remove(arrayList.size() - 1);
    }

    public final androidx.recyclerview.widget.x2 c(int i17) {
        android.util.SparseArray sparseArray = this.f12289a;
        androidx.recyclerview.widget.x2 x2Var = (androidx.recyclerview.widget.x2) sparseArray.get(i17);
        if (x2Var != null) {
            return x2Var;
        }
        androidx.recyclerview.widget.x2 x2Var2 = new androidx.recyclerview.widget.x2();
        sparseArray.put(i17, x2Var2);
        return x2Var2;
    }

    public void d(androidx.recyclerview.widget.k3 k3Var) {
        int itemViewType = k3Var.getItemViewType();
        java.util.ArrayList arrayList = c(itemViewType).f12272a;
        if (((androidx.recyclerview.widget.x2) this.f12289a.get(itemViewType)).f12273b <= arrayList.size()) {
            return;
        }
        k3Var.resetInternal();
        arrayList.add(k3Var);
    }

    public void e(int i17, int i18) {
        androidx.recyclerview.widget.x2 c17 = c(i17);
        c17.f12273b = i18;
        java.util.ArrayList arrayList = c17.f12272a;
        while (arrayList.size() > i18) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
