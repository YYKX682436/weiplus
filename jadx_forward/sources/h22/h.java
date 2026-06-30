package h22;

/* loaded from: classes15.dex */
public final class h extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f359836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 view, android.os.Looper looper) {
        super(looper);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(looper, "looper");
        this.f359836a = new java.lang.ref.WeakReference(view);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff c13369xdedd0dff;
        int m17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 c13370x510fae49 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49) this.f359836a.get();
        if (c13370x510fae49 != null && msg.what == 1 && (m17 = (c13369xdedd0dff = c13370x510fae49.f180022e).m()) >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c13370x510fae49.f180026i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(m17 + 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$TimerHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c1163xf1deaba4.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$TimerHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            sendEmptyMessageDelayed(1, c13369xdedd0dff.f180014f + c13370x510fae49.f180021d.f359832d);
        }
    }
}
