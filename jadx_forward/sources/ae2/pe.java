package ae2;

/* loaded from: classes3.dex */
public final class pe extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.pe f85633d = new ae2.pe();

    public pe() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(172800, "直播服务通知本地记录时间窗口", null, null, 12, null);
        aVar.a("FINDER_LIVE_NOTIFY_RECORD_DURATION", kz5.c0.i(172800, 3600, 7200, 1800, 900), kz5.c0.i("48小时", "1小时", "2小时", "30分钟", "15分钟"));
        return aVar;
    }
}
