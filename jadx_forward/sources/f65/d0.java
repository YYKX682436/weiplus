package f65;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341409f;

    public d0(java.lang.String str, int i17, int i18) {
        this.f341407d = str;
        this.f341408e = i17;
        this.f341409f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0.c(f65.y0.f341552a, this.f341407d, new f65.c0(this.f341408e, this.f341409f));
    }
}
