package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class b2 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.a2 f102020d = new com.tencent.mm.plugin.finder.assist.a2(null);

    /* renamed from: e, reason: collision with root package name */
    public static zy2.i5 f102021e;

    public b2() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FinderCreateAccountResultEvent event = (com.tencent.mm.autogen.events.FinderCreateAccountResultEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createResultEvent callback :");
        am.ya yaVar = event.f54268g;
        sb6.append(yaVar != null ? java.lang.Integer.valueOf(yaVar.f8448a) : null);
        com.tencent.mars.xlog.Log.i("Finder.CreateAccountStarter", sb6.toString());
        zy2.i5 i5Var = f102021e;
        if (i5Var == null) {
            return true;
        }
        i5Var.a(java.lang.Integer.valueOf(yaVar != null ? yaVar.f8448a : 0));
        return true;
    }
}
