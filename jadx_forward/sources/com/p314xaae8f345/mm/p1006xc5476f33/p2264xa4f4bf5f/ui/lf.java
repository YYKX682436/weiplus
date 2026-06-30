package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class lf extends oa.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf f255593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf tfVar) {
        super(c1190x18d3c3fe);
        this.f255593e = tfVar;
    }

    @Override // oa.l, oa.c
    public void l4(oa.i iVar) {
        int i17 = iVar != null ? iVar.f425315e : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf tfVar = this.f255593e;
        if (i17 == 0) {
            tfVar.f255864m = iVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.O6(tfVar, iVar) : 0;
        } else if (i17 == 1) {
            tfVar.f255863i = iVar != null ? com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.O6(tfVar, iVar) : 0;
        }
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.P6(tfVar, iVar, false);
        }
        tfVar.T6(iVar != null ? iVar.f425315e : -1);
        if ((iVar != null ? iVar.f425315e : -1) == 1) {
            ni4.x.f419309d.o();
        }
        tfVar.U6(iVar != null ? iVar.f425315e : -1);
    }

    @Override // oa.l, oa.c
    public void u1(oa.i tab) {
        int O6;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f425332d.m8316x940d026a(tab.f425315e);
        int i18 = tab.f425315e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf tfVar = this.f255593e;
        if (!tfVar.f255861g) {
            if (i18 == 0) {
                O6 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.O6(tfVar, tab);
                i17 = tfVar.f255863i;
            } else if (i18 != 1) {
                O6 = 0;
                i17 = 0;
            } else {
                i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.O6(tfVar, tab);
                O6 = tfVar.f255864m;
            }
            android.app.Activity context = tfVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(hi4.m.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            hi4.m mVar = (hi4.m) a17;
            hi4.m.O6(mVar, tab.f425315e == 0 ? 2 : 3, O6, i17, 0, 8, null);
            mVar.f363091e++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.P6(tfVar, tab, true);
    }
}
