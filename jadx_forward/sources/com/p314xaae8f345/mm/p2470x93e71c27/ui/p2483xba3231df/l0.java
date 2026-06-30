package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class l0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a f272507e;

    /* renamed from: f, reason: collision with root package name */
    public final kb0.g f272508f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.k0 f272509g = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.k0(this);

    public l0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.a aVar, kb0.g gVar) {
        this.f272507e = aVar;
        this.f272508f = gVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5b;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        jz5.f0 f0Var;
        java.lang.String str;
        jz5.f0 f0Var2;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        xj.m mVar = data.f272555o;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ta_);
        textView.setVisibility(0);
        if (mVar == null || (string = mVar.f536288c) == null) {
            string = holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ocs);
        }
        textView.setText(string);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.f564163m73);
        if (linearLayout != null) {
            ((vh0.x1) ((vh0.z0) i95.n0.c(vh0.z0.class))).wi(linearLayout, mVar, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.j0(this, data, holder));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e1t);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e1s);
        xj.m mVar2 = data.f272555o;
        jz5.f0 f0Var3 = jz5.f0.f384359a;
        if (mVar2 != null) {
            textView2.setText(mVar2.f536287b);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = data.f272547d;
            if (xVar == null || (str2 = xVar.f272564g) == null) {
                f0Var2 = null;
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0 n0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o0.f272515e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0.d(n0Var, str2, imageView, 0.0f, false, 12, null);
                f0Var2 = f0Var3;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder iconUrl is null");
            }
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder adInfo is null");
        }
        if (mVar == null || (str = mVar.f536286a) == null) {
            f0Var3 = null;
        } else {
            i95.m c17 = i95.n0.c(xj.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, str, wj.w0.f528074d, null, 4, null);
        }
        if (f0Var3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenWayAdLineItemConvert", "ad expose report adInfo is null");
        }
    }
}
