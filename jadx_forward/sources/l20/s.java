package l20;

/* loaded from: classes9.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b f396723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b) {
        super(0);
        this.f396723d = c10547x7c1a666b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String b17;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b = this.f396723d;
        java.lang.String str = c10547x7c1a666b.G;
        if (str != null) {
            if (str.length() > 0) {
                linkedHashMap.put("finder_card_info", str);
            }
        }
        bw5.qf qfVar = c10547x7c1a666b.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA java.lang.String();
        if (qfVar != null && (b17 = qfVar.b()) != null) {
            if (b17.length() > 0) {
                linkedHashMap.put("wxec_card_info", b17);
            }
        }
        return linkedHashMap;
    }
}
