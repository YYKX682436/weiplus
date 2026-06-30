package zx2;

/* loaded from: classes2.dex */
public abstract class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 f558572v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void O6(zx2.i iVar, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (iVar == null || c15436x4c00d79 == null) {
            return;
        }
        zx2.u j17 = c15436x4c00d79.j();
        j17.c(iVar.a());
        iVar.c((android.view.ViewGroup) j17.f558619f);
        iVar.e(false);
        if (iVar instanceof zx2.k) {
            zx2.k kVar = (zx2.k) iVar;
            ?? r47 = kVar.f558583h;
            if (r47.length() == 0) {
                r47 = kVar.i(m80379x76847179());
            }
            j17.f558617d = r47;
            zx2.w wVar = j17.f558621h;
            if (wVar != null) {
                wVar.b();
            }
        }
        j17.f558614a = iVar;
        java.util.ArrayList arrayList = c15436x4c00d79.f214633d;
        if (i17 >= 0) {
            c15436x4c00d79.b(j17, i17, arrayList.isEmpty());
        } else {
            c15436x4c00d79.b(j17, arrayList.size(), arrayList.isEmpty());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void S6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "ajustIndicator:" + c15436x4c00d79.m62978x443e53f0());
            if (c15436x4c00d79.m62978x443e53f0() <= 1) {
                return;
            }
            c15436x4c00d79.post(new zx2.e(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void T6() {
        zx2.u i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            int m62978x443e53f0 = c15436x4c00d79.m62978x443e53f0();
            android.view.ViewGroup Z6 = Z6();
            if (Z6 != null) {
                boolean z17 = false;
                for (int i18 = 0; i18 < m62978x443e53f0; i18++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d792 = this.f558572v;
                    java.lang.Object obj = (c15436x4c00d792 == null || (i17 = c15436x4c00d792.i(i18)) == null) ? null : i17.f558614a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    int[] b17 = ((zx2.i) obj).b();
                    if (b17[0] > 0 || b17[1] > 0) {
                        v7(Z6, i18, i65.a.b(Z6.getContext(), b17[0]), i65.a.b(Z6.getContext(), b17[1]));
                        z17 = true;
                    }
                }
                if (z17) {
                    Z6.requestLayout();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            c15436x4c00d79.a(new zx2.f(this, c15436x4c00d79));
            int i17 = 0;
            for (java.lang.Object obj : f7()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                zx2.i iVar = (zx2.i) obj;
                iVar.f558573a = i17;
                O6(iVar, -1);
                i17 = i18;
            }
            S6();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public android.view.ViewGroup Z6() {
        android.view.View childAt;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 == null || (childAt = c15436x4c00d79.getChildAt(0)) == null) {
            return null;
        }
        return (android.view.ViewGroup) childAt;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public int a7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        return c15436x4c00d79 != null ? c15436x4c00d79.m62977xe06bcb0d() : this.f215188d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void g7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 d76 = d7();
        zx2.d dVar = d76 instanceof zx2.d ? (zx2.d) d76 : null;
        if (dVar != null) {
            this.f215195n = dVar.f558567a;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void h7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 a17 = c7().a();
        this.f558572v = a17;
        if (a17 == null) {
            return;
        }
        a17.H = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            c15436x4c00d79.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d792 = this.f558572v;
        if (c15436x4c00d792 != null) {
            c15436x4c00d792.post(new zx2.g(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void q7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            zx2.u uVar = c15436x4c00d79.f214634e;
            int i18 = uVar != null ? uVar.f558618e : 0;
            c15436x4c00d79.l(i17);
            java.util.ArrayList arrayList = c15436x4c00d79.f214633d;
            zx2.u uVar2 = (zx2.u) arrayList.remove(i17);
            if (uVar2 != null) {
                uVar2.f558620g = null;
                uVar2.f558621h = null;
                uVar2.f558614a = null;
                uVar2.f558615b = null;
                uVar2.f558616c = null;
                uVar2.f558617d = null;
                uVar2.f558618e = -1;
                uVar2.f558619f = null;
                ((m3.g) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79.f214631x0).b(uVar2);
            }
            int size = arrayList.size();
            for (int i19 = i17; i19 < size; i19++) {
                ((zx2.u) arrayList.get(i19)).f558618e = i19;
            }
            if (i18 == i17) {
                c15436x4c00d79.m(arrayList.isEmpty() ? null : (zx2.u) arrayList.get(java.lang.Math.max(0, i17 - 1)), true);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void s7(int i17, boolean z17) {
        zx2.u i18;
        super.s7(i17, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = this.f558572v;
        if (c15436x4c00d79 != null) {
            if (!(i17 >= 0 && i17 < c15436x4c00d79.m62978x443e53f0())) {
                c15436x4c00d79 = null;
            }
            if (c15436x4c00d79 == null || (i18 = c15436x4c00d79.i(i17)) == null) {
                return;
            }
            if (z17 || !i18.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "FinderAlignTabUIC selectTab :" + i17);
                i18.b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
