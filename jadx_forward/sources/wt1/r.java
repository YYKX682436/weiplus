package wt1;

/* loaded from: classes13.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.p f530873d;

    public r(wt1.p pVar) {
        this.f530873d = pVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        wt1.p pVar = this.f530873d;
        pVar.f530859n = true;
        pVar.a(pVar.f530854f, new byte[0], -85.0f, -1000.0f, 0, false, true);
    }
}
