package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class a9 {
    public a9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9 a9Var, android.content.Context context, java.lang.String str, long j17, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9 d9Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9();
        d9Var.f97661c = j17;
        new java.lang.ref.WeakReference(context);
        az2.q qVar = new az2.q();
        if (str != null) {
            qVar.f97682c = str;
        }
        qVar.f97683d = onCancelListener;
        qVar.f97685a = new java.lang.ref.WeakReference(context);
        d9Var.f97660b = qVar;
        return d9Var;
    }
}
