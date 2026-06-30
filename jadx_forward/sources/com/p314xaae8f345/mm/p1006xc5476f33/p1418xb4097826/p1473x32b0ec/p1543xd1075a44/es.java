package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class es extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et f199811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.uc5 f199812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar, r45.uc5 uc5Var) {
        super(0);
        this.f199811d = etVar;
        this.f199812e = uc5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar = this.f199811d;
        java.util.LinkedList linkedList = etVar.K;
        if (linkedList != null) {
            r45.uc5 uc5Var = this.f199812e;
            int indexOf = linkedList.indexOf(uc5Var);
            if ((indexOf >= 0 && indexOf < linkedList.size()) && linkedList.remove(uc5Var)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vs) ((jz5.n) etVar.U).mo141623x754a37bb()).m8155x27702c4(indexOf);
                etVar.k0();
            }
        }
        return jz5.f0.f384359a;
    }
}
