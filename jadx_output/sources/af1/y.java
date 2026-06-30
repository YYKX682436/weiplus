package af1;

/* loaded from: classes7.dex */
public class y implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r.a f4512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4515g;

    public y(r.a aVar, int i17, java.lang.String str, int i18) {
        this.f4512d = aVar;
        this.f4513e = i17;
        this.f4514f = str;
        this.f4515g = i18;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.SameLayer.ExoMediaPlayerUtils";
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4512d.apply(af1.z.b(this.f4513e, this.f4514f, this.f4515g));
    }
}
