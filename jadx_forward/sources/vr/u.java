package vr;

/* loaded from: classes5.dex */
public final class u implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f520971a;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        if (interfaceC4987x84e327cb != null) {
            java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo42933xb5885648);
            if (mo42933xb5885648.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "selected emoticon with empty md5");
                return;
            }
            byte[] mo14344x5f01b1f6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class))).Ai(interfaceC4987x84e327cb).mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 != null) {
                if (!(mo14344x5f01b1f6.length == 0)) {
                    java.lang.String wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6.class))).wi(interfaceC4987x84e327cb);
                    vr.s sVar = new vr.s(mo42933xb5885648, false, wi6 == null ? "" : wi6, this, mo14344x5f01b1f6);
                    java.lang.String mo42933xb58856482 = interfaceC4987x84e327cb.mo42933xb5885648();
                    if (interfaceC4987x84e327cb.E0()) {
                        java.lang.String T = interfaceC4987x84e327cb.T();
                        sVar.mo146xb9724478(T != null ? T : "");
                        return;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "local emoticon file missing, start load. md5=" + mo42933xb58856482);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).wi(interfaceC4987x84e327cb, new vr.t(mo42933xb58856482, sVar, interfaceC4987x84e327cb));
                        return;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "failed to serialize EmojiInfo for md5: ".concat(mo42933xb5885648));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
    }
}
