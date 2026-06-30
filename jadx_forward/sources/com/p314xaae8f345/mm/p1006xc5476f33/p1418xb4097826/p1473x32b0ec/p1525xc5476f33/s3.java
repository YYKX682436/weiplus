package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f195743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f195744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(0);
        this.f195743d = linkedList;
        this.f195744e = v3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = null;
        java.util.LinkedList linkedList = this.f195743d;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (!zl2.r4.f555483a.u1((r45.f62) next)) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.f62) obj;
        }
        boolean z17 = obj == null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f195744e;
        if (z17) {
            v3Var.f196178r.setTextColor(v3Var.f196179s.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            v3Var.f196178r.setTextColor(v3Var.f196179s.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        }
        return jz5.f0.f384359a;
    }
}
