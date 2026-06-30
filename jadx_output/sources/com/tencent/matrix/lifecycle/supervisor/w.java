package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class w implements com.tencent.matrix.lifecycle.owners.y {
    public void a(java.lang.String newScene, java.lang.String origin) {
        kotlin.jvm.internal.o.g(newScene, "newScene");
        kotlin.jvm.internal.o.g(origin, "origin");
        com.tencent.matrix.lifecycle.supervisor.d0 d0Var = com.tencent.matrix.lifecycle.supervisor.d0.f52834k;
        oj.j.a(d0Var.b(), "onSceneChanged: " + origin + " -> " + newScene, new java.lang.Object[0]);
        d0Var.getClass();
        com.tencent.matrix.lifecycle.supervisor.j jVar = com.tencent.matrix.lifecycle.supervisor.d0.f52829f;
        if (jVar != null) {
            java.lang.String b17 = d0Var.b();
            try {
                jVar.a3(newScene);
            } catch (java.lang.Throwable th6) {
                oj.j.d(b17, th6, "", new java.lang.Object[0]);
            }
        }
    }
}
