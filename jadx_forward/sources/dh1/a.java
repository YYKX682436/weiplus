package dh1;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f313948d = str;
        this.f313949e = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.h(this.f313948d, "magicbrushframedata");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
        boolean n17 = r26.i0.n(h17, "/", false);
        java.lang.String str = this.f313949e;
        if (n17) {
            return h17 + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str);
        }
        return h17 + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.b(str, true);
    }
}
