package a45;

/* loaded from: classes3.dex */
public final class i extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570997eo1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = m158359x1e885992().getStringArrayListExtra("IntentKey_MsgData");
        if (stringArrayListExtra == null) {
            return;
        }
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("IntentKey_Title");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        for (java.lang.String str : stringArrayListExtra) {
            u15.a aVar = new u15.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            aVar.m126728xdc93280d(str);
            arrayList.add(aVar);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) m158354x19263085 : null;
        if (abstractActivityC16711x120e7ae0 != null) {
            if (stringExtra == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (!((u15.a) obj).n()) {
                        arrayList2.add(obj);
                    }
                }
                objArr[0] = java.lang.Integer.valueOf(arrayList2.size());
                stringExtra = abstractActivityC16711x120e7ae0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o6q, objArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringExtra, "getString(...)");
            }
            abstractActivityC16711x120e7ae0.mo54450xbf7c1df6(stringExtra);
            abstractActivityC16711x120e7ae0.mo78530x8b45058f();
            abstractActivityC16711x120e7ae0.mo54448x9c8c0d33(new a45.h(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p653x55bb7a46.p654x592d43e.C10388xd1b5a472 c10388xd1b5a472 = new com.p314xaae8f345.mm.p653x55bb7a46.p654x592d43e.C10388xd1b5a472(context, (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo144222x4ff8c0f0);
        c10388xd1b5a472.m43552x5464d498(a45.g.class);
        c10388xd1b5a472.m43553xf98c4604(arrayList);
    }
}
