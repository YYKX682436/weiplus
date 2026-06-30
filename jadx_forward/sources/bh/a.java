package bh;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(bh.b bVar, final java.lang.String type, final int i17, final int i18, final int i19, final android.view.Surface surface, yz5.l replaceCallback, yz5.l lVar, boolean z17, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerSurface");
        }
        yz5.l lVar2 = (i27 & 64) != 0 ? null : lVar;
        boolean z18 = (i27 & 128) != 0 ? true : z17;
        com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e c4211x20e2c38e = (com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd.C4211x20e2c38e) bVar;
        c4211x20e2c38e.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replaceCallback, "replaceCallback");
        java.lang.String a17 = c4211x20e2c38e.a(type, i17);
        if (i18 <= 0 || i19 <= 0 || c4211x20e2c38e.f130161b.containsKey(a17)) {
            return;
        }
        c4211x20e2c38e.f130161b.put(a17, new bh.c(i18, i19, null, surface, replaceCallback, lVar2));
        final com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = c4211x20e2c38e.f130160a;
        if (abstractC4208x204d5c83.f130110a == 0) {
            return;
        }
        final boolean z19 = z18;
        abstractC4208x204d5c83.n(new java.lang.Runnable() { // from class: yg.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c832 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.this;
                abstractC4208x204d5c832.m34785x13a3b2c6(abstractC4208x204d5c832.f130110a, i17, type, i18, i19, surface, z19);
            }
        });
    }
}
