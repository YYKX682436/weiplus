package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.th f104179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f104180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(com.tencent.mm.plugin.finder.convert.th thVar, java.util.ArrayList arrayList) {
        super(0);
        this.f104179d = thVar;
        this.f104180e = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        so2.i1 i1Var = this.f104179d.f104617i;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long j17 = i1Var.f410418f;
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = j17;
        int i17 = 1;
        iaVar.f6921d = 1;
        java.util.ArrayList arrayList = this.f104180e;
        so2.j1 j1Var = (so2.j1) kz5.n0.Z(arrayList);
        if (j1Var != null && (finderObject = j1Var.f410439d) != null && (contact = finderObject.getContact()) != null) {
            i17 = contact.getLiveStatus();
        }
        iaVar.f6925h = i17;
        iaVar.f6924g = so2.o.f410511e.b(arrayList);
        iaVar.f6919b = 9;
        feedUpdateEvent.e();
        return jz5.f0.f302826a;
    }
}
