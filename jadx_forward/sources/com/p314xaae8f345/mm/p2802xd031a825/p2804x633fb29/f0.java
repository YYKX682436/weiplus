package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public abstract class f0 {
    public static r45.n34 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JumpItemUtil", "createFromJSONObject() jsonObject == null");
            return null;
        }
        r45.n34 n34Var = new r45.n34();
        n34Var.f462581d = jSONObject.optString("wording");
        n34Var.f462582e = jSONObject.optInt("action");
        n34Var.f462583f = jSONObject.optString("url");
        n34Var.f462584g = jSONObject.optString(dm.i4.f66875xa013b0d5);
        n34Var.f462585h = jSONObject.optString("pagepath");
        return n34Var;
    }

    public static org.json.JSONObject b(r45.n34 n34Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("wording", n34Var.f462581d);
            jSONObject.put("action", n34Var.f462582e);
            jSONObject.put("url", n34Var.f462583f);
            jSONObject.put(dm.i4.f66875xa013b0d5, n34Var.f462584g);
            jSONObject.put("pagepath", n34Var.f462585h);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JumpItemUtil", "getJSONObject() Exception: %s", e17.getMessage());
        }
        return jSONObject;
    }

    public static void c(android.content.Context context, r45.n34 n34Var, java.lang.Object obj, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e0 e0Var) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = n34Var == null ? e(n34Var) : "null";
        objArr[1] = e0Var != null ? "no null" : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "handleAction() jumpItem:%s iJumpItemCallback:%s", objArr);
        if (n34Var == null) {
            return;
        }
        int i17 = n34Var.f462582e;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", n34Var.f462583f);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(context, intent);
                    } else if (i17 == 4) {
                        try {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                            am.nx nxVar = c6113xa3727625.f136390g;
                            nxVar.f88999a = n34Var.f462584g;
                            nxVar.f89000b = n34Var.f462585h;
                            if (e0Var != null) {
                                nxVar.f89002d = e0Var.b();
                            } else {
                                nxVar.f89002d = 1000;
                            }
                            nxVar.f89001c = 0;
                            nxVar.f89004f = context;
                            c6113xa3727625.e();
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JumpItemUtil", "handleAction() Exception: %s", e17.getMessage());
                        }
                    } else if (i17 == 5 && e0Var != null) {
                        e0Var.e(obj);
                    }
                } else if (e0Var != null) {
                    e0Var.c(obj);
                }
            } else if (e0Var != null) {
                e0Var.f(obj);
            }
        } else if (e0Var != null) {
            e0Var.d(obj);
        }
        if (e0Var != null) {
            e0Var.a(obj);
        }
    }

    public static void d(android.content.Context context, r45.po5 po5Var, java.lang.Object obj, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e0 e0Var) {
        if (po5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "showRemindWin() remindWin == null");
        } else {
            db5.e1.C(context, po5Var.f464787d, "", po5Var.f464788e.f462581d, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.v(context, po5Var, obj, e0Var), new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.w()).show();
        }
    }

    public static java.lang.String e(r45.n34 n34Var) {
        if (n34Var == null) {
            return "JumpItem{null}";
        }
        return "JumpItem{wording='" + n34Var.f462581d + "', action=" + n34Var.f462582e + ", url='" + n34Var.f462583f + "', username='" + n34Var.f462584g + "', pagepath='" + n34Var.f462585h + "'}";
    }
}
