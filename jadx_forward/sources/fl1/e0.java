package fl1;

/* loaded from: classes4.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f345283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bg7 f345284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345286g;

    public e0(fl1.c1 c1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, r45.bg7 bg7Var, java.lang.Runnable runnable) {
        this.f345286g = c1Var;
        this.f345283d = o6Var;
        this.f345284e = bg7Var;
        this.f345285f = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f345286g.i(this.f345283d, true, null, this.f345284e);
        this.f345285f.run();
    }
}
