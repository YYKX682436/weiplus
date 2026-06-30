package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class b9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f199385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f199386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f199387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(android.widget.TextView textView, android.view.View view, int i17) {
        super(1);
        this.f199385d = textView;
        this.f199386e = view;
        this.f199387f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View view = this.f199386e;
        int color = view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30);
        android.widget.TextView textView = this.f199385d;
        textView.setTextColor(color);
        if (this.f199387f == 2) {
            ne2.c cVar = ne2.c.f418060a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            textView.setText(cVar.a(context, intValue, 2));
        } else {
            ne2.c cVar2 = ne2.c.f418060a;
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            textView.setText(cVar2.a(context2, intValue, 1));
        }
        return jz5.f0.f384359a;
    }
}
