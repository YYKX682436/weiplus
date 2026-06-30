package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f290300d = null;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f290301e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f290302f;

    public h1(android.content.Context context, java.lang.String str) {
        this.f290301e = context;
        this.f290302f = str;
    }

    public final void a(java.util.List list, java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (str.length() > 0 && str.substring(str.length() - 1, str.length()).matches("[_0-9a-zA-Z]$")) {
                list.add(str);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneHelper", "[onTextChanged]");
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        java.lang.String substring = valueOf.substring(i17, i19 + i17);
        boolean z17 = false;
        if (i17 >= 0 && valueOf.length() > i17) {
            if (i17 != 0 && valueOf.substring(i17 - 1, i17).matches("[_0-9a-zA-Z]$")) {
                if (this.f290300d == null) {
                    this.f290300d = new java.util.LinkedList();
                    a(this.f290300d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559546a0));
                    a(this.f290300d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559547a1));
                }
                java.lang.String substring2 = valueOf.substring(0, i17);
                java.util.Iterator it = this.f290300d.iterator();
                while (it.hasNext()) {
                    if (substring2.endsWith((java.lang.String) it.next())) {
                    }
                }
            }
            z17 = true;
            break;
        }
        if (z17 && "@".equals(substring)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(this.f290302f);
            com.p314xaae8f345.mm.ui.i1.f290426c = i17 + 1;
            com.p314xaae8f345.mm.ui.i1.f290429f = true;
            rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
            android.content.Context context = this.f290301e;
            android.content.Intent wi6 = ((qd0.u0) g1Var).wi((android.app.Activity) context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3q), this.f290302f, m17, "");
            wi6.putExtra("showSource", 1);
            wi6.putExtra("key_result_receiver", new com.p314xaae8f345.mm.ui.C21347xb96b140b(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper())));
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = context;
            cVar.d(wi6);
            cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
            cVar.h(229);
        }
    }
}
