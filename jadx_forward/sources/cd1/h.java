package cd1;

/* loaded from: classes7.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cd1.i f122154f;

    public h(cd1.i iVar, int i17, java.lang.String str) {
        this.f122154f = iVar;
        this.f122152d = i17;
        this.f122153e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f122154f.e(this.f122152d, this.f122153e);
    }
}
