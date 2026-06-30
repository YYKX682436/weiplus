package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5 f268899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 f268900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ck f268901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5 c5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var, r45.ck ckVar) {
        super(1);
        this.f268899d = c5Var;
        this.f268900e = l5Var;
        this.f268901f = ckVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5 c5Var = this.f268899d;
        if (intValue == 0) {
            c5Var.f268661c.setVisibility(0);
            c5Var.f268665g.setVisibility(8);
            return java.lang.Boolean.FALSE;
        }
        c5Var.f268661c.setVisibility(8);
        c5Var.f268662d.setVisibility(8);
        c5Var.f268663e.setVisibility(8);
        c5Var.f268660b.setVisibility(8);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f268900e.f268915d;
        java.lang.String str = this.f268901f.f453136g;
        android.widget.TextView textView = c5Var.f268659a;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        c5Var.f268665g.setVisibility(0);
        c5Var.f268666h.setVisibility(8);
        c5Var.f268664f.setVisibility(8);
        return java.lang.Boolean.TRUE;
    }
}
