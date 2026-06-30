package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class b3 extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f11965a;

    public b3(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f11965a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11965a;
        recyclerView.Q(null);
        recyclerView.F1.f12064f = true;
        recyclerView.P0(true);
        if (recyclerView.f11890g.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11965a;
        recyclerView.Q(null);
        androidx.recyclerview.widget.c cVar = recyclerView.f11890g;
        boolean z17 = false;
        if (i18 < 1) {
            cVar.getClass();
        } else {
            java.util.ArrayList arrayList = cVar.f11971b;
            arrayList.add(cVar.h(4, i17, i18, obj));
            cVar.f11975f |= 4;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11965a;
        recyclerView.Q(null);
        androidx.recyclerview.widget.c cVar = recyclerView.f11890g;
        boolean z17 = false;
        if (i18 < 1) {
            cVar.getClass();
        } else {
            java.util.ArrayList arrayList = cVar.f11971b;
            arrayList.add(cVar.h(1, i17, i18, null));
            cVar.f11975f |= 1;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void f(int i17, int i18, int i19) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11965a;
        recyclerView.Q(null);
        androidx.recyclerview.widget.c cVar = recyclerView.f11890g;
        cVar.getClass();
        boolean z17 = false;
        if (i17 != i18) {
            if (i19 != 1) {
                throw new java.lang.IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            java.util.ArrayList arrayList = cVar.f11971b;
            arrayList.add(cVar.h(8, i17, i18, null));
            cVar.f11975f |= 8;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    @Override // androidx.recyclerview.widget.h2
    public void g(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11965a;
        recyclerView.Q(null);
        androidx.recyclerview.widget.c cVar = recyclerView.f11890g;
        boolean z17 = false;
        if (i18 < 1) {
            cVar.getClass();
        } else {
            java.util.ArrayList arrayList = cVar.f11971b;
            arrayList.add(cVar.h(2, i17, i18, null));
            cVar.f11975f |= 2;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    public void h() {
        int[] iArr = androidx.recyclerview.widget.RecyclerView.X1;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f11965a;
        if (!recyclerView.f11910y || !recyclerView.f11907x) {
            recyclerView.F = true;
            recyclerView.requestLayout();
        } else {
            java.lang.Runnable runnable = recyclerView.f11895n;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(recyclerView, runnable);
        }
    }
}
