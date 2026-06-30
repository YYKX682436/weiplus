package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0 f290904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.v0 v0Var) {
        super(1);
        this.f290904d = v0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            java.util.HashSet hashSet = state.f527853p;
            this.f290904d.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("weixin");
            arrayList.addAll(c01.e2.i());
            arrayList.addAll(c01.e2.h());
            arrayList.remove("conversationboxservice");
            arrayList.remove("opencustomerservicemsg");
            arrayList.remove("filehelper");
            hashSet.addAll(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
