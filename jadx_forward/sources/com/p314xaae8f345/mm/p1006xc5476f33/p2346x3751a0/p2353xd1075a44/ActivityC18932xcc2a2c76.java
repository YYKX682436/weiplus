package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* renamed from: com.tencent.mm.plugin.voip.widget.InviteRemindDialog */
/* loaded from: classes.dex */
public class ActivityC18932xcc2a2c76 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f258625e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f258626f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f258627g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f258628h;

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.c1o);
        this.f258627g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jlm);
        this.f258628h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jli);
        this.f258625e = getIntent().getStringExtra("InviteRemindDialog_User");
        int intExtra = getIntent().getIntExtra("InviteRemindDialog_Type", 0);
        this.f258626f = intExtra;
        if (intExtra == 0) {
            this.f258627g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kd8));
            this.f258628h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575001kc1));
        } else if (intExtra == 1) {
            this.f258627g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdn));
            this.f258628h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdk));
        }
        findViewById(com.p314xaae8f345.mm.R.id.f78304x89ab61fb).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.c(this));
        findViewById(com.p314xaae8f345.mm.R.id.f78303x1455f299).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.d(this));
    }
}
