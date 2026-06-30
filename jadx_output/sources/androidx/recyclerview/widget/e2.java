package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class e2 implements androidx.recyclerview.widget.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f12010a;

    public e2(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f12010a = recyclerView;
    }

    public void a(androidx.recyclerview.widget.b bVar) {
        int i17 = bVar.f11959a;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12010a;
        if (i17 == 1) {
            recyclerView.f11902s.onItemsAdded(recyclerView, bVar.f11960b, bVar.f11962d);
            return;
        }
        if (i17 == 2) {
            recyclerView.f11902s.onItemsRemoved(recyclerView, bVar.f11960b, bVar.f11962d);
        } else if (i17 == 4) {
            recyclerView.f11902s.onItemsUpdated(recyclerView, bVar.f11960b, bVar.f11962d, bVar.f11961c);
        } else {
            if (i17 != 8) {
                return;
            }
            recyclerView.f11902s.onItemsMoved(recyclerView, bVar.f11960b, bVar.f11962d, 1);
        }
    }

    public void b(int i17, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12010a;
        int h17 = recyclerView.f11891h.h();
        int i28 = i18 + i17;
        for (int i29 = 0; i29 < h17; i29++) {
            android.view.View g17 = recyclerView.f11891h.g(i29);
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(g17);
            if (x07 != null && !x07.shouldIgnore() && (i27 = x07.mPosition) >= i17 && i27 < i28) {
                x07.addFlags(2);
                x07.addChangePayload(obj);
                ((androidx.recyclerview.widget.RecyclerView.LayoutParams) g17.getLayoutParams()).f11917f = true;
            }
        }
        androidx.recyclerview.widget.z2 z2Var = recyclerView.f11888e;
        java.util.ArrayList arrayList = z2Var.f12311c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.J1 = true;
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList.get(size);
            if (k3Var != null && (i19 = k3Var.mPosition) >= i17 && i19 < i28) {
                k3Var.addFlags(2);
                z2Var.h(size);
            }
        }
    }

    public void c(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12010a;
        int h17 = recyclerView.f11891h.h();
        for (int i19 = 0; i19 < h17; i19++) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(recyclerView.f11891h.g(i19));
            if (x07 != null && !x07.shouldIgnore() && x07.mPosition >= i17) {
                x07.offsetPosition(i18, false);
                recyclerView.F1.f12064f = true;
            }
        }
        java.util.ArrayList arrayList = recyclerView.f11888e.f12311c;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList.get(i27);
            if (k3Var != null && k3Var.mPosition >= i17) {
                k3Var.offsetPosition(i18, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.I1 = true;
    }

    public void d(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f12010a;
        int h17 = recyclerView.f11891h.h();
        int i47 = -1;
        if (i17 < i18) {
            i27 = i17;
            i19 = i18;
            i28 = -1;
        } else {
            i19 = i17;
            i27 = i18;
            i28 = 1;
        }
        for (int i48 = 0; i48 < h17; i48++) {
            androidx.recyclerview.widget.k3 x07 = androidx.recyclerview.widget.RecyclerView.x0(recyclerView.f11891h.g(i48));
            if (x07 != null && (i39 = x07.mPosition) >= i27 && i39 <= i19) {
                if (i39 == i17) {
                    x07.offsetPosition(i18 - i17, false);
                } else {
                    x07.offsetPosition(i28, false);
                }
                recyclerView.F1.f12064f = true;
            }
        }
        androidx.recyclerview.widget.z2 z2Var = recyclerView.f11888e;
        z2Var.getClass();
        if (i17 < i18) {
            i37 = i17;
            i29 = i18;
        } else {
            i29 = i17;
            i37 = i18;
            i47 = 1;
        }
        java.util.ArrayList arrayList = z2Var.f12311c;
        int size = arrayList.size();
        for (int i49 = 0; i49 < size; i49++) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) arrayList.get(i49);
            if (k3Var != null && (i38 = k3Var.mPosition) >= i37 && i38 <= i29) {
                if (i38 == i17) {
                    k3Var.offsetPosition(i18 - i17, false);
                } else {
                    k3Var.offsetPosition(i47, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.I1 = true;
    }
}
