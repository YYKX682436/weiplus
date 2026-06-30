package oj1;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 f427286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26) {
        super(1);
        this.f427285d = str;
        this.f427286e = c11832x1f85bd26;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf it = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.m78545xde66c1f2(new oj1.b(this.f427285d, it));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, it.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571787ph));
        intent.putExtra("rawUrl", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.a(this.f427286e));
        intent.putExtra("forceHideShare", true);
        j45.l.o(it, "webview", ".ui.tools.WebViewUI", intent, cf.b.a(it), true);
        it.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
        return jz5.f0.f384359a;
    }
}
