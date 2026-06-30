package k50;

/* loaded from: classes.dex */
public final class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f385768d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f385769e;

    public k0(java.util.List items, yz5.p onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f385768d = items;
        this.f385769e = onItemClick;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f385768d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.lang.Object obj = this.f385768d.get(i17);
        k50.m0 m0Var = obj instanceof k50.m0 ? (k50.m0) obj : null;
        if (m0Var != null) {
            return m0Var.f385774a.f385755e ? 1 : 0;
        }
        throw new java.lang.IllegalArgumentException("Expected ListItem.App at position " + i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f385768d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.forward.ForwardToOtherAppsSheetUIC.ListItem.App");
        k50.i0 i0Var = (k50.i0) holder;
        k50.h0 h0Var = ((k50.m0) obj).f385774a;
        android.widget.ImageView imageView = i0Var.f385759d;
        if (imageView != null) {
            imageView.setImageDrawable(h0Var.f385751a);
        }
        android.widget.TextView textView = i0Var.f385760e;
        if (textView != null) {
            textView.setText(h0Var.f385752b);
        }
        java.lang.String str = h0Var.f385754d;
        boolean z17 = str == null || str.length() == 0;
        android.widget.TextView textView2 = i0Var.f385761f;
        if (!z17) {
            if (textView2 != null) {
                textView2.setText(h0Var.f385754d);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        i0Var.f3639x46306858.setOnClickListener(new k50.j0(this, h0Var, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570643ef1, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new k50.i0(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570642ef0, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new k50.i0(inflate2);
    }
}
