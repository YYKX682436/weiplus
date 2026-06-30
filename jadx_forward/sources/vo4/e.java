package vo4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f520156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f520157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vo4.i iVar, boolean z17) {
        super(0);
        this.f520156d = iVar;
        this.f520157e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vo4.r rVar = this.f520156d.f520167e;
        boolean z17 = this.f520157e;
        rVar.f520208d = z17;
        java.util.Iterator it = rVar.f520209e.iterator();
        while (it.hasNext()) {
            ((vo4.b) it.next()).a(z17);
        }
        return jz5.f0.f384359a;
    }
}
