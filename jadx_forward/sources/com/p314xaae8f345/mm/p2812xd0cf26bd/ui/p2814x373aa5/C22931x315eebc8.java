package com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/wedrop/ui/view/PermissionLineView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Liq5/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-wedrop_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.wedrop.ui.view.PermissionLineView */
/* loaded from: classes5.dex */
public final class C22931x315eebc8 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<iq5.d> {

    /* renamed from: f, reason: collision with root package name */
    public em.g4 f295825f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f295826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22931x315eebc8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eqr, (android.view.ViewGroup) null);
        this.f295825f = new em.g4(inflate);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        iq5.d dVar = (iq5.d) pVar2;
        if (dVar != null) {
            em.g4 g4Var = this.f295825f;
            if (g4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (g4Var.f335889b == null) {
                g4Var.f335889b = (android.widget.TextView) g4Var.f335888a.findViewById(com.p314xaae8f345.mm.R.id.u_i);
            }
            g4Var.f335889b.setText(java.lang.String.valueOf(dVar.f375339d));
            em.g4 g4Var2 = this.f295825f;
            if (g4Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (g4Var2.f335892e == null) {
                g4Var2.f335892e = (android.widget.TextView) g4Var2.f335888a.findViewById(com.p314xaae8f345.mm.R.id.u_k);
            }
            g4Var2.f335892e.setText(dVar.f375340e);
            em.g4 g4Var3 = this.f295825f;
            if (g4Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var3.a().setText(dVar.f375341f);
            g();
        }
    }

    public final boolean g() {
        yz5.a aVar;
        iq5.d m48328xa0ab20ce = m48328xa0ab20ce();
        boolean booleanValue = (m48328xa0ab20ce == null || (aVar = m48328xa0ab20ce.f375342g) == null) ? false : ((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue();
        this.f295826g = booleanValue;
        if (booleanValue) {
            em.g4 g4Var = this.f295825f;
            if (g4Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var.a().setVisibility(8);
            em.g4 g4Var2 = this.f295825f;
            if (g4Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var2.b().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nto));
            em.g4 g4Var3 = this.f295825f;
            if (g4Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var3.b().setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            em.g4 g4Var4 = this.f295825f;
            if (g4Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var4.f335888a.setOnClickListener(iq5.b.f375337d);
        } else {
            em.g4 g4Var5 = this.f295825f;
            if (g4Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var5.a().setVisibility(0);
            em.g4 g4Var6 = this.f295825f;
            if (g4Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var6.b().setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ntp));
            em.g4 g4Var7 = this.f295825f;
            if (g4Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var7.b().setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880));
            em.g4 g4Var8 = this.f295825f;
            if (g4Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            g4Var8.f335888a.setOnClickListener(new iq5.c(this));
        }
        return this.f295826g;
    }
}
