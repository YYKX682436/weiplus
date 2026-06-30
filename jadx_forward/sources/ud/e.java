package ud;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud.g f508098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ud.g gVar) {
        super(0);
        this.f508098d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ud.g gVar = this.f508098d;
        synchronized (gVar) {
            if (gVar.f508102c == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = gVar.f508102c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
            c4209xd2d3ddad.r();
            gVar.f508102c = null;
        }
        return jz5.f0.f384359a;
    }
}
