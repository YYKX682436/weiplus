package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ub0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f196080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f196081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, boolean z17) {
        super(0);
        this.f196080d = dc0Var;
        this.f196081e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f196080d;
        android.view.ViewGroup viewGroup = dc0Var.f193792i;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r3d);
        android.view.ViewGroup viewGroup2 = dc0Var.f193792i;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.r3e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.content.Context context = dc0Var.f193787d;
        android.widget.ImageView imageView = dc0Var.f193798r;
        if (this.f196081e) {
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnIconView");
                throw null;
            }
            imageView.setVisibility(0);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5o));
            java.lang.String str = dc0Var.f193796p;
            if (str == null) {
                str = dc0Var.f193795o;
            }
            textView2.setText(str);
        } else {
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnIconView");
                throw null;
            }
            imageView.setVisibility(8);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5n));
            textView2.setText(dc0Var.f193795o);
        }
        return jz5.f0.f384359a;
    }
}
