package fh4;

/* loaded from: classes11.dex */
public class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh4.s f344238d;

    public r(fh4.s sVar) {
        this.f344238d = sVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        fh4.s sVar = this.f344238d;
        sVar.f344239d.f254000r = false;
        dh4.l.Di().i();
        sVar.f344239d.finish();
    }
}
