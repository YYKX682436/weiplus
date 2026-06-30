package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class l8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o f225200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8 f225202f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8 p8Var) {
        super(2);
        this.f225200d = oVar;
        this.f225201e = str;
        this.f225202f = p8Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j8 j8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.j8) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar = this.f225200d;
        if (booleanValue) {
            java.lang.String str = this.f225201e;
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppSendVideoMessage", "doShare, thumbPath is empty");
                oVar.a("sendFileMessage fail, illegal video");
            } else if (j8Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.p8 p8Var = this.f225202f;
                p8Var.getClass();
                p8Var.f225252a = j8Var;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSendVideoMessage", "doShare, fail since video illegal");
            oVar.a("sendFileMessage fail, fail since video illegal");
        }
        return jz5.f0.f384359a;
    }
}
