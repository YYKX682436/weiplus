package ch;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch.f f41180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ch.f fVar, java.lang.String str) {
        super(1);
        this.f41180d = fVar;
        this.f41181e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        final byte[] data = (byte[]) obj;
        kotlin.jvm.internal.o.g(data, "data");
        final com.tencent.magicbrush.MagicBrush magicBrush = this.f41180d.f41183b;
        magicBrush.getClass();
        final java.lang.String str = this.f41181e;
        magicBrush.n(new java.lang.Runnable() { // from class: yg.i$$b
            @Override // java.lang.Runnable
            public final void run() {
                r2.nativeNotifyLoadDataFromURL(com.tencent.magicbrush.MBRuntime.this.f48577a, str, data);
            }
        });
        return jz5.f0.f302826a;
    }
}
