package cj5;

/* loaded from: classes.dex */
public final class z4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.c5 f123822d;

    public z4(cj5.c5 c5Var) {
        this.f123822d = c5Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f544710a : null) == ym3.p.f544714f) {
            cj5.c5 c5Var = this.f123822d;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = c5Var.T6().k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            if (((a17 == null || (arrayList = a17.f233598o) == null) ? 0 : arrayList.size()) > 0) {
                c5Var.T6().d().setVisibility(8);
                return;
            }
            if (!c5Var.f123621e) {
                c5Var.f123621e = true;
                android.widget.FrameLayout d17 = c5Var.T6().d();
                if (d17 != null) {
                    android.view.View inflate = android.view.LayoutInflater.from(d17.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpc, (android.view.ViewGroup) null);
                    if (inflate != null) {
                        inflate.setOnClickListener(new cj5.y4(c5Var));
                    }
                    d17.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
                }
            }
            c5Var.T6().d().setVisibility(0);
        }
    }
}
