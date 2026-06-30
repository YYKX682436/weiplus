package v33;

/* loaded from: classes8.dex */
public final class r extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f514674d;

    /* renamed from: e, reason: collision with root package name */
    public final long f514675e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514676f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f514677g;

    public r(java.lang.String chatroomName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        this.f514674d = chatroomName;
        this.f514675e = j17;
        this.f514677g = jz5.h.a(jz5.i.f384364f, new v33.q(this));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514676f = u0Var;
        java.lang.Object mo141623x754a37bb = this.f514677g.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return mo9409x10f9447a(sVar, (com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4565;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiPublishChatroomMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f514676f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
