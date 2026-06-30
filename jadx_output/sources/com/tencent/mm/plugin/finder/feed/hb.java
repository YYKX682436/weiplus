package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.jb f106912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f106913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.tencent.mm.plugin.finder.feed.jb jbVar, java.util.HashMap hashMap) {
        super(1);
        this.f106912d = jbVar;
        this.f106913e = hashMap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        this.f106912d.f107007m.clear();
        java.util.HashMap hashMap = this.f106913e;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                kotlin.jvm.internal.m0.c(hashMap).remove(((r45.md1) it.next()).getString(5));
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (linkedList != null) {
                int intValue = ((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue();
                if (intValue > linkedList.size()) {
                    intValue = linkedList.size();
                }
                ((r45.md1) ((jz5.l) entry.getValue()).f302833d).getString(0);
                linkedList.add(intValue, ((jz5.l) entry.getValue()).f302833d);
            }
        }
        return linkedList;
    }
}
