package os3;

/* loaded from: classes11.dex */
public class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ os3.j1 f429609g;

    public f1(os3.j1 j1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f429609g = j1Var;
        this.f429606d = str;
        this.f429607e = str2;
        this.f429608f = str3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f429609g.b(this.f429606d, this.f429607e, this.f429608f);
    }
}
