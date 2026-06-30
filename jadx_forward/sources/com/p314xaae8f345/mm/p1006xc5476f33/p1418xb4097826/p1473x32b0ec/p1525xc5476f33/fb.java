package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class fb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f194066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(android.view.ViewGroup viewGroup) {
        super(0);
        this.f194066d = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f194066d;
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        textView.setTextSize(0, i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
        textView.setGravity(17);
        textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0j);
        viewGroup.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb.f193926d);
        return textView;
    }
}
