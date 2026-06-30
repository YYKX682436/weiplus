package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance */
/* loaded from: classes8.dex */
public class C13622x4798ee75 extends android.widget.LinearLayout implements l75.q0, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f183089d;

    /* renamed from: e, reason: collision with root package name */
    public long f183090e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183091f;

    public C13622x4798ee75(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f183090e = -1L;
        this.f183091f = java.lang.String.valueOf(-1L);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f183089d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nwk);
        setOnClickListener(new w82.f0(this));
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (this.f183091f.equals(str)) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f183090e);
            if (F == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagEntrence", "id[%d] info is null, return", java.lang.Long.valueOf(this.f183090e));
            } else {
                m55399x63233181(F.f67653xef67d413.f466629e);
            }
        }
    }

    /* renamed from: setFavItemID */
    public void m55398xb09ab427(long j17) {
        this.f183090e = j17;
        this.f183091f = java.lang.String.valueOf(j17);
    }

    /* renamed from: setTagContent */
    public void m55399x63233181(java.util.List<java.lang.String> list) {
        java.lang.String str;
        if (this.f183089d == null) {
            return;
        }
        android.content.Context context = getContext();
        if (context == null || list == null || list.isEmpty()) {
            str = "";
        } else {
            str = list.get(0);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdk);
            for (int i17 = 1; i17 < list.size(); i17++) {
                str = str + string + list.get(i17);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f183089d.setText("");
            this.f183089d.setHint(com.p314xaae8f345.mm.R.C30867xcad56011.ca8);
            return;
        }
        android.widget.TextView textView = this.f183089d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = getContext();
        float textSize = this.f183089d.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, textSize));
    }
}
