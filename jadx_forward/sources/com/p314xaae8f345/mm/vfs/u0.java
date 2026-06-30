package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class u0 extends com.p314xaae8f345.mm.vfs.b1 {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.regex.Pattern f294724l;

    public u0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        super(str, i17, i18, str2);
        this.f294724l = java.util.regex.Pattern.compile("^\\$\\{data\\}/app_xwalk_[\\-0-9]*$");
    }

    @Override // com.p314xaae8f345.mm.vfs.b1
    public boolean a(com.p314xaae8f345.mm.vfs.a1 a1Var) {
        return a1Var.f294299b == 7 && this.f294724l.matcher(a1Var.f294301d).matches();
    }
}
