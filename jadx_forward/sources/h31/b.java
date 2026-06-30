package h31;

/* loaded from: classes9.dex */
public final class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f359925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h31.r f359926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359927f;

    public b(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, h31.r rVar, int i17) {
        this.f359925d = c11158xe7d16ed5;
        this.f359926e = rVar;
        this.f359927f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f359925d;
        int i18 = c11158xe7d16ed5.f153330w;
        h31.r rVar = this.f359926e;
        if (i18 == 0) {
            h31.a aVar = rVar.f359967h;
            if (aVar != null) {
                ((m31.y1) aVar).b(false, c11158xe7d16ed5);
                return;
            }
            return;
        }
        h31.a aVar2 = rVar.f359967h;
        if (aVar2 != null) {
            ((m31.y1) aVar2).a(this.f359927f, i18, c11158xe7d16ed5.f153331x);
        }
    }
}
