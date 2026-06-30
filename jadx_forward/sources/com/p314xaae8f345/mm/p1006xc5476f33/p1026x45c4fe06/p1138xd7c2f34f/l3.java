package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3 f166283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3 n3Var) {
        super(1);
        this.f166283d = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.kf batchResp = (r45.kf) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batchResp, "batchResp");
        java.util.Set<java.util.Map.Entry> entrySet = this.f166283d.f166334e.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) entry.getKey();
            yz5.l lVar = (yz5.l) ((jz5.l) entry.getValue()).f384366d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z6Var);
            r45.me3[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r4.a(batchResp, z6Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            lVar.mo146xb9724478(a17);
        }
        return jz5.f0.f384359a;
    }
}
