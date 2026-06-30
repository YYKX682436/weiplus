package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingPrefUI;", "Lcom/tencent/mm/plugin/setting/ui/setting_new/base/BaseSettingUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI */
/* loaded from: classes.dex */
public abstract class AbstractActivityC17508x8f0972f6 extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2061x2e06d1.AbstractActivityC17509x7e1428f3 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f243370h = 0;

    /* renamed from: e, reason: collision with root package name */
    public a24.i f243371e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f243372f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f243373g;

    public java.lang.String U6() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eif;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f243373g = getIntent().getStringArrayListExtra("key_highlight_item");
        mo78530x8b45058f();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : mo80395x5316d740()) {
            if (abstractC22275x3ce1d8c9 instanceof a24.i) {
                arrayList.add(abstractC22275x3ce1d8c9);
            }
        }
        u24.m mVar = u24.m.f505662a;
        a24.i iVar = this.f243371e;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        jz5.l d17 = mVar.d(iVar, arrayList);
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 != null) {
            m67437x4bd5310.B3(new r24.e(d17));
        }
        this.f243372f = getIntent().getStringExtra("key_config_target_item");
        mo54450xbf7c1df6(U6());
        mo54448x9c8c0d33(new a24.m(this));
        j75.f m67437x4bd53102 = m67437x4bd5310();
        if (m67437x4bd53102 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c92 : mo80395x5316d740()) {
            if (abstractC22275x3ce1d8c92 instanceof a24.i) {
                arrayList2.add(abstractC22275x3ce1d8c92);
            }
        }
        a24.i iVar2 = this.f243371e;
        if (iVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        m67437x4bd53102.B3(new r24.e(mVar.d(iVar2, arrayList2)));
        j75.f m67437x4bd53103 = m67437x4bd5310();
        if (m67437x4bd53103 != null) {
            m67437x4bd53103.L2(this, new a24.p(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f243372f = intent != null ? intent.getStringExtra("key_config_target_item") : null;
        j75.f m67437x4bd5310 = m67437x4bd5310();
        if (m67437x4bd5310 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : mo80395x5316d740()) {
            if (abstractC22275x3ce1d8c9 instanceof a24.i) {
                arrayList.add(abstractC22275x3ce1d8c9);
            }
        }
        u24.m mVar = u24.m.f505662a;
        a24.i iVar = this.f243371e;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        m67437x4bd5310.B3(new r24.e(mVar.d(iVar, arrayList)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        jz5.l c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.e.class);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.d.class);
        java.lang.String stringExtra = getIntent().getStringExtra("key_config_item");
        u24.m mVar = u24.m.f505662a;
        if (stringExtra == null || (c17 = mVar.c(stringExtra, this)) == null) {
            c17 = mVar.c("SettingGroup_Main", this);
        }
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseSettingPrefUI", "superImportUIComponents: node is null");
            return;
        }
        java.util.Iterator it = ((java.lang.Iterable) c17.f384367e).iterator();
        while (it.hasNext()) {
            set.add(((a24.i) it.next()).getClass());
        }
        this.f243371e = (a24.i) c17.f384366d;
    }
}
