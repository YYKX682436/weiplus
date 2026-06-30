package l01;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.u f396280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f396281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l01.b f396282g;

    public c(l01.b bVar, java.lang.String str, l01.u uVar, java.lang.String str2, l01.c0 c0Var) {
        this.f396282g = bVar;
        this.f396279d = str;
        this.f396280e = uVar;
        this.f396281f = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.b bVar = this.f396282g;
        android.graphics.Bitmap a17 = ((l01.n) bVar.f396276e).a(this.f396279d);
        if (a17 == null || a17.isRecycled()) {
            a17 = null;
        }
        l01.u uVar = this.f396280e;
        if (a17 != null) {
            uVar.mo1040x5481b993(a17);
            return;
        }
        l01.c0 c0Var = this.f396281f;
        java.lang.String str = c0Var.f396290n + c0Var.e();
        ((java.util.concurrent.ConcurrentHashMap) bVar.f396272a).put(uVar, str);
        ((java.util.concurrent.ConcurrentHashMap) bVar.f396273b).put(str, uVar);
        uVar.d();
        c0Var.f396286g.f396275d.f396317a.mo50293x3498a0(new l01.y(c0Var));
    }
}
