package cj5;

/* loaded from: classes.dex */
public final class k5 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f123706d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f123707e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f123708f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f123709g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f123710h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123706d = new java.util.ArrayList();
        this.f123707e = new java.util.HashMap();
        this.f123708f = new java.util.HashMap();
        this.f123709g = new java.util.HashMap();
        this.f123710h = jz5.h.b(new cj5.j5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = m158359x1e885992().getStringArrayListExtra("selectedUserNames");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        this.f123706d = stringArrayListExtra;
        java.io.Serializable serializableExtra = m158359x1e885992().getSerializableExtra("selectDict");
        java.util.HashMap hashMap = serializableExtra instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra : null;
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        this.f123707e = hashMap;
        java.io.Serializable serializableExtra2 = m158359x1e885992().getSerializableExtra("selectDictExtraData");
        java.util.HashMap hashMap2 = serializableExtra2 instanceof java.util.HashMap ? (java.util.HashMap) serializableExtra2 : null;
        if (hashMap2 == null) {
            hashMap2 = new java.util.HashMap();
        }
        this.f123708f = hashMap2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.f123707e.keySet()) {
            if (!this.f123706d.contains(str)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                arrayList.add(str);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            this.f123707e.remove(str2);
            this.f123708f.remove(str2);
        }
        java.util.Iterator it6 = this.f123706d.iterator();
        while (it6.hasNext()) {
            java.lang.String str3 = (java.lang.String) it6.next();
            java.util.HashMap hashMap3 = this.f123709g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            hashMap3.put(str3, java.lang.Integer.valueOf(c01.w9.v(str3)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.g5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationMainViewUIC", "onResume() called");
        ((em.l2) ((jz5.n) this.f123710h).mo141623x754a37bb()).k().postDelayed(new cj5.i5(this), 60L);
    }
}
