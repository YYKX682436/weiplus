package os4;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f04 f429801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.b f429802f;

    public c(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        this.f429800d = context;
        this.f429801e = f04Var;
        this.f429802f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os4.h.a(this.f429800d, this.f429801e.f455441e, this.f429802f);
    }
}
