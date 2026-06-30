package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes.dex */
public class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f155586e;

    public n1(int i17, android.content.Context context) {
        this.f155585d = i17;
        this.f155586e = context;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = this.f155585d;
        int i18 = i17 & 1;
        android.content.Context context = this.f155586e;
        if (i18 != 0) {
            g4Var.f(1, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574322hv2));
        }
        if ((i17 & 2) != 0) {
            g4Var.f(2, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574323hv3));
        }
        if ((i17 & 4) != 0) {
            g4Var.f(4, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574321hv1));
        }
        if ((i17 & 8) > 0) {
            g4Var.f(8, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8m));
        }
    }
}
