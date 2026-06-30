package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class rh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f104474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.th f104475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.convert.th thVar) {
        super(0);
        this.f104474d = linkedList;
        this.f104475e = thVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = this.f104474d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.finder.report.w4 w4Var = com.tencent.mm.plugin.finder.report.w4.f125422a;
            int i17 = 0;
            com.tencent.mm.plugin.finder.convert.th thVar = this.f104475e;
            if (!hasNext) {
                w4Var.b(arrayList, thVar.f104614f, 0);
                return jz5.f0.f302826a;
            }
            so2.j1 j1Var = (so2.j1) it.next();
            long itemId = j1Var.getItemId();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = j1Var.f410439d;
            r45.dm2 object_extend = finderObject.getObject_extend();
            java.lang.String string = object_extend != null ? object_extend.getString(62) : null;
            java.lang.String sessionBuffer = finderObject.getSessionBuffer();
            r45.qt2 qt2Var = thVar.f104614f;
            if (qt2Var != null) {
                i17 = qt2Var.getInteger(5);
            }
            arrayList.add(w4Var.a(itemId, string, 2004, sessionBuffer, i17));
        }
    }
}
