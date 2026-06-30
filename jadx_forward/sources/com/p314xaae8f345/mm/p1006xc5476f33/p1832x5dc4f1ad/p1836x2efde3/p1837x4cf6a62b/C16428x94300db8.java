package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.p1837x4cf6a62b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoPublicServiceBizPkgManagement;", "Lcom/tencent/mm/plugin/magicbrush/demo/bizlogic/MagicBrushDemoBizPkgManagement;", "", "instanceName", "<init>", "(Ljava/lang/String;)V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoPublicServiceBizPkgManagement */
/* loaded from: classes7.dex */
public final class C16428x94300db8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.p1837x4cf6a62b.C16427x6ba5962c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f229448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16428x94300db8(java.lang.String instanceName) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f229448g = "MagicBrushDemoPublicServiceBizPkgManagement";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.p1837x4cf6a62b.C16427x6ba5962c, jc3.x
    public java.lang.String d() {
        return "MagicBrushPublicServiceDemo";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.p1837x4cf6a62b.C16427x6ba5962c, jc3.x
    public void f(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f229448g, "provideMainScript");
        java.lang.String e17 = ik1.f.e("magicbrush-demo-publicservice-bizstartup.js");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getAssetAsString(...)");
        cb6.mo146xb9724478(kz5.b0.c(new lc3.j0(e17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.p1837x4cf6a62b.C16427x6ba5962c, jc3.x
    public java.lang.String g() {
        return "MagicBrushPublicServiceDemo";
    }
}
