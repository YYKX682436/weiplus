package u85;

/* loaded from: classes10.dex */
public final class n extends u85.o {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f507251h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 info) {
        super(info);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f507251h = "MicroMsg.StickerProcessTask";
    }

    @Override // fp0.d
    public void a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("load_info", this.f507252f);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, bundle, u85.l.class, new u85.m(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f507252f.a();
    }

    @Override // u85.o
    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f507251h, "onResult: " + d() + ' ' + z17);
        super.e(z17);
    }
}
