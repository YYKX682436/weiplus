package kt;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w implements lt.m0 {
    public java.lang.String Ai(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "buildUnistallUrl fail, invalid arguments");
            return null;
        }
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), context);
        if (o17 == null || o17.length() == 0) {
            o17 = "zh_CN";
        } else if (o17.equals("en")) {
            o17 = "en_US";
        }
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfa, str, java.lang.Integer.valueOf(o45.wf.f424562g), o17, wo.q.f529313a, str2, 0);
    }

    public java.lang.String Bi(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false);
        if (a17 != null && a17.length != 0) {
            return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.e(kk.k.g(a17[0].toByteArray()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "signs is null");
        return null;
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 Di(java.lang.String str) {
        kk.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270481a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5();
        i5Var.f270471e = false;
        if (!lj.f.f(str)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var2 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270481a.m77803xc84af884(str);
            if (i5Var2 != null) {
                i5Var = i5Var2;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i5Var.f270468b)) {
                final java.lang.String str2 = i5Var.f270468b;
                ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.j5$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.List list = (java.util.List) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270482b.remove(str2);
                        if (list != null) {
                            list.size();
                        }
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270481a.m77803xc84af884((java.lang.String) it.next());
                        }
                    }
                }, "OpenSDKTokenTask");
            }
        }
        return i5Var;
    }

    public boolean Ni(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtil", "check the signature of the Application.");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "context is null.");
            return true;
        }
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "appInfo is null.");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67386xa1e9e82c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "packageName is null.");
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67390xda9bc3b3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "app.field_signature is null. app.field_packageName is %s", mVar.f67386xa1e9e82c);
            return true;
        }
        android.content.pm.Signature[] a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, mVar.f67386xa1e9e82c, false);
        if (a17 == null || a17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "apk signatures is null");
        } else {
            java.util.List D0 = mVar.D0(mVar.f67386xa1e9e82c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtil", "apk server signatures:%s", D0);
            for (android.content.pm.Signature signature : a17) {
                java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.e(kk.k.g(signature.toByteArray()));
                if (((java.util.ArrayList) D0).contains(e17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtil", "app_name : %s ,signature : %s", mVar.f67372x453d1e07, e17);
                    return true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppUtil", "signature is diff.(app_name:%s)", mVar.f67372x453d1e07);
        }
        return false;
    }

    public void Ri(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppUtil", "appid is null");
            return;
        }
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        if (d17 != null) {
            java.lang.String string = d17.getString("key_app_ids_registion_while_not_login", "");
            if (string.contains(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppUtil", "this app has been saved : %s in %s", str, string);
                return;
            }
            d17.edit().putString("key_app_ids_registion_while_not_login", str + "|" + string).commit();
        }
    }

    public void Ui(android.content.Context context, final java.lang.String str, final java.lang.String str2, int i17) {
        kk.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270481a;
        java.lang.String d17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.d(context, str2);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5();
        i5Var.f270467a = str;
        i5Var.f270468b = str2;
        i5Var.f270469c = d17;
        i5Var.f270470d = i17;
        i5Var.f270471e = true;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270481a.put(str, i5Var);
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.j5$$b
            @Override // java.lang.Runnable
            public final void run() {
                java.util.HashMap hashMap = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j5.f270482b;
                java.lang.String str3 = str2;
                java.util.List list = (java.util.List) hashMap.get(str3);
                if (list != null) {
                    list.size();
                }
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(str);
                hashMap.put(str3, list);
            }
        }, "OpenSDKTokenTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r13.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/") != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String wi(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt.e.wi(java.lang.String, java.lang.String):java.lang.String");
    }
}
