package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI */
/* loaded from: classes.dex */
public final class ActivityC18844x9df91d1e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f257734f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f257735d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.a0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f257736e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.e0(this));

    public final fq.e T6() {
        return (fq.e) ((jz5.n) this.f257735d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d4f;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.d0(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        com.p314xaae8f345.mm.ui.bk.s0(T6().f346962c.getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(T6().f346961b.getPaint());
        com.p314xaae8f345.mm.ui.bk.s0(T6().f346963d.getPaint());
        T6().f346963d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.b0(this));
        T6().f346961b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.c0(this));
        switch (((java.lang.Number) ((jz5.n) this.f257736e).mo141623x754a37bb()).intValue()) {
            case 72:
                T6().f346962c.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9s));
                T6().f346961b.setVisibility(0);
                return;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.k.f34811x366c91de /* 73 */:
                T6().f346962c.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9r));
                T6().f346961b.setVisibility(8);
                return;
            case 74:
            default:
                T6().f346962c.setVisibility(8);
                T6().f346961b.setVisibility(8);
                return;
            case 75:
                android.widget.ImageView imageView = T6().f346964e;
                android.graphics.drawable.Drawable drawable = getDrawable(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
                com.p314xaae8f345.mm.ui.uk.f(drawable, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                imageView.setBackground(drawable);
                T6().f346962c.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9z));
                T6().f346963d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_0));
                T6().f346961b.setVisibility(8);
                return;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33152x107efc1c /* 76 */:
                android.widget.ImageView imageView2 = T6().f346964e;
                android.graphics.drawable.Drawable drawable2 = getDrawable(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
                com.p314xaae8f345.mm.ui.uk.f(drawable2, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                imageView2.setBackground(drawable2);
                T6().f346962c.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9v));
                T6().f346963d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                T6().f346961b.setVisibility(8);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26291xfe1296d3.f51705xc4897837 /* 77 */:
                android.widget.ImageView imageView3 = T6().f346964e;
                android.graphics.drawable.Drawable drawable3 = getDrawable(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
                com.p314xaae8f345.mm.ui.uk.f(drawable3, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77922x54cad3c6));
                imageView3.setBackground(drawable3);
                T6().f346962c.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9w));
                T6().f346963d.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                T6().f346961b.setVisibility(8);
                return;
        }
    }
}
