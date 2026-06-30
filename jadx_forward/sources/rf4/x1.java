package rf4;

/* loaded from: classes4.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331) {
        super(0);
        this.f476658d = c18486xb54a9331;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476658d;
        if (c18486xb54a9331.f253547i.getTranslationY() < c18486xb54a9331.f253543e) {
            if (c18486xb54a9331.f253547i.getTranslationY() > r1.getMeasuredHeight() / 10) {
                c18486xb54a9331.a();
            } else {
                c18486xb54a9331.b(c18486xb54a9331.getCurPosition(), true);
            }
        }
        return jz5.f0.f384359a;
    }
}
