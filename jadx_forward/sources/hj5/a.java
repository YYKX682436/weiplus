package hj5;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj5.e f363196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f363197e;

    public a(hj5.e eVar, wi5.n0 n0Var) {
        this.f363196d = eVar;
        this.f363197e = n0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        hj5.e eVar = this.f363196d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = eVar.m158354x19263085();
        android.content.Intent intent = new android.content.Intent();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.LinkedList linkedList = this.f363197e.f527852o;
        java.lang.Integer num = null;
        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList))) {
            linkedList = null;
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.util.List j17 = ((b93.b) c93.a.a()).j((java.lang.String) it6.next());
                if (j17 != null) {
                    if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(j17))) {
                        j17 = null;
                    }
                    if (j17 != null) {
                        hashSet.addAll(j17);
                    }
                }
            }
        }
        intent.putExtra("KSelectUserList", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(kz5.n0.S0(hashSet), ","));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) eVar.f363201d).mo141623x754a37bb()).k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
        if (a17 != null && (arrayList = a17.f233598o) != null) {
            if (arrayList.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it7 = arrayList.iterator();
                i17 = 0;
                while (it7.hasNext()) {
                    if (((ri5.j) it7.next()).f477659w && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            num = java.lang.Integer.valueOf(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelTopMenuUIC", "clickConfirmMenu: size:" + num);
        intent.putExtra("INTENT_KEY_SIZE", num);
        m158354x19263085.setResult(-1, intent);
        eVar.m158354x19263085().finish();
        return false;
    }
}
