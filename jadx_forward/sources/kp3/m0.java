package kp3;

/* loaded from: classes12.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f392544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kp3.p0 p0Var) {
        super(1);
        this.f392544d = p0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[setFinishBlurIv] get effectBitmap:" + bitmap);
        ((ku5.t0) ku5.t0.f394148d).B(new kp3.l0(this.f392544d, bitmap));
        return jz5.f0.f384359a;
    }
}
