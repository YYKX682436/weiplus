package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class w60 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60 f217841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.x60 x60Var) {
        super(0);
        this.f217841d = x60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f217841d.f217938b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.air, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nep);
        if (textView != null) {
            textView.setTag(java.lang.Float.valueOf(0.5f));
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.neq);
        if (textView2 != null) {
            textView2.setTag(java.lang.Float.valueOf(1.0f));
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ner);
        if (textView3 != null) {
            textView3.setTag(java.lang.Float.valueOf(1.25f));
        }
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nes);
        if (textView4 != null) {
            textView4.setTag(java.lang.Float.valueOf(1.5f));
        }
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.net);
        if (textView5 != null) {
            textView5.setTag(java.lang.Float.valueOf(2.0f));
        }
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rb9);
        if (textView6 != null) {
            textView6.setTag(java.lang.Float.valueOf(3.0f));
        }
        return inflate;
    }
}
