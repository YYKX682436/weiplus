package bi4;

/* loaded from: classes5.dex */
public final class q1 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21081a;

    public q1(yz5.l lVar) {
        this.f21081a = lVar;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        boolean j17 = com.tencent.mm.vfs.w6.j(str2);
        if (bitmap == null) {
            this.f21081a.invoke("");
            return;
        }
        if (j17) {
            yz5.l lVar = this.f21081a;
            kotlin.jvm.internal.o.d(str2);
            lVar.invoke(str2);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new bi4.p1(bitmap, str2, this.f21081a));
        }
    }
}
