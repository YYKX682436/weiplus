package kt2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 f393509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1) {
        super(0);
        this.f393509d = c14940x2aae97e1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs5.f m58928xb411027f;
        m58928xb411027f = this.f393509d.m58928xb411027f();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((it2.x) m58928xb411027f).Bi() != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardView", "initialize service available " + valueOf.booleanValue());
        return valueOf;
    }
}
