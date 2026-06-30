package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class w3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f166854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m81.c[] f166855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me3 f166856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f166857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m81.b[] f166858f;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, m81.c[] cVarArr, r45.me3 me3Var, km5.b bVar, m81.b[] bVarArr) {
        this.f166853a = q4Var;
        this.f166854b = f4Var;
        this.f166855c = cVarArr;
        this.f166856d = me3Var;
        this.f166857e = bVar;
        this.f166858f = bVarArr;
    }

    @Override // m81.d
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f progressInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressInfo, "progressInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4.a(this.f166854b, progressInfo);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.va
    public void b(m81.b request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f166853a.f166602l;
        if (concurrentLinkedQueue != null) {
            ((java.util.LinkedList) request.f406225p).addAll(concurrentLinkedQueue);
        }
    }

    @Override // m81.d
    public void c(java.lang.String appId, m81.c errCode, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa waVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errCode, "errCode");
        boolean G = kz5.z.G(this.f166855c, errCode);
        km5.b bVar = this.f166857e;
        if (G) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4.b(this.f166854b, errCode, waVar, this.f166856d);
            bVar.a(null);
        } else {
            bVar.mo143715xc84dc82d();
        }
        m81.b bVar2 = this.f166858f[0];
        if (bVar2 != null) {
            this.f166853a.f166604n.remove(bVar2);
        }
    }
}
