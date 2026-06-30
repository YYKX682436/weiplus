package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView */
/* loaded from: classes4.dex */
public class C18410x906a0652 extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f252375i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f252376d;

    /* renamed from: e, reason: collision with root package name */
    public int f252377e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f252378f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f252379g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f252380h;

    public C18410x906a0652(android.content.Context context) {
        super(context);
        this.f252376d = new java.util.ArrayList();
    }

    public void a(java.util.List list) {
        java.lang.String str;
        int a17;
        int a18;
        android.view.View inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        if (list != null) {
            int i17 = 0;
            while (i17 < list.size()) {
                boolean z17 = i17 != 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.k) list.get(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                if (kVar == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                } else {
                    java.lang.String str2 = kVar.f247561a;
                    int color = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
                    int color2 = getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a5d);
                    if (com.p314xaae8f345.mm.ui.bk.C()) {
                        str = kVar.f247563c;
                        a17 = a84.c0.a(kVar.f247567g, color);
                        a18 = a84.c0.a(kVar.f247565e, color2);
                    } else {
                        str = kVar.f247562b;
                        a17 = a84.c0.a(kVar.f247566f, color);
                        a18 = a84.c0.a(kVar.f247564d, color2);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        android.content.Context context = this.f252379g;
                        if (context != null) {
                            inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569488ci, (android.view.ViewGroup) null);
                        } else {
                            android.app.Activity activity = this.f252378f;
                            inflate = activity != null ? activity.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569488ci, (android.view.ViewGroup) null) : null;
                        }
                        if (inflate == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCardTagListView", "error in tagview inflate");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                        } else {
                            inflate.getBackground().setColorFilter(a18, android.graphics.PorterDuff.Mode.SRC);
                            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b7l);
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.b7j);
                            c22699x3dcdb352.setVisibility(8);
                            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                            if (z17) {
                                layoutParams.leftMargin = this.f252377e;
                            }
                            textView.setText(str2);
                            textView.setTextColor(a17);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadTagIcon", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                                if (!android.text.TextUtils.equals((java.lang.String) c22699x3dcdb352.getTag(com.p314xaae8f345.mm.R.id.n1z), str)) {
                                    c22699x3dcdb352.setImageDrawable(null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils");
                                    if (android.text.TextUtils.isEmpty(str)) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils");
                                    } else {
                                        c22699x3dcdb352.hashCode();
                                        c22699x3dcdb352.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
                                        za4.t0.a(str, false, 41, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f1(c22699x3dcdb352, str, textView));
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagUtils");
                                    }
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadTagIcon", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                            }
                            addView(inflate, layoutParams);
                            ((java.util.ArrayList) this.f252376d).add(inflate);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
                }
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTag", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    /* renamed from: getOriginSnsId */
    public java.lang.String m71257x404777f7() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        java.lang.String str = this.f252380h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        return str;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        super.onMeasure(i17, i18);
        int i19 = 0;
        int i27 = 0;
        while (true) {
            list = this.f252376d;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            if (i19 > 0) {
                i27 += this.f252377e;
            }
            if (i27 >= getMeasuredWidth()) {
                i19--;
                break;
            }
            i27 += ((android.view.View) ((java.util.ArrayList) list).get(i19)).getMeasuredWidth();
            if (i27 >= getMeasuredWidth()) {
                break;
            } else {
                i19++;
            }
        }
        if (i19 >= 0 && i19 < ((java.util.ArrayList) list).size()) {
            android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i19);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b7l);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.e1(this, textView, view));
            while (true) {
                i19++;
                if (i19 >= ((java.util.ArrayList) list).size()) {
                    break;
                }
                removeView((android.view.View) ((java.util.ArrayList) list).get(i19));
                ((java.util.ArrayList) list).remove(i19);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeAllViews", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        super.removeAllViews();
        ((java.util.ArrayList) this.f252376d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeAllViews", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    /* renamed from: setActivityContext */
    public void m71258x734686de(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setActivityContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f252378f = activity;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setActivityContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    /* renamed from: setContext */
    public void m71259xe9f5beed(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f252379g = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContext", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    /* renamed from: setOriginSnsId */
    public void m71260xd6aceb6b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f252380h = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOriginSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    /* renamed from: setTagSpace */
    public void m71261x4860900e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTagSpace", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
        this.f252377e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTagSpace", "com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView");
    }

    public C18410x906a0652(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f252376d = new java.util.ArrayList();
    }

    public C18410x906a0652(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f252376d = new java.util.ArrayList();
    }
}
