package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes15.dex */
public class d6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222898d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f222899e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f222900f = new java.util.LinkedList();

    public d6(android.content.Context context) {
        this.f222898d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f222900f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6) this.f222900f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c6 c6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6) this.f222900f.get(i17);
        android.content.Context context = this.f222898d;
        if (view == null) {
            view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bhp, null);
            c6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c6(null);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gon);
            c6Var.f222613a = textView;
            c6Var.f222614b = (android.view.ViewGroup) textView.getParent();
            c6Var.f222615c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gom);
            c6Var.f222616d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gok);
            c6Var.f222617e = (android.view.ViewGroup) c6Var.f222615c.getParent();
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gol);
            c6Var.f222618f = textView2;
            c6Var.f222619g = (android.view.ViewGroup) textView2.getParent().getParent();
            view.setTag(c6Var);
        } else {
            c6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.c6) view.getTag();
        }
        int i18 = b6Var.f222592a;
        if (i18 == 1) {
            c6Var.f222614b.setVisibility(0);
            c6Var.f222617e.setVisibility(8);
            c6Var.f222619g.setVisibility(8);
            c6Var.f222614b.setOnClickListener(null);
            c6Var.f222613a.setText(b6Var.f222593b);
        } else if (i18 == 2) {
            c6Var.f222614b.setVisibility(8);
            c6Var.f222617e.setVisibility(0);
            c6Var.f222619g.setVisibility(8);
            c6Var.f222615c.setText(b6Var.f222593b);
            c6Var.f222616d.setText(b6Var.f222595d);
        } else if (i18 == 3) {
            c6Var.f222614b.setVisibility(8);
            c6Var.f222617e.setVisibility(8);
            c6Var.f222619g.setVisibility(0);
            c6Var.f222618f.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560735sq);
            int indexOf = b6Var.f222593b.indexOf(this.f222899e);
            if (indexOf >= 0) {
                android.text.SpannableString spannableString = new android.text.SpannableString(b6Var.f222593b);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), indexOf, this.f222899e.length() + indexOf, 33);
                c6Var.f222618f.setText(spannableString);
            } else {
                c6Var.f222618f.setText(b6Var.f222593b);
            }
        }
        return view;
    }
}
