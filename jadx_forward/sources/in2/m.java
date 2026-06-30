package in2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f374393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(in2.s sVar) {
        super(0);
        this.f374393d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in2.s sVar = this.f374393d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = sVar.P;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(false);
        }
        sVar.I.q7(false);
        db5.t7.g(sVar.f199716e, "设置失败，请稍后再试");
        return jz5.f0.f384359a;
    }
}
