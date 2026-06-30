package kj1;

/* loaded from: classes9.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj1.m f389825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b f389827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f389828g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kj1.m mVar, android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b c12590x3a54364b, yz5.l lVar) {
        super(1);
        this.f389825d = mVar;
        this.f389826e = activity;
        this.f389827f = c12590x3a54364b;
        this.f389828g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f389825d.c(this.f389826e, this.f389827f.f170402h, booleanValue);
        yz5.l lVar = this.f389828g;
        if (lVar != null) {
            lVar.mo146xb9724478(booleanValue ? kj1.g0.f389859d : kj1.g0.f389865m);
        }
        return jz5.f0.f384359a;
    }
}
