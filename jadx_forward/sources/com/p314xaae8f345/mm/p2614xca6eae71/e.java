package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f274769b = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.C21034x994f880c f274770a;

    static {
        lp0.b.s();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener] */
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.mm.p2614xca6eae71.C21034x994f880c c21034x994f880c = this.f274770a;
        if (c21034x994f880c != null) {
            c21034x994f880c.mo48814x2efc64();
        }
        ?? r17 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>(this) { // from class: com.tencent.mm.smiley.EmojiDrawableBitmapRepo$MMTrimMemoryEventListener

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f274743d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this, "target");
                this.f274743d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 708811463;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 event = c5697xfda8a2d7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (((com.p314xaae8f345.mm.p2614xca6eae71.e) this.f274743d.get()) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiDrawableBitmapRepo", "received MMTrimMemoryEvent: EmojiDrawableBitmapRepo");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("received MMTrimMemoryEvent: clear cache size:");
                    gr.q qVar = gr.q.f356209a;
                    gr.r rVar = gr.q.f356210b;
                    sb6.append(rVar.b(false));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiDrawableBitmapRepo", sb6.toString());
                    rVar.a(false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDrawableBitmapRepo", "received MMTrimMemoryEvent: EmojiDrawableBitmapRepo was gone");
                    mo48814x2efc64();
                    int i17 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
                    com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a.f274770a = null;
                }
                return false;
            }
        };
        this.f274770a = r17;
        r17.mo48813x58998cd();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable a(com.p314xaae8f345.mm.p2614xca6eae71.a1 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.e.a(com.tencent.mm.smiley.a1, boolean):android.graphics.drawable.Drawable");
    }
}
