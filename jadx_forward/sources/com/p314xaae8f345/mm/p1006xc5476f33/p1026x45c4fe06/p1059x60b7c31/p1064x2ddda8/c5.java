package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class c5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 f160960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var) {
        super(1);
        this.f160960d = j5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Instrumentation.ActivityResult it = (android.app.Instrumentation.ActivityResult) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int resultCode = it.getResultCode();
        android.content.Intent resultData = it.getResultData();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var = this.f160960d;
        if (resultCode == -1) {
            java.util.List stringArrayListExtra = resultData != null ? resultData.getStringArrayListExtra("RESULT_KEY_UPDATED_LIST") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = kz5.p0.f395529d;
            }
            if (stringArrayListExtra.isEmpty()) {
                j5Var.f161140h.f143454i = 2L;
                j5Var.f161141i.a();
            } else {
                j5Var.f161135c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.w4.f161304d;
                j5Var.f161140h.f143454i = 1L;
                j5Var.h().b(stringArrayListExtra);
                j5Var.b(j5Var.h().f176156d);
            }
        } else {
            j5Var.f161141i.a();
        }
        return jz5.f0.f384359a;
    }
}
