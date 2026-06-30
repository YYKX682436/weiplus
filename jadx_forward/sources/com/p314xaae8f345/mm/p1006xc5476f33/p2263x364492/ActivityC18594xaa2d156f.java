package com.p314xaae8f345.mm.p1006xc5476f33.p2263x364492;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/test/ExMainSettings;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "yh4/a", "yh4/b", "yh4/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.test.ExMainSettings */
/* loaded from: classes8.dex */
public final class ActivityC18594xaa2d156f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f254740d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f254741e = new java.util.ArrayList();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7s;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new yh4.g(this));
        java.util.ArrayList arrayList = this.f254741e;
        arrayList.add(new yh4.a("朋友圈", com.p314xaae8f345.mm.R.raw.f79411xe8f6bc49, new yh4.d(this)));
        arrayList.add(new yh4.a("Live", com.p314xaae8f345.mm.R.raw.f80807x8f436077, new yh4.e()));
        android.graphics.drawable.Drawable i17 = i65.a.i(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f80119x628f1c9a);
        i17.setColorFilter(new android.graphics.PorterDuffColorFilter(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880), android.graphics.PorterDuff.Mode.SRC_ATOP));
        arrayList.add(new yh4.a("Finder", i17, new yh4.f(this)));
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        this.f254740d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f568058lj4);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f254740d;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        }
        yh4.b bVar = new yh4.b(arrayList);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f254740d;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7960x6cab2c8d(bVar);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f254740d;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.m7965x440a0e9(0);
        }
        pm0.v.V(0L, new yh4.h(bVar));
    }
}
