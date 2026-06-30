package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference */
/* loaded from: classes8.dex */
public class ViewOnClickListenerC19710x6eeb8653 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements android.view.View.OnClickListener {
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 L;
    public android.view.View M;

    public ViewOnClickListenerC19710x6eeb8653(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/PhoneNumPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.L.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.M == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 c19650x84c3dde8 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8(u17.getContext(), this);
            this.L = c19650x84c3dde8;
            viewGroup2.addView(c19650x84c3dde8, new android.widget.AbsListView.LayoutParams(-1, -2));
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19650x84c3dde8 c19650x84c3dde82 = this.L;
            c19650x84c3dde82.f271345d = null;
            c19650x84c3dde82.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", null, null);
            c19650x84c3dde82.f271347e = null;
            c19650x84c3dde82.f271348f = null;
            c19650x84c3dde82.b();
            this.M = u17;
        }
        return this.M;
    }

    public ViewOnClickListenerC19710x6eeb8653(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
