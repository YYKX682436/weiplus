package k53;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f385876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f385877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k53.f f385878g;

    public c(k53.f fVar, java.lang.String str, long j17, long j18) {
        this.f385878g = fVar;
        this.f385875d = str;
        this.f385876e = j17;
        this.f385877f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800 = this.f385878g.f385890d.f385891d;
        if (c11149x9c6f800 != null) {
            c11149x9c6f800.mo48220x9bb59ea0(this.f385875d, this.f385876e, this.f385877f);
        }
    }
}
