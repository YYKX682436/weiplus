package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class d5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f103123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f103124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f103126g;

    public d5(com.tencent.mm.ui.widget.dialog.u3 u3Var, zy2.gc gcVar, android.content.Context context, boolean z17) {
        this.f103123d = u3Var;
        this.f103124e = gcVar;
        this.f103125f = context;
        this.f103126g = z17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.String string;
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f103123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        zy2.gc gcVar = this.f103124e;
        if (gcVar != null) {
            gcVar.r5(req, ret);
        }
        int integer = ret.getInteger(1);
        boolean z17 = this.f103126g;
        android.content.Context context = this.f103125f;
        if (integer == 0) {
            string = context.getResources().getString(z17 ? com.tencent.mm.R.string.cpl : com.tencent.mm.R.string.f491311cq0);
        } else {
            string = context.getResources().getString(z17 ? com.tencent.mm.R.string.cpk : com.tencent.mm.R.string.cpz);
        }
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(context, string);
    }
}
