package e04;

/* loaded from: classes15.dex */
public class i0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.p f327489d;

    public i0(e04.p pVar) {
        this.f327489d = pVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rz3.e eVar = this.f327489d.f327592w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
