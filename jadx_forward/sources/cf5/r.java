package cf5;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f122552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f122553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122552d = j17;
        this.f122553e = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cf5.r(this.f122552d, this.f122553e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cf5.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.Set set = cf5.t.f122561b;
        long j17 = this.f122552d;
        boolean add = set.add(new java.lang.Long(j17));
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!add) {
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122562c).remove(new java.lang.Long(j17));
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122563d).remove(new java.lang.Long(j17));
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122564e).remove(new java.lang.Long(j17));
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122565f).remove(new java.lang.Long(j17));
            return f0Var;
        }
        cf5.n nVar = (cf5.n) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122562c).remove(new java.lang.Long(j17));
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122563d).remove(new java.lang.Long(j17));
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Long l18 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122564e).remove(new java.lang.Long(j17));
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        java.lang.Long l19 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f122565f).remove(new java.lang.Long(j17));
        long longValue3 = l19 != null ? l19.longValue() : 0L;
        java.util.Map l27 = kz5.c1.l(new jz5.l("msg_svr_id", new java.lang.Long(j17)), new jz5.l("render_cost_ms", new java.lang.Long(this.f122553e)), new jz5.l("inner_version", new java.lang.Integer(1)));
        if (nVar != null) {
            l27.put("text_length", new java.lang.Integer(nVar.f122541b));
            l27.put("parse_cost_ms", new java.lang.Long(nVar.f122542c));
            l27.put("block_count", new java.lang.Integer(nVar.f122543d));
            l27.put("is_streaming", java.lang.Boolean.valueOf(nVar.f122544e));
            cf5.m mVar = nVar.f122545f;
            l27.put("bold_count", new java.lang.Integer(mVar.f122522a));
            l27.put("code_block_count", new java.lang.Integer(mVar.f122523b));
            l27.put("inline_code_count", new java.lang.Integer(mVar.f122524c));
            l27.put("table_count", new java.lang.Integer(mVar.f122525d));
            l27.put("table_cell_count", new java.lang.Integer(mVar.f122526e));
            l27.put("heading_count", new java.lang.Integer(mVar.f122527f));
            l27.put("ordered_list_count", new java.lang.Integer(mVar.f122528g));
            l27.put("unordered_list_count", new java.lang.Integer(mVar.f122529h));
            l27.put("list_item_count", new java.lang.Integer(mVar.f122530i));
            l27.put("blockquote_count", new java.lang.Integer(mVar.f122531j));
            l27.put("math_block_count", new java.lang.Integer(mVar.f122532k));
            l27.put("hr_count", new java.lang.Integer(mVar.f122533l));
            l27.put("link_count", new java.lang.Integer(mVar.f122534m));
            l27.put("italic_count", new java.lang.Integer(mVar.f122535n));
            l27.put("strikethrough_count", new java.lang.Integer(mVar.f122536o));
            l27.put("inline_math_count", new java.lang.Integer(mVar.f122537p));
            l27.put("code_block_char_count", new java.lang.Integer(mVar.f122538q));
            l27.put("table_cell_char_count", new java.lang.Integer(mVar.f122539r));
        }
        l27.put("code_highlight_cost_ms", new java.lang.Long(longValue));
        l27.put("code_block_render_cost_ms", new java.lang.Long(longValue2));
        l27.put("table_render_cost_ms", new java.lang.Long(longValue3));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = ((java.util.LinkedHashMap) l27).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object value = entry.getValue();
            if (((value instanceof java.lang.Number) && ((java.lang.Number) value).longValue() == 0) ? false : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        cf5.t tVar = cf5.t.f122560a;
        try {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej("markdown_perf", linkedHashMap, 38006);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MarkdownPerfReporter", "reportEvent: event=%s, params=%s", "markdown_perf", linkedHashMap);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MarkdownPerfReporter", e17, "reportEvent failed", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
