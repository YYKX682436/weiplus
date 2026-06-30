package k53;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f385887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k53.f f385888f;

    public e(k53.f fVar, java.lang.String str, int i17) {
        this.f385888f = fVar;
        this.f385886d = str;
        this.f385887e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p961x7eb7aaf2.C11149x9c6f800 c11149x9c6f800 = this.f385888f.f385890d.f385891d;
        if (c11149x9c6f800 != null) {
            c11149x9c6f800.o(this.f385886d, this.f385887e);
        }
    }
}
