package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class x1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f272267d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272268e;

    public x1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272268e = c19666xfd6e2f33;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272268e;
        android.text.Editable text = c19666xfd6e2f33.f271554m.getText();
        java.util.List list = this.f272267d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
        }
        ((java.util.LinkedList) list).clear();
        java.lang.String text2 = c19666xfd6e2f33.f271554m.getText().toString();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272719u.matcher(text2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(c19666xfd6e2f33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
            ((java.util.LinkedList) list).add(foregroundColorSpan);
            text.setSpan(foregroundColorSpan, start, end, 33);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
        if (y4Var != null && y4Var.a() != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho) ((sb5.o2) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.o2.class));
            hoVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text2, "text");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(text2, hoVar.f280724u)) {
                boolean z17 = text2.length() == 0;
                java.lang.Runnable runnable = hoVar.f280729z;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = hoVar.f280728y;
                if (z17) {
                    hoVar.u0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280909d);
                    n3Var.mo50300x3fa464aa(runnable);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = hoVar.f280716m;
                    if (c21668xed8974f2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
                        throw null;
                    }
                    c21668xed8974f2.m79447xac166b75("");
                } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(text2, hoVar.f280723t) && hoVar.n0() != -1) {
                    hoVar.u0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280910e);
                    n3Var.mo50300x3fa464aa(runnable);
                    n3Var.mo50297x7c4d7ca2(runnable, 300L);
                }
                hoVar.f280724u = text2;
            }
        }
        if (c19666xfd6e2f33.f271562n3) {
            c19666xfd6e2f33.f271554m.mo81584x764b0e09("");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
