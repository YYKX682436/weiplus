package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes8.dex */
public final class x7 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.x7 f277864d = new com.p314xaae8f345.mm.p2621x8fb0427b.x7();

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f277865e = {"*", "rowid"};

    /* renamed from: f, reason: collision with root package name */
    public static final l75.k0 f277866f;

    static {
        l75.k0 k0Var = gm0.j1.u().f354686f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
        f277866f = k0Var;
    }

    public x7() {
        super(gm0.j1.u().f354686f, qk.h6.f445683p1, "FunctionMsgItem", new java.lang.String[]{"CREATE INDEX IF NOT EXISTS functionIdIndex ON FunctionMsgItem(functionmsgid)"});
    }

    public final qk.h6 y0(java.lang.String functionMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionMsgId, "functionMsgId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(functionMsgId)) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgStorage", "getByFunctionMsgId, functionMsgId: %s", functionMsgId);
        android.database.Cursor D = f277866f.D("FunctionMsgItem", f277865e, "functionmsgid=?", new java.lang.String[]{functionMsgId}, null, null, null, 2);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(D);
            if (!D.moveToFirst()) {
                vz5.b.a(D, null);
                return null;
            }
            qk.h6 h6Var = new qk.h6();
            h6Var.mo9015xbf5d97fd(D);
            vz5.b.a(D, null);
            return h6Var;
        } finally {
        }
    }

    public final void z0(java.lang.String functionMsgId, qk.h6 newFunctionMsgItem) {
        r45.j4 j4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionMsgId, "functionMsgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s", functionMsgId);
        qk.h6 y07 = y0(functionMsgId);
        if (y07 != null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = functionMsgId;
                objArr[1] = java.lang.Boolean.valueOf(newFunctionMsgItem.f66759xf1091605 == null);
                objArr[2] = java.lang.Boolean.valueOf(y07.f66759xf1091605 == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s, newFunctionMsgItem.msgContent==null: %s,oldFunctionMsgItem.msgContent==null: %s", objArr);
                android.content.ContentValues mo9763xeb27878e = newFunctionMsgItem.mo9763xeb27878e();
                if (mo9763xeb27878e.get("addMsg") == null && (j4Var = y07.f66759xf1091605) != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j4Var);
                    mo9763xeb27878e.put("addMsg", j4Var.mo14344x5f01b1f6());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, ret: %s", java.lang.Integer.valueOf(f277866f.p("FunctionMsgItem", mo9763xeb27878e, "functionmsgid=?", new java.lang.String[]{functionMsgId})));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId error: %s", e17.getMessage());
            }
        }
    }
}
