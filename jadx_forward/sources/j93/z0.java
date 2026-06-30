package j93;

/* loaded from: classes.dex */
public final class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f380072d;

    public z0(j93.j1 j1Var) {
        this.f380072d = j1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        j93.j1 j1Var = this.f380072d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) j1Var.f379946d).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        java.lang.Integer num = null;
        if (a17 != null && (arrayList = a17.f233598o) != null) {
            if (arrayList.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it6 = arrayList.iterator();
                i17 = 0;
                while (it6.hasNext()) {
                    if (((ri5.j) it6.next()).f477659w && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            num = java.lang.Integer.valueOf(i17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clickConfirmMenu: count:");
        java.util.HashSet hashSet = j1Var.f379948f;
        sb6.append(hashSet.size());
        sb6.append(" size:");
        sb6.append(num);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectChatroomContactTopMenuUIC", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        for (java.lang.String str : (java.util.List) ((jz5.n) j1Var.f379947e).mo141623x754a37bb()) {
            if (hashSet.contains(str)) {
                hashSet.remove(str);
            }
        }
        java.util.List S0 = kz5.n0.S0(hashSet);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(S0)) {
            intent.putExtra("KSelectUserList", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(S0, ","));
        }
        intent.putExtra("INTENT_KEY_SIZE", num);
        j1Var.m158354x19263085().setResult(-1, intent);
        j1Var.m158354x19263085().finish();
        return false;
    }
}
