package ak5;

/* loaded from: classes5.dex */
public final class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak5.g0 f87194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.db f87197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f87198h;

    public c0(ak5.g0 g0Var, android.content.Context context, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f87194d = g0Var;
        this.f87195e = context;
        this.f87196f = i17;
        this.f87197g = dbVar;
        this.f87198h = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f87194d.Ai(this.f87195e, this.f87196f, this.f87197g, this.f87198h);
    }
}
