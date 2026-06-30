package vi1;

/* loaded from: classes7.dex */
public final class p3 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f518963a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(vi1.z3 z3Var, long j17, long j18) {
        super(j17, j18);
        this.f518963a = z3Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f518963a.t();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        vi1.z3 z3Var = this.f518963a;
        z3Var.f519062s.setText(z3Var.f519050d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571677m5, "" + (j17 / 1000)));
    }
}
