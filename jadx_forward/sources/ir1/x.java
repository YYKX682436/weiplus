package ir1;

/* loaded from: classes11.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr1.e f375599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.u f375600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hr1.e eVar, ir1.u uVar) {
        super(1);
        this.f375599d = eVar;
        this.f375600e = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            hr1.e eVar = this.f375599d;
            boolean z17 = true;
            if (eVar.f66330xa35b5abb > 0 && eVar.f66324x9b4f418d == 0) {
                java.lang.String str = eVar.f66326xbed8694c;
                if ((str == null || str.length() == 0) || (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizfansgreetholder@bizfansmsg") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizphotofansgreetholder@picfansmsg"))) {
                    z17 = false;
                }
                ir1.u uVar = this.f375600e;
                if (z17) {
                    uVar.f375589s.setVisibility(0);
                } else {
                    uVar.f375590t.setVisibility(0);
                    java.lang.String valueOf = java.lang.String.valueOf(eVar.f66330xa35b5abb);
                    android.widget.TextView textView = uVar.f375590t;
                    textView.setText(valueOf);
                    textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(uVar.f3639x46306858.getContext(), eVar.f66330xa35b5abb));
                    textView.setTextSize(0, i65.a.f(uVar.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(uVar.f3639x46306858.getContext()));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
