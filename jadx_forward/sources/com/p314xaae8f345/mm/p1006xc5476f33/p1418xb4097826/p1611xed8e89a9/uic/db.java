package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class db extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob f205156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f205157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar, ya2.b2 b2Var) {
        super(1);
        this.f205156d = obVar;
        this.f205157e = b2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v31 v31Var;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ob obVar = this.f205156d;
        if (obVar.S1 == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) obVar.m80379x76847179(), 1, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.f205634r.get(obVar.m58741x6c03c64c());
            if (l2Var != null && (v31Var = l2Var.A) != null) {
                long j17 = v31Var.f469383g;
                if (j17 > 0) {
                    k0Var.q(obVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nic, k35.m1.d(obVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nib), j17)), 17);
                }
            }
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.x6(obVar);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.y6(obVar, this.f205157e);
            k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.z6(obVar);
            obVar.S1 = k0Var;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = obVar.S1;
        if (k0Var2 != null && !k0Var2.i()) {
            k0Var2.v();
        }
        return jz5.f0.f384359a;
    }
}
