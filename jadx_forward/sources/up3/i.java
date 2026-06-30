package up3;

/* loaded from: classes12.dex */
public class i implements com.p314xaae8f345.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.regex.Pattern f511365a;

    public i(up3.j jVar, java.util.regex.Pattern pattern) {
        this.f511365a = pattern;
    }

    @Override // com.p314xaae8f345.mm.vfs.t6
    /* renamed from: accept */
    public boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        return this.f511365a.matcher(r6Var.m82467xfb82e301()).matches();
    }
}
