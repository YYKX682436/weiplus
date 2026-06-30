package xe2;

/* loaded from: classes3.dex */
public final class h0 extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f535399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f535399c = "LiveGiftMsgInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        q26.n i17 = q26.h0.i(kz5.n0.J(msgList), new xe2.g0(this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535399c, "#dealWithMsgList after filter self giftMsgList.size=" + q26.h0.f(i17));
        ((ku5.t0) ku5.t0.f394148d).h(new xe2.f0(this.f526800a.f354008i, i17, this), "LiveGiftMsgInterceptor");
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20009};
    }
}
