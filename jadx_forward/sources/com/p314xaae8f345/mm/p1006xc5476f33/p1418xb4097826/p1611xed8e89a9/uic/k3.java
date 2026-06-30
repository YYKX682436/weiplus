package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class k3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var) {
        super(0);
        this.f205418d = f4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var = this.f205418d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = f4Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
        java.lang.Integer valueOf = abstractActivityC15087xee12defa != null ? java.lang.Integer.valueOf(abstractActivityC15087xee12defa.getD()) : null;
        int intExtra = f4Var.m158359x1e885992().getIntExtra("key_entrance_type", -1);
        int intExtra2 = f4Var.m158359x1e885992().getIntExtra("KEY_REF_COMMENTSCENE", 0);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        return intExtra2 + '-' + intExtra + '-' + valueOf + '-' + uuid;
    }
}
