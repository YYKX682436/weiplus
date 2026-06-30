package qm2;

/* loaded from: classes3.dex */
public final class c implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.e f446241d;

    public c(qm2.e eVar) {
        this.f446241d = eVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.widget.TextView textView;
        java.lang.CharSequence text;
        r45.q12 q12Var = (r45.q12) obj;
        boolean z17 = (q12Var != null ? q12Var.m75939xb282bd08(0) : 0) == 2 && (q12Var != null ? q12Var.m75939xb282bd08(1) : 0) == 16;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveMicTopicUIC", "liveModeCollect: " + q12Var + ", isChatVoiceRoomMode: " + z17);
        qm2.e eVar = this.f446241d;
        if (z17) {
            android.view.ViewGroup viewGroup = eVar.f446245e;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            gk2.e eVar2 = eVar.f446244d;
            java.lang.String str = null;
            java.lang.String str2 = eVar2 != null ? ((mm2.g1) eVar2.a(mm2.g1.class)).A : null;
            if (!(str2 == null || str2.length() == 0)) {
                android.widget.TextView textView2 = eVar.f446246f;
                if (textView2 != null && (text = textView2.getText()) != null) {
                    str = text.toString();
                }
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2) && (textView = eVar.f446246f) != null) {
                    textView.setText(str2);
                }
            }
        } else {
            android.view.ViewGroup viewGroup2 = eVar.f446245e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
