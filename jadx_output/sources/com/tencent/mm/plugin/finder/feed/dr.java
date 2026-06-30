package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(1);
        this.f106585d = krVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("debug:请求失败 ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(' ');
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(' ');
        sb6.append(fVar != null ? fVar.f70617c : null);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f106585d;
        krVar.s(sb7);
        krVar.V = false;
        return jz5.f0.f302826a;
    }
}
