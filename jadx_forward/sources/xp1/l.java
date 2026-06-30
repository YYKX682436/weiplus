package xp1;

/* loaded from: classes12.dex */
public class l implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae0.e f537434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f537435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f537436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae0.f f537437f;

    public l(android.content.Context context, int i17, java.lang.String str, ae0.e eVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var, boolean z17, ae0.f fVar) {
        this.f537432a = context;
        this.f537433b = str;
        this.f537434c = eVar;
        this.f537435d = u1Var;
        this.f537436e = z17;
        this.f537437f = fVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        java.lang.String str2 = this.f537433b;
        if (z17) {
            xp1.d.a(this.f537432a, false, 4, str2, this.f537434c);
        } else {
            xp1.d.b(this.f537435d, 4, str2, this.f537436e);
        }
        this.f537437f.a(z18, str2, 4);
    }
}
