package xp1;

/* loaded from: classes12.dex */
public class k implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l34.b f537426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f537428c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f537429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 f537430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae0.f f537431f;

    public k(l34.b bVar, android.content.Context context, boolean z17, int i17, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var, ae0.f fVar) {
        this.f537426a = bVar;
        this.f537427b = context;
        this.f537428c = z17;
        this.f537429d = str;
        this.f537430e = u1Var;
        this.f537431f = fVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        boolean z19 = this.f537428c;
        java.lang.String str2 = this.f537429d;
        if (z17) {
            this.f537426a.c(this.f537427b);
            if (z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15783, 2, 0, str2);
            }
        } else {
            xp1.d.b(this.f537430e, 2, str2, z19);
        }
        this.f537431f.a(z18, str2, 2);
    }
}
