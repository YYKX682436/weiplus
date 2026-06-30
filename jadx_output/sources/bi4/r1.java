package bi4;

/* loaded from: classes11.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.d1 f21082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f21083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(bi4.d1 d1Var, android.os.ResultReceiver resultReceiver) {
        super(1);
        this.f21082d = d1Var;
        this.f21083e = resultReceiver;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(it);
        bi4.s1.c(this.f21082d, this.f21083e, it, n07.outWidth, n07.outHeight);
        return jz5.f0.f302826a;
    }
}
