package kt4;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt4.e f393562d;

    public c(kt4.e eVar) {
        this.f393562d = eVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kt4.e eVar = this.f393562d;
        eVar.f393564c.f(eVar.f420366a, null);
        eVar.f420366a.finish();
    }
}
