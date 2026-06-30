package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes7.dex */
public class l0 extends qd.a implements o91.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f167065d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f167065d = c11510xdd90c2f2;
    }

    @Override // o91.e
    public java.lang.String T0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        if (!U0(lVar, str)) {
            return str;
        }
        return "wxapkg://icon?appId=" + lVar.mo48798x74292566() + "&path=" + android.net.Uri.encode(str);
    }

    @Override // o91.e
    public boolean U0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        return (lVar == null || str == null || str.length() == 0 || str.startsWith("wxapkg://") || str.startsWith("http://") || str.startsWith("https://") || str.startsWith("wxfile://") || str.contains("://")) ? false : true;
    }

    @Override // o91.a
    public boolean a(java.lang.String str) {
        return str != null && str.startsWith("wxapkg://");
    }

    @Override // o91.a
    public android.graphics.Bitmap c(java.lang.String str, android.graphics.Rect rect, o91.b bVar) {
        if (!a(str)) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = (java.lang.String) android.util.Pair.create(parse.getQueryParameter("appId"), parse.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)).second;
        if (android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s5.b(this.f167065d, android.net.Uri.decode(str2));
        return rect != null ? new zg1.b(rect.left, rect.top, rect.width(), rect.height()).c(b17) : b17;
    }

    @Override // qd.a
    public void d(java.lang.String str, o91.c cVar) {
        if (cVar == null) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String str2 = (java.lang.String) android.util.Pair.create(parse.getQueryParameter("appId"), parse.getQueryParameter(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)).second;
        if (android.text.TextUtils.isEmpty(str2)) {
            cVar.a(null);
        } else {
            cVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.q(this.f167065d, str2));
        }
    }

    @Override // o91.a
    public java.lang.String key() {
        return "WxaPkgImageReader";
    }
}
