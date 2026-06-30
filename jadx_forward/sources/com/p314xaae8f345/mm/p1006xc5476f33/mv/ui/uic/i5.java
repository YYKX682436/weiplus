package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f232736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f232737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j5 f232738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j5 j5Var) {
        super(0);
        this.f232736d = z5Var;
        this.f232737e = j17;
        this.f232738f = j5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm3.q qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f232736d;
        if (z5Var.Q6().getChildCount() > 0) {
            android.view.View childAt = z5Var.Q6().getChildAt(0);
            float f17 = (-childAt.getLeft()) / z5Var.f233116v;
            float width = (z5Var.Q6().getWidth() - childAt.getLeft()) / z5Var.f233116v;
            long j17 = this.f232737e;
            z5Var.S6().m67378x853690dc(((((float) j17) - f17) * 1.0f) / (width - f17));
            fm3.q qVar2 = z5Var.f233117w;
            if (qVar2 != null) {
                ((android.widget.TextView) ((jz5.n) z5Var.f233111q).mo141623x754a37bb()).setText(qVar2.c(((int) j17) + qVar2.f345640e + 33));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j5 j5Var = this.f232738f;
            if (j5Var.f232754a > j17 && (qVar = z5Var.f233117w) != null) {
                kl3.t.g().a().c(qVar.f345640e);
            }
            j5Var.f232754a = j17;
        }
        return jz5.f0.f384359a;
    }
}
