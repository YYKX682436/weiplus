package hr3;

/* loaded from: classes4.dex */
public class c0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f364968d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f364969e;

    public c0(android.view.LayoutInflater layoutInflater, java.util.List list) {
        this.f364969e = layoutInflater;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f364968d = linkedList;
        if (list != null) {
            linkedList.addAll(list);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f364968d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d) ((java.util.LinkedList) this.f364968d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        hr3.b0 b0Var;
        if (view == null) {
            view = this.f364969e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569582fg, viewGroup, false);
            b0Var = new hr3.b0(null);
            b0Var.f364945a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h5n);
            b0Var.f364946b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l5_);
            b0Var.f364947c = view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
            view.setTag(b0Var);
        } else {
            b0Var = (hr3.b0) view.getTag();
        }
        java.util.List list = this.f364968d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d c11826x30fe0b2d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11826x30fe0b2d) ((java.util.LinkedList) list).get(i17);
        l01.d0.f396294a.b(b0Var.f364945a, c11826x30fe0b2d.f158965g, l01.a.h(), l01.q0.f396320d);
        android.widget.TextView textView = b0Var.f364946b;
        java.lang.String str = c11826x30fe0b2d.f158963e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        if (list != null) {
            android.view.View view2 = b0Var.f364947c;
            int i18 = ((java.util.LinkedList) list).size() + (-1) == i17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/BizBindWxaInfoUI$AdapterImpl", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view;
    }
}
