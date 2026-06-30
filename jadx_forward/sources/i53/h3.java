package i53;

/* loaded from: classes12.dex */
public class h3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.m3 f370125e;

    public h3(i53.m3 m3Var, java.lang.String str) {
        this.f370125e = m3Var;
        this.f370124d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f370125e.b(this.f370124d);
    }
}
