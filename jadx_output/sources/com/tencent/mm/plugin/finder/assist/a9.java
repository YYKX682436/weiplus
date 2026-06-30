package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class a9 {
    public a9(kotlin.jvm.internal.i iVar) {
    }

    public static com.tencent.mm.plugin.finder.assist.d9 a(com.tencent.mm.plugin.finder.assist.a9 a9Var, android.content.Context context, java.lang.String str, long j17, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str = null;
        }
        if ((i17 & 4) != 0) {
            j17 = 500;
        }
        if ((i17 & 8) != 0) {
            onCancelListener = null;
        }
        a9Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.assist.d9 d9Var = new com.tencent.mm.plugin.finder.assist.d9();
        d9Var.f16128c = j17;
        new java.lang.ref.WeakReference(context);
        az2.q qVar = new az2.q();
        if (str != null) {
            qVar.f16149c = str;
        }
        qVar.f16150d = onCancelListener;
        qVar.f16152a = new java.lang.ref.WeakReference(context);
        d9Var.f16127b = qVar;
        return d9Var;
    }
}
