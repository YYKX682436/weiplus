package fg1;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.u f343423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fg1.u uVar) {
        super(1);
        this.f343423d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gg1.j it = (gg1.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume now:" + it.f353109a);
        fg1.j jVar = fg1.u.f343426l;
        gg1.c1 b17 = this.f343423d.b();
        java.lang.Object obj2 = it.f353109a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        b17.e(((java.lang.Number) obj2).intValue() + 1);
        return jz5.f0.f384359a;
    }
}
