package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f82345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list) {
        super(1);
        this.f82345d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem item = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.util.Iterator it = this.f82345d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (android.text.TextUtils.equals(item.f71803f, ((m31.q0) obj2).f323203d)) {
                break;
            }
        }
        m31.q0 q0Var = (m31.q0) obj2;
        return java.lang.Boolean.valueOf(q0Var != null ? q0Var.f323200a : false);
    }
}
