package sc3;

/* loaded from: classes7.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487999f;

    public j0(sc3.k1 k1Var, java.lang.String str, java.lang.String str2) {
        this.f487997d = k1Var;
        this.f487998e = str;
        this.f487999f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f487997d.f488010f.h(this.f487998e, this.f487999f);
    }
}
