package ut4;

/* loaded from: classes15.dex */
public class b extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41 f512717d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41 c19182xecb10d41, ut4.a aVar) {
        this.f512717d = c19182xecb10d41;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) this.f512717d.f262779f.get(i17));
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        tt4.a[] aVarArr = this.f512717d.f262781h;
        if (aVarArr == null) {
            return 0;
        }
        return aVarArr.length;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.C19182xecb10d41 c19182xecb10d41 = this.f512717d;
        android.view.View view = (android.view.View) c19182xecb10d41.f262779f.get(i17);
        viewGroup.addView(view);
        tt4.a aVar = c19182xecb10d41.f262781h[i17];
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.iph);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_1);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h0_);
        imageView.setImageResource(aVar.f503571a);
        textView.setText(aVar.f503572b);
        textView2.setText(aVar.f503573c);
        return view;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
