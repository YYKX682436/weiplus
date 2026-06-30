package zv;

/* loaded from: classes11.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557599e;

    public o2(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, java.lang.String str) {
        this.f557598d = c10465x1b7ee7d;
        this.f557599e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23413x332f291 c23413x332f291 = this.f557598d.f146723e;
        if (c23413x332f291 != null) {
            java.lang.String cardId = this.f557599e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cardId, "$cardId");
            c23413x332f291.m86240x343e4b95(cardId, zv.n2.f557593d);
        }
    }
}
