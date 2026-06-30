package ab5;

/* loaded from: classes9.dex */
public class a0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2920f;

    public a0(android.content.Context context, java.lang.String str, boolean z17) {
        this.f2918d = context;
        this.f2919e = str;
        this.f2920f = z17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(1176, this);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        db5.t7.makeText(this.f2918d, com.tencent.mm.R.string.f492652hd0, 0).show();
        com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
        java.lang.String str2 = this.f2919e;
        am.g00 g00Var = updateWxaOptionsEvent.f54927g;
        g00Var.f6724a = str2;
        g00Var.f6725b = !this.f2920f ? 2 : 1;
        g00Var.f6726c = 2;
        updateWxaOptionsEvent.e();
    }
}
