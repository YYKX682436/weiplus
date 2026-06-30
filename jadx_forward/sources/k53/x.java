package k53;

/* loaded from: classes8.dex */
public class x implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k53.b0 f385941a;

    public x(k53.c0 c0Var, k53.b0 b0Var) {
        this.f385941a = b0Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        if (bVar == null || bVar.f441067d == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "load thumb:%s, from:%d", str, java.lang.Integer.valueOf(bVar.f441065b));
        this.f385941a.f385873g.post(new k53.w(this));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
