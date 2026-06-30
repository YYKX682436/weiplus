package ms4;

/* loaded from: classes8.dex */
public final class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.a f412572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js4.o f412573e;

    public h0(ms4.a aVar, js4.o oVar) {
        this.f412572d = aVar;
        this.f412573e = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        js4.o oVar;
        ms4.a aVar = this.f412572d;
        if (aVar == null || (oVar = this.f412573e) == null) {
            return;
        }
        java.lang.String str = aVar.f412530c;
        if (str == null) {
            str = "";
        }
        oVar.a(aVar.f412528a, aVar.f412529b, str);
    }
}
