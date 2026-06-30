package com.tencent.mm.plugin.expansions;

/* loaded from: classes15.dex */
public class o implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f99769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expansions.p f99770e;

    public o(com.tencent.mm.plugin.expansions.p pVar, java.lang.Boolean bool) {
        this.f99770e = pVar;
        this.f99769d = bool;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        this.f99770e.f99771a.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(this.f99769d.booleanValue()));
        return null;
    }
}
