package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class wb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac f157568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar) {
        super(0);
        this.f157568d = acVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : this.f157568d.f156980f.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3) entry.getValue()).f157578f != null) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }
}
