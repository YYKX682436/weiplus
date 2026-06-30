package fa;

/* loaded from: classes15.dex */
public class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f342159d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public o.u f342160e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f342161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fa.u f342162g;

    public l(fa.u uVar) {
        this.f342162g = uVar;
        x();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f342159d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        fa.n nVar = (fa.n) this.f342159d.get(i17);
        if (nVar instanceof fa.o) {
            return 2;
        }
        if (nVar instanceof fa.m) {
            return 3;
        }
        if (nVar instanceof fa.p) {
            return ((fa.p) nVar).f342165a.hasSubMenu() ? 1 : 0;
        }
        throw new java.lang.RuntimeException("Unknown item type.");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        fa.t tVar = (fa.t) k3Var;
        int mo863xcdaf1228 = mo863xcdaf1228(i17);
        java.util.ArrayList arrayList = this.f342159d;
        if (mo863xcdaf1228 != 0) {
            if (mo863xcdaf1228 == 1) {
                ((android.widget.TextView) tVar.f3639x46306858).setText(((fa.p) arrayList.get(i17)).f342165a.f423341h);
                return;
            } else {
                if (mo863xcdaf1228 != 2) {
                    return;
                }
                fa.o oVar = (fa.o) arrayList.get(i17);
                tVar.f3639x46306858.setPadding(0, oVar.f342163a, 0, oVar.f342164b);
                return;
            }
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2707x19559f2b c2707x19559f2b = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2707x19559f2b) tVar.f3639x46306858;
        fa.u uVar = this.f342162g;
        c2707x19559f2b.m20312x7f562754(uVar.f342176p);
        if (uVar.f342174n) {
            c2707x19559f2b.m20314x1d8f3e73(uVar.f342173m);
        }
        android.content.res.ColorStateList colorStateList = uVar.f342175o;
        if (colorStateList != null) {
            c2707x19559f2b.m20315x1c5c5ff4(colorStateList);
        }
        android.graphics.drawable.Drawable drawable = uVar.f342177q;
        android.graphics.drawable.Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.q(c2707x19559f2b, newDrawable);
        fa.p pVar = (fa.p) arrayList.get(i17);
        c2707x19559f2b.m20313xefc0324b(pVar.f342166b);
        c2707x19559f2b.m20309x49d2ab0b(uVar.f342178r);
        c2707x19559f2b.m20311x1a060796(uVar.f342179s);
        c2707x19559f2b.a(pVar.f342165a, 0);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 qVar;
        fa.u uVar = this.f342162g;
        if (i17 == 0) {
            qVar = new fa.q(uVar.f342172i, viewGroup, uVar.f342182v);
        } else if (i17 == 1) {
            qVar = new fa.s(uVar.f342172i, viewGroup);
        } else {
            if (i17 != 2) {
                if (i17 != 3) {
                    return null;
                }
                return new fa.k(uVar.f342168e);
            }
            qVar = new fa.r(uVar.f342172i, viewGroup);
        }
        return qVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewRecycled */
    public void mo8162x34789575(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        fa.t tVar = (fa.t) k3Var;
        if (tVar instanceof fa.q) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2707x19559f2b c2707x19559f2b = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2707x19559f2b) tVar.f3639x46306858;
            android.widget.FrameLayout frameLayout = c2707x19559f2b.F;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            c2707x19559f2b.E.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void x() {
        boolean z17;
        if (this.f342161f) {
            return;
        }
        this.f342161f = true;
        java.util.ArrayList arrayList = this.f342159d;
        arrayList.clear();
        arrayList.add(new fa.m());
        fa.u uVar = this.f342162g;
        int size = uVar.f342169f.l().size();
        boolean z18 = false;
        int i17 = -1;
        int i18 = 0;
        boolean z19 = false;
        int i19 = 0;
        while (i18 < size) {
            o.u uVar2 = (o.u) uVar.f342169f.l().get(i18);
            if (uVar2.isChecked()) {
                y(uVar2);
            }
            if (uVar2.isCheckable()) {
                uVar2.f(z18);
            }
            if (uVar2.hasSubMenu()) {
                o.o0 o0Var = uVar2.f423351u;
                if (o0Var.hasVisibleItems()) {
                    if (i18 != 0) {
                        arrayList.add(new fa.o(uVar.f342181u, z18 ? 1 : 0));
                    }
                    arrayList.add(new fa.p(uVar2));
                    int size2 = o0Var.size();
                    int i27 = z18 ? 1 : 0;
                    int i28 = i27;
                    while (i27 < size2) {
                        o.u uVar3 = (o.u) o0Var.getItem(i27);
                        if (uVar3.isVisible()) {
                            if (i28 == 0 && uVar3.getIcon() != null) {
                                i28 = 1;
                            }
                            if (uVar3.isCheckable()) {
                                uVar3.f(z18);
                            }
                            if (uVar2.isChecked()) {
                                y(uVar2);
                            }
                            arrayList.add(new fa.p(uVar3));
                        }
                        i27++;
                        z18 = false;
                    }
                    if (i28 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((fa.p) arrayList.get(size4)).f342166b = true;
                        }
                    }
                }
                z17 = true;
            } else {
                int i29 = uVar2.f423338e;
                if (i29 != i17) {
                    i19 = arrayList.size();
                    z19 = uVar2.getIcon() != null;
                    if (i18 != 0) {
                        i19++;
                        int i37 = uVar.f342181u;
                        arrayList.add(new fa.o(i37, i37));
                    }
                } else if (!z19 && uVar2.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i38 = i19; i38 < size5; i38++) {
                        ((fa.p) arrayList.get(i38)).f342166b = true;
                    }
                    z17 = true;
                    z19 = true;
                    fa.p pVar = new fa.p(uVar2);
                    pVar.f342166b = z19;
                    arrayList.add(pVar);
                    i17 = i29;
                }
                z17 = true;
                fa.p pVar2 = new fa.p(uVar2);
                pVar2.f342166b = z19;
                arrayList.add(pVar2);
                i17 = i29;
            }
            i18++;
            z18 = false;
        }
        this.f342161f = z18 ? 1 : 0;
    }

    public void y(o.u uVar) {
        if (this.f342160e == uVar || !uVar.isCheckable()) {
            return;
        }
        o.u uVar2 = this.f342160e;
        if (uVar2 != null) {
            uVar2.setChecked(false);
        }
        this.f342160e = uVar;
        uVar.setChecked(true);
    }
}
