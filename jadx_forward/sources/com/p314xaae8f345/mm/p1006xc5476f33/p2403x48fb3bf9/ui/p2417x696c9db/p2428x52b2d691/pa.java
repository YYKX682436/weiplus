package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class pa implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267969e;

    public pa(nw4.k kVar, nw4.y2 y2Var) {
        this.f267968d = kVar;
        this.f267969e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("KEY_RESULT_CODE");
        android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable("KEY_RESULT_DATA");
        nw4.k kVar = this.f267968d;
        nw4.y2 y2Var = this.f267969e;
        if (i17 != -1) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail_cancel", null);
            return;
        }
        pj4.w wVar = new pj4.w();
        byte[] byteArray = bundle2 != null ? bundle2.getByteArray("select_status_info") : null;
        if (byteArray != null) {
            wVar.mo11468x92b714fd(byteArray);
        }
        java.lang.String str = wVar.f436844d;
        if (str == null) {
            str = "";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("icon_id", str);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", linkedHashMap);
    }
}
