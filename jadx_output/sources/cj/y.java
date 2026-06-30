package cj;

/* loaded from: classes12.dex */
public class y extends cj.c {
    @Override // cj.c
    public boolean b(com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo destroyedActivityInfo) {
        oj.j.c("Matrix.LeakProcessor.NoDump", "lightweight mode, just report leaked activity name.", new java.lang.Object[0]);
        this.f41825a.b(destroyedActivityInfo.mActivityName, true);
        c(0, wi.b.NO_DUMP, destroyedActivityInfo.mActivityName, destroyedActivityInfo.mKey, "no dump", "0");
        return true;
    }
}
