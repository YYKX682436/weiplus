package g81;

@j95.b
/* loaded from: classes4.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p2621x8fb0427b.i f351058d;

    public static g81.e Ai() {
        return (g81.e) i95.n0.c(g81.e.class);
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.i wi() {
        gm0.j1.b().c();
        if (this.f351058d == null) {
            synchronized (this) {
                if (this.f351058d == null) {
                    this.f351058d = new com.p314xaae8f345.mm.p2621x8fb0427b.i(gm0.j1.u().f354686f);
                }
            }
        }
        return this.f351058d;
    }
}
