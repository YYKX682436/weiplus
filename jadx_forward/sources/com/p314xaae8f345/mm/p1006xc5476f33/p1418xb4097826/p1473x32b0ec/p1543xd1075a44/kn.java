package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class kn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn f200381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar) {
        super(0);
        this.f200381d = mnVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List list = ((mm2.o4) this.f200381d.f200618f.P0(mm2.o4.class)).f410851o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((km2.q) obj).f390710h) {
                    arrayList.add(obj);
                }
            }
        }
        this.f200381d.f200630u.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar = this.f200381d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.q qVar = (km2.q) it.next();
            java.lang.String str = qVar.f390705c;
            if (str != null) {
                mnVar.f200630u.put(str, qVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar2 = this.f200381d;
        bm2.i4 i4Var = mnVar2.f200628s;
        java.util.List list2 = ((mm2.o4) mnVar2.f200618f.P0(mm2.o4.class)).f410852p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-recomApplylinkMicUserList>(...)");
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (((km2.q) obj2).f390710h) {
                    arrayList2.add(obj2);
                }
            }
        }
        i4Var.y(arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar3 = this.f200381d;
        bm2.i4 i4Var2 = mnVar3.f200628s;
        java.util.HashMap localApplyMicMap = mnVar3.f200630u;
        i4Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localApplyMicMap, "localApplyMicMap");
        i4Var2.f103506e = localApplyMicMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mn mnVar4 = this.f200381d;
        bm2.i4 i4Var3 = mnVar4.f200628s;
        java.util.List list3 = ((mm2.o4) mnVar4.f200618f.P0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list3, "<get-anchorPkMicUserList>(...)");
        i4Var3.getClass();
        java.util.ArrayList arrayList3 = i4Var3.f103508g;
        arrayList3.clear();
        arrayList3.addAll(list3);
        this.f200381d.f200628s.m8146xced61ae5();
        return jz5.f0.f384359a;
    }
}
