package ae2;

/* loaded from: classes3.dex */
public final class fh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.fh f3607d = new ae2.fh();

    public fh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "缓存评论的直播间数量", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_room_size_to_cache_comment, false, 2, null);
        aVar.a("FINDER_LIVE_ROOM_SIZE_TO_CACHE_COMMENT", kz5.c0.i(1, 5, 10), kz5.c0.i("1", "5", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        return aVar;
    }
}
