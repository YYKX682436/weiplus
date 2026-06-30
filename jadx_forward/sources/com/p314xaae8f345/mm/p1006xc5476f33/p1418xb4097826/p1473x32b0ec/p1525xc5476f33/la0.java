package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class la0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ma0 f194904d;

    public la0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ma0 ma0Var) {
        this.f194904d = ma0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ma0 ma0Var = this.f194904d;
        android.view.ViewGroup viewGroup = ma0Var.f195011p;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.mxt);
        ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568473my3)).setVisibility(8);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79590x301f7106);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14363xcdb31e8e c14363xcdb31e8e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14363xcdb31e8e) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568475my4);
        c14363xcdb31e8e.setMaxWidth((int) (c14363xcdb31e8e.getTextSize() * 6));
        if (str == null || str.length() == 0) {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            c14363xcdb31e8e.setText(ma0Var.f446856d.getContext().getResources().getString(dk2.ef.f314917g ? com.p314xaae8f345.mm.R.C30867xcad56011.d5l : com.p314xaae8f345.mm.R.C30867xcad56011.f575315p20));
            c14363xcdb31e8e.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            c22699x3dcdb352.setVisibility(0);
        } else {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            c22699x3dcdb352.setVisibility(0);
            c14363xcdb31e8e.setText(str);
        }
        c14363xcdb31e8e.setSelected(true);
    }
}
