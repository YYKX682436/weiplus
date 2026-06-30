package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class g8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 f280616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var) {
        super(0);
        this.f280616d = y8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = this.f280616d;
        android.view.View F0 = y8Var.F0();
        android.widget.TextView textView = F0 != null ? (android.widget.TextView) F0.findViewById(com.p314xaae8f345.mm.R.id.vob) : null;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r));
        }
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f8(y8Var));
        }
        return textView;
    }
}
