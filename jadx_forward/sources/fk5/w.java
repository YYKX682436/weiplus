package fk5;

/* loaded from: classes12.dex */
public final class w implements f65.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345213a;

    public w(java.lang.String str) {
        this.f345213a = str;
    }

    @Override // f65.a
    public void a(long j17, java.util.Map params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(this.f345213a, j17);
        fk5.y yVar = fk5.y.f345216d;
        yVar.e(n17, params, n17.P0() == 2);
        synchronized (yVar.f341404c) {
            ((java.util.ArrayList) yVar.f341404c).remove(java.lang.Long.valueOf(j17));
        }
    }
}
