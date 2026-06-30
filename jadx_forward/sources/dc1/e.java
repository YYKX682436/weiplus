package dc1;

/* loaded from: classes7.dex */
public final class e extends dc1.d {

    /* renamed from: CTRL_INDEX */
    public static final int f65819x366c91de = 1152;

    /* renamed from: NAME */
    public static final java.lang.String f65820x24728b = "openCustomerServiceChatForFakeNative";

    /* renamed from: h, reason: collision with root package name */
    public final boolean f310225h = true;

    @Override // dc1.d
    public void C(com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        request.f153808g = true;
    }

    @Override // dc1.d
    public boolean D() {
        return this.f310225h;
    }

    @Override // dc1.d
    public java.lang.String F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject extInfo, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = extInfo.optString("entity", super.F(lVar, extInfo, data));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        return optString;
    }
}
