package ou4;

/* loaded from: classes6.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ou4.y f430572d = new ou4.y();

    public y() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ou4.w wVar = ou4.x.f430567d;
        ou4.x xVar = ou4.x.f430568e;
        if (xVar == null) {
            synchronized (wVar) {
                xVar = ou4.x.f430568e;
                if (xVar == null) {
                    xVar = new ou4.x(null);
                    ou4.x.f430568e = xVar;
                }
            }
        }
        return xVar;
    }
}
