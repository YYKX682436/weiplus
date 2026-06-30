package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes15.dex */
public final class s2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f268363d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f268364e;

    /* renamed from: f, reason: collision with root package name */
    public final o11.f f268365f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f268366g;

    /* renamed from: h, reason: collision with root package name */
    public int f268367h;

    public s2(android.content.Context context, java.util.LinkedList linkedList, int i17) {
        this.f268366g = context;
        this.f268364e = android.view.LayoutInflater.from(context);
        this.f268363d = linkedList;
        if (linkedList == null) {
            this.f268363d = new java.util.LinkedList();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "LoginAvatarListAdapter avatars size:%d", java.lang.Integer.valueOf(this.f268363d.size()));
        o11.f fVar = new o11.f();
        this.f268365f = fVar;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f80704x478452f2;
        fVar.f423629t = true;
        fVar.f423630u = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9h);
        this.f268367h = i17;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r45.mx4 getItem(int i17) {
        java.util.LinkedList linkedList = this.f268363d;
        if (linkedList == null || i17 < 0 || i17 >= linkedList.size()) {
            return null;
        }
        return (r45.mx4) linkedList.get(i17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f268363d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r2 r2Var;
        r45.mx4 item = getItem(i17);
        if (item == null) {
            return view;
        }
        if (view == null) {
            r2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r2(null);
            view2 = this.f268364e.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569699j1, (android.view.ViewGroup) null, false);
            r2Var.f268330a = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a_1);
            r2Var.f268331b = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.a_f);
            r2Var.f268332c = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.a9v);
            r2Var.f268333d = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.a_i);
            view2.setTag(r2Var);
        } else {
            view2 = view;
            r2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r2) view.getTag();
        }
        android.widget.TextView textView = r2Var.f268331b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = item.f462427e;
        float textSize = r2Var.f268331b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.f268366g, str, textSize));
        n11.a.b().h(item.f462428f, r2Var.f268330a, this.f268365f.a());
        java.lang.String str2 = item.f462429g;
        if (str2 != null) {
            r2Var.f268332c.setText(str2);
            r2Var.f268332c.setVisibility(0);
        } else {
            r2Var.f268332c.setVisibility(8);
        }
        if (item.f462426d == this.f268367h) {
            r2Var.f268333d.setVisibility(0);
        } else {
            r2Var.f268333d.setVisibility(4);
        }
        return view2;
    }
}
