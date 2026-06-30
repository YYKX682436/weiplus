package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class e3 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static zy2.i5 f102116d;

    public e3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderIpcResultEvent event = (com.tencent.mm.autogen.events.FinderIpcResultEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createResultEvent callback :");
        am.kb kbVar = event.f54280g;
        sb6.append(kbVar != null ? 0 : null);
        com.tencent.mars.xlog.Log.i("Finder.CreateAccountStarter", sb6.toString());
        zy2.i5 i5Var = f102116d;
        if (i5Var != null) {
            java.lang.String str = kbVar != null ? kbVar.f7137a : null;
            if (str == null) {
                str = "";
            }
            i5Var.a(new jz5.l(0, str));
        }
        f102116d = null;
        return true;
    }
}
