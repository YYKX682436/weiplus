package db5;

/* loaded from: classes8.dex */
public class y2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 f310111d;

    public y2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151, db5.w2 w2Var) {
        this.f310111d = c21498xf966a151;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310111d;
        int i17 = c21498xf966a151.f278953f;
        if (i17 < 0 || c21498xf966a151.f278958n == null) {
            return 0;
        }
        return i17;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310111d;
        db5.v2 v2Var = c21498xf966a151.f278958n;
        if (v2Var == null) {
            return null;
        }
        return ((za3.b) v2Var).f552422b.get(c21498xf966a151.f278954g + i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310111d;
        db5.v2 v2Var = c21498xf966a151.f278958n;
        if (v2Var == null) {
            return 0L;
        }
        int i18 = c21498xf966a151.f278954g + i17;
        ((za3.b) v2Var).getClass();
        return i18;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310111d;
        db5.v2 v2Var = c21498xf966a151.f278958n;
        if (v2Var == null) {
            return 0;
        }
        int i18 = c21498xf966a151.f278954g;
        v2Var.getClass();
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310111d;
        int i18 = c21498xf966a151.f278951d;
        viewGroup.toString();
        boolean z18 = c21498xf966a151.f278956i;
        if (c21498xf966a151.f278956i) {
            view = null;
        }
        db5.v2 v2Var = c21498xf966a151.f278958n;
        if (v2Var == null) {
            view = null;
        } else {
            int i19 = c21498xf966a151.f278954g + i17;
            za3.b bVar = (za3.b) v2Var;
            bVar.getClass();
            za3.a aVar = new za3.a(bVar);
            if (view == null) {
                view = android.view.View.inflate(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569698j0, null);
                aVar.f552419a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_2);
                aVar.f552420b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ove);
                view.setTag(aVar);
            } else {
                aVar = (za3.a) view.getTag();
            }
            java.lang.String str = (java.lang.String) bVar.f552422b.get(i19);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(aVar.f552419a, str, null);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (e17.length() > 8) {
                e17 = ((java.lang.Object) e17.subSequence(0, 9)) + "...";
            }
            aVar.f552420b.setText(e17);
        }
        iz5.a.g(null, view != null);
        int i27 = c21498xf966a151.f278955h;
        if (-1 == i27 || c21498xf966a151.f278954g + i17 != i27) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.os.SystemClock.elapsedRealtime();
        int i28 = c21498xf966a151.f278955h;
        int i29 = c21498xf966a151.f278954g;
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        db5.v2 v2Var = this.f310111d.f278958n;
        if (v2Var == null) {
            return 1;
        }
        v2Var.getClass();
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21498xf966a151 c21498xf966a151 = this.f310111d;
        db5.v2 v2Var = c21498xf966a151.f278958n;
        if (v2Var == null) {
            return false;
        }
        int i18 = c21498xf966a151.f278954g;
        v2Var.getClass();
        return true;
    }
}
