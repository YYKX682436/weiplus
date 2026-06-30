package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes9.dex */
public final class s7 implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15271xc6bc8c7d f214559a;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15271xc6bc8c7d c15271xc6bc8c7d) {
        this.f214559a = c15271xc6bc8c7d;
    }

    @Override // fb5.l
    public final android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.r7 r7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15271xc6bc8c7d c15271xc6bc8c7d = this.f214559a;
        if (view == null) {
            view = android.view.View.inflate(c15271xc6bc8c7d.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.afm, null);
            r7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.r7();
            r7Var.f214465a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
            r7Var.f214466b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            r7Var.f214467c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            r7Var.f214468d = view.findViewById(com.p314xaae8f345.mm.R.id.hhc);
            view.setTag(r7Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.FinderContactSortView.ViewHolder");
            r7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.r7) tag;
        }
        java.lang.Object obj = nVar.f342431b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
        ya2.b2 b2Var = (ya2.b2) obj;
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar2 = new mn2.n(b2Var.m176700xe5e0d2a0(), null, 2, null);
        android.widget.ImageView imageView = r7Var.f214465a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(nVar2, imageView, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = r7Var.f214466b;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = c15271xc6bc8c7d.getContext();
            java.lang.String w07 = b2Var.w0();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, w07));
        }
        if (c15271xc6bc8c7d.f279405p && z17) {
            android.widget.TextView textView2 = r7Var.f214467c;
            if (textView2 != null) {
                textView2.setText(nVar.f342430a);
            }
            android.widget.TextView textView3 = r7Var.f214467c;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        } else {
            android.widget.TextView textView4 = r7Var.f214467c;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        if (c15271xc6bc8c7d.m79354xfb82a219() == 0 && z18) {
            android.view.View view2 = r7Var.f214468d;
            if (view2 != null) {
                view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
            }
        } else {
            android.view.View view3 = r7Var.f214468d;
            if (view3 != null) {
                view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
            }
        }
        return view;
    }
}
