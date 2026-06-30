package ir2;

/* loaded from: classes2.dex */
public class e extends ir2.q {

    /* renamed from: a, reason: collision with root package name */
    public final int f375657a;

    /* renamed from: b, reason: collision with root package name */
    public final long f375658b;

    /* renamed from: c, reason: collision with root package name */
    public final long f375659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i17, long j17, long j18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(false, 1, null);
        i17 = (i18 & 1) != 0 ? -1 : i17;
        j17 = (i18 & 2) != 0 ? -1L : j17;
        j18 = (i18 & 4) != 0 ? -1L : j18;
        this.f375657a = i17;
        this.f375658b = j17;
        this.f375659c = j18;
    }
}
