package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.LiveBizSessionTipsBar */
/* loaded from: classes8.dex */
public class C21392x1bd9268c extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f278399d;

    /* renamed from: e, reason: collision with root package name */
    public yb5.d f278400e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278401f;

    public C21392x1bd9268c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278401f = null;
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bqk, this);
        this.f278399d = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ako);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.akq)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aku));
    }

    /* renamed from: setChattingContext */
    public void m78465x4001c3c7(yb5.d dVar) {
        this.f278400e = dVar;
        this.f278401f = dVar.x();
        int m78386x9c19e6d7 = this.f278400e.f542250l.m78386x9c19e6d7("specific_chat_from_scene", 0);
        java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.e(this.f278401f);
        java.lang.String str = this.f278401f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23044, 1, this.f278401f, java.lang.Integer.valueOf(m78386x9c19e6d7), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a), e17, java.lang.Integer.valueOf(str == null ? 0 : com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270732c.o("live_scene-".concat(str), 0)), 0, "");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f278399d, "chatting_title_bar");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f278399d, 40, 26236);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("live_id", "");
        arrayMap.put("finder_username", "");
        arrayMap.put("feed_id", "");
        arrayMap.put("comment_scene", "");
        arrayMap.put("finder_feed_export_id", e17);
        arrayMap.put("wx_username", this.f278401f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this.f278399d, arrayMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f278399d, new com.p314xaae8f345.mm.ui.j9(this));
        this.f278399d.setOnClickListener(new com.p314xaae8f345.mm.ui.k9(this, m78386x9c19e6d7));
    }

    public C21392x1bd9268c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278401f = null;
        a();
    }
}
