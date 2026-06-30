package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f195118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(2);
        this.f195118d = v3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f195118d;
        if (num != null && num.intValue() == 0) {
            java.lang.String string = v3Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.now);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Context context = v3Var.f446856d.getContext();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = v3Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.not);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                android.content.Context context2 = v3Var.f446856d.getContext();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.f293309c = string2;
                e4Var2.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
