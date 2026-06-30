package lo2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 f401695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05) {
        super(1);
        this.f401695d = activityC14480x353d0a05;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.ActivityC14480x353d0a05 activityC14480x353d0a05 = this.f401695d;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = activityC14480x353d0a05.A;
        if (gVar != null) {
            return gVar;
        }
        if (linkedList != null) {
            java.util.ArrayList arrayList = activityC14480x353d0a05.f202928y;
            if (arrayList.isEmpty()) {
                arrayList.addAll(linkedList);
                lo2.g gVar2 = activityC14480x353d0a05.f202927x;
                gVar2.getClass();
                java.util.ArrayList arrayList2 = gVar2.f401656e;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gVar2.notifyDataSetChanged();
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        return f0Var;
    }
}
