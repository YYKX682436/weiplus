package w35;

/* loaded from: classes8.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f524280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w35.q f524281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f524282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f524283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w f524284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f524285i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, w35.q qVar, android.content.Context context, android.content.Intent intent, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str) {
        super(0);
        this.f524280d = f4Var;
        this.f524281e = qVar;
        this.f524282f = context;
        this.f524283g = intent;
        this.f524284h = wVar;
        this.f524285i = r6Var;
        this.f524286m = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent;
        this.f524280d.dismiss();
        android.content.Intent intent2 = this.f524283g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent2, "$intent");
        android.content.Context context = this.f524282f;
        w35.q qVar = this.f524281e;
        if (!qVar.c(context, intent2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(qVar.f524293e, "open file failed, action: " + intent2.getAction() + ", filePath: " + qVar.f524259d);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = this.f524284h.f272547d;
            if (xVar != null && (intent = xVar.f272570p) != null) {
                android.content.Context context2 = this.f524282f;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.e(context2, intent, this.f524285i, qVar.f524256a.f270843c, qVar.f524258c, false);
                intent.setPackage(this.f524286m);
                qVar.c(context2, intent);
            }
        }
        w35.a aVar = qVar.f524257b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
        }
        return jz5.f0.f384359a;
    }
}
