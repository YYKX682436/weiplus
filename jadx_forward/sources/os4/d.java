package os4;

/* loaded from: classes8.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f04 f429804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.b f429805f;

    public d(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        this.f429803d = context;
        this.f429804e = f04Var;
        this.f429805f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os4.h.a(this.f429803d, this.f429804e.f455442f, this.f429805f);
    }
}
