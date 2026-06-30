package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public final class d1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 f227378d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab9) {
        this.f227378d = c16348x20daaab9;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab9 = this.f227378d;
        if (c16348x20daaab9.getNeedLoopPlay()) {
            c16348x20daaab9.m66147x44867d86(false);
            if (it.what == 1) {
                int currentPosition = c16348x20daaab9.getCurrentPosition() + 1;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = c16348x20daaab9.f227346l2;
                if (c22848x6ddd90cf == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storyDataAdapter");
                    throw null;
                }
                c22848x6ddd90cf.mo1894x7e414b06();
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = c16348x20daaab9.f227346l2;
                if (c22848x6ddd90cf2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storyDataAdapter");
                    throw null;
                }
                if (currentPosition < c22848x6ddd90cf2.mo1894x7e414b06()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab92 = this.f227378d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(currentPosition));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c16348x20daaab92, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                    c16348x20daaab92.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c16348x20daaab92, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "smoothScrollToPosition", "(I)V");
                } else {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = c16348x20daaab9.f227346l2;
                    if (c22848x6ddd90cf3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("storyDataAdapter");
                        throw null;
                    }
                    if (currentPosition == c22848x6ddd90cf3.mo1894x7e414b06()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16348x20daaab9 c16348x20daaab93 = this.f227378d;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(c16348x20daaab93, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "scrollToPosition", "(I)V");
                        c16348x20daaab93.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(c16348x20daaab93, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryViewPager$handler$1", "handleMessage", "(Landroid/os/Message;)Z", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
        return true;
    }
}
