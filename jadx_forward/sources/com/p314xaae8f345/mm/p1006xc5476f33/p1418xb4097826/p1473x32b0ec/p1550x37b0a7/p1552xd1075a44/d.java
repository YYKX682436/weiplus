package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e f202228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e eVar) {
        super(3);
        this.f202228d = eVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.e eVar = this.f202228d;
        ((az2.f) ((jz5.n) eVar.f202234o).mo141623x754a37bb()).b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("InteractionWishPanelWidget", "createInteractionWish fail errCode: " + num + " errType: " + ((java.lang.Integer) obj3) + " errMsg: " + str);
        if (num != null && num.intValue() == -200462) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.i iVar = eVar.f202233n;
            if (iVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.f[] fVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.f.f202236d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.m mVar = iVar.f202248n;
            if (mVar != null && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.j.f202251a[0] == 1) {
                android.widget.TextView textView = mVar.f202273p;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("performanceNameInvalidDesc");
                    throw null;
                }
                textView.setVisibility(0);
            }
        }
        android.content.Context context = eVar.f199914d;
        if (str == null) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oss);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575279ow2, str));
        return jz5.f0.f384359a;
    }
}
