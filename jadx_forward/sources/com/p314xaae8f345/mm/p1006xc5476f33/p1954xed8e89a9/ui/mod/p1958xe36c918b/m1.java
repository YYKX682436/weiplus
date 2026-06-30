package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b;

/* loaded from: classes.dex */
public final class m1 extends kr3.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // kr3.t
    public boolean Z6() {
        return false;
    }

    @Override // kr3.t
    public android.view.View b7(java.lang.String username, com.p314xaae8f345.mm.p670x38b72420.o contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        java.util.List j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n2.f235073a.j(contact, m158359x1e885992());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(m80379x76847179());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, i65.a.f(linearLayout.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.anl));
        java.util.ArrayList arrayList = (java.util.ArrayList) j17;
        if (true ^ arrayList.isEmpty()) {
            android.view.View view = new android.view.View(m80379x76847179());
            view.setBackgroundColor(i65.a.d(view.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835));
            linearLayout.addView(view, -1, i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561174bg));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhonePreviewUI", "phone list size: " + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e3i, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sys)).setText(str);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.syr).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.k1(str, this));
            inflate.findViewById(com.p314xaae8f345.mm.R.id.syq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1958xe36c918b.l1(str, this));
            linearLayout.addView(inflate);
        }
        return linearLayout;
    }

    @Override // kr3.t
    public int k7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.gxv;
    }

    @Override // kr3.t, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onClickDialogSpaceOnHalfScreenMode */
    public boolean mo10662xe0085496() {
        X6();
        return false;
    }
}
