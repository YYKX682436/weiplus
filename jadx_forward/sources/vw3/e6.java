package vw3;

/* loaded from: classes5.dex */
public final class e6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w f522475d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f522476e;

    public e6(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w wVar, java.util.List projects, android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projects, "projects");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f522475d = wVar;
        this.f522476e = kz5.n0.S0(projects);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f522476e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f522476e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dpa, null);
            view.setTag(new vw3.d6(this, view));
        }
        java.lang.Object tag = view.getTag();
        vw3.d6 d6Var = tag instanceof vw3.d6 ? (vw3.d6) tag : null;
        if (d6Var != null) {
            java.lang.String str = (java.lang.String) this.f522476e.get(i17);
            d6Var.f522462d.setText(str);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.w wVar = this.f522475d;
            if (wVar != null && (linkedList = wVar.f299119d) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x) it.next();
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xVar.d(), str);
                    android.widget.TextView textView = d6Var.f522465g;
                    android.widget.TextView textView2 = d6Var.f522464f;
                    android.widget.TextView textView3 = d6Var.f522463e;
                    if (b17) {
                        textView3.setText(xVar.m117638xfb82e301());
                        textView2.setText(xVar.m117637xb5885648());
                        textView.setText(java.lang.String.valueOf(xVar.f299123e));
                        break;
                    }
                    textView3.setText("");
                    textView2.setText("");
                    textView.setText("");
                }
            }
        }
        return view;
    }
}
