package a31;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a31.m mVar, int i17, int i18, int i19) {
        super(0);
        this.f952d = mVar;
        this.f953e = i17;
        this.f954f = i18;
        this.f955g = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout;
        a31.m mVar = this.f952d;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2 = mVar.f969c;
        int curV2TStatus = speechInputLayout2 != null ? speechInputLayout2.getCurV2TStatus() : 0;
        int i17 = this.f953e;
        if (i17 < 4 || i17 > 10) {
            int i18 = this.f954f;
            if (i17 == 20) {
                android.content.Context context = mVar.f967a;
                if (context == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SpeechInputHelper", "showSysErrorTip: context is null, skip showing system error tip");
                } else {
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = context.getString(com.tencent.mm.R.string.pch);
                    e4Var.c();
                    b31.l.f17613a.f();
                }
                z21.w wVar = mVar.f985s;
                if (wVar != null) {
                    wVar.e(i18 + 200000);
                }
            } else {
                mVar.h();
                int abs = (java.lang.Math.abs(this.f955g) * 10000000) + java.lang.Math.abs(i18);
                z21.w wVar2 = mVar.f985s;
                if (wVar2 != null) {
                    wVar2.e(abs);
                }
            }
        } else {
            android.content.Context context2 = mVar.f967a;
            if (context2 != null) {
                int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.pjm);
                e4Var2.c();
            }
            z21.w wVar3 = mVar.f985s;
            if (wVar3 != null) {
                wVar3.e(15);
            }
        }
        if (curV2TStatus >= 2 && (speechInputLayout = mVar.f969c) != null) {
            speechInputLayout.c(1);
        }
        return jz5.f0.f302826a;
    }
}
