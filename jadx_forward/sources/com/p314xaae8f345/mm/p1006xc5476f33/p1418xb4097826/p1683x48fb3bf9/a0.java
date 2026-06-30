package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class a0 extends com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 f218357a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281) {
        this.f218357a = c15492xb61be281;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749
    /* renamed from: onMiscCallBack */
    public java.lang.Object mo52190xdaaffcf0(java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        java.lang.String string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "method bundle :" + str + "  bundle:" + bundle);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "shouldInterceptLoadError")) {
            return null;
        }
        int i17 = bundle != null ? bundle.getInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993) : 0;
        java.lang.String str3 = "";
        if (bundle == null || (str2 = bundle.getString("description")) == null) {
            str2 = "";
        }
        if (bundle != null && (string = bundle.getString("failingUrl")) != null) {
            str3 = string;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "errCode :" + i17 + " description:" + str2 + " failingUrl:" + str3);
        this.f218357a.m63353xaf8aa769();
        return null;
    }
}
