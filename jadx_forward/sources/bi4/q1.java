package bi4;

/* loaded from: classes5.dex */
public final class q1 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102614a;

    public q1(yz5.l lVar) {
        this.f102614a = lVar;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str2);
        if (bitmap == null) {
            this.f102614a.mo146xb9724478("");
            return;
        }
        if (j17) {
            yz5.l lVar = this.f102614a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            lVar.mo146xb9724478(str2);
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new bi4.p1(bitmap, str2, this.f102614a));
        }
    }
}
