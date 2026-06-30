package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class d1 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74532a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74533b;

    public d1(com.tencent.mm.plugin.address.ui.l1 l1Var, android.widget.TextView textView) {
        this.f74532a = l1Var;
        this.f74533b = textView;
    }

    @Override // u60.e
    public final void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        java.util.Objects.toString(addr);
        java.lang.String str = addr.f71215h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = addr.f71214g;
        }
        com.tencent.mm.plugin.address.ui.l1 l1Var = this.f74532a;
        com.tencent.mm.plugin.address.model.RcptItem h17 = l1Var.f74579t.h(addr.f71213f, str, addr.f71216i, addr.f71220p);
        if (h17 != null) {
            java.lang.String str2 = h17.f74371d;
            com.tencent.mm.plugin.address.model.RcptItem rcptItem = h17;
            while (true) {
                rcptItem = l1Var.f74579t.c(rcptItem.f74375h);
                if (rcptItem == null) {
                    break;
                }
                str2 = rcptItem.f74371d + ' ' + str2;
            }
            this.f74533b.setText(str2);
            android.widget.TextView textView = (android.widget.TextView) l1Var.findViewById(com.tencent.mm.R.id.f486807mj0);
            if (textView != null) {
                textView.setVisibility(0);
                textView.setOnClickListener(new com.tencent.mm.plugin.address.ui.c1(l1Var, h17));
            }
        }
    }
}
