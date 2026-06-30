package xu2;

/* loaded from: classes3.dex */
public final class t extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu2.u f538762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xu2.u uVar, long j17) {
        super(j17, 100L);
        this.f538762a = uVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        xu2.u uVar = this.f538762a;
        ((mm2.c1) uVar.S0().a(mm2.c1.class)).O5 = uVar.V0().f390662d.Z;
        android.widget.TextView textView = uVar.f538770w;
        if (textView == null) {
            return;
        }
        textView.setVisibility(4);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        xu2.u uVar = this.f538762a;
        ((mm2.c1) uVar.S0().a(mm2.c1.class)).O5 = (int) ((uVar.V0().f390662d.Z - (j17 / 1000)) - 1);
        if (!uVar.V0().f390662d.Y || uVar.u1() <= 0) {
            android.widget.TextView textView = uVar.f538770w;
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        android.widget.TextView textView2 = uVar.f538770w;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }
}
