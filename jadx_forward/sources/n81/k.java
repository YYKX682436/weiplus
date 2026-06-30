package n81;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f417156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list) {
        super(0);
        this.f417156d = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long b17 = n81.p.b(n81.p.f417161a, this.f417156d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSweeperLogic", "publicCleanBlock, cleaned " + b17 + " bytes");
        return java.lang.Long.valueOf(b17);
    }
}
