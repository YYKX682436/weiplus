package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes7.dex */
public class w6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f269124d;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6 x6Var, java.util.LinkedList linkedList) {
        this.f269124d = linkedList;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f269124d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.jv5) this.f269124d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.v6 v6Var;
        java.util.LinkedList linkedList = this.f269124d;
        if (linkedList == null || linkedList.size() <= 0) {
            return null;
        }
        r45.jv5 jv5Var = (r45.jv5) linkedList.get(i17);
        if (view == null) {
            v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.v6(this, null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569695iv, null);
            v6Var.f269117a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564614w2);
            v6Var.f269118b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f564612w0);
            view2.setTag(v6Var);
        } else {
            view2 = view;
            v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.v6) view.getTag();
        }
        int i18 = jv5Var.f459666f;
        if (i18 == 1) {
            v6Var.f269117a.setImageResource(com.p314xaae8f345.mm.R.raw.f80524x3921d096);
        } else if (i18 == 3) {
            v6Var.f269117a.setImageResource(com.p314xaae8f345.mm.R.raw.f80523x57ba5c03);
        } else {
            v6Var.f269117a.setImageResource(com.p314xaae8f345.mm.R.raw.f80522x24cd9309);
        }
        v6Var.f269118b.setText(jv5Var.f459665e);
        android.widget.ImageView imageView = v6Var.f269117a;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u6(this, jv5Var, imageView));
        return view2;
    }
}
