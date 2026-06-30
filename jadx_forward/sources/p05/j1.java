package p05;

/* loaded from: classes5.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f432091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f432092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(int i17, int i18) {
        super(1);
        this.f432091d = i17;
        this.f432092e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p05.q3 it = (p05.q3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.f432190b == this.f432091d && it.f432191c == this.f432092e);
    }
}
