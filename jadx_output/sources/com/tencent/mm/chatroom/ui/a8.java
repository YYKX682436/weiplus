package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class a8 {
    public a8(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str) {
        if (str != null) {
            p75.n0 n0Var = dm.w9.f240866o;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("read", (java.lang.Integer) 1);
            p75.m0 j17 = dm.w9.f240868q.j(str);
            p75.h1 j18 = dm.w9.f240866o.j(contentValues);
            j18.b(j17);
            j18.a().f(gm0.j1.u().f273153f);
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().doNotify(str);
            g95.u.l(str, 7);
        }
    }
}
