package qi;

/* loaded from: classes12.dex */
public class a implements qi.c {
    public a(android.content.Context context) {
    }

    @Override // qi.c
    public void a(ri.d0 d0Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Object obj = d0Var;
        if (d0Var == null) {
            obj = "";
        }
        objArr[0] = obj;
        oj.j.c("Matrix.DefaultPluginListener", "report issue content: %s", objArr);
    }

    @Override // qi.c
    public void b(qi.b bVar) {
        oj.j.c("Matrix.DefaultPluginListener", "%s plugin is started", bVar.b());
    }

    @Override // qi.c
    public void c(qi.b bVar) {
        oj.j.c("Matrix.DefaultPluginListener", "%s plugin is inited", bVar.b());
    }

    @Override // qi.c
    public void d(qi.b bVar) {
        oj.j.c("Matrix.DefaultPluginListener", "%s plugin is stopped", bVar.b());
    }
}
