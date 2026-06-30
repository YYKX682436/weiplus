package b71;

/* loaded from: classes.dex */
public final class i implements z61.h {
    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        z61.c data = (z61.c) obj;
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f470324a == z61.b.f470321d) {
            int i17 = data.f470325b;
            java.lang.String customInfo = data.f470326c;
            kotlin.jvm.internal.o.g(customInfo, "customInfo");
            java.lang.String ticket = data.f470327d;
            kotlin.jvm.internal.o.g(ticket, "ticket");
            java.lang.String policyList = data.f470328e;
            kotlin.jvm.internal.o.g(policyList, "policyList");
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new a71.c(i17, customInfo, ticket, policyList, "AgreeEvent", null), 1, null);
            }
            a71.d dVar = a71.e.f1915d;
            if (dVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Account.AccountComplianceReceiver", "currentObj: " + dVar.f1909c + ' ' + dVar.f1907a);
                if (kotlin.jvm.internal.o.b(ticket, dVar.f1909c)) {
                    a71.e.f1915d = null;
                }
            }
        }
    }
}
