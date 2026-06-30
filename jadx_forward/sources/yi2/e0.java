package yi2;

/* loaded from: classes10.dex */
public final class e0 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f544042b;

    public e0(int i17, yi2.i0 i0Var) {
        this.f544041a = i17;
        this.f544042b = i0Var;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveMicAnchorWidget", "set pk mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set pk mic setting success:");
        int i17 = this.f544041a;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorWidget", sb6.toString());
        ((mm2.o4) this.f544042b.f544051d.a(mm2.o4.class)).U.f458667i = i17;
    }
}
