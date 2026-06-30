package eg4;

/* loaded from: classes11.dex */
public final class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p7 f334323e;

    public s(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p7 p7Var) {
        this.f334322d = context;
        this.f334323e = p7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        eg4.g1.b(this.f334322d, null, this.f334323e, false, false);
    }
}
