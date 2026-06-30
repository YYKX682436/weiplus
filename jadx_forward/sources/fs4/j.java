package fs4;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs4.k f347876d;

    public j(fs4.k kVar) {
        this.f347876d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fs4.k kVar = this.f347876d;
        kVar.f347877c.f295334c.putInt("RESET_PWD_USER_ACTION", 2);
        fs4.m mVar = kVar.f347877c;
        mVar.o(kVar.f420366a, 0, mVar.f295334c);
    }
}
