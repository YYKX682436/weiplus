package k53;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f385882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f385883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k53.f f385884g;

    public d(k53.f fVar, java.lang.String str, long j17, long j18) {
        this.f385884g = fVar;
        this.f385881d = str;
        this.f385882e = j17;
        this.f385883f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800 = this.f385884g.f385890d.f385891d;
        if (c11149x9c6f800 != null) {
            c11149x9c6f800.f(this.f385881d, this.f385882e, this.f385883f);
        }
    }
}
