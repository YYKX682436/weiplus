package os4;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f04 f429807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.b f429808f;

    public e(android.content.Context context, r45.f04 f04Var, ms4.b bVar) {
        this.f429806d = context;
        this.f429807e = f04Var;
        this.f429808f = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os4.h.a(this.f429806d, this.f429807e.f455441e, this.f429808f);
    }
}
