package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public final class x0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273506d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f273507e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273508f;

    public x0(android.content.Context mContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f273506d = mContext;
        this.f273508f = "";
        this.f273507e = new java.util.ArrayList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f273507e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y0) this.f273507e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w0 w0Var;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DropdownListAdapter", "duanyi test getView:" + i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y0 y0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y0) this.f273507e.get(i17);
        android.content.Context context = this.f273506d;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4s, parent, false);
            w0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w0();
            w0Var.f273494a = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.hhr);
            w0Var.f273495b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hiq);
            w0Var.f273496c = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.mkk);
            w0Var.f273497d = view2.findViewById(com.p314xaae8f345.mm.R.id.hi_);
            view2.setTag(w0Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.tools.DropdownListView.DropdownListAdapter.ViewHolder");
            w0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w0) tag;
            view2 = view;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273508f, y0Var.f273537a)) {
            android.widget.ImageView imageView = w0Var.f273496c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            imageView.setVisibility(0);
        } else {
            android.widget.ImageView imageView2 = w0Var.f273496c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            imageView2.setVisibility(4);
        }
        if (i17 < getCount() - 1) {
            android.view.View view3 = w0Var.f273497d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = w0Var.f273497d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view4);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView$DropdownListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = w0Var.f273494a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        c22699x3dcdb352.setImageDrawable(context.getResources().getDrawable(y0Var.f273538b));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = w0Var.f273494a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb3522);
        c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(y0Var.f273539c));
        android.widget.TextView textView = w0Var.f273495b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        textView.setVisibility(0);
        android.widget.TextView textView2 = w0Var.f273495b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        textView2.setText(y0Var.f273537a);
        return view2;
    }
}
