package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class b4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f166047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.me3 f166048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m81.b[] f166049d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, r45.me3 me3Var, m81.b[] bVarArr) {
        this.f166046a = q4Var;
        this.f166047b = f4Var;
        this.f166048c = me3Var;
        this.f166049d = bVarArr;
    }

    @Override // m81.d
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f progressInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressInfo, "progressInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4.a(this.f166047b, progressInfo);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va
    public void b(m81.b request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f166046a.f166602l;
        if (concurrentLinkedQueue != null) {
            ((java.util.LinkedList) request.f406225p).addAll(concurrentLinkedQueue);
        }
    }

    @Override // m81.d
    public void c(java.lang.String appId, m81.c errCode, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errCode, "errCode");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4.b(this.f166047b, errCode, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa) obj, this.f166048c);
        m81.b bVar = this.f166049d[0];
        if (bVar != null) {
            this.f166046a.f166604n.remove(bVar);
        }
    }
}
