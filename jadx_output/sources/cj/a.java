package cj;

/* loaded from: classes12.dex */
public class a extends cj.c {
    @Override // cj.c
    public boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo) {
        xi.e eVar = this.f41826b;
        com.tencent.matrix.resource.watcher.f fVar = this.f41825a;
        if (eVar == null) {
            this.f41826b = new xi.e(fVar.f395858d);
        }
        java.io.File a17 = this.f41826b.a(true);
        if (a17 != null) {
            fVar.b(destroyedActivityInfo.mActivityName, true);
            fVar.d();
            ti.w0 w0Var = new ti.w0(a17, destroyedActivityInfo.mKey, destroyedActivityInfo.mActivityName);
            if (this.f41827c == null) {
                this.f41827c = new cj.b(this);
            }
            ((cj.b) this.f41827c).a(w0Var);
        } else {
            oj.j.c("Matrix.LeakProcessor.AutoDump", "heap dump for further analyzing activity with key [%s] was failed, just ignore.", destroyedActivityInfo.mKey);
        }
        return true;
    }
}
