package ns4;

/* loaded from: classes8.dex */
public final class t0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421188d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421188d = activityC19066x54c41420;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.ma7 ma7Var = (r45.ma7) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421188d;
        if (ma7Var == null) {
            android.view.ViewGroup viewGroup = activityC19066x54c41420.f260692q;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cutTaxEntrace");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup2 = activityC19066x54c41420.f260692q;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cutTaxEntrace");
            throw null;
        }
        viewGroup2.setVisibility(0);
        android.widget.TextView textView = activityC19066x54c41420.f260693r;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cutTaxTitle");
            throw null;
        }
        textView.setText(ma7Var.f461848d);
        android.widget.TextView textView2 = activityC19066x54c41420.f260694s;
        if (textView2 != null) {
            textView2.setText(ma7Var.f461849e);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cutTaxDesc");
            throw null;
        }
    }
}
