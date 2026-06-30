package sm2;

/* loaded from: classes3.dex */
public final class i4 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491035b;

    public i4(sm2.o4 o4Var, java.lang.String str) {
        this.f491034a = o4Var;
        this.f491035b = str;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f491034a.f491143f, "setFocusMicSetting set mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        sm2.o4 o4Var = this.f491034a;
        java.lang.String str = o4Var.f491143f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setFocusMicSetting set mic setting success focusUserId:");
        java.lang.String str2 = this.f491035b;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ((mm2.o4) o4Var.c(mm2.o4.class)).U.f458664f = str2;
    }
}
