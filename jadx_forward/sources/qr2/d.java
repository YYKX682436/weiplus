package qr2;

/* loaded from: classes2.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void a(qr2.d dVar, java.util.ArrayList feeds, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z18 = true;
        }
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        if (z17 && !(!((java.util.ArrayList) kz5.j0.I(feeds, qr2.f.class)).isEmpty())) {
            feeds.add(new qr2.f());
            if (z18) {
                adapter.m8149x8b456734(feeds.size() - 1);
            }
        }
    }
}
