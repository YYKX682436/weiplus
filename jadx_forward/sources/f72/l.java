package f72;

/* loaded from: classes12.dex */
public class l extends f72.j {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f341584h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f341585i;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13519x2c4403b8 c13519x2c4403b8, android.content.Intent intent) {
        super(c13519x2c4403b8, intent, null);
        this.f341584h = intent.getStringExtra("k_ticket");
        this.f341585i = intent.getStringExtra("request_verify_pre_info");
    }

    @Override // f72.j
    public com.p314xaae8f345.mm.p944x882e457a.m1 a(dn.h hVar) {
        return gm0.j1.b().n() ? new c72.c0(this.f341582f, this.f341580d, this.f341581e, hVar.f69522xf9dbbe9c, hVar.f69502xf11df5f5, this.f341584h, this.f341585i) : new c72.d0(this.f341582f, this.f341580d, this.f341581e, hVar.f69522xf9dbbe9c, hVar.f69502xf11df5f5, this.f341584h, this.f341585i);
    }
}
