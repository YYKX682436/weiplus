package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/u3;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/fav/api/DoFavoriteData;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class u3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13542x92d0b3b1 c13542x92d0b3b1 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13542x92d0b3b1) obj;
        if (c13542x92d0b3b1 == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_result_code", 2);
            return bundle;
        }
        java.lang.String str = c13542x92d0b3b1.f181755d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            throw null;
        }
        java.lang.String str2 = c13542x92d0b3b1.f181756e;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("excerptJson");
            throw null;
        }
        java.lang.String str3 = c13542x92d0b3b1.f181757f;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cover");
            throw null;
        }
        java.lang.String str4 = c13542x92d0b3b1.f181758g;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initUrl");
            throw null;
        }
        java.lang.String str5 = c13542x92d0b3b1.f181759h;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageKey");
            throw null;
        }
        java.lang.String str6 = c13542x92d0b3b1.f181760i;
        if (str6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayName");
            throw null;
        }
        java.lang.String str7 = c13542x92d0b3b1.f181761m;
        if (str7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemShowTypeStr");
            throw null;
        }
        java.lang.String str8 = c13542x92d0b3b1.f181762n;
        if (str8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("srcUserName");
            throw null;
        }
        java.lang.String str9 = c13542x92d0b3b1.f181763o;
        if (str9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsUserName");
            throw null;
        }
        int q17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f267837d.q(str, str2, str3, str4, str5, str6, str7, str8, str9);
        o72.a5 a5Var = (o72.a5) i95.n0.c(o72.a5.class);
        java.lang.String str10 = c13542x92d0b3b1.f181759h;
        if (str10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageKey");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.la) a5Var).getClass();
        o72.r2 rc6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(str10);
        long j17 = rc6 != null ? rc6.f67645x88be67a1 : -1L;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("key_result_code", q17);
        bundle2.putLong("key_result_id", j17);
        return bundle2;
    }
}
