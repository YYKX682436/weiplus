package com.tencent.mm.plugin.fav.ui.widget;

/* loaded from: classes11.dex */
public class FavSearchActionView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f101548m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageButton f101549d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavTagPanel f101550e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f101551f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f101552g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f101553h;

    /* renamed from: i, reason: collision with root package name */
    public w82.e0 f101554i;

    public FavSearchActionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f101551f = new java.util.LinkedList();
        this.f101552g = new java.util.LinkedList();
        this.f101553h = new java.util.LinkedList();
    }

    public static java.lang.String a(android.content.Context context, int i17) {
        if (context == null) {
            return "";
        }
        if (i17 == 3) {
            return context.getString(com.tencent.mm.R.string.cdh);
        }
        if (i17 == 5) {
            return context.getString(com.tencent.mm.R.string.cdf);
        }
        if (i17 == 6) {
            return context.getString(com.tencent.mm.R.string.cd_);
        }
        if (i17 == 7) {
            return context.getString(com.tencent.mm.R.string.cda);
        }
        if (i17 == 8) {
            return context.getString(com.tencent.mm.R.string.f491211cd1);
        }
        if (i17 == 17) {
            return context.getString(com.tencent.mm.R.string.cde);
        }
        if (i17 == 18) {
            return context.getString(com.tencent.mm.R.string.cdc);
        }
        switch (i17) {
            case 20:
                return context.getString(com.tencent.mm.R.string.f491212cd2);
            case 21:
                return context.getString(com.tencent.mm.R.string.cd9);
            case 22:
                return context.getString(com.tencent.mm.R.string.cdd);
            default:
                return "";
        }
    }

    public final void b() {
        if (this.f101551f.isEmpty() && this.f101552g.isEmpty()) {
            this.f101550e.setEditHint(getResources().getString(com.tencent.mm.R.string.f490549y8));
        } else {
            this.f101550e.setEditHint("");
        }
    }

    public final void c(java.lang.String str) {
        java.util.List list = this.f101553h;
        ((java.util.LinkedList) list).clear();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        for (java.lang.String str2 : str.split(" ")) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                ((java.util.LinkedList) list).add(str2);
            }
        }
    }

    public void d(int i17, boolean z17) {
        java.util.List list = this.f101551f;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).add(java.lang.Integer.valueOf(i17));
        if (this.f101550e == null) {
            return;
        }
        b();
        this.f101550e.setType(a(getContext(), i17));
        if (this.f101554i == null) {
            return;
        }
        c(this.f101550e.getEditText());
        if (z17) {
            ((com.tencent.mm.plugin.fav.ui.j5) this.f101554i).a(list, this.f101553h, this.f101552g, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11126, 1);
    }

    public java.util.List<java.lang.String> getSearchKeys() {
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = this.f101550e;
        if (favTagPanel != null) {
            c(favTagPanel.getEditText());
        }
        return this.f101553h;
    }

    public java.util.List<java.lang.String> getSearchTags() {
        return this.f101552g;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f101549d = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.mdl);
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = (com.tencent.mm.plugin.fav.ui.widget.FavTagPanel) findViewById(com.tencent.mm.R.id.dwl);
        this.f101550e = favTagPanel;
        if (favTagPanel != null) {
            favTagPanel.setEditTextColor(getResources().getColor(com.tencent.mm.R.color.f478719fa));
            this.f101550e.setTagTipsDrawable(0);
            this.f101550e.setTagHighlineBG(0);
            this.f101550e.setTagSelectedBG(0);
            this.f101550e.setTagSelectedTextColorRes(com.tencent.mm.R.color.aaq);
            this.f101550e.setTagNormalBG(0);
            this.f101550e.setTagNormalTextColorRes(com.tencent.mm.R.color.aaw);
            this.f101550e.setEditHint(getResources().getString(com.tencent.mm.R.string.f490549y8));
            this.f101550e.k(true);
            com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel2 = this.f101550e;
            favTagPanel2.f197583o = false;
            favTagPanel2.f197584p = true;
            favTagPanel2.setCallBack((w82.l0) new w82.c0(this));
        }
        android.widget.ImageButton imageButton = this.f101549d;
        if (imageButton != null) {
            imageButton.setOnClickListener(new w82.d0(this));
        }
    }

    public void setOnSearchChangedListener(w82.e0 e0Var) {
        this.f101554i = e0Var;
    }
}
