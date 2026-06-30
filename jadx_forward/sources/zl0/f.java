package zl0;

/* loaded from: classes13.dex */
public class f implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl0.a f555096a;

    public f(zl0.a aVar) {
        this.f555096a = aVar;
    }

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        java.lang.String m82467xfb82e301 = r6Var.m82467xfb82e301();
        if (!m82467xfb82e301.endsWith(".zst")) {
            return false;
        }
        zl0.a aVar = this.f555096a;
        return m82467xfb82e301.contains(aVar.f555091c) && m82467xfb82e301.contains(aVar.f555090b) && m82467xfb82e301.contains(aVar.f555092d);
    }
}
