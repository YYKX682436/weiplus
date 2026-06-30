package fs;

/* loaded from: classes6.dex */
public enum k2 implements fs.h {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f347651d = new java.util.concurrent.ConcurrentHashMap(4440);

    k2() {
    }

    public fs.i a(java.lang.Class cls) {
        java.util.Map map = this.f347651d;
        fs.i iVar = (fs.i) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
        if (iVar == null) {
            iVar = fs.a.INSTANCE;
            fs.r[] rVarArr = {fs.s.INSTANCE};
            while (true) {
                fs.r rVar = rVarArr[0];
                if (rVar == null) {
                    break;
                }
                iVar = rVar.a(cls, rVarArr);
            }
            ((java.util.concurrent.ConcurrentHashMap) map).put(cls, iVar);
        }
        return iVar;
    }
}
