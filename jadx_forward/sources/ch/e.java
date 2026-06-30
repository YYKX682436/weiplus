package ch;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch.f f122713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ch.f fVar, java.lang.String str) {
        super(1);
        this.f122713d = fVar;
        this.f122714e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        final byte[] data = (byte[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        final com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f122713d.f122716b;
        c4209xd2d3ddad.getClass();
        final java.lang.String str = this.f122714e;
        c4209xd2d3ddad.n(new java.lang.Runnable() { // from class: yg.i$$b
            @Override // java.lang.Runnable
            public final void run() {
                r2.m34749x99cfef35(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.this.f130110a, str, data);
            }
        });
        return jz5.f0.f384359a;
    }
}
