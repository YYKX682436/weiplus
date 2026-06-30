package my2;

/* loaded from: classes3.dex */
public final class j0 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f414274a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(my2.k0 k0Var, long j17) {
        super(j17, 1000L);
        this.f414274a = k0Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        my2.k0 k0Var = this.f414274a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15384x34dfb03b c15384x34dfb03b = k0Var.f414277q;
        if (c15384x34dfb03b != null) {
            c15384x34dfb03b.setVisibility(0);
        }
        android.widget.TextView textView = k0Var.f414283w;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        my2.k0 k0Var = this.f414274a;
        k0Var.B++;
        android.widget.TextView textView = k0Var.f414283w;
        if (textView == null) {
            return;
        }
        textView.setText(k0Var.f446856d.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573419ej4, no0.l.a(no0.m.f420263a, k0Var.C - k0Var.B, ":", false, false, false, 24, null)));
    }
}
