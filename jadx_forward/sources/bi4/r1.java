package bi4;

/* loaded from: classes11.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bi4.d1 f102615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f102616e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(bi4.d1 d1Var, android.os.ResultReceiver resultReceiver) {
        super(1);
        this.f102615d = d1Var;
        this.f102616e = resultReceiver;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(it);
        bi4.s1.c(this.f102615d, this.f102616e, it, n07.outWidth, n07.outHeight);
        return jz5.f0.f384359a;
    }
}
