package th5;

/* loaded from: classes12.dex */
public final class f extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        int i17;
        int i18;
        mf3.k oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641 c10612x9ba63641 = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641) b3.q.a(intent, "biz_photo_account_gallery_args", com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641.class);
        if (c10612x9ba63641 != null) {
            java.util.List list = c10612x9ba63641.f148622d;
            if (!list.isEmpty()) {
                mf3.f fVar = new mf3.f();
                java.util.Iterator it = list.iterator();
                java.lang.String str = null;
                int i19 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    int i27 = c10612x9ba63641.f148623e;
                    if (!hasNext) {
                        int d17 = fVar.d() - 1;
                        if (d17 < 0) {
                            d17 = 0;
                        }
                        int f17 = e06.p.f(i27, 0, d17);
                        if (str == null && fVar.d() > 0) {
                            str = ((mf3.k) fVar.get(0)).mo2110x5db1b11();
                        }
                        if (str != null) {
                            ((lf3.c0) listener).Y6(str);
                        }
                        ((lf3.c0) listener).X6(fVar, true);
                        listener.T3(f17);
                        return true;
                    }
                    java.lang.Object next = it.next();
                    int i28 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a c10613xe014f98a = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a) next;
                    if (c10613xe014f98a.f148630f) {
                        i17 = i27;
                        i18 = i19;
                        oVar = new th5.q(i19, c10613xe014f98a.f148628d, c10613xe014f98a.f148629e, c10613xe014f98a.f148631g, c10613xe014f98a.f148632h, c10613xe014f98a.f148633i, c10612x9ba63641.f148627i);
                    } else {
                        i17 = i27;
                        i18 = i19;
                        oVar = new th5.o(i18, c10613xe014f98a.f148628d, c10613xe014f98a.f148629e, c10613xe014f98a.f148632h, c10612x9ba63641.f148627i);
                    }
                    fVar.add(oVar);
                    if (i18 == i17) {
                        str = oVar.mo2110x5db1b11();
                    }
                    i19 = i28;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPhotoAccountDataProvider", "fetch failed: no args");
        return false;
    }
}
