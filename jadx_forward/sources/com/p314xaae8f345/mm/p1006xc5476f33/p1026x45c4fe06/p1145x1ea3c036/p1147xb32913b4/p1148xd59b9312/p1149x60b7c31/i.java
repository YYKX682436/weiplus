package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.j f167144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 f167145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 f167146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7 c12403xda2a3ec7, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26) {
        super(1);
        this.f167144d = jVar;
        this.f167145e = c12403xda2a3ec7;
        this.f167146f = c11832x1f85bd26;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf it = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.h(this.f167144d, this.f167145e, it));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, it.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571787ph));
        intent.putExtra("rawUrl", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.a(this.f167146f));
        intent.putExtra("forceHideShare", true);
        j45.l.o(it, "webview", ".ui.tools.WebViewUI", intent, cf.b.a(it), true);
        it.overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292611a, com.p314xaae8f345.mm.ui.uc.f292612b);
        return jz5.f0.f384359a;
    }
}
