package u9;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f507306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f507307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u9.s f507308g;

    public m(u9.s sVar, java.lang.String str, long j17, long j18) {
        this.f507308g = sVar;
        this.f507305d = str;
        this.f507306e = j17;
        this.f507307f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f507308g.f507324b.l(this.f507305d, this.f507306e, this.f507307f);
    }
}
