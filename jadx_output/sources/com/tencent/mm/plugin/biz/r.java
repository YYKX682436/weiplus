package com.tencent.mm.plugin.biz;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f93871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ipcinvoker.r rVar) {
        super(1);
        this.f93871d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        this.f93871d.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(bool != null ? bool.booleanValue() : true));
        return jz5.f0.f302826a;
    }
}
