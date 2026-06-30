package a31;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a31.m f82485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f82487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f82488g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a31.m mVar, int i17, int i18, int i19) {
        super(0);
        this.f82485d = mVar;
        this.f82486e = i17;
        this.f82487f = i18;
        this.f82488g = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d32;
        a31.m mVar = this.f82485d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 c19651x7fe9d322 = mVar.f82502c;
        int curV2TStatus = c19651x7fe9d322 != null ? c19651x7fe9d322.getCurV2TStatus() : 0;
        int i17 = this.f82486e;
        if (i17 < 4 || i17 > 10) {
            int i18 = this.f82487f;
            if (i17 == 20) {
                android.content.Context context = mVar.f82500a;
                if (context == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SpeechInputHelper", "showSysErrorTip: context is null, skip showing system error tip");
                } else {
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                    e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pch);
                    e4Var.c();
                    b31.l.f99146a.f();
                }
                z21.w wVar = mVar.f82518s;
                if (wVar != null) {
                    wVar.e(i18 + 200000);
                }
            } else {
                mVar.h();
                int abs = (java.lang.Math.abs(this.f82488g) * 10000000) + java.lang.Math.abs(i18);
                z21.w wVar2 = mVar.f82518s;
                if (wVar2 != null) {
                    wVar2.e(abs);
                }
            }
        } else {
            android.content.Context context2 = mVar.f82500a;
            if (context2 != null) {
                int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjm);
                e4Var2.c();
            }
            z21.w wVar3 = mVar.f82518s;
            if (wVar3 != null) {
                wVar3.e(15);
            }
        }
        if (curV2TStatus >= 2 && (c19651x7fe9d32 = mVar.f82502c) != null) {
            c19651x7fe9d32.c(1);
        }
        return jz5.f0.f384359a;
    }
}
