package wx0;

/* loaded from: classes5.dex */
public final class r0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.s0 f532068a;

    public r0(wx0.s0 s0Var) {
        this.f532068a = s0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        this.f532068a.c(i17 == com.p314xaae8f345.mm.R.id.rpa ? wx0.m0.f532045d : i17 == com.p314xaae8f345.mm.R.id.f568313s46 ? wx0.m0.f532046e : i17 == com.p314xaae8f345.mm.R.id.s8e ? wx0.m0.f532047f : wx0.m0.f532045d);
    }
}
