package en4;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18752xe045e0a7 f336875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18752xe045e0a7 c18752xe045e0a7) {
        super(1);
        this.f336875d = c18752xe045e0a7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wm4.y yVar;
        pm4.z state = (pm4.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof vm4.b) && (yVar = ((vm4.b) dVar).f519679b) != null) {
            int i17 = yVar.f528853d;
            int i18 = yVar.f528852c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.uic.C18752xe045e0a7 c18752xe045e0a7 = this.f336875d;
            c18752xe045e0a7.getClass();
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            android.content.Intent a17 = su4.r2.a();
            a17.putExtra("ftsneedkeyboard", true);
            a17.putExtra("ftsbizscene", i18);
            a17.putExtra("ftsType", i17);
            a17.putExtra("key_change_search_icon", true);
            java.util.Map b17 = su4.r2.b(i18, false, i17);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            long g17 = o13.n.g(1005);
            java.util.HashMap hashMap = (java.util.HashMap) b17;
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(g17));
            hashMap.put("subSessionId", java.lang.String.valueOf(g17));
            hashMap.put("isSug", "1");
            a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(g17));
            a17.putExtra("subSessionId", java.lang.String.valueOf(g17));
            java.lang.String e17 = su4.r2.e(b17, 0);
            a17.putExtra("rawUrl", e17);
            a17.putExtra("key_load_js_without_delay", true);
            a17.putExtra("key_search_icon_and_hint_fix_default", true);
            a17.putExtra("key_preload_biz", 4);
            a17.putExtra("key_back_and_clear_query", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStorySearchUIC", "openSearchPage searchType:" + i17 + " searchScene:" + i18 + " url:" + e17);
            j45.l.z(c18752xe045e0a7.m158354x19263085(), a17, null);
        }
        return jz5.f0.f384359a;
    }
}
