package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class b9 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e9 f161368d;

    public b9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e9 e9Var) {
        this.f161368d = e9Var;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2 = c16991x15ced046 != null ? c16991x15ced046.f237195f : null;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.e9 e9Var = this.f161368d;
        if (K0) {
            e9Var.getMResult().f160116e = null;
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e mRequest = e9Var.getMRequest();
            if (mRequest == null || (str = mRequest.getExtras()) == null) {
                str = "{}";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11928xba1e0e3e mResult = e9Var.getMResult();
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386.f262975u.a(jSONObject);
            a17.f262988s = str2;
            mResult.f160116e = a17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16991x15ced046);
            java.lang.Integer num = (java.lang.Integer) c16991x15ced046.a().b("KEY_MEDIA_SOURCE_INT", -1);
            z17 = true;
            if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
                z17 = false;
            }
            e9Var.getMResult().f160115d = z17 ? 7 : 6;
            int i17 = e9Var.getMResult().f160115d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386 c19210xff3b4386 = e9Var.getMResult().f160116e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19210xff3b4386);
            java.util.Map b17 = c19210xff3b4386.b();
            tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((sg0.e) f1Var).Ai(context2, 5, i17, b17);
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            if (z17) {
                activity.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559389de);
            } else {
                activity.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559312b8);
            }
        }
        e9Var.m50420x7b736e5c(e9Var.getMResult());
    }
}
