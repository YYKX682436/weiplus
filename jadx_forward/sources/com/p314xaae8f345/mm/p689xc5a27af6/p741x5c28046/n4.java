package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

@j95.b
/* loaded from: classes4.dex */
public final class n4 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6 {

    /* renamed from: d, reason: collision with root package name */
    public final wr.j f147939d = new wr.j();

    public java.lang.String wi(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb iEmojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iEmojiInfo, "iEmojiInfo");
        wr.j jVar = this.f147939d;
        jVar.getClass();
        java.lang.String d17 = jVar.d(iEmojiInfo);
        if (d17 != null) {
            return d17;
        }
        wr.k e17 = jVar.e(iEmojiInfo);
        if (e17.f530286a.length() > 0) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6 t6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class);
            java.lang.String mo42933xb5885648 = iEmojiInfo.mo42933xb5885648();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
            java.lang.String Ui = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) t6Var).Ui(mo42933xb5885648, e17.f530286a);
            if (com.p314xaae8f345.mm.vfs.w6.j(Ui)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageMgr", "get existing external downloaded thumb path. md5: " + iEmojiInfo.mo42933xb5885648());
                return Ui;
            }
        }
        return null;
    }
}
