package in5;

/* loaded from: classes10.dex */
public final class j0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f374610b;

    public j0(in5.n0 n0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f374609a = n0Var;
        this.f374610b = c1163xf1deaba4;
        new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        in5.n0 n0Var = this.f374609a;
        if (n0Var.f374630d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374610b;
            if (c1163xf1deaba4.E0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", "[onChanged] Cannot call this method while RecyclerView is computing a layout or scrolling");
                c1163xf1deaba4.post(new in5.d0(n0Var));
                return;
            }
        }
        java.util.Iterator it = n0Var.f374634h.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.h2) it.next()).b();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        in5.n0 n0Var = this.f374609a;
        if (n0Var.f374630d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374610b;
            if (c1163xf1deaba4.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeChanged] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(' ');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", sb6.toString());
                c1163xf1deaba4.post(new in5.e0(this, i18, n0Var, i17));
                return;
            }
        }
        java.util.Iterator it = n0Var.f374634h.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.h2) it.next()).c(i17, i18);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        in5.n0 n0Var = this.f374609a;
        if (n0Var.f374630d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374610b;
            if (c1163xf1deaba4.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeChanged] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(" payload=");
                sb6.append(obj);
                sb6.append(' ');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", sb6.toString());
                c1163xf1deaba4.post(new in5.f0(this, i18, this.f374609a, i17, obj));
                return;
            }
        }
        java.util.Iterator it = n0Var.f374634h.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.h2) it.next()).d(i17, i18, obj);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        in5.n0 n0Var = this.f374609a;
        if (n0Var.f374630d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374610b;
            if (c1163xf1deaba4.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeInserted] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(' ');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", sb6.toString());
                c1163xf1deaba4.post(new in5.g0(this, i18, n0Var, i17));
                return;
            }
        }
        java.util.Iterator it = n0Var.f374634h.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.h2) it.next()).e(i17, i18);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void f(int i17, int i18, int i19) {
        in5.n0 n0Var = this.f374609a;
        if (n0Var.f374630d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374610b;
            if (c1163xf1deaba4.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeMoved] Cannot call this method while RecyclerView is computing a layout or scrolling, fromPosition=");
                sb6.append(i17);
                sb6.append(" toPosition=");
                sb6.append(i18);
                sb6.append(" itemCount=");
                sb6.append(i19);
                sb6.append(' ');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", sb6.toString());
                c1163xf1deaba4.post(new in5.h0(this, i19, this.f374609a, i17, i18));
                return;
            }
        }
        java.util.Iterator it = n0Var.f374634h.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.h2) it.next()).f(i17, i18, i19);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        in5.n0 n0Var = this.f374609a;
        if (n0Var.f374630d) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f374610b;
            if (c1163xf1deaba4.E0()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemRangeRemoved] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=");
                sb6.append(i17);
                sb6.append(" itemCount=");
                sb6.append(i18);
                sb6.append(' ');
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecyclerViewAdapterEx", sb6.toString());
                c1163xf1deaba4.post(new in5.i0(this, i18, n0Var, i17));
                return;
            }
        }
        java.util.Iterator it = n0Var.f374634h.iterator();
        while (it.hasNext()) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.h2) it.next()).g(i17, i18);
        }
    }

    public final boolean h(int i17) {
        return i17 == this.f374609a.mo1894x7e414b06();
    }
}
