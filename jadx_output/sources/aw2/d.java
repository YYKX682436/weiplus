package aw2;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14738h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14739i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f14740m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f14741n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(aw2.n nVar, int i17, java.lang.String str, java.lang.String str2, int i18, int i19, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str3) {
        super(0);
        this.f14734d = nVar;
        this.f14735e = i17;
        this.f14736f = str;
        this.f14737g = str2;
        this.f14738h = i18;
        this.f14739i = i19;
        this.f14740m = finderJumpInfo;
        this.f14741n = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aw2.n nVar = this.f14734d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = nVar.f14784o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        nVar.f14784o = null;
        java.util.Map map = db2.z4.f228259a;
        rx2.p pVar = nVar.f14779g;
        com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView = nVar.f14783n;
        int i17 = this.f14735e;
        if (i17 == 0) {
            java.lang.String link = finderExtendReadingView.getLink();
            if (kotlin.jvm.internal.o.b(link != null ? r26.n0.u0(link).toString() : null, this.f14736f)) {
                this.f14734d.e(this.f14736f, this.f14737g, this.f14738h, this.f14739i, this.f14740m);
                pVar.a();
            }
        } else {
            java.lang.String errMsg = nVar.f14776d.getResources().getString(com.tencent.mm.R.string.cu9);
            kotlin.jvm.internal.o.f(errMsg, "getString(...)");
            if (i17 == -4054) {
                java.lang.String str = this.f14741n;
                if (!(str == null || str.length() == 0)) {
                    errMsg = str;
                }
            }
            pVar.getClass();
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView = pVar.f400986g;
            finderExtendReadingEditView.getClass();
            android.widget.TextView textView = finderExtendReadingEditView.f131044o;
            textView.setText(errMsg);
            textView.setVisibility(0);
            textView.setTextColor(finderExtendReadingEditView.getContext().getResources().getColor(com.tencent.mm.R.color.Red_100));
            finderExtendReadingView.c();
        }
        return jz5.f0.f302826a;
    }
}
