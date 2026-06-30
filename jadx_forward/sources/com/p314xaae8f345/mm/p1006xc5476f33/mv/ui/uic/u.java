package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes4.dex */
public final class u implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 f233003d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var) {
        this.f233003d = c0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0 c0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16666xe1e8fad2 c16666xe1e8fad2;
        java.util.ArrayList arrayList;
        if (((ym3.o) obj).f544710a != ym3.p.f544714f || (c16666xe1e8fad2 = (c0Var = this.f233003d).f232602g) == null || (arrayList = c16666xe1e8fad2.f233598o) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((im3.j) obj2).f374236i) {
                xm3.t0 t0Var = c0Var.f232603h;
                int a07 = i17 + (t0Var != null ? t0Var.a0() : 0);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O6 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(a07));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(O6, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$1$1$2", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                O6.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewSelectedUIC$onCreate$1$1$2", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            i17 = i18;
        }
        if (!(!arrayList.isEmpty())) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).setVisibility(8);
            c0Var.P6().setEnabled(false);
            c0Var.P6().setText(c0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c0.O6(c0Var).setVisibility(0);
        c0Var.P6().setEnabled(true);
        c0Var.P6().setText(c0Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww) + '(' + arrayList.size() + ')');
    }
}
