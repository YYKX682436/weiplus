package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class r9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t9 f166650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t9 t9Var) {
        super(1);
        this.f166650d = t9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.kf resp = (r45.kf) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        for (java.util.Map.Entry entry : this.f166650d.f166698c.entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "<this>");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6) entry.getKey();
            yz5.l lVar = (yz5.l) ((jz5.l) entry.getValue()).f384366d;
            r45.me3[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r4.a(resp, z6Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            lVar.mo146xb9724478(a17);
        }
        return jz5.f0.f384359a;
    }
}
