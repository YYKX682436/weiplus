package ok4;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f427551f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, java.lang.String str, boolean z17) {
        super(0);
        this.f427549d = i17;
        this.f427550e = str;
        this.f427551f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        int i17 = this.f427549d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (i17 == 1) {
            ok4.u uVar = ok4.u.f427574a;
            java.lang.String str = this.f427550e;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6749x237baa80 a17 = uVar.a(str);
            if (a17 != null) {
                boolean z17 = this.f427551f;
                a17.f140788p = z17 ? 1 : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsFromPreLoad >> " + str + ", " + z17);
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewIsFromPreLoad >> " + str + "  >> is no have struct");
            }
        }
        return f0Var2;
    }
}
