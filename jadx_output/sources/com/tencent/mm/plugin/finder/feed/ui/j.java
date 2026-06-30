package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f110166d;

    /* renamed from: e, reason: collision with root package name */
    public int f110167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent f110168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent finderAccountManagent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110168f = finderAccountManagent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.j(this.f110168f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.feed.ui.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        com.tencent.mm.plugin.finder.feed.ui.FinderAccountManagent finderAccountManagent;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f110167e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f110167e = 1;
            x17 = bVar.x1(2, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(x17)) {
            java.util.LinkedList list = ((r45.lk2) x17).getList(20);
            kotlin.jvm.internal.o.f(list, "getFinder_list(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                finderAccountManagent = this.f110168f;
                if (!hasNext) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj2).getCustom(1);
                if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, (java.lang.String) ((jz5.n) finderAccountManagent.f109202f).getValue())) {
                    break;
                }
            }
            r45.ac5 ac5Var = (r45.ac5) obj2;
            finderAccountManagent.f109201e = ac5Var != null ? (r45.d1) ac5Var.getCustom(10) : null;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.feed.ui.i iVar = new com.tencent.mm.plugin.finder.feed.ui.i(finderAccountManagent, null);
            this.f110166d = x17;
            this.f110167e = 2;
            if (kotlinx.coroutines.l.g(g3Var, iVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
