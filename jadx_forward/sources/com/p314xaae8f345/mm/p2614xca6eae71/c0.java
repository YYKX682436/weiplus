package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2614xca6eae71.c0 f274758a = new com.p314xaae8f345.mm.p2614xca6eae71.c0();

    /* renamed from: b, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.f2 f274759b;

    /* renamed from: c, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.y0 f274760c;

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.p3332x361a9b.d f274761d;

    /* renamed from: e, reason: collision with root package name */
    public static ny4.e f274762e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2614xca6eae71.s f274763f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f274764g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f274765h;

    static {
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a);
        p3325xe03a0797.p3326xc267989b.z0.c(a17, null);
        f274760c = a17;
        f274761d = new p3325xe03a0797.p3326xc267989b.p3332x361a9b.k(true);
        f274763f = new com.p314xaae8f345.mm.p2614xca6eae71.s(0L, 0L, 0, 0L, 0L, 0L, 0L, 127, null);
        f274765h = true;
    }

    public static final ny4.e a(com.p314xaae8f345.mm.p2614xca6eae71.c0 c0Var) {
        c0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "createRecognizer");
        ny4.e eVar = new ny4.e();
        boolean e17 = eVar.e(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "init ocr result: " + e17);
        if (e17) {
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:11:0x0066, B:13:0x006d, B:16:0x0078, B:20:0x0111, B:21:0x0085, B:24:0x008f, B:27:0x00a3, B:29:0x00ac, B:33:0x00bd, B:37:0x00c5, B:38:0x00c8, B:40:0x00cf, B:41:0x00e8, B:47:0x0119, B:48:0x011c, B:51:0x011e, B:52:0x0121, B:55:0x0123, B:56:0x0126, B:15:0x0071, B:26:0x0099, B:23:0x0089), top: B:10:0x0066, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:11:0x0066, B:13:0x006d, B:16:0x0078, B:20:0x0111, B:21:0x0085, B:24:0x008f, B:27:0x00a3, B:29:0x00ac, B:33:0x00bd, B:37:0x00c5, B:38:0x00c8, B:40:0x00cf, B:41:0x00e8, B:47:0x0119, B:48:0x011c, B:51:0x011e, B:52:0x0121, B:55:0x0123, B:56:0x0126, B:15:0x0071, B:26:0x0099, B:23:0x0089), top: B:10:0x0066, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(com.p314xaae8f345.mm.p2614xca6eae71.c0 r20, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.c0.b(com.tencent.mm.smiley.c0, com.tencent.mm.storage.emotion.EmojiInfo):boolean");
    }

    public final com.p314xaae8f345.mm.p2614xca6eae71.t c(android.graphics.Bitmap bitmap) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        return new com.p314xaae8f345.mm.p2614xca6eae71.t(allocateDirect, bitmap.getWidth(), bitmap.getHeight());
    }

    public final void d(boolean z17) {
        if (f274762e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiOcrService", "already started!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "start: " + z17);
        com.p314xaae8f345.mm.p2614xca6eae71.s sVar = f274763f;
        sVar.f274899e = 0L;
        sVar.f274900f = 0L;
        sVar.f274901g = 0L;
        sVar.f274895a = 0L;
        sVar.f274896b = 0L;
        sVar.f274897c = 0;
        sVar.f274898d = 0L;
        p3325xe03a0797.p3326xc267989b.f2 a17 = p3325xe03a0797.p3326xc267989b.w3.a(1, "emoji-ocr");
        p3325xe03a0797.p3326xc267989b.y0 a18 = p3325xe03a0797.p3326xc267989b.z0.a(a17);
        f274760c = a18;
        f274759b = a17;
        p3325xe03a0797.p3326xc267989b.l.d(a18, null, null, new com.p314xaae8f345.mm.p2614xca6eae71.y(z17, null), 3, null);
    }

    public final void e(yz5.a onCompeted) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCompeted, "onCompeted");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "stop: " + p3325xe03a0797.p3326xc267989b.z0.h(f274760c));
        f274765h = true;
        if (f274759b != null) {
            p3325xe03a0797.p3326xc267989b.l.d(f274760c, null, null, new com.p314xaae8f345.mm.p2614xca6eae71.b0(onCompeted, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiOcrService", "the job has been already finished");
            onCompeted.mo152xb9724478();
        }
    }
}
