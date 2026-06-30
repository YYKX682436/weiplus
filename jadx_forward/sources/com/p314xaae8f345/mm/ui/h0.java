package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f f290299d;

    public h0(com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f) {
        this.f290299d = activityC21341x70473b8f;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.LinkedList linkedList = this.f290299d.f278106h;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f = this.f290299d;
        com.p314xaae8f345.mm.ui.o0 o0Var = (com.p314xaae8f345.mm.ui.o0) activityC21341x70473b8f.f278106h.get(i17);
        com.p314xaae8f345.mm.ui.n0 n0Var = (com.p314xaae8f345.mm.ui.n0) k3Var;
        n0Var.f290923d.setTag(o0Var);
        android.widget.TextView textView = n0Var.f290926g;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC21341x70473b8f.mo55332x76847179();
        java.lang.String str = o0Var.f290968b;
        float textSize = n0Var.f290926g.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
        android.widget.TextView textView2 = n0Var.f290924e;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC21341x70473b8f.mo55332x76847179();
        java.lang.String str2 = o0Var.f290969c;
        float textSize2 = n0Var.f290924e.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471792, str2, textSize2));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = o0Var.f290970d;
        if (j17 - currentTimeMillis < 60000) {
            n0Var.f290925f.setText(activityC21341x70473b8f.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fci, 1));
        } else if (j17 - currentTimeMillis < 3600000) {
            n0Var.f290925f.setText(activityC21341x70473b8f.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fci, java.lang.Long.valueOf((o0Var.f290970d - currentTimeMillis) / 60000)));
        } else if (j17 - currentTimeMillis < 10800000) {
            android.widget.TextView textView3 = n0Var.f290925f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC21341x70473b8f.mo55332x76847179();
            java.lang.Long valueOf = java.lang.Long.valueOf((o0Var.f290970d - currentTimeMillis) / 3600000);
            long j18 = o0Var.f290970d;
            textView3.setText(mo55332x768471793.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fch, valueOf, java.lang.Long.valueOf(((j18 - currentTimeMillis) - (((j18 - currentTimeMillis) / 3600000) * 3600000)) / 60000)));
        } else {
            n0Var.f290925f.setText(k35.m1.f(activityC21341x70473b8f.mo55332x76847179(), o0Var.f290970d, true, false));
        }
        if (o0Var.f290971e == 2) {
            n0Var.f290927h.setImageDrawable(activityC21341x70473b8f.mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562302bv3));
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f290927h, o0Var.f290967a, null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.n0(this.f290299d, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cdx, viewGroup, false));
    }
}
