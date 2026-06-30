package t00;

/* loaded from: classes9.dex */
public final class e2 implements t00.r0 {
    public static final boolean h(t00.e2 e2Var, android.content.Context context, int i17, int i18, android.content.Intent intent, int i19, java.lang.String str, c00.n3 n3Var) {
        e2Var.getClass();
        if (i17 != i19) {
            n3Var.a();
            return false;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Contact") : null;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, select username nil");
                n3Var.a();
            } else {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str2, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712(stringExtra, str), t00.o1.class, new t00.d2(context, n3Var));
            }
        } else {
            n3Var.mo13720x3d6f0539();
        }
        return true;
    }

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.f495862j;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int optInt = data.optInt("selectType", 0);
        int i18 = h20.g.f359800a;
        if (optInt == 1) {
            i(i17, context, data, callback, jSONObject);
            return;
        }
        if (optInt != 2) {
            i(i17, context, data, callback, jSONObject);
            return;
        }
        java.lang.String optString = data.optString("ticket");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, ticket:" + optString);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, ticket:" + optString + ", context is null");
            callback.a();
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(optString), t00.n1.class)).f149939d;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, ticket:" + optString + ", get chatroomName is null");
            callback.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, chatroomName:" + str);
        int a17 = cf.b.a(this);
        rd0.d1 d1Var = (rd0.d1) i95.n0.c(rd0.d1.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        java.lang.String string = activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nei);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        kz5.p0 p0Var = kz5.p0.f395529d;
        ((qd0.o0) d1Var).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmSelectContactEcsFeatureService", "createSelectGroupMembersIntent title:" + string + " chatroomName:" + str + " selectedMemberList:" + p0Var + " allUserNameList:" + p0Var);
        android.content.Intent intent = new android.content.Intent(activityC0065xcd7aa112, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192.class);
        intent.putExtra("titile", string);
        intent.putExtra("chatroomName", str);
        intent.putExtra("chatroommemberlist", kz5.n0.g0(p0Var, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("block_contact", c01.z1.r());
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, dj5.b0.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        intent.putExtra("block_contact", c01.z1.r());
        if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".ui.mvvm.MvvmContactListUI", intent, a17, new t00.y1(this, context, a17, optString, callback));
        } else if (activityC0065xcd7aa112 instanceof nf.m) {
            nf.g.a(context).f(new t00.z1(this, context, a17, optString, callback));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, context unsupported type");
            callback.a();
        }
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r16, android.content.Context r17, org.json.JSONObject r18, c00.n3 r19, org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.e2.i(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }
}
