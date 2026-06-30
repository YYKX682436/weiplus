package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class m2 extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.content.Context L;
    public boolean M;
    public java.lang.String N;
    public int P;
    public java.lang.String Q;
    public java.lang.String R;
    public yz5.a S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(android.content.Context context, int i17, int i18, boolean z17) {
        super(context, i17, i18, z17);
        kotlin.jvm.internal.o.g(context, "context");
        this.L = context;
        this.N = "";
    }

    public final java.lang.String D() {
        java.lang.String str = this.Q;
        if (str != null) {
            if (str.length() > 0) {
                return str;
            }
        }
        int i17 = this.P;
        android.content.Context context = this.L;
        if (i17 == 1) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.msq);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (i17 == 2) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.msp);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (i17 != 3) {
            return "";
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.mso);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return string3;
    }
}
