package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/b0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class b0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String string = bundle.getString("uri");
        int i17 = bundle.getInt("funId");
        int i18 = bundle.getInt("reqCmdId");
        int i19 = bundle.getInt("respCmdId");
        java.lang.String string2 = bundle.getString("reqClassName");
        java.lang.Class<?> cls = java.lang.Class.forName(java.lang.String.valueOf(bundle.getString("respClassName")));
        java.lang.Object newInstance = java.lang.Class.forName(java.lang.String.valueOf(string2)).newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RequestProtoBuf");
        r45.mr5 mr5Var = (r45.mr5) newInstance;
        mr5Var.mo11468x92b714fd(bundle.getByteArray("req"));
        java.lang.String valueOf = java.lang.String.valueOf(string);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.a0(callback);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = mr5Var;
        java.lang.Object newInstance2 = cls.newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
        lVar.f152198b = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) newInstance2;
        lVar.f152199c = valueOf;
        lVar.f152200d = i17;
        lVar.f152201e = i18;
        lVar.f152202f = i19;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.v(a0Var), false);
    }
}
