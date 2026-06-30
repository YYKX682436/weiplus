package wx;

@j95.b
/* loaded from: classes7.dex */
public final class q extends i95.w implements wx.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f531962d = "ChatBotIamService";

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f531962d, "onAccountInitialized registerAff");
        wx.o.f531957a.a();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f531962d, "attachNativeController releaseAffAsync");
        wx.o.f531957a.b();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f531962d, "ChatBotIamService onCreate");
    }
}
