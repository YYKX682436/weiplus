package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "_bizKey", "", "_isAuthed", "Ljz5/f0;", "invoke", "(ILjava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1 */
/* loaded from: classes7.dex */
public final class C12380xf0908296 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12379x29aead26 f35073xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12380xf0908296(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12379x29aead26 c12379x29aead26) {
        super(3);
        this.f35073xcbdd23aa = c12379x29aead26;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        m51823xb9724478(((java.lang.Number) obj).intValue(), (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m51823xb9724478(int i17, java.lang.String _bizKey, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_bizKey, "_bizKey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IPCGoAuthTask callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12379x29aead26 c12379x29aead26 = this.f35073xcbdd23aa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12378x7586db7e c12378x7586db7e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12378x7586db7e();
        c12378x7586db7e.m51820x587834e(_bizKey);
        c12378x7586db7e.m51821xd1fd9215(z17);
        c12379x29aead26.m50420x7b736e5c(c12378x7586db7e);
    }
}
