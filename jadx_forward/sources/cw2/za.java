package cw2;

/* loaded from: classes10.dex */
public final class za extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.ab f305681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(cw2.ab abVar) {
        super(3000L, 1000L);
        this.f305681a = abVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        cw2.ab abVar = this.f305681a;
        abVar.f305107e.setVisibility(8);
        ju3.d0.k(abVar.f305106d, ju3.c0.A, null, 2, null);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        this.f305681a.f305108f.setText(java.lang.String.valueOf(a06.d.b(((float) j17) / 1000.0f)));
    }
}
