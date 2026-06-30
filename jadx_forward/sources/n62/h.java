package n62;

/* loaded from: classes12.dex */
public class h implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n62.k f416726d;

    public h(n62.k kVar) {
        this.f416726d = kVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        n62.k kVar = this.f416726d;
        if (!kVar.f416737n.contains(str)) {
            kVar.f416737n.add(str);
        }
        kVar.f416738o.mo50303x856b99f0(0);
        kVar.f416738o.mo50307xb9e94560(0, 60L);
    }
}
