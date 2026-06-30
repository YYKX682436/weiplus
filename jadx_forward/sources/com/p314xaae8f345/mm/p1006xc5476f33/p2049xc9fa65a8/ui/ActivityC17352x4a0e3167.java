package com.p314xaae8f345.mm.p1006xc5476f33.p2049xc9fa65a8.ui;

/* renamed from: com.tencent.mm.plugin.search.ui.FTSInfoUI */
/* loaded from: classes12.dex */
public class ActivityC17352x4a0e3167 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f241572d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f241573e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f241574f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f241575g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f241576h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f241577i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f241578m = new m04.d(this);

    public static long T6() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f241577i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[DBSize]=");
        o13.o oVar = o13.p.f423782b;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(oVar.f423776a * 1048576));
        stringBuffer.append(sb6.toString());
        stringBuffer.append("\n");
        stringBuffer.append("[WXContact]=" + oVar.f423777b);
        stringBuffer.append("\n");
        stringBuffer.append("[WXChatroom]=" + oVar.f423778c);
        stringBuffer.append("\n");
        stringBuffer.append("[Favorite]=" + oVar.f423780e);
        stringBuffer.append("\n");
        stringBuffer.append("[Message]=" + oVar.f423779d);
        stringBuffer.append("\n");
        stringBuffer.append("[WebSearchH5Version]=" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0));
        stringBuffer.append("\n");
        stringBuffer.append("[TopStoryH5Version]=" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1));
        stringBuffer.append("\n");
        stringBuffer.append("[WxAppH5Version]=" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3));
        stringBuffer.append("\n");
        stringBuffer.append("[BoxH5Version]=" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(2));
        stringBuffer.append("\n");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[TopStoryWebViewCore]=");
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).getClass();
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
        sb7.append(com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS);
        stringBuffer.append(sb7.toString());
        stringBuffer.append("\n");
        stringBuffer.append("[PardusH5Version]=" + com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(5));
        stringBuffer.append("\n");
        this.f241576h.setText(stringBuffer.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bcb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fge);
        mo54448x9c8c0d33(new m04.a(this));
        this.f241572d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f566873hc5);
        this.f241576h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hcv);
        this.f241572d.setOnClickListener(new m04.c(this));
        this.f241573e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.l5c);
        this.f241574f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.l5e);
        this.f241575g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.l5d);
        this.f241573e.setTag(1);
        this.f241574f.setTag(2);
        this.f241575g.setTag(3);
        android.widget.Button button = this.f241573e;
        android.view.View.OnClickListener onClickListener = this.f241578m;
        button.setOnClickListener(onClickListener);
        this.f241574f.setOnClickListener(onClickListener);
        this.f241575g.setOnClickListener(onClickListener);
    }
}
