package ni2;

/* loaded from: classes10.dex */
public final class w0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh2.c f419030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.kf5 f419032c;

    public w0(zh2.c cVar, java.lang.String str, r45.kf5 kf5Var) {
        this.f419030a = cVar;
        this.f419031b = str;
        this.f419032c = kf5Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicSettingModePanel", "set mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicSettingModePanel", "set mic setting success micSettingFlag:" + j18);
        zh2.c cVar = this.f419030a;
        ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458664f = this.f419031b;
        ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458665g = this.f419032c;
    }
}
