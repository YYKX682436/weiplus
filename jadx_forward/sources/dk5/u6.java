package dk5;

/* loaded from: classes9.dex */
public final class u6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f316477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316478g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316479h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f316480i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f316481m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f316482n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316483o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f316484p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316485q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f316486r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ dk5.e6 f316487s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.util.LinkedList linkedList, int i17, boolean z17, boolean z18, java.lang.String str, int i18, java.lang.String str2, int i19, dk5.e6 e6Var) {
        super(1);
        this.f316475d = context;
        this.f316476e = intent;
        this.f316477f = mVar;
        this.f316478g = c11286x34a5504;
        this.f316479h = linkedList;
        this.f316480i = i17;
        this.f316481m = z17;
        this.f316482n = z18;
        this.f316483o = str;
        this.f316484p = i18;
        this.f316485q = str2;
        this.f316486r = i19;
        this.f316487s = e6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "checkAndCopyFileIfNeed  callBack:" + intValue);
        dk5.y6 y6Var = dk5.y6.f316543a;
        if (intValue == 0) {
            y6Var.d(this.f316475d, this.f316476e, this.f316477f, this.f316478g, this.f316479h, this.f316480i, this.f316481m, this.f316482n, this.f316483o, this.f316484p, this.f316485q, this.f316486r, this.f316487s, (r31 & 8192) != 0 ? null : null);
        } else if (intValue == 2) {
            y6Var.d(this.f316475d, this.f316476e, this.f316477f, this.f316478g, this.f316479h, this.f316480i, this.f316481m, this.f316482n, this.f316483o, this.f316484p, this.f316485q, this.f316486r, this.f316487s, (r31 & 8192) != 0 ? null : null);
        } else if (intValue == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendWXMediaMessageHelper", "sendWXMediaMessage fail, WXMediaMessage file check fail");
            dk5.e6 e6Var = this.f316487s;
            if (e6Var != null) {
                ((dk5.z4) e6Var).b(3, "cb_key_file_check_invalid");
            }
        }
        return jz5.f0.f384359a;
    }
}
