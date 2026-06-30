package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/ting/uic/l0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class l0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        rk4.k5.e("onMultiTaskItemClick TingHandleClickTask...", "TingMultiTaskRegisterUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) data.getParcelable("tingTaskInfo");
        if (c16601x7ed0e40c == null) {
            c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
        }
        data.remove("tingTaskInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.k0.a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.m0.f256312d, c16601x7ed0e40c, null);
        return null;
    }
}
