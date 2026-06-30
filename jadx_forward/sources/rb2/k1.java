package rb2;

/* loaded from: classes3.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.n f475203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(gd2.n nVar, java.lang.String str) {
        super(0);
        this.f475203d = nVar;
        this.f475204e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        gd2.n nVar = this.f475203d;
        nVar.getClass();
        java.lang.String curFilename = this.f475204e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curFilename, "curFilename");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f352080c;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("FinderCommentImageMenuData", "", e17);
        }
        if (concurrentHashMap.containsKey(curFilename)) {
            java.lang.Object obj = concurrentHashMap.get(curFilename);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            z17 = ((java.lang.Boolean) obj).booleanValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageMenuData", "isCurrentImgCanShowTransEntrance:" + z17);
            return java.lang.Boolean.valueOf(z17);
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageMenuData", "isCurrentImgCanShowTransEntrance:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
