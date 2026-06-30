package ra2;

/* loaded from: classes2.dex */
public final class a extends java.util.Observable {

    /* renamed from: a, reason: collision with root package name */
    public int f475016a;

    public a(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f475016a = (i18 & 1) != 0 ? 0 : i17;
    }

    public final void a(int i17) {
        this.f475016a = i17;
        setChanged();
    }
}
