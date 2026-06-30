package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f106451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f106452b;

    public c3(yz5.a aVar, yz5.a aVar2) {
        this.f106451a = aVar;
        this.f106452b = aVar2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return this.f106452b.invoke();
        }
        this.f106451a.invoke();
        return jz5.f0.f302826a;
    }
}
