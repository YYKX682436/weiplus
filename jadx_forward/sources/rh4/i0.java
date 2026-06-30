package rh4;

/* loaded from: classes8.dex */
public class i0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 f477274d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80) {
        this.f477274d = c18566x5b11ed80;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f477274d.f254244f2).size() + 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        this.f477274d.getClass();
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f477274d.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569679ig, viewGroup, false);
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        return new cl1.z(inflate);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(cl1.a aVar, int i17) {
        if (aVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.p2259x756f7ee5.p2261x6bc5093.C18566x5b11ed80 c18566x5b11ed80 = this.f477274d;
        int i18 = c18566x5b11ed80.f254254p2;
        cl1.z zVar = (cl1.z) aVar;
        android.widget.TextView textView = zVar.f124440i;
        textView.setTextColor(i18);
        java.util.ArrayList arrayList = (java.util.ArrayList) c18566x5b11ed80.f254244f2;
        cl1.n0 n0Var = i17 >= arrayList.size() ? null : (cl1.n0) arrayList.get(i17);
        if (n0Var == null) {
            return;
        }
        aVar.f124382d = n0Var;
        if (aVar.m8185xcdaf1228() != 2) {
            aVar.i(new rh4.h0(this, aVar, n0Var), null);
            c18566x5b11ed80.r1(aVar);
            cl1.m0 m0Var = c18566x5b11ed80.f254251m2;
            if (m0Var == null || m0Var.m15086x4905e9fa() != c18566x5b11ed80) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12768x381d68c7) c18566x5b11ed80.f254251m2).i(aVar, i17);
            return;
        }
        rh4.g0 g0Var = new rh4.g0(this);
        zVar.j();
        textView.setVisibility(4);
        android.widget.ImageView imageView = zVar.f124438g;
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562885r5);
        imageView.setAlpha(0.1f);
        android.widget.ImageView imageView2 = zVar.f124437f;
        imageView2.getLayoutParams().width = (int) (i65.a.f(zVar.k(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561460j7) * i65.a.q(zVar.k()));
        imageView2.getLayoutParams().height = (int) (i65.a.f(zVar.k(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561460j7) * i65.a.q(zVar.k()));
        imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f79813xc8512e6d);
        imageView2.setColorFilter(new android.graphics.PorterDuffColorFilter(i65.a.d(zVar.k(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d), android.graphics.PorterDuff.Mode.SRC_ATOP));
        zVar.f124441m.setVisibility(8);
        zVar.f3639x46306858.setOnClickListener(g0Var);
        zVar.f3639x46306858.setOnLongClickListener(null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        cl1.a aVar = (cl1.a) k3Var;
        if (list.size() == 0) {
            mo864xe5e2e48d(aVar, i17);
        }
    }
}
