package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class h2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f261832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i2 f261833b;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i2 i2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f261833b = i2Var;
        this.f261832a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f261832a;
        c0Var.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.i2 i2Var = this.f261833b;
        if (z17) {
            java.lang.String str = (java.lang.String) obj;
            i2Var.f261860d.U1.m83213x765074af(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = i2Var.f261860d;
            boolean z18 = !str.equals(activityC19108xd69d11c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kki));
            java.util.Iterator it = ((java.util.ArrayList) activityC19108xd69d11c7.V1).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) it.next();
                if (!z18 || !c19097xe6dc5b4c.b()) {
                    if (!z18) {
                        if (2 == c19097xe6dc5b4c.f261191r) {
                        }
                    }
                }
                activityC19108xd69d11c7.W = c19097xe6dc5b4c;
                activityC19108xd69d11c7.c7(false);
            }
        }
        i2Var.f261860d.W1 = c0Var.b();
    }
}
