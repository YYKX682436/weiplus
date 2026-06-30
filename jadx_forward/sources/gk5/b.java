package gk5;

/* loaded from: classes9.dex */
public final class b extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new nb5.b();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String m126747x696739c;
        v05.b j17 = ((nb5.b) c7()).j();
        return (j17 == null || (m126747x696739c = j17.m126747x696739c()) == null) ? "" : m126747x696739c;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    @Override // m50.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k7(xi5.e r11) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk5.b.k7(xi5.e):boolean");
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 e76 = e7();
        ot0.q Z6 = Z6();
        if (Z6 != null) {
            byte[] bArr = null;
            if (e76 != null && e76.z0() != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e76.z0(), "")) {
                i95.m c17 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                try {
                    bArr = com.p314xaae8f345.mm.vfs.w6.N(tg3.u0.ga((tg3.u0) c17, e76, e76.z0(), false, 4, null), 0, -1);
                    if (!q7(bArr)) {
                        return;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ForwardAppBrandUIC", e17, "processAppMessageTransfer send to user: %s, exception", up5.f.f511478o);
                }
            }
            ot0.a aVar = (ot0.a) Z6.y(ot0.a.class);
            if (aVar == null) {
                aVar = new ot0.a();
            }
            aVar.K = false;
            aVar.R = te5.e2.d(e76);
            Z6.f(aVar);
            ((ez.w0) ot0.j1.a()).wi(Z6, Z6.f430179d, Z6.H, toUser, "", bArr, true);
        }
    }

    public final boolean q7(byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardAppBrandUIC", "isImage called, data[0-4]:[%d,%d,%d,%d,%d]", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3]), java.lang.Byte.valueOf(bArr[4]));
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, bArr.length, options);
        return options.outWidth >= 0 && options.outHeight >= 0;
    }
}
