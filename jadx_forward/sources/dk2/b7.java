package dk2;

/* loaded from: classes3.dex */
public final class b7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f314772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.na0 f314774f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(ce2.i iVar, java.lang.String str, r45.na0 na0Var) {
        super(1);
        this.f314772d = iVar;
        this.f314773e = str;
        this.f314774f = na0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        rs5.h result = (rs5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result == rs5.h.f480890e || result == rs5.h.f480891f || result == rs5.h.f480892g || result == rs5.h.f480893h;
        ce2.i iVar = this.f314772d;
        if (z17) {
            yz5.p pVar = dk2.u7.f315732s;
            if (pVar != null) {
                java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
                pVar.mo149xb9724478(field_rewardProductId, java.lang.Boolean.TRUE);
            }
            dk2.u7.f315732s = null;
            java.util.Map map = dk2.u7.f315720g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "<get-customGiftResourceMd5Map>(...)");
            map.put(iVar.f67814x2c488eb6, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1) ((jz5.n) dk2.u7.f315733t).mo141623x754a37bb();
            java.lang.String m75945x2fec8307 = this.f314774f.m75945x2fec8307(7);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c14940x2aae97e1.m58935xa92fde5d(m75945x2fec8307);
            dk2.u7.f315726m.put(iVar.f67814x2c488eb6, java.lang.Float.valueOf(c14940x2aae97e1.d() * 1000));
        }
        dk2.u7 u7Var = dk2.u7.f315714a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftLoader", this.f314773e + " fetchCustomGiftMagicRewardResource customGift id:" + iVar.f67814x2c488eb6 + " name:" + iVar.f67809x225f1eb0 + " success:" + z17 + ", duration:" + dk2.u7.f315726m.get(iVar.f67814x2c488eb6) + '!');
        return jz5.f0.f384359a;
    }
}
