package f33;

/* loaded from: classes10.dex */
public class e extends e33.b0 {
    public final android.content.Context N;
    public final java.lang.String P;
    public final x.d Q;

    public e(boolean z17, android.content.Context context, e33.i2 i2Var, java.lang.String str) {
        super(z17, context, i2Var);
        this.Q = new x.d(0);
        this.A = true;
        this.N = context;
        this.P = str;
    }

    @Override // e33.b0
    public void M(x.d dVar) {
        super.M(dVar);
        m8152xc67946d3(z(), I(), "update_disable_state");
    }

    @Override // e33.b0
    public void Q(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, android.view.View view) {
        if (!"image/gif".equals(abstractC15633xee433078.f219971p)) {
            R(i17, abstractC15633xee433078, view);
            return;
        }
        ck5.c cVar = new ck5.c(abstractC15633xee433078.f219963e);
        cVar.f124083b = ip.c.b();
        int c17 = ip.c.c();
        cVar.f124084c = c17;
        cVar.f124085d = c17;
        cVar.a(new f33.d(this, i17, abstractC15633xee433078, view));
    }

    public final void R(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, android.view.View view) {
        java.util.ArrayList arrayList = this.f328664g;
        int J2 = J();
        int i18 = this.f328661d;
        boolean z17 = this.B;
        boolean isEmpty = arrayList.isEmpty();
        android.content.Context context = this.N;
        java.lang.String str = this.P;
        if (!isEmpty && arrayList.get(0) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(0)).mo63659xfb85f7b0() == 1 && J2 >= i18 && !arrayList.contains(abstractC15633xee433078)) {
            if (!z17) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    or.d.b(str, 5, 1, null, or.c.b("warning_pup_win", str, null, null, 1));
                }
                if (i18 < 9) {
                    db5.e1.s(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obf, java.lang.Integer.valueOf(i18)));
                } else {
                    db5.e1.s(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obi, java.lang.Integer.valueOf(i18)));
                }
            }
            if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(false);
                return;
            }
            return;
        }
        if (!arrayList.isEmpty() && arrayList.get(0) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(0)).mo63659xfb85f7b0() != abstractC15633xee433078.mo63659xfb85f7b0()) {
            if (!z17) {
                if (!android.text.TextUtils.isEmpty(str)) {
                    or.d.b(str, 5, 1, null, or.c.b("warning_pup_win", str, null, null, 2));
                }
                db5.e1.s(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obe));
            }
            if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(false);
                return;
            }
            return;
        }
        if (arrayList.isEmpty() || arrayList.get(0) == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(0)).mo63659xfb85f7b0() != 2 || abstractC15633xee433078.mo63659xfb85f7b0() != 2 || arrayList.contains(abstractC15633xee433078)) {
            super.Q(i17, abstractC15633xee433078, view);
            boolean contains = arrayList.contains(abstractC15633xee433078);
            if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(contains);
            }
            m8152xc67946d3(z(), I(), "update_disable_state");
            return;
        }
        if (!z17) {
            if (!android.text.TextUtils.isEmpty(str)) {
                or.d.b(str, 5, 1, null, or.c.b("warning_pup_win", str, null, null, 4));
            }
            db5.e1.s(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obk, 1));
        }
        if (view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec) view).setChecked(false);
        }
    }

    public final void S(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        if (k3Var instanceof e33.m) {
            e33.m mVar = (e33.m) k3Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 E = E(i17);
            if (E == null) {
                return;
            }
            if (this.Q.contains(E.f219963e)) {
                mVar.f3639x46306858.setEnabled(false);
                android.view.View view = mVar.f3639x46306858;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f328878m.setAlpha(0.5f);
                return;
            }
            java.util.ArrayList arrayList2 = this.f328664g;
            int J2 = J();
            if (J2 == 0 || arrayList2.contains(E)) {
                mVar.f3639x46306858.setEnabled(true);
                android.view.View view2 = mVar.f3639x46306858;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f328878m.setAlpha(1.0f);
                return;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList2.get(0)).mo63659xfb85f7b0() == 2 || E.mo63659xfb85f7b0() == 2) {
                mVar.f3639x46306858.setEnabled(false);
                android.view.View view3 = mVar.f3639x46306858;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList4.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f328878m.setAlpha(0.5f);
                return;
            }
            if (J2 == this.f328661d) {
                mVar.f3639x46306858.setEnabled(false);
                android.view.View view4 = mVar.f3639x46306858;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList5.add(java.lang.Float.valueOf(0.2f));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                mVar.f328878m.setAlpha(0.5f);
                return;
            }
            mVar.f3639x46306858.setEnabled(true);
            android.view.View view5 = mVar.f3639x46306858;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList6.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/gallery/ui/emoji/EmoticonAlbumAdapter", "updateDisableState", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            mVar.f328878m.setAlpha(1.0f);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        if (!list.isEmpty() && list.contains("update_disable_state")) {
            S(k3Var, i17);
        } else {
            super.mo8157xe5e2e48d(k3Var, i17, list);
        }
    }

    @Override // e33.b0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.view.View view;
        super.mo864xe5e2e48d(k3Var, i17);
        if (k3Var instanceof e33.m) {
            e33.m mVar = (e33.m) k3Var;
            mVar.f328878m.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22625xc06c7fec c22625xc06c7fec = mVar.f328878m;
            if (c22625xc06c7fec != null && (view = (android.view.View) c22625xc06c7fec.getParent()) != null) {
                view.post(new f33.c(this, c22625xc06c7fec, view));
            }
            S(k3Var, i17);
        }
    }
}
