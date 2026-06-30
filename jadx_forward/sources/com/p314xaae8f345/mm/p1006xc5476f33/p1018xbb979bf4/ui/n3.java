package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes12.dex */
public class n3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156135d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f156136e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f156137f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a f156138g;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a, com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a2) {
        this.f156138g = activityC11497x3bc191a;
        this.f156135d = activityC11497x3bc191a2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f156136e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (s71.b) this.f156136e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.m3 m3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.m3(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a = this.f156135d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ActivityC11497x3bc191a activityC11497x3bc191a2 = this.f156138g;
        if (view == null) {
            view = android.view.View.inflate(activityC11497x3bc191a, com.p314xaae8f345.mm.R.C30864xbddafb2a.d4z, null);
            m3Var.f156123a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.sbi);
            m3Var.f156124b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564273mn);
            m3Var.f156125c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564280mv);
            m3Var.f156126d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.sbh);
            m3Var.f156127e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.ptv);
            m3Var.f156128f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.sbg);
            m3Var.f156129g = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.sbf);
            m3Var.f156130h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.sbn);
            if (activityC11497x3bc191a2.f156039y) {
                view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562842q5);
                m3Var.f156123a.setTextColor(activityC11497x3bc191a2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
                m3Var.f156124b.setTextColor(activityC11497x3bc191a2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                m3Var.f156125c.setTextColor(activityC11497x3bc191a2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
                m3Var.f156126d.setTextColor(activityC11497x3bc191a2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
                m3Var.f156127e.m82040x7541828(activityC11497x3bc191a2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
                m3Var.f156128f.m82040x7541828(activityC11497x3bc191a2.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            }
            view.setTag(m3Var);
        } else {
            m3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.m3) view.getTag();
        }
        s71.b bVar = (s71.b) this.f156136e.get(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(bVar.f485505f)) {
            sb6.append(bVar.f485505f);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485506g)) {
            sb6.append(" ");
            sb6.append(bVar.f485506g);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485507h)) {
            sb6.append(" ");
            sb6.append(bVar.f485507h);
        }
        if (!android.text.TextUtils.isEmpty(bVar.f485513q)) {
            sb6.append(" ");
            sb6.append(bVar.f485513q);
        }
        m3Var.f156123a.setText(sb6.toString());
        m3Var.f156124b.setText(bVar.f485509m);
        m3Var.f156125c.setText(bVar.f485510n);
        m3Var.f156126d.setText(bVar.f485511o);
        m3Var.f156127e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.i3(this, bVar));
        m3Var.f156128f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.j3(this, bVar));
        m3Var.f156129g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.k3(this));
        if (activityC11497x3bc191a2.f156032r) {
            m3Var.f156127e.setVisibility(8);
        }
        if (activityC11497x3bc191a2.getIntent().hasExtra("KEY_ITEM_SHOW_EDIT")) {
            if (activityC11497x3bc191a2.getIntent().getBooleanExtra("KEY_ITEM_SHOW_EDIT", false)) {
                m3Var.f156128f.setVisibility(0);
            } else {
                m3Var.f156128f.setVisibility(8);
            }
        }
        if (activityC11497x3bc191a2.getIntent().hasExtra("KEY_ITEM_SHOW_COPY")) {
            if (activityC11497x3bc191a2.getIntent().getBooleanExtra("KEY_ITEM_SHOW_COPY", false)) {
                m3Var.f156127e.setVisibility(0);
            } else {
                m3Var.f156127e.setVisibility(8);
            }
        }
        if (this.f156137f) {
            s71.b bVar2 = activityC11497x3bc191a.f156024g;
            if (bVar2 == null || bVar.f485503d != bVar2.f485503d) {
                m3Var.f156130h.setVisibility(4);
            } else {
                m3Var.f156130h.setVisibility(0);
            }
        } else {
            m3Var.f156130h.setVisibility(8);
        }
        return view;
    }
}
