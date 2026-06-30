package er;

/* loaded from: classes12.dex */
public class d extends er.f {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f337460q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo) {
        super(emojiInfo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f337460q = "MicroMsg.EmojiLoadTask";
    }

    @Override // er.f
    public java.lang.String e() {
        java.lang.String mo42933xb5885648 = this.f337463f.mo42933xb5885648();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo42933xb5885648, "getMd5(...)");
        return mo42933xb5885648;
    }

    @Override // er.f, java.lang.Runnable
    public void run() {
        super.run();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f337463f;
        boolean E0 = interfaceC4987x84e327cb.E0();
        java.lang.String str = this.f337460q;
        if (E0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "IEmojiLoadTask exist " + interfaceC4987x84e327cb.mo42933xb5885648());
            f(true);
            return;
        }
        zq.h hVar = zq.h.f556505a;
        if (zq.h.f556508d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, interfaceC4987x84e327cb.mo42933xb5885648() + ": mock download fail");
            f(false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "IEmojiLoadTask run " + interfaceC4987x84e327cb.mo42933xb5885648());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb;
        new cr.k(c21053xdbf1e5f4, new cr.l(c21053xdbf1e5f4, new er.c(this)));
    }
}
