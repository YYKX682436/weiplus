package f53;

/* loaded from: classes5.dex */
public final class b0 extends com.p314xaae8f345.mm.ui.p2740x696c9db.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341167h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b, int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        super(i17, t4Var);
        this.f341167h = activityC15905x15a0ec7b;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        java.lang.String valueOf = java.lang.String.valueOf(spanned);
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(valueOf, t4Var) + com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(source.toString(), t4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341167h;
        if (e17 > activityC15905x15a0ec7b.F) {
            db5.t7.g(activityC15905x15a0ec7b.mo55332x76847179(), activityC15905x15a0ec7b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fq8));
        }
        return source;
    }
}
