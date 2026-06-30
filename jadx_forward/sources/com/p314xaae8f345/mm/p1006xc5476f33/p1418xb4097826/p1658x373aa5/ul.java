package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class ul implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f214738d;

    public ul(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39) {
        this.f214738d = c15352x8ed10a39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = this.f214738d;
        if (c15352x8ed10a39.isFolded) {
            return;
        }
        int size = ((java.util.ArrayList) c15352x8ed10a39.m62411x5aa37cae().f213021d).size();
        c15352x8ed10a39.m62402xbc21531b().clear();
        for (int i17 = 1; i17 < size; i17++) {
            java.lang.Object obj = ((java.util.ArrayList) c15352x8ed10a39.m62411x5aa37cae().f213021d).get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                c15352x8ed10a39.m62402xbc21531b().add((android.view.View) it.next());
            }
        }
        java.util.Iterator<T> it6 = c15352x8ed10a39.m62402xbc21531b().iterator();
        while (it6.hasNext()) {
            c15352x8ed10a39.m62411x5aa37cae().removeView((android.view.View) it6.next());
        }
        c15352x8ed10a39.m62417xca97362(true);
        c15352x8ed10a39.b();
        yz5.a onFlodListener = c15352x8ed10a39.getOnFlodListener();
        if (onFlodListener != null) {
            onFlodListener.mo152xb9724478();
        }
    }
}
