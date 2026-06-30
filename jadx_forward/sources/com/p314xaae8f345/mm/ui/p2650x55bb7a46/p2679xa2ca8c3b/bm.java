package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public abstract class bm {
    public static final void a(android.content.Intent intent, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = (context instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) && android.os.Build.VERSION.SDK_INT >= 30;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemImgKtHelper", "fillIfStartWithFragmentMode() supportVas:" + z17);
        if (z17) {
            lk5.s.e(intent, true);
            intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39700x5121213, true);
        }
    }
}
