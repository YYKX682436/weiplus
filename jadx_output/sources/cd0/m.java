package cd0;

/* loaded from: classes5.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f40551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f40552f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40553g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f40554h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40555i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f40556m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f40557n;

    public m(com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var, java.util.List list, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, long j17, boolean z17) {
        this.f40550d = f9Var;
        this.f40551e = v2Var;
        this.f40552f = list;
        this.f40553g = str;
        this.f40554h = weakReference;
        this.f40555i = str2;
        this.f40556m = j17;
        this.f40557n = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f40551e.f415004c;
        com.tencent.mm.storage.f9 f9Var = this.f40550d;
        f9Var.o1(j17);
        f9Var.setType(43);
        cd0.b0 b0Var = cd0.b0.f40525a;
        com.tencent.mm.storage.f9 f9Var2 = this.f40550d;
        b0Var.a(f9Var2, this.f40552f, kz5.b0.c(f9Var2), this.f40553g, this.f40554h, this.f40555i, false, this.f40556m, this.f40557n);
    }
}
