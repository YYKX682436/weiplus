package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/openmsg/ui/OpenMsgUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "feature-openmsg_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.openmsg.ui.OpenMsgUI */
/* loaded from: classes3.dex */
public final class ActivityC10638xd29f3d8b extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f148854d;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dyd;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37
    /* renamed from: isContentAtTop */
    public boolean mo45060x28c9d73() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = this.f148854d;
        return c1095x65355f89 != null && c1095x65355f89.getScrollY() == 0;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f148854d = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById(com.p314xaae8f345.mm.R.id.f567729un4);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.obb));
        findViewById(com.p314xaae8f345.mm.R.id.f567727un3).setOnClickListener(new ib0.g(this));
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        mo74406x9c8c0d33(new ib0.h(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.q0.class);
        set.add(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.v.class);
        set.add(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.z.class);
        set.add(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n0.class);
    }
}
