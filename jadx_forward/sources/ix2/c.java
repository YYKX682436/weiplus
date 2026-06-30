package ix2;

/* loaded from: classes10.dex */
public final class c implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1665x5c28046.C15399x9819e226 f376885a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1665x5c28046.C15399x9819e226 c15399x9819e226) {
        this.f376885a = c15399x9819e226;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        java.lang.String valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1665x5c28046.C15399x9819e226 c15399x9819e226 = this.f376885a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var = c15399x9819e226.f213572d;
        if (k0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("textListener");
            throw null;
        }
        k0Var.a(str);
        if (c15399x9819e226.getPickEmojiStr().length() > 0) {
            valueOf = c15399x9819e226.getPickEmojiStr() + ';' + str;
        } else {
            valueOf = java.lang.String.valueOf(str);
        }
        c15399x9819e226.m62677xc0eb58ce(valueOf);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
