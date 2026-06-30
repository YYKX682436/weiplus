package bf3;

/* loaded from: classes7.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf3.z f101189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bf3.z zVar) {
        super(0);
        this.f101189d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bf3.z zVar = this.f101189d;
        if (zVar.f101219k && zVar.f101218j) {
            java.util.Iterator it = zVar.f101216h.iterator();
            while (it.hasNext()) {
                bf3.z.d(zVar, (java.lang.String) it.next());
            }
        }
        return jz5.f0.f384359a;
    }
}
