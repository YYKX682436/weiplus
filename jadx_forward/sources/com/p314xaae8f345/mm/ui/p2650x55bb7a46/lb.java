package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class lb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb f283468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar) {
        super(0);
        this.f283468d = tbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb tbVar = this.f283468d;
        em.i1 i1Var = tbVar.f284244d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
            throw null;
        }
        i1Var.a().removeCallbacks(tbVar.f284249i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownPreviewUIC", "[PREVIEW_TAP] cancel delayed finish by child interaction");
        return jz5.f0.f384359a;
    }
}
