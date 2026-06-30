package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI */
/* loaded from: classes9.dex */
public class ActivityC22384x2b6f00ff extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f288956d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f288957e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.jb f288958f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f288959g = new int[2];

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckj;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kkf);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ab(this));
        this.f288956d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.cit);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_conversation_list");
        this.f288957e = stringArrayListExtra;
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.jb jbVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.jb(this);
        this.f288958f = jbVar;
        this.f288956d.setAdapter((android.widget.ListAdapter) jbVar);
        this.f288956d.setOnTouchListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.bb(this));
        this.f288956d.setOnItemClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.cb(this));
        this.f288956d.setOnItemLongClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.gb(this));
    }
}
