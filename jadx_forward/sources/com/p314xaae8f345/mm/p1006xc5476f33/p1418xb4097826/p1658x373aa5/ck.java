package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class ck implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f213315a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f213316b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f213317c = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public int a() {
        return com.p314xaae8f345.mm.R.id.g2j;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWidgetCreated, "onWidgetCreated");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(data), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yj.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zj(this, onWidgetCreated, context), null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.content.Context context;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.View view = this.f213315a;
        if (view == null || (context = view.getContext()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        layoutParams.topMargin = i65.a.b(context, 12);
        return layoutParams;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f213316b = data;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareProductWxaCoverWidget", "createWidget data:".concat(data));
            org.json.JSONObject jSONObject = new org.json.JSONObject(data);
            java.lang.String string = jSONObject.getString("feedId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            this.f213317c = string;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject.getString("nonceId"), "getString(...)");
        } catch (java.lang.Throwable unused) {
        }
        return e(context);
    }

    public final android.view.View e(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570628dk, (android.view.ViewGroup) null);
        this.f213315a = inflate;
        if (inflate != null) {
            inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bk(this));
        }
        inflate.setTag("isFinderWidget");
        return inflate;
    }
}
