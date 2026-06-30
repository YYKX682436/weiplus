package ej4;

/* loaded from: classes11.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 f334919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.x f334920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f334921f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659, ej4.x xVar, java.lang.CharSequence charSequence) {
        super(0);
        this.f334919d = c21526xca364659;
        this.f334920e = xVar;
        this.f334921f = charSequence;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = this.f334919d;
        java.lang.Object tag = c21526xca364659.getTag(com.p314xaae8f345.mm.R.id.f565475t06);
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f334920e.f334907a)) {
            c21526xca364659.m79270x765074af(this.f334921f);
        }
        return jz5.f0.f384359a;
    }
}
