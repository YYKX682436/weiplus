package p05;

/* loaded from: classes3.dex */
public final class b1 implements com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd {

    /* renamed from: a, reason: collision with root package name */
    public boolean f431989a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f431990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p05.d1 f431991c;

    public b1(p05.d1 d1Var) {
        this.f431991c = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd
    public void a(int i17, int i18, int i19, int i27) {
        if (i17 == 0) {
            this.f431989a = true;
        }
        boolean z17 = false;
        boolean z18 = i17 == 1;
        if (this.f431989a && i17 == 2) {
            z17 = true;
        }
        if (this.f431990b) {
            return;
        }
        if (z18 || z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("InteractiveGiftEffect", "#AnimationCallback, animEnd");
            this.f431990b = true;
            p05.r0 r0Var = this.f431991c.f432017f;
            if (r0Var != null) {
                ((df2.r9) r0Var).a();
            }
        }
    }
}
