package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes2.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f233346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f233347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f233348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super(1);
        this.f233346d = f0Var;
        this.f233347e = f0Var2;
        this.f233348f = c1163xf1deaba4;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int floatValue = (int) (this.f233346d.f391649d * ((java.lang.Number) obj).floatValue());
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f233347e;
        int i17 = floatValue - f0Var.f391649d;
        f0Var.f391649d = floatValue;
        this.f233348f.scrollBy(0, i17);
        return jz5.f0.f384359a;
    }
}
