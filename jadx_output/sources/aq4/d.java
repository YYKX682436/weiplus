package aq4;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str) {
        super(1);
        this.f13209d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent videoBackgroundRemuxResultEventEvent = new com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent();
        am.l00 l00Var = videoBackgroundRemuxResultEventEvent.f54932g;
        l00Var.f7204a = 4001;
        l00Var.f7205b = this.f13209d;
        l00Var.f7207d = intValue;
        l00Var.f7206c = -1;
        videoBackgroundRemuxResultEventEvent.e();
        return jz5.f0.f302826a;
    }
}
