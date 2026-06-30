package wx0;

/* loaded from: classes5.dex */
public final class j0 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.k0 f532033a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j17, long j18, wx0.k0 k0Var) {
        super(j17, j18);
        this.f532033a = k0Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        if (this.f532033a.f532038m) {
            return;
        }
        this.f532033a.f532037i = null;
        wx0.g0 g0Var = this.f532033a.f532039n;
        if (g0Var != null) {
            mx0.p4 p4Var = (mx0.p4) g0Var;
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = p4Var.f413745c;
            m47319x71e92c1d = c10977x8e40eced.m47319x71e92c1d();
            m47319x71e92c1d.removeView(p4Var.f413744b);
            c10977x8e40eced.a1();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        wx0.g0 g0Var;
        if (this.f532033a.f532038m || (g0Var = this.f532033a.f532039n) == null) {
            return;
        }
        mx0.p4 p4Var = (mx0.p4) g0Var;
        android.animation.AnimatorSet animatorSet = p4Var.f413743a;
        animatorSet.cancel();
        animatorSet.start();
        p4Var.f413744b.setText(java.lang.String.valueOf(a06.d.b(((float) j17) / 1000.0f)));
    }
}
