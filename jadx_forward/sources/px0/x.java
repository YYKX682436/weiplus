package px0;

/* loaded from: classes5.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc) {
        super(0);
        this.f440346d = c10988x551cb0cc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440346d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd) ((jz5.n) c10988x551cb0cc.f151192w).mo141623x754a37bb();
        if (c16995x8ab634cd != null) {
            linkedHashMap.put("source_feedid", pm0.v.u(c16995x8ab634cd.f237227h));
            java.lang.String finderContextId = c16995x8ab634cd.f237230n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderContextId, "finderContextId");
            linkedHashMap.put("finder_context_id", finderContextId);
            java.lang.String finderTabContextId = c16995x8ab634cd.f237231o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderTabContextId, "finderTabContextId");
            linkedHashMap.put("finder_tab_context_id", finderTabContextId);
            linkedHashMap.put("comment_scene", 379);
            java.lang.String str = (java.lang.String) ((jz5.n) c10988x551cb0cc.f151193x).mo141623x754a37bb();
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("templateid", str);
            i95.m c17 = i95.n0.c(zy2.pa.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            long j17 = c16995x8ab634cd.f237227h;
            java.lang.String str2 = c16995x8ab634cd.f237228i;
            int i17 = c16995x8ab634cd.f237233q;
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            linkedHashMap.put("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18).ek(j17, str2, i17));
        }
        return linkedHashMap;
    }
}
