package ne1;

/* loaded from: classes7.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne1.d f418047d;

    public c(ne1.d dVar) {
        this.f418047d = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ne1.e eVar = this.f418047d.f418049e;
        eVar.f418050a.a(eVar.f418051b, eVar.f418052c.o("fail user canceled updateApp"));
    }
}
