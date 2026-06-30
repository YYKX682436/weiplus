package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class xk0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 f196634d;

    public xk0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 yk0Var) {
        this.f196634d = yk0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk0 yk0Var = this.f196634d;
        if (!yk0Var.w1()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yk0Var.v1(), "singSongGiftSelect.observe - Plugin not available, skip");
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
            int i17 = ((mm2.m6) yk0Var.S0().a(mm2.m6.class)).f410781p ? com.p314xaae8f345.mm.R.C30867xcad56011.efb : com.p314xaae8f345.mm.R.C30867xcad56011.p1r;
            android.view.ViewGroup viewGroup = yk0Var.f446856d;
            android.content.Context context = viewGroup.getContext();
            java.lang.String string = viewGroup.getContext().getResources().getString(i17);
            java.lang.Boolean bool2 = db5.t7.f310051a;
            android.widget.Toast makeText = android.widget.Toast.makeText(context, "", 0);
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(com.p314xaae8f345.mm.R.raw.f79590x301f7106);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
            textView.setText(string);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new db5.o7(textView, context));
            makeText.setGravity(17, 0, 0);
            makeText.setView(inflate);
            makeText.show();
        }
    }
}
