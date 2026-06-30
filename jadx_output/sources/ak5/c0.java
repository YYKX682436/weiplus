package ak5;

/* loaded from: classes5.dex */
public final class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak5.g0 f5661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f5662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.db f5664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f5665h;

    public c0(ak5.g0 g0Var, android.content.Context context, int i17, com.tencent.mm.storage.db dbVar, com.tencent.mm.storage.f9 f9Var) {
        this.f5661d = g0Var;
        this.f5662e = context;
        this.f5663f = i17;
        this.f5664g = dbVar;
        this.f5665h = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f5661d.Ai(this.f5662e, this.f5663f, this.f5664g, this.f5665h);
    }
}
