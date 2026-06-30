package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3[] f67125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67127f;

    public c0(com.tencent.mm.feature.lite.i iVar, com.tencent.mm.ui.widget.dialog.u3[] u3VarArr, boolean z17, android.content.Context context) {
        this.f67125d = u3VarArr;
        this.f67126e = z17;
        this.f67127f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        if (this.f67126e) {
            android.content.Context context = this.f67127f;
            u3Var = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f67127f.getString(com.tencent.mm.R.string.f490604zq), true, false, new com.tencent.mm.feature.lite.b0(this));
        } else {
            u3Var = null;
        }
        this.f67125d[0] = u3Var;
    }
}
