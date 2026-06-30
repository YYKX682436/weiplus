package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/gallery/ui/VLogPreloadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "e33/n6", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gallery.ui.VLogPreloadUI */
/* loaded from: classes8.dex */
public final class ActivityC15661x768a86ef extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static final e33.n6 f220172d = new e33.n6(null);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571135d45;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        ai3.d.f86640a = true;
        getWindow().setFormat(-3);
        db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, false, null);
        getIntent().getStringArrayListExtra("key_select_video_list");
        getIntent().getStringArrayListExtra("key_select_image_list");
        getIntent().getIntArrayExtra(ya.b.f77479x42930b2);
        android.graphics.Point i17 = com.p314xaae8f345.mm.ui.bk.i(this);
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadUI", "screen x:" + i17.x + " y:" + i17.y + "  realScreen x:" + h17.x + " y:" + h17.y + ", previewSize:" + getIntent().getIntExtra("KEY_PREVIEW_WIDTH", -1) + ',' + getIntent().getIntExtra("KEY_PREVIEW_HEIGHT", -1));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogPreloadUI", "VLogPreloadUI onDestroy");
    }
}
