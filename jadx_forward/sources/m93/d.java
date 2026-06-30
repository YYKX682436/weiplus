package m93;

/* loaded from: classes8.dex */
public class d implements m93.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f406557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f406558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m93.i f406559d;

    public d(m93.i iVar, java.lang.String str, long j17, int i17) {
        this.f406559d = iVar;
        this.f406556a = str;
        this.f406557b = j17;
        this.f406558c = i17;
    }

    @Override // m93.h
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteApp.LiteAppGetA8Key", "preAuth failed %s", this.f406556a);
    }

    @Override // m93.h
    public void b(m93.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteApp.LiteAppGetA8Key", "preAuth success %s", this.f406556a);
        this.f406559d.d(new m93.c(this, gVar));
    }
}
