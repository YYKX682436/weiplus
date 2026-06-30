package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class h5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 f161109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var) {
        super(1);
        this.f161109d = j5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        android.app.Instrumentation.ActivityResult it = (android.app.Instrumentation.ActivityResult) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int resultCode = it.getResultCode();
        android.content.Intent resultData = it.getResultData();
        if (-1 == resultCode && resultData != null) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = resultData.getStringArrayListExtra("RESULT_KEY_UPDATED_LIST");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var = this.f161109d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e h17 = j5Var.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = h17.f176156d;
            if (c13026x8642c3d7 == null || (arrayList = c13026x8642c3d7.f176137d) == null) {
                arrayList = new java.util.ArrayList();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a17 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new rt1.s0(arrayList, stringArrayListExtra == null ? new java.util.ArrayList<>() : stringArrayListExtra), true);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            a17.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g5(c0Var));
            if (c0Var.f391645d) {
                h17.b(stringArrayListExtra);
                j5Var.b(h17.f176156d);
            }
        }
        return jz5.f0.f384359a;
    }
}
