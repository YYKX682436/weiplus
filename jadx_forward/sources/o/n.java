package o;

/* loaded from: classes15.dex */
public class n implements o.g0, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f423281d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.LayoutInflater f423282e;

    /* renamed from: f, reason: collision with root package name */
    public o.r f423283f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0070xbf16889d f423284g;

    /* renamed from: h, reason: collision with root package name */
    public o.f0 f423285h;

    /* renamed from: i, reason: collision with root package name */
    public o.m f423286i;

    public n(android.content.Context context, int i17) {
        this.f423281d = context;
        this.f423282e = android.view.LayoutInflater.from(context);
    }

    @Override // o.g0
    public void a(o.r rVar, boolean z17) {
        o.f0 f0Var = this.f423285h;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.g0
    public android.os.Parcelable b() {
        if (this.f423284g == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        p012xc85e97e9.p016x746ad0e3.p017x373aa5.p018x33155f.C0070xbf16889d c0070xbf16889d = this.f423284g;
        if (c0070xbf16889d != null) {
            c0070xbf16889d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.g0
    public void c(boolean z17) {
        o.m mVar = this.f423286i;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // o.g0
    public void d(android.content.Context context, o.r rVar) {
        if (this.f423281d != null) {
            this.f423281d = context;
            if (this.f423282e == null) {
                this.f423282e = android.view.LayoutInflater.from(context);
            }
        }
        this.f423283f = rVar;
        o.m mVar = this.f423286i;
        if (mVar != null) {
            mVar.notifyDataSetChanged();
        }
    }

    @Override // o.g0
    public boolean e() {
        return false;
    }

    @Override // o.g0
    public void f(android.os.Parcelable parcelable) {
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = ((android.os.Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f423284g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // o.g0
    public void g(o.f0 f0Var) {
        this.f423285h = f0Var;
    }

    @Override // o.g0
    /* renamed from: getId */
    public int mo2872x5db1b11() {
        return 0;
    }

    @Override // o.g0
    public boolean h(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // o.g0
    public boolean i(o.o0 o0Var) {
        if (!o0Var.hasVisibleItems()) {
            return false;
        }
        o.s sVar = new o.s(o0Var);
        android.content.Context context = o0Var.f423313d;
        p012xc85e97e9.p016x746ad0e3.app.l lVar = new p012xc85e97e9.p016x746ad0e3.app.l(context);
        p012xc85e97e9.p016x746ad0e3.app.h hVar = lVar.f90726a;
        o.n nVar = new o.n(hVar.f90662a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569426au);
        sVar.f423335f = nVar;
        nVar.f423285h = sVar;
        o0Var.b(nVar, context);
        o.n nVar2 = sVar.f423335f;
        if (nVar2.f423286i == null) {
            nVar2.f423286i = new o.m(nVar2);
        }
        hVar.f90675n = nVar2.f423286i;
        hVar.f90676o = sVar;
        android.view.View view = o0Var.f423327u;
        if (view != null) {
            hVar.f90666e = view;
        } else {
            hVar.f90664c = o0Var.f423326t;
            hVar.f90665d = o0Var.f423325s;
        }
        hVar.f90673l = sVar;
        p012xc85e97e9.p016x746ad0e3.app.m a17 = lVar.a();
        sVar.f423334e = a17;
        a17.setOnDismissListener(sVar);
        android.view.WindowManager.LayoutParams attributes = sVar.f423334e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        sVar.f423334e.show();
        o.f0 f0Var = this.f423285h;
        if (f0Var == null) {
            return true;
        }
        f0Var.c(o0Var);
        return true;
    }

    @Override // o.g0
    public boolean j(o.r rVar, o.u uVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        this.f423283f.q(this.f423286i.getItem(i17), this, 0);
    }
}
