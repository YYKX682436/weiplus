package c43;

/* loaded from: classes15.dex */
public final class c1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f38407f;

    public c1(java.lang.String str, java.lang.String str2, long j17) {
        this.f38405d = str;
        this.f38406e = str2;
        this.f38407f = j17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            return 0;
        }
        c43.e1.f38421b.remove(new jz5.l(this.f38405d, this.f38406e));
        com.tencent.mm.autogen.events.CancelTickleMsgEvent cancelTickleMsgEvent = new com.tencent.mm.autogen.events.CancelTickleMsgEvent();
        cancelTickleMsgEvent.f54028g.f7860a = this.f38407f;
        cancelTickleMsgEvent.e();
        return 0;
    }
}
