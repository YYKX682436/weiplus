package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes10.dex */
public abstract class f2 {

    /* renamed from: mObservable */
    private final p012xc85e97e9.p103xe821e364.p104xd1075a44.g2 f3622xdc6ded90 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g2();

    /* renamed from: mHasStableIds */
    private boolean f3621xbc367910 = false;

    /* renamed from: bindViewHolder */
    public final void m8141xb7153cce(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        k3Var.f3650x519040b6 = i17;
        if (m8145x24a16003()) {
            k3Var.f3643x92b325b = mo7906x1ed62e84(i17);
        }
        k3Var.m8205x52fbaf45(1, md1.e1.f72846x366c91de);
        java.lang.reflect.Method method = j3.v.f378876b;
        j3.t.a("RV OnBindView");
        mo8157xe5e2e48d(k3Var, i17, k3Var.m8189x6729fd1d());
        k3Var.m8178xcfb08281();
        android.view.ViewGroup.LayoutParams layoutParams = k3Var.f3639x46306858.getLayoutParams();
        if (layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).f93450f = true;
        }
        j3.t.b();
    }

    /* renamed from: createViewHolder */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m8142xeac316cd(android.view.ViewGroup viewGroup, int i17) {
        try {
            java.lang.reflect.Method method = j3.v.f378876b;
            j3.t.a("RV CreateView");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc = mo865x9cc5cacc(viewGroup, i17);
            if (mo865x9cc5cacc.f3639x46306858.getParent() != null) {
                throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            mo865x9cc5cacc.f3644x45198bf = i17;
            j3.t.b();
            return mo865x9cc5cacc;
        } catch (java.lang.Throwable th6) {
            java.lang.reflect.Method method2 = j3.v.f378876b;
            j3.t.b();
            throw th6;
        }
    }

    /* renamed from: getCount */
    public int mo8143x7444f759() {
        return mo1894x7e414b06();
    }

    /* renamed from: getItemCount */
    public abstract int mo1894x7e414b06();

    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return -1L;
    }

    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    /* renamed from: hasObservers */
    public final boolean m8144x4365e2e3() {
        return this.f3622xdc6ded90.a();
    }

    /* renamed from: hasStableIds */
    public final boolean m8145x24a16003() {
        return this.f3621xbc367910;
    }

    /* renamed from: notifyDataSetChanged */
    public final void m8146xced61ae5() {
        this.f3622xdc6ded90.b();
    }

    /* renamed from: notifyItemChanged */
    public final void m8147xed6e4d18(int i17) {
        this.f3622xdc6ded90.d(i17, 1, null);
    }

    /* renamed from: notifyItemInserted */
    public final void m8149x8b456734(int i17) {
        this.f3622xdc6ded90.e(i17, 1);
    }

    /* renamed from: notifyItemMoved */
    public final void m8150x87567217(int i17, int i18) {
        this.f3622xdc6ded90.c(i17, i18);
    }

    /* renamed from: notifyItemRangeChanged */
    public final void m8151xc67946d3(int i17, int i18) {
        this.f3622xdc6ded90.d(i17, i18, null);
    }

    /* renamed from: notifyItemRangeInserted */
    public final void m8153xd399a4d9(int i17, int i18) {
        this.f3622xdc6ded90.e(i17, i18);
    }

    /* renamed from: notifyItemRangeRemoved */
    public final void m8154xdb81fc7f(int i17, int i18) {
        this.f3622xdc6ded90.f(i17, i18);
    }

    /* renamed from: notifyItemRemoved */
    public final void m8155x27702c4(int i17) {
        this.f3622xdc6ded90.f(i17, 1);
    }

    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
    }

    /* renamed from: onBindViewHolder */
    public abstract void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17);

    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List<java.lang.Object> list) {
        mo864xe5e2e48d(k3Var, i17);
    }

    /* renamed from: onCreateViewHolder */
    public abstract p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17);

    /* renamed from: onDetachedFromRecyclerView */
    public void mo8158xdba684df(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
    }

    /* renamed from: onFailedToRecycleView */
    public boolean m8159xf1546cc1(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return false;
    }

    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
    }

    public void p(int i17) {
        m8147xed6e4d18(i17);
    }

    public void q(int i17) {
        m8149x8b456734(i17);
    }

    public void r(int i17, int i18) {
        m8153xd399a4d9(i17, i18);
    }

    /* renamed from: registerAdapterDataObserver */
    public void mo8163xed962dec(p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 h2Var) {
        this.f3622xdc6ded90.registerObserver(h2Var);
    }

    /* renamed from: setHasStableIds */
    public void mo8164xbbdced85(boolean z17) {
        if (m8144x4365e2e3()) {
            throw new java.lang.IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3621xbc367910 = z17;
    }

    /* renamed from: unregisterAdapterDataObserver */
    public void mo8165x48eac7b3(p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 h2Var) {
        this.f3622xdc6ded90.unregisterObserver(h2Var);
    }

    public void w(int i17) {
        m8155x27702c4(i17);
    }

    /* renamed from: notifyItemChanged */
    public final void m8148xed6e4d18(int i17, java.lang.Object obj) {
        this.f3622xdc6ded90.d(i17, 1, obj);
    }

    /* renamed from: notifyItemRangeChanged */
    public final void m8152xc67946d3(int i17, int i18, java.lang.Object obj) {
        this.f3622xdc6ded90.d(i17, i18, obj);
    }
}
