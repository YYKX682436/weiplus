package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class bc implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f280263d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb f280264e;

    public bc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21661x911db8dc c21661x911db8dc) {
        this.f280264e = jbVar;
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

    public final boolean b(java.lang.String str, int i17) {
        if (str == null || i17 < 0 || str.length() <= i17) {
            return false;
        }
        if (i17 == 0 || !str.substring(i17 - 1, i17).matches("[_0-9a-zA-Z]$")) {
            return true;
        }
        if (this.f280263d == null) {
            this.f280263d = new java.util.LinkedList();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = this.f280264e;
            a(this.f280263d, jbVar.f280113d.f542250l.m78652xba8c474f().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559546a0));
            a(this.f280263d, jbVar.f280113d.f542250l.m78652xba8c474f().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559547a1));
        }
        java.lang.String substring = str.substring(0, i17);
        java.util.Iterator it = this.f280263d.iterator();
        while (it.hasNext()) {
            if (substring.endsWith((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bc.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
