package os3;

/* loaded from: classes11.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f429620f;

    public g1(os3.j1 j1Var, java.lang.String str, java.lang.String str2) {
        this.f429620f = j1Var;
        this.f429618d = str;
        this.f429619e = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.j1.a(this.f429620f, this.f429618d, this.f429619e, "", "");
    }
}
