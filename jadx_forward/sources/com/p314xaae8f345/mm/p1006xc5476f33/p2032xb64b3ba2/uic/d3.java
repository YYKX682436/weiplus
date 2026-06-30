package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class d3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(vx3.i desc, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        wx3.a.c(4L, pm0.v.u(desc.f522831o), 2, username, false, false, 48, null);
    }

    public final void P6(vx3.i desc, java.lang.String str, boolean z17) {
        int i17;
        java.lang.String valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        long j17 = desc.f522831o;
        if (j17 != 0) {
            i17 = 2;
        } else if (desc.f522833q == 0) {
            return;
        } else {
            i17 = 1;
        }
        if (i17 == 1) {
            valueOf = java.lang.String.valueOf(desc.f522833q);
        } else if (i17 != 2) {
            return;
        } else {
            valueOf = pm0.v.u(j17);
        }
        wx3.a.b(2L, valueOf, i17, str, desc.f522830n, z17);
    }

    public final void Q6(vx3.i desc, java.lang.String str, boolean z17) {
        java.lang.String str2;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        int i18 = desc.f522833q;
        if (i18 != 0) {
            str2 = java.lang.String.valueOf(i18);
            i17 = 1;
        } else {
            long j17 = desc.f522831o;
            if (j17 != 0) {
                str2 = pm0.v.u(j17);
                i17 = 2;
            } else {
                str2 = "0";
                i17 = 3;
            }
        }
        wx3.a.c(1L, str2, i17, str, false, z17, 16, null);
    }

    public final void R6(vx3.i iVar, java.lang.String str, boolean z17) {
        int i17;
        java.lang.String valueOf;
        if (iVar == null) {
            return;
        }
        long j17 = iVar.f522831o;
        if (j17 != 0) {
            i17 = 2;
        } else if (iVar.f522833q == 0) {
            return;
        } else {
            i17 = 1;
        }
        if (i17 == 1) {
            valueOf = java.lang.String.valueOf(iVar.f522833q);
        } else if (i17 != 2) {
            return;
        } else {
            valueOf = pm0.v.u(j17);
        }
        wx3.a.b(3L, valueOf, i17, str, iVar.f522830n, z17);
    }
}
