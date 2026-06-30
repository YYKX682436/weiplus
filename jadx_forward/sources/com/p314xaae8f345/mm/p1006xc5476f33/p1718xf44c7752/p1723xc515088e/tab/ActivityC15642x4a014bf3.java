package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.tab;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.uc.f34908x366c91de)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/tab/MediaTabPickerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.gallery.picker.tab.MediaTabPickerUI */
/* loaded from: classes8.dex */
public final class ActivityC15642x4a014bf3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        jz5.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerUI", "finish");
        java.lang.Object obj = null;
        if (vk5.a.f519307d) {
            oVar = new jz5.o(java.lang.Integer.valueOf(vk5.a.f519304a), vk5.a.f519305b, java.lang.Integer.valueOf(vk5.a.f519306c));
            vk5.a.f519304a = 0;
            vk5.a.f519305b = null;
            vk5.a.f519306c = -1;
            vk5.a.f519307d = false;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            b33.o oVar2 = (b33.o) pf5.z.f435481a.a(this).a(b33.o.class);
            java.util.Iterator it = oVar2.f99210f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) next).f384367e, oVar2.f99211g)) {
                    obj = next;
                    break;
                }
            }
            jz5.l lVar = (jz5.l) obj;
            int intValue = lVar != null ? ((java.lang.Number) lVar.f384366d).intValue() : -1;
            int intValue2 = ((java.lang.Number) oVar.f384374d).intValue();
            android.content.Intent intent = (android.content.Intent) oVar.f384375e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerUI", "get result back, currentPageType=" + intValue + ", resultCode:" + intValue2 + ", " + intent + ", requestCode=" + ((java.lang.Number) oVar.f384376f).intValue());
            if (intValue != -1) {
                if (intent != null) {
                    intent.putExtra("key_page_type", intValue);
                }
                setResult(intValue2, intent);
            }
        }
        super.finish();
        if (getIntent().hasExtra("KEY_PARAMS_EXIT_ANIM")) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1));
        } else {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bxd;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{b33.f.class, b33.o.class});
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerUI", "onBackPressed");
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intExtra;
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        com.p314xaae8f345.mm.ui.v9.d(this);
        getWindow().setStatusBarColor(0);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        }
        m78531x8f8cf1fb();
        getWindow().getDecorView().setSystemUiVisibility(0);
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560696rn));
        if (!com.p314xaae8f345.mm.ui.b4.c(this) && (intExtra = getIntent().getIntExtra("intent_bottom_navigationbar_height", 0)) > 0) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f566532g71);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = intExtra;
            findViewById.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerUI", "onCreate");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerUI", "onDestroy");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaTabPickerUI", "onResume");
    }
}
