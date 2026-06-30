package vw3;

/* loaded from: classes5.dex */
public final class q2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f522613d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f522614e;

    public q2(java.util.List list, java.util.List biz, android.app.Activity context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(biz, "biz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f522613d = list;
        this.f522614e = biz;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f522614e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f522614e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (view == null) {
            view = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570941dd2, null);
            view.setTag(new vw3.p2(this, view));
        }
        java.lang.Object tag = view.getTag();
        vw3.p2 p2Var = tag instanceof vw3.p2 ? (vw3.p2) tag : null;
        if (p2Var != null) {
            java.lang.String str = (java.lang.String) this.f522614e.get(i17);
            p2Var.f522597d.setText(str);
            java.util.List list = this.f522613d;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd) it.next();
                    java.lang.String str2 = c16421xe4d4fcd.f229391d;
                    java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                    boolean equals = str2.equals(lowerCase);
                    android.widget.TextView textView = p2Var.f522599f;
                    android.widget.TextView textView2 = p2Var.f522598e;
                    if (equals) {
                        textView2.setText(c16421xe4d4fcd.f229393f);
                        textView.setText(c16421xe4d4fcd.f229399o);
                        break;
                    }
                    textView2.setText("");
                    textView.setText("");
                }
            }
        }
        return view;
    }
}
