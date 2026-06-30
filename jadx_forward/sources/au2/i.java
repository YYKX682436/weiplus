package au2;

/* loaded from: classes8.dex */
public final class i extends k34.a implements k34.g {
    @Override // k34.a, k34.f
    public void b(android.content.Context context, android.content.Intent intent) {
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011e A[Catch: all -> 0x0184, TryCatch #0 {all -> 0x0184, blocks: (B:43:0x00e9, B:45:0x0105, B:47:0x010b, B:52:0x011a, B:54:0x011e, B:56:0x0133, B:57:0x0143, B:59:0x0153, B:60:0x0165, B:62:0x0173, B:63:0x0156, B:65:0x0178, B:66:0x017b), top: B:42:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178 A[Catch: all -> 0x0184, TryCatch #0 {all -> 0x0184, blocks: (B:43:0x00e9, B:45:0x0105, B:47:0x010b, B:52:0x011a, B:54:0x011e, B:56:0x0133, B:57:0x0143, B:59:0x0153, B:60:0x0165, B:62:0x0173, B:63:0x0156, B:65:0x0178, B:66:0x017b), top: B:42:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01aa  */
    @Override // k34.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au2.i.c(android.content.Context, android.content.Intent):void");
    }

    @Override // k34.a, k34.f
    public void f(android.content.Context context, android.content.Intent intent) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ni(3);
    }

    public final void h(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        int rk6 = ((c61.l7) ((zy2.b6) c17)).rk();
        i95.m c18 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        java.lang.String Bj = ((c61.l7) ((zy2.b6) c18)).Bj(1, 49, rk6, intent);
        intent.putExtra("isEnableShowUnreadFeed", true);
        intent.putExtra("key_enter_from_desktop_shortcuts", true);
        intent.putExtra("key_need_update_task_id", true);
        intent.setPackage(context.getPackageName());
        i95.m c19 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        ya2.e1.f542005a.D(context, intent, true);
        i95.m c27 = i95.n0.c(zy2.pa.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zj(Bj, "Enter");
    }
}
