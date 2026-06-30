package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class s1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f176905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176906e;

    public s1(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf) {
        this.f176905d = list;
        this.f176906e = activityC13074xfcf8fabf;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f176905d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.xt xtVar = (r45.xt) obj;
            g4Var.add(0, i17, 1, xtVar.f471917d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f176906e.f176802i, "Icon menu content, index: " + i17 + ", wording: " + xtVar.f471917d + ", jumpType:" + xtVar.f471918e + ' ');
            i17 = i18;
        }
    }
}
