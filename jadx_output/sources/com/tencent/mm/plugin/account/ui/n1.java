package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class n1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f74052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f74053e;

    public n1(int i17, android.content.Context context) {
        this.f74052d = i17;
        this.f74053e = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = this.f74052d;
        int i18 = i17 & 1;
        android.content.Context context = this.f74053e;
        if (i18 != 0) {
            g4Var.f(1, context.getString(com.tencent.mm.R.string.f492789hv2));
        }
        if ((i17 & 2) != 0) {
            g4Var.f(2, context.getString(com.tencent.mm.R.string.f492790hv3));
        }
        if ((i17 & 4) != 0) {
            g4Var.f(4, context.getString(com.tencent.mm.R.string.f492788hv1));
        }
        if ((i17 & 8) > 0) {
            g4Var.f(8, context.getString(com.tencent.mm.R.string.l8m));
        }
    }
}
