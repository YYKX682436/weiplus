package h31;

/* loaded from: classes9.dex */
public final class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f359943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h31.r f359944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359945f;

    public h(com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, h31.r rVar, int i17) {
        this.f359943d = c11158xe7d16ed5;
        this.f359944e = rVar;
        this.f359945f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f359943d;
        int i18 = c11158xe7d16ed5.f153330w;
        h31.r rVar = this.f359944e;
        if (i18 == 0) {
            h31.a aVar = rVar.f359967h;
            if (aVar != null) {
                ((m31.y1) aVar).c(c11158xe7d16ed5);
                return;
            }
            return;
        }
        h31.a aVar2 = rVar.f359967h;
        if (aVar2 != null) {
            ((m31.y1) aVar2).a(this.f359945f, i18, c11158xe7d16ed5.f153331x);
        }
    }
}
