package gx0;

/* loaded from: classes5.dex */
public final class gh implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f358017d;

    public gh(gx0.kh khVar) {
        this.f358017d = khVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        gx0.bh bhVar = (gx0.bh) this.f358017d.T6(gx0.bh.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = bhVar.f357801x;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("revokeButton");
            throw null;
        }
        c22699x3dcdb352.setEnabled(booleanValue);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = bhVar.f357801x;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(booleanValue ? ((java.lang.Number) ((jz5.n) bhVar.f357794J).mo141623x754a37bb()).intValue() : ((java.lang.Number) ((jz5.n) bhVar.K).mo141623x754a37bb()).intValue());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("revokeButton");
            throw null;
        }
    }
}
