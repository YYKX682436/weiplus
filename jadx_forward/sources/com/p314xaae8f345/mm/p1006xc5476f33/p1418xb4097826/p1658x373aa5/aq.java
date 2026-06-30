package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class aq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq f213212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f213213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar, android.widget.EditText editText, android.view.View view) {
        super(0);
        this.f213212d = gqVar;
        this.f213213e = editText;
        this.f213214f = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq.i(this.f213212d, this.f213213e.getText().toString());
        android.view.View view = this.f213214f;
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b2z)).setEnabled(i17);
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.b2z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        r4Var.Y2((android.widget.TextView) findViewById, i17, false);
        return jz5.f0.f384359a;
    }
}
