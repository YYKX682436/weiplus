package bf3;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf3.z f19656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bf3.z zVar) {
        super(0);
        this.f19656d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bf3.z zVar = this.f19656d;
        if (zVar.f19686k && zVar.f19685j) {
            java.util.Iterator it = zVar.f19683h.iterator();
            while (it.hasNext()) {
                bf3.z.d(zVar, (java.lang.String) it.next());
            }
        }
        return jz5.f0.f302826a;
    }
}
