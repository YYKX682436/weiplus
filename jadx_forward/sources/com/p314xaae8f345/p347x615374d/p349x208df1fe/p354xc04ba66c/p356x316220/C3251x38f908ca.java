package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaWordingServiceImpl */
/* loaded from: classes9.dex */
public class C3251x38f908ca implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3552xa3857428 {
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3552xa3857428
    /* renamed from: getWording */
    public com.p314xaae8f345.p347x615374d.gen.C3639xbe1d9478 mo25939x98b23862(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28;
        java.lang.String str4 = "desc";
        com.p314xaae8f345.p347x615374d.gen.C3639xbe1d9478 c3639xbe1d9478 = new com.p314xaae8f345.p347x615374d.gen.C3639xbe1d9478(true, "entryTip", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "subTitle", "desc", "subDesc");
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (str.equals("valid_date")) {
            if (context != null) {
                str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.khv);
                str4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.khw);
            }
            return new com.p314xaae8f345.p347x615374d.gen.C3639xbe1d9478(true, "entryTip", str3, "subTitle", str4, "subDesc");
        }
        if (str.equals("cvv")) {
            if (context != null) {
                str3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572565bn0);
                str4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bmy);
            }
            return new com.p314xaae8f345.p347x615374d.gen.C3639xbe1d9478(true, "entryTip", str3, "subTitle", str4, "subDesc");
        }
        if (str.equals("phone_number") || str.equals("sms")) {
            return c3639xbe1d9478;
        }
        str.equals("person");
        return c3639xbe1d9478;
    }
}
