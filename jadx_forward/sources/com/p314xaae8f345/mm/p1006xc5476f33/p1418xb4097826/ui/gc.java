package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class gc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d f210828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d) {
        super(1);
        this.f210828d = activityC15052xa671b52d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f210828d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = activityC15052xa671b52d.f210180w;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList == null) {
            return null;
        }
        java.util.ArrayList arrayList = activityC15052xa671b52d.f210177t;
        if (arrayList.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ya2.d.h((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next(), null, false, 3, null));
            }
            arrayList.addAll(arrayList2);
        }
        return jz5.f0.f384359a;
    }
}
