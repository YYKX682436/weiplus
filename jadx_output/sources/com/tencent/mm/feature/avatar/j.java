package com.tencent.mm.feature.avatar;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f65163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.ipcinvoker.r rVar) {
        super(1);
        this.f65163d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String avatarPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(avatarPath, "avatarPath");
        this.f65163d.a(new com.tencent.mm.ipcinvoker.type.IPCString(avatarPath));
        return jz5.f0.f302826a;
    }
}
