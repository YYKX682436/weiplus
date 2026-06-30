package ls1;

/* loaded from: classes8.dex */
public final class f0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 {
    public yz5.a G;
    public yz5.l H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getCurrentUrlProxy */
    public final yz5.a m146259x300b8ca2() {
        return this.G;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.C27816xac2547f9, tx5.f
    /* renamed from: getUrl */
    public java.lang.String mo120156xb5887639() {
        yz5.l lVar;
        java.lang.String mo120156xb5887639 = super.mo120156xb5887639();
        if (this.G == null || (lVar = this.H) == null) {
            return mo120156xb5887639;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        if (((java.lang.Boolean) lVar.mo146xb9724478(mo120156xb5887639)).booleanValue()) {
            return mo120156xb5887639;
        }
        yz5.a aVar = this.G;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        return (java.lang.String) aVar.mo152xb9724478();
    }

    /* renamed from: getValidUrlProxy */
    public final yz5.l m146260x4e9d16a5() {
        return this.H;
    }

    /* renamed from: setCurrentUrlProxy */
    public final void m146261x66e22616(yz5.a aVar) {
        this.G = aVar;
    }

    /* renamed from: setValidUrlProxy */
    public final void m146262xe1737d19(yz5.l lVar) {
        this.H = lVar;
    }
}
