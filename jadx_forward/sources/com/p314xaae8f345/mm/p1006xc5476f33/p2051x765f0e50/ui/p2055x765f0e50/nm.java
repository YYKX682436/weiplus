package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class nm implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.om f242900e;

    public nm(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.om omVar, java.lang.String str) {
        this.f242900e = omVar;
        this.f242899d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f242899d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "delete %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.om omVar = this.f242900e;
        omVar.f242933a.f242228r = true;
        c01.uc ucVar = c01.uc.f119047c;
        ucVar.i(str);
        ((java.util.HashMap) omVar.f242933a.f242232v).remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17660x9d61a64 c17660x9d61a64 = omVar.f242933a.f242218e;
        java.util.ArrayList arrayList = (java.util.ArrayList) c17660x9d61a64.f243589m;
        if (arrayList.contains(str)) {
            int indexOf = arrayList.indexOf(str);
            arrayList.remove(str);
            ((java.util.ArrayList) c17660x9d61a64.f243590n).remove(indexOf);
            ((java.util.ArrayList) c17660x9d61a64.f243591o).remove(indexOf);
        }
        omVar.f242933a.Y6();
        omVar.f242933a.f242218e.b();
        if (omVar.f242933a.f242226p == 0) {
            if (((java.util.HashSet) ucVar.d()).size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 1, 4, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 0, 4, ucVar.f(), ucVar.e(), wo.w0.k());
            }
        }
    }
}
