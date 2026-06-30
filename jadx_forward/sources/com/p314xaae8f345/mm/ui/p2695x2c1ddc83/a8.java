package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes.dex */
public final class a8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b8 f288975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b8 b8Var) {
        super(1);
        this.f288975d = b8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String obj2 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) it.findViewById(com.p314xaae8f345.mm.R.id.kbq)).m79231xfb85ada3().toString();
        java.lang.Object parent = it.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((android.view.View) parent).getTag(com.p314xaae8f345.mm.R.id.apj), java.lang.Boolean.TRUE)) {
            obj2 = obj2 + (char) 65292 + this.f288975d.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.an8);
        }
        return obj2 + (char) 65292 + ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) it.findViewById(com.p314xaae8f345.mm.R.id.otg)).m79231xfb85ada3().toString() + (char) 65292 + ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) it.findViewById(com.p314xaae8f345.mm.R.id.f567011ht5)).m79231xfb85ada3().toString();
    }
}
