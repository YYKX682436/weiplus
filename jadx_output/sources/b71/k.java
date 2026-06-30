package b71;

/* loaded from: classes.dex */
public final class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WebViewUIDestroyEvent event = (com.tencent.mm.autogen.events.WebViewUIDestroyEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        a71.d dVar = a71.e.f1915d;
        if (dVar == null) {
            return false;
        }
        java.lang.String str = dVar.f1909c;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = str == null ? "" : str;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new a71.c(0, "", str2, str3, "Destroy", null), 1, null);
        }
        a71.e.f1915d = null;
        return false;
    }
}
