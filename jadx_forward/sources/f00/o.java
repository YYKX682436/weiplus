package f00;

/* loaded from: classes.dex */
public final class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f339853a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f339854b = "";

    /* renamed from: c, reason: collision with root package name */
    public boolean f339855c;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public int a() {
        return com.p314xaae8f345.mm.R.id.g2j;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onWidgetCreated, "onWidgetCreated");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.content.Context context;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.View view = this.f339853a;
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
        this.f339854b = data;
        boolean z17 = true;
        if (data.length() > 0) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsProductWxaCoverWidget", "createWidget data:".concat(data));
                org.json.JSONObject jSONObject = new org.json.JSONObject(data);
                java.lang.String optString = jSONObject.optString("finderUsername");
                if (jSONObject.has("showLiving")) {
                    this.f339855c = jSONObject.optBoolean("showLiving");
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if (optString.length() <= 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(data), f00.j.class, new f00.l(this));
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EcsProductWxaCoverWidget", "createWidget error:" + th6);
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e4i, (android.view.ViewGroup) null);
        this.f339853a = inflate;
        if (inflate != null) {
            inflate.setOnClickListener(new f00.n(this));
        }
        inflate.setTag("isAsyncEcsProductFinderWidget");
        int i17 = this.f339855c ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget", "genWidget", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget", "genWidget", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return inflate;
    }
}
