package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class xh extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f294089d;

    /* renamed from: e, reason: collision with root package name */
    public final int f294090e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f294091f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.LayoutInflater f294092g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f294093h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f294094i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f294095m;

    /* renamed from: n, reason: collision with root package name */
    public final o11.g f294096n;

    public xh(android.content.Context context, android.view.LayoutInflater layoutInflater, int i17, java.lang.String str) {
        this.f294089d = context;
        this.f294090e = i17;
        this.f294091f = str;
        this.f294092g = layoutInflater;
        this.f294095m = new com.p314xaae8f345.mm.ui.uh(this, i17);
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423627r = l01.a.h();
        this.f294096n = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f294093h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.ui.vh) this.f294093h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.wh whVar;
        com.p314xaae8f345.mm.ui.vh vhVar = (com.p314xaae8f345.mm.ui.vh) this.f294093h.get(i17);
        if (view == null) {
            view = this.f294092g.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ckh, viewGroup, false);
            whVar = new com.p314xaae8f345.mm.ui.wh(null);
            whVar.f292769a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9o);
            whVar.f292770b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obg);
            whVar.f292771c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m1y);
            view.setTag(whVar);
        } else {
            whVar = (com.p314xaae8f345.mm.ui.wh) view.getTag();
        }
        n11.a.b().h(vhVar.f292691b, whVar.f292769a, this.f294096n);
        whVar.f292770b.setText(vhVar.f292692c);
        int i18 = this.f294090e;
        android.content.Context context = this.f294089d;
        if (i18 == 1) {
            whVar.f292771c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hcu));
        } else {
            whVar.f292771c.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hcv));
        }
        whVar.f292771c.setTag(vhVar.f292690a);
        whVar.f292771c.setOnClickListener(this.f294095m);
        return view;
    }
}
