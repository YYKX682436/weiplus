package ns4;

/* loaded from: classes8.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.a f421121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns4.s f421122e;

    public m(ms4.a aVar, ns4.s sVar) {
        this.f421121d = aVar;
        this.f421122e = sVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        js4.n nVar;
        js4.o oVar;
        ms4.a aVar = this.f421121d;
        if (aVar == null || (nVar = this.f421122e.f421170b) == null || (oVar = nVar.f383079d) == null) {
            return;
        }
        java.lang.String str = aVar.f412530c;
        if (str == null) {
            str = "";
        }
        oVar.a(aVar.f412528a, aVar.f412529b, str);
    }
}
