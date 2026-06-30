package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class hb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jb f188445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f188446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jb jbVar, java.util.HashMap hashMap) {
        super(1);
        this.f188445d = jbVar;
        this.f188446e = hashMap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        this.f188445d.f188540m.clear();
        java.util.HashMap hashMap = this.f188446e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap).remove(((r45.md1) it.next()).m75945x2fec8307(5));
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (linkedList != null) {
                int intValue = ((java.lang.Number) ((jz5.l) entry.getValue()).f384367e).intValue();
                if (intValue > linkedList.size()) {
                    intValue = linkedList.size();
                }
                ((r45.md1) ((jz5.l) entry.getValue()).f384366d).m75945x2fec8307(0);
                linkedList.add(intValue, ((jz5.l) entry.getValue()).f384366d);
            }
        }
        return linkedList;
    }
}
