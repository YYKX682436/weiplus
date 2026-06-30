package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cr extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f106501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yr f106502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(com.tencent.mm.plugin.finder.feed.kr krVar, com.tencent.mm.plugin.finder.feed.yr yrVar) {
        super(1);
        this.f106501d = krVar;
        this.f106502e = yrVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cu0 resp = (r45.cu0) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f106501d;
        com.tencent.mm.plugin.finder.feed.xr xrVar = krVar.f107247x;
        if (xrVar != null) {
            java.util.LinkedList list = resp.getList(1);
            xrVar.a(list != null ? (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.Z(list) : null, this.f106502e, krVar.m().getDataListJustForAdapter(), krVar.m().getInitPos());
        }
        krVar.V = false;
        return jz5.f0.f302826a;
    }
}
