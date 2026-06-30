package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class qd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f214423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165) {
        super(0);
        this.f214423d = c15317x5870b165;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float m62173xb87cdfa8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165 = this.f214423d;
        android.widget.TextView textView = (android.widget.TextView) c15317x5870b165.findViewById(com.p314xaae8f345.mm.R.id.rgj);
        if (textView == null) {
            return null;
        }
        m62173xb87cdfa8 = c15317x5870b165.m62173xb87cdfa8();
        textView.setTextSize(1, m62173xb87cdfa8);
        return textView;
    }
}
