package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class l9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 f197995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3) {
        super(0);
        this.f197995d = c14340xe0508cb3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14340xe0508cb3 c14340xe0508cb3 = this.f197995d;
        android.content.Context context = c14340xe0508cb3.f197608f;
        if (context == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.axi, c14340xe0508cb3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.view.ViewGroup) inflate).findViewById(com.p314xaae8f345.mm.R.id.fhi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        viewGroup.post(new d92.b(new d92.c(viewGroup, true)));
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.s27)).setTextSize(1, 14.0f);
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.fhh)).setTextSize(1, 14.0f);
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.tns)).setTextSize(1, 14.0f);
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.fhe)).setTextSize(1, 14.0f);
        return viewGroup;
    }
}
