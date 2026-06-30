package com.tencent.mm.plugin.fav.ui.widget;

/* loaded from: classes8.dex */
public class FavTagEntrance extends android.widget.LinearLayout implements l75.q0, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f101556d;

    /* renamed from: e, reason: collision with root package name */
    public long f101557e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f101558f;

    public FavTagEntrance(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f101557e = -1L;
        this.f101558f = java.lang.String.valueOf(-1L);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f101556d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nwk);
        setOnClickListener(new w82.f0(this));
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (this.f101558f.equals(str)) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f101557e);
            if (F == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavTagEntrence", "id[%d] info is null, return", java.lang.Long.valueOf(this.f101557e));
            } else {
                setTagContent(F.field_tagProto.f385096e);
            }
        }
    }

    public void setFavItemID(long j17) {
        this.f101557e = j17;
        this.f101558f = java.lang.String.valueOf(j17);
    }

    public void setTagContent(java.util.List<java.lang.String> list) {
        java.lang.String str;
        if (this.f101556d == null) {
            return;
        }
        android.content.Context context = getContext();
        if (context == null || list == null || list.isEmpty()) {
            str = "";
        } else {
            str = list.get(0);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.cdk);
            for (int i17 = 1; i17 < list.size(); i17++) {
                str = str + string + list.get(i17);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f101556d.setText("");
            this.f101556d.setHint(com.tencent.mm.R.string.ca8);
            return;
        }
        android.widget.TextView textView = this.f101556d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = getContext();
        float textSize = this.f101556d.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
    }
}
