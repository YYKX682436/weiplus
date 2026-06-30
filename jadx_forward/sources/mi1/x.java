package mi1;

/* loaded from: classes7.dex */
public final class x extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f408255d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f408256e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f408257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        super(runtime.r0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f408255d = runtime;
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aln, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qtu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qts);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f408256e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qtt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f408257f = findViewById3;
        ((android.widget.TextView) findViewById).setText(runtime.u0().L1.R);
        findViewById2.setOnClickListener(new mi1.w(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b c11818x81f6960b = runtime.u0().L1.S;
        if (c11818x81f6960b != null) {
            c11818x81f6960b.b();
        }
    }
}
