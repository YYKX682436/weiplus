package com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/wedrop/ui/view/PermissionAreaView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Liq5/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feature-wedrop_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.wedrop.ui.view.PermissionAreaView */
/* loaded from: classes5.dex */
public final class C22930x873617e1 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<iq5.a> {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f295824f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22930x873617e1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f295824f = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        g(linearLayout, m48328xa0ab20ce());
        return linearLayout;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        iq5.a aVar = (iq5.a) pVar;
        iq5.a aVar2 = (iq5.a) pVar2;
        if (aVar2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar, aVar2)) {
            return;
        }
        android.view.View contentView = getContentView();
        android.widget.LinearLayout linearLayout = contentView instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) contentView : null;
        if (linearLayout != null) {
            ((java.util.ArrayList) this.f295824f).clear();
            linearLayout.removeAllViews();
            g(linearLayout, aVar2);
        }
    }

    public final void g(android.widget.LinearLayout parent, iq5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (aVar != null) {
            java.util.List<iq5.d> list = aVar.f375336e;
            boolean z17 = true;
            if (!list.isEmpty()) {
                java.lang.String str = aVar.f375335d;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                }
                if (!z17) {
                    android.widget.TextView textView = new android.widget.TextView(getContext());
                    textView.setText(str);
                    textView.setTextColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ahg));
                    textView.setTextSize(14.0f);
                    textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
                    textView.setPadding(0, 0, 0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
                    parent.addView(textView);
                }
                h(parent);
                for (iq5.d dVar : list) {
                    android.content.Context context = getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22931x315eebc8 c22931x315eebc8 = new com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2814x373aa5.C22931x315eebc8(context, null);
                    c22931x315eebc8.m48330xfcfee142(dVar);
                    c22931x315eebc8.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
                    parent.addView(c22931x315eebc8);
                    ((java.util.ArrayList) this.f295824f).add(c22931x315eebc8);
                    h(parent);
                }
            }
        }
    }

    public final void h(android.widget.LinearLayout parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View view = new android.view.View(getContext());
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, 1));
        view.setBackgroundColor(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560846vt));
        parent.addView(view);
    }
}
