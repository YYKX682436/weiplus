package uf5;

/* loaded from: classes10.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f508764d;

    public g1(uf5.j1 j1Var, java.lang.Runnable runnable) {
        this.f508764d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f508764d.run();
    }
}
