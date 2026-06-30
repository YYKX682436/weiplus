package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3[] f148658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f148659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148660f;

    public c0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3[] u3VarArr, boolean z17, android.content.Context context) {
        this.f148658d = u3VarArr;
        this.f148659e = z17;
        this.f148660f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (this.f148659e) {
            android.content.Context context = this.f148660f;
            u3Var = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f148660f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, new com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.b0(this));
        } else {
            u3Var = null;
        }
        this.f148658d[0] = u3Var;
    }
}
