package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f;

/* loaded from: classes3.dex */
public final class c extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f272482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f272482d = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.b(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.util.ArrayList arrayList = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) m158354x19263085 : null;
        if (abstractActivityC16711x120e7ae0 != null) {
            abstractActivityC16711x120e7ae0.mo54450xbf7c1df6("");
            abstractActivityC16711x120e7ae0.mo78530x8b45058f();
            abstractActivityC16711x120e7ae0.mo78529xe76c1b79();
            p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC16711x120e7ae0.mo2533x106ab264();
            if (mo2533x106ab264 != null) {
                mo2533x106ab264.o();
            }
            ul5.k m78511x9f88d943 = abstractActivityC16711x120e7ae0.m78511x9f88d943();
            if (m78511x9f88d943 != null) {
                m78511x9f88d943.mo82163x4e0f6657(false);
            }
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekx, (android.view.ViewGroup) null);
        em.p2 p2Var = (em.p2) ((jz5.n) this.f272482d).mo141623x754a37bb();
        if (p2Var.f336236b == null) {
            p2Var.f336236b = (android.widget.FrameLayout) p2Var.f336235a.findViewById(com.p314xaae8f345.mm.R.id.gyb);
        }
        p2Var.f336236b.addView(inflate);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = m158359x1e885992().getStringArrayListExtra("KEY_SIMPLE_MSG_ITEM");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get msgInfoStrs count: ");
        sb6.append(stringArrayListExtra != null ? java.lang.Integer.valueOf(stringArrayListExtra.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiShareHeaderUIC", sb6.toString());
        if (stringArrayListExtra != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
            for (java.lang.String str : stringArrayListExtra) {
                u15.a aVar = new u15.a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                aVar.m126728xdc93280d(str);
                arrayList.add(aVar);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : 1);
            textView.setText(m80379x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ols, objArr));
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cwk);
        if (textView2 != null) {
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p2484x1c644e5f.a(arrayList, this));
        }
    }
}
