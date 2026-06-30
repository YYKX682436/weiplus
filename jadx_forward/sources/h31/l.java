package h31;

/* loaded from: classes9.dex */
public final class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h31.r f359951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f359952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f359953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f359954g;

    public l(h31.r rVar, yz5.a aVar, android.content.Context context, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        this.f359951d = rVar;
        this.f359952e = aVar;
        this.f359953f = context;
        this.f359954g = c11158xe7d16ed5;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h31.r rVar = this.f359951d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = rVar.f359970k;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f359952e.mo152xb9724478();
        e31.k a17 = e31.n.f328620a.a("name_biz");
        if (a17 != null) {
            a17.e(this.f359953f, 3, rVar.f359962c, this.f359954g.f153316f);
        }
    }
}
