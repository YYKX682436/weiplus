package lf3;

@j95.b
/* loaded from: classes10.dex */
public class q extends i95.w implements nf3.e {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.w8 f399864d;

    public com.p314xaae8f345.mm.p2621x8fb0427b.w8 wi() {
        gm0.j1.b().c();
        if (this.f399864d == null) {
            synchronized (this) {
                if (this.f399864d == null) {
                    this.f399864d = new com.p314xaae8f345.mm.p2621x8fb0427b.w8(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f399864d;
    }
}
