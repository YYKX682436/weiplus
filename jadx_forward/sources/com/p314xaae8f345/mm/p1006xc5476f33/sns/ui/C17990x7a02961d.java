package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.PreviewContactView */
/* loaded from: classes2.dex */
public class C17990x7a02961d extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f248109d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TableLayout f248110e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f248111f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f248112g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f248113h;

    /* renamed from: i, reason: collision with root package name */
    public int f248114i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f248115m;

    public C17990x7a02961d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248111f = new java.util.ArrayList();
        this.f248112g = new java.util.HashMap();
        this.f248113h = new java.util.HashMap();
        this.f248114i = 5;
        this.f248115m = false;
        this.f248109d = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        this.f248110e = (android.widget.TableLayout) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ct8, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.cgi);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    /* renamed from: getEllipsizeTV */
    private android.widget.TextView m70666xbe3e9c99() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEllipsizeTV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        android.widget.TextView textView = new android.widget.TextView(this.f248109d);
        android.widget.TextView textView2 = (android.widget.TextView) getRootView().findViewById(com.p314xaae8f345.mm.R.id.a5m);
        if (textView2 != null) {
            textView.setTextSize(0, textView2.getTextSize());
        }
        textView.setText("...");
        textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEllipsizeTV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        return textView;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        super.onLayout(z17, i17, i18, i19, i27);
        if (!this.f248115m) {
            m70669x764ce020(this.f248111f);
            this.f248115m = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    /* renamed from: setImageClick */
    public void m70667xc4d7d2ef(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y7 y7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    /* renamed from: setLineNum */
    public void m70668xbbc99830(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLineNum", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        this.f248114i = i17;
        m70669x764ce020(this.f248111f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLineNum", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }

    /* renamed from: setList */
    public void m70669x764ce020(java.util.List<java.lang.String> list) {
        int i17;
        int width;
        java.util.List<java.lang.String> list2 = list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
        if (list2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            return;
        }
        this.f248111f = list2;
        if (this.f248110e.getChildCount() > 0) {
            this.f248110e.removeAllViews();
        }
        if (list.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            return;
        }
        int size = list.size();
        int i18 = 0;
        int i19 = 0;
        int i27 = -1;
        while (i18 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRow", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            java.util.HashMap hashMap = (java.util.HashMap) this.f248113h;
            android.widget.TableRow tableRow = (android.widget.TableRow) hashMap.get(java.lang.Integer.valueOf(i19));
            android.content.Context context = this.f248109d;
            if (tableRow == null) {
                tableRow = new android.widget.TableRow(context);
                hashMap.put(java.lang.Integer.valueOf(i19), tableRow);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRow", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
            tableRow.removeAllViews();
            int i28 = 0;
            while (i28 < this.f248114i && i18 < size) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                java.util.HashMap hashMap2 = (java.util.HashMap) this.f248112g;
                android.view.View view = (android.view.View) hashMap2.get(java.lang.Integer.valueOf(i18));
                if (view == null) {
                    view = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ct7, null);
                    hashMap2.put(java.lang.Integer.valueOf(i18), view);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIV", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                java.lang.String str = list2.get(i18);
                android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.hjz);
                imageView.setBackgroundDrawable(null);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
                view.setTag(0);
                view.setClickable(false);
                if (i27 == -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                    if (view.getWidth() == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        i17 = size;
                        width = -1;
                    } else {
                        this.f248115m = true;
                        android.widget.TextView m70666xbe3e9c99 = m70666xbe3e9c99();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endTextWidth", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        android.graphics.Rect rect = new android.graphics.Rect();
                        i17 = size;
                        m70666xbe3e9c99.getPaint().getTextBounds("...", 0, 3, rect);
                        int width2 = rect.width();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endTextWidth", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        width = getWidth() / view.getWidth();
                        if (width == 5) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        } else {
                            if ((getWidth() - (view.getWidth() * width)) - width2 < 0) {
                                width--;
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTableRowCount", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
                        }
                    }
                    i27 = width;
                } else {
                    i17 = size;
                }
                if (i28 == i27) {
                    tableRow.addView(m70666xbe3e9c99());
                    i18 = i17;
                } else {
                    tableRow.addView(view);
                }
                i28++;
                i18++;
                list2 = list;
                size = i17;
            }
            this.f248110e.addView(tableRow);
            i19++;
            list2 = list;
            size = size;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setList", "com.tencent.mm.plugin.sns.ui.PreviewContactView");
    }
}
