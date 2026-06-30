package mi2;

/* loaded from: classes10.dex */
public final class g implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mi2.h f408285a;

    public g(mi2.h hVar) {
        this.f408285a = hVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408285a.f408289m, "set mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        mi2.h hVar = this.f408285a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.f408289m, "set mic setting success micSettingFlag:" + j18);
        ((mm2.o4) hVar.f408286h.g().a(mm2.o4.class)).U.f458662d = j18;
    }
}
