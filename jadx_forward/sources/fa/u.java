package fa;

/* loaded from: classes15.dex */
public class u implements o.g0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2708x9856d2f8 f342167d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f342168e;

    /* renamed from: f, reason: collision with root package name */
    public o.r f342169f;

    /* renamed from: g, reason: collision with root package name */
    public int f342170g;

    /* renamed from: h, reason: collision with root package name */
    public fa.l f342171h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.LayoutInflater f342172i;

    /* renamed from: m, reason: collision with root package name */
    public int f342173m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f342174n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.res.ColorStateList f342175o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.res.ColorStateList f342176p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f342177q;

    /* renamed from: r, reason: collision with root package name */
    public int f342178r;

    /* renamed from: s, reason: collision with root package name */
    public int f342179s;

    /* renamed from: t, reason: collision with root package name */
    public int f342180t;

    /* renamed from: u, reason: collision with root package name */
    public int f342181u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnClickListener f342182v = new fa.j(this);

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.f342167d != null) {
            android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            this.f342167d.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        fa.l lVar = this.f342171h;
        if (lVar != null) {
            lVar.getClass();
            android.os.Bundle bundle2 = new android.os.Bundle();
            o.u uVar = lVar.f342160e;
            if (uVar != null) {
                bundle2.putInt("android:menu:checked", uVar.f423337d);
            }
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray2 = new android.util.SparseArray<>();
            java.util.ArrayList arrayList = lVar.f342159d;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                fa.n nVar = (fa.n) arrayList.get(i17);
                if (nVar instanceof fa.p) {
                    o.u uVar2 = ((fa.p) nVar).f342165a;
                    android.view.View actionView = uVar2 != null ? uVar2.getActionView() : null;
                    if (actionView != null) {
                        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2709x80699f16 c2709x80699f16 = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2709x80699f16();
                        actionView.saveHierarchyState(c2709x80699f16);
                        sparseArray2.put(uVar2.f423337d, c2709x80699f16);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f342168e != null) {
            android.util.SparseArray<android.os.Parcelable> sparseArray3 = new android.util.SparseArray<>();
            this.f342168e.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // o.g0
    public void c(boolean z17) {
        fa.l lVar = this.f342171h;
        if (lVar != null) {
            lVar.x();
            lVar.m8146xced61ae5();
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        this.f342172i = android.view.LayoutInflater.from(context);
        this.f342169f = rVar;
        this.f342181u = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561825tp);
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        o.u uVar;
        android.view.View actionView;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2709x80699f16 c2709x80699f16;
        o.u uVar2;
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f342167d.restoreHierarchyState(sparseParcelableArray);
            }
            android.os.Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                fa.l lVar = this.f342171h;
                lVar.getClass();
                int i17 = bundle2.getInt("android:menu:checked", 0);
                java.util.ArrayList arrayList = lVar.f342159d;
                if (i17 != 0) {
                    lVar.f342161f = true;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            break;
                        }
                        fa.n nVar = (fa.n) arrayList.get(i18);
                        if ((nVar instanceof fa.p) && (uVar2 = ((fa.p) nVar).f342165a) != null && uVar2.f423337d == i17) {
                            lVar.y(uVar2);
                            break;
                        }
                        i18++;
                    }
                    lVar.f342161f = false;
                    lVar.x();
                }
                android.util.SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        fa.n nVar2 = (fa.n) arrayList.get(i19);
                        if ((nVar2 instanceof fa.p) && (uVar = ((fa.p) nVar2).f342165a) != null && (actionView = uVar.getActionView()) != null && (c2709x80699f16 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2709x80699f16) sparseParcelableArray2.get(uVar.f423337d)) != null) {
                            actionView.restoreHierarchyState(c2709x80699f16);
                        }
                    }
                }
            }
            android.util.SparseArray<android.os.Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f342168e.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // o.g0
    /* renamed from: getId */
    public int mo2872x5db1b11() {
        return this.f342170g;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        return false;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }
}
