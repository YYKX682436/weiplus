package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusSquareActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity */
/* loaded from: classes3.dex */
public final class ActivityC18673xdcab54cb extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f255232d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f255233e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d0a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jg(this));
        android.os.Bundle extras = getIntent().getExtras();
        java.lang.String string = extras != null ? extras.getString("TEXT_STATUS") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            extras2.getString("TOPIC_ID");
        }
        android.os.Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            extras3.getString("STATUS_ID");
        }
        int i17 = 0;
        while (true) {
            arrayList = this.f255232d;
            if (i17 >= 11) {
                break;
            }
            arrayList.add(new lj4.h(java.lang.String.valueOf(i17), "test", "", "", ""));
            i17++;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.lqa);
        this.f255233e = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f255233e;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity$buildItemConverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return type == -1 ? new ni4.e() : new ni4.h();
                }
            }, arrayList, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f255233e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d253 != null ? c22849x81a93d253.mo7946xf939df19() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        in5.n0.S((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19, new lj4.g("#" + string, "共324人 同城23人"), false, 2, null);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f255233e;
        if (c22849x81a93d254 != null) {
            c22849x81a93d254.N(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kg(this));
        }
    }
}
