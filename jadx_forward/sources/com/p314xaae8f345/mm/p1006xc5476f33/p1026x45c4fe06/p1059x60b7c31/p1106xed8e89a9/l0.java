package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/l0;", "Lcom/tencent/mm/plugin/appbrand/jsapi/profile/e0;", "Landroid/content/Context;", "context", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Lab0/f0;", "callback", "Lab0/a;", "b", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.e0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.e0
    public ab0.a b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c request, ab0.f0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (((ab0.b0) i95.n0.c(ab0.b0.class)) == null) {
            return null;
        }
        r45.dx5 dx5Var = new r45.dx5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12219x24694ded c12219x24694ded = request instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12219x24694ded ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12219x24694ded) request : null;
        dx5Var.mo75930xb5cb93b2(c12219x24694ded != null ? c12219x24694ded.getReqJsonStr() : null);
        cb0.b bVar = new cb0.b(context, dx5Var, callback);
        bVar.d();
        return bVar;
    }
}
