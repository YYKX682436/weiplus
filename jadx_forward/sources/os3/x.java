package os3;

/* loaded from: classes8.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.y f429778d;

    public x(os3.y yVar) {
        this.f429778d = yVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.y yVar = this.f429778d;
        yVar.f429785d.setResult(0);
        yVar.f429785d.finish();
    }
}
