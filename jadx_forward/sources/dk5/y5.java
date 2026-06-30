package dk5;

/* loaded from: classes9.dex */
public class y5 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f316541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tg3.x0 f316542c;

    public y5(dk5.s5 s5Var, android.content.Context context, int i17, tg3.x0 x0Var) {
        this.f316540a = context;
        this.f316541b = i17;
        this.f316542c = x0Var;
    }

    @Override // tg3.x0
    public void a(int i17, int i18, java.util.List list, byte[] bArr) {
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.f283212a;
            com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27784x24933d23 c27784x24933d23 = new com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.C27784x24933d23();
            c27784x24933d23.f301680f = bArr;
            com.p314xaae8f345.p3200xd0d7bedf.api.AbstractC27778x5479f090.a(this.f316540a).a(c27784x24933d23, com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(this.f316541b));
        }
        this.f316542c.a(i17, i18, list, bArr);
    }
}
