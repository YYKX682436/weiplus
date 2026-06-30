package fg;

/* loaded from: classes7.dex */
public final class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg.g f343321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f343322b;

    public m(fg.g gVar, fg.b0 b0Var) {
        this.f343321a = gVar;
        this.f343322b = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3
    public void a(int i17) {
        int c17 = this.f343321a.c();
        int i18 = i17 - c17;
        fg.b0 b0Var = this.f343322b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f343257a, "OnHeightChangedListener, totalHeight: %d, lateSavedKeyboardPanelHeight: %d, currentKeyboardPanelHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b0Var.f343264h), java.lang.Integer.valueOf(c17));
        if (c17 == 0 || b0Var.f343264h == c17) {
            return;
        }
        b0Var.f343264h = c17;
        b0Var.f343265i = i17;
        sf.c cVar = sf.c.f488472a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = oaVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.oa oaVar2 = b0Var.f343260d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oaVar2);
        cVar.a(a17, oaVar2.b(), new sf.b(i17, b0Var.d(i17), b0Var.f343268l, new fg.l(b0Var, i18)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p3
    public android.widget.EditText b() {
        android.widget.EditText editText = this.f343322b.f343263g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(editText);
        return editText;
    }
}
