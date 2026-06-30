package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class w extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f154394d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f154395e;

    /* renamed from: f, reason: collision with root package name */
    public int f154396f;

    public w(android.content.Context context, int i17) {
        this.f154395e = context;
        this.f154396f = i17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f154394d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f154394d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.content.Context context = this.f154395e;
        if (view == null) {
            view = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569403a7, viewGroup, false);
            view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v(this, view));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.v) view.getTag();
        r45.p pVar = (r45.p) getItem(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pVar.f464172n)) {
            vVar.f154373a.setImageResource(com.p314xaae8f345.mm.R.raw.f78340x713d7246);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(vVar.f154373a, pVar.f464172n, 0.1f);
        }
        android.widget.TextView textView = vVar.f154375c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = pVar.f464166e;
        float textSize = vVar.f154375c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str2 = pVar.f464172n;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) || e17.endsWith("@chatroom")) {
            e17 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571255v);
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView2 = vVar.f154374b;
        float textSize2 = textView2.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, e17, textSize2));
        int i18 = this.f154396f;
        android.widget.TextView textView3 = vVar.f154376d;
        if (i18 == 2) {
            textView3.setText(pVar.f464173o);
        } else {
            textView3.setText(pVar.f464168g);
        }
        java.lang.String format = java.lang.String.format("%s%s", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571303b7), new java.math.BigDecimal(h61.o.r(pVar.f464167f)).setScale(2, 4).toString());
        android.widget.TextView textView4 = vVar.f154377e;
        textView4.setText(format);
        com.p314xaae8f345.mm.ui.bk.r0(textView4.getPaint(), 0.8f);
        android.widget.TextView textView5 = vVar.f154378f;
        textView5.setVisibility(0);
        if (this.f154396f == 2) {
            int i19 = pVar.f464169h;
            if (i19 == 1) {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571271ab);
                textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560093au));
            } else if (i19 != 2) {
                textView5.setVisibility(4);
            } else {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a_);
                textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560093au));
            }
        } else {
            int i27 = pVar.f464169h;
            if (i27 == 1) {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571270aa);
                textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560093au));
            } else if (i27 == 2) {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571269a9);
                textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            } else if (i27 == 3) {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571267a7);
                textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            } else if (i27 != 4) {
                textView5.setVisibility(4);
            } else {
                textView5.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571268a8);
                textView5.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            }
        }
        return view;
    }
}
