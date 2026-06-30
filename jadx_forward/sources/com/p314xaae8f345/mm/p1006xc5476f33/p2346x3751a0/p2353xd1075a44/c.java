package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18932xcc2a2c76 f258664d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18932xcc2a2c76 activityC18932xcc2a2c76) {
        this.f258664d = activityC18932xcc2a2c76;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/InviteRemindDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.ActivityC18932xcc2a2c76 activityC18932xcc2a2c76 = this.f258664d;
        java.lang.String str = null;
        if (activityC18932xcc2a2c76.f258625e != null) {
            try {
                java.util.Map b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0.b((java.lang.String) gm0.j1.u().c().l(77829, null));
                if (b17 != null) {
                    if (b17.size() > 0) {
                        if (b17.containsKey(activityC18932xcc2a2c76.f258625e)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0) b17.get(activityC18932xcc2a2c76.f258625e);
                            e0Var.f257998b++;
                            b17.put(activityC18932xcc2a2c76.f258625e, e0Var);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0 e0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0();
                            e0Var2.f257998b++;
                            b17.put(activityC18932xcc2a2c76.f258625e, e0Var2);
                        }
                    }
                    gm0.j1.u().c().w(77829, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0.a(b17));
                    java.util.Iterator it = b17.entrySet().iterator();
                    while (it.hasNext()) {
                        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0) ((java.util.Map.Entry) it.next()).getValue()).f257997a;
                    }
                } else {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0 e0Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0();
                    e0Var3.f257998b++;
                    hashMap.put(activityC18932xcc2a2c76.f258625e, e0Var3);
                    gm0.j1.u().c().w(77829, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0.a(hashMap));
                    java.util.Iterator it6 = hashMap.entrySet().iterator();
                    while (it6.hasNext()) {
                        int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e0) ((java.util.Map.Entry) it6.next()).getValue()).f257997a;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MMInviteRemindDialog", e17, "", new java.lang.Object[0]);
            }
        }
        int i19 = activityC18932xcc2a2c76.f258626f;
        if (i19 == 0) {
            str = activityC18932xcc2a2c76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575000kc0);
        } else if (i19 == 1) {
            str = activityC18932xcc2a2c76.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdj);
        }
        java.lang.String str2 = activityC18932xcc2a2c76.f258625e;
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.y(str2, str, c01.e2.C(str2), 0));
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.addFlags(67108864);
        intent.putExtra("Chat_User", activityC18932xcc2a2c76.f258625e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.j(intent, activityC18932xcc2a2c76);
        activityC18932xcc2a2c76.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/widget/InviteRemindDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
