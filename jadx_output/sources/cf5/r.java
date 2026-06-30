package cf5;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f41020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(long j17, long j18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41019d = j17;
        this.f41020e = j18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cf5.r(this.f41019d, this.f41020e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cf5.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set set = cf5.t.f41028b;
        long j17 = this.f41019d;
        boolean add = set.add(new java.lang.Long(j17));
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!add) {
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41029c).remove(new java.lang.Long(j17));
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41030d).remove(new java.lang.Long(j17));
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41031e).remove(new java.lang.Long(j17));
            ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41032f).remove(new java.lang.Long(j17));
            return f0Var;
        }
        cf5.n nVar = (cf5.n) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41029c).remove(new java.lang.Long(j17));
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41030d).remove(new java.lang.Long(j17));
        long longValue = l17 != null ? l17.longValue() : 0L;
        java.lang.Long l18 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41031e).remove(new java.lang.Long(j17));
        long longValue2 = l18 != null ? l18.longValue() : 0L;
        java.lang.Long l19 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) cf5.t.f41032f).remove(new java.lang.Long(j17));
        long longValue3 = l19 != null ? l19.longValue() : 0L;
        java.util.Map l27 = kz5.c1.l(new jz5.l("msg_svr_id", new java.lang.Long(j17)), new jz5.l("render_cost_ms", new java.lang.Long(this.f41020e)), new jz5.l("inner_version", new java.lang.Integer(1)));
        if (nVar != null) {
            l27.put("text_length", new java.lang.Integer(nVar.f41008b));
            l27.put("parse_cost_ms", new java.lang.Long(nVar.f41009c));
            l27.put("block_count", new java.lang.Integer(nVar.f41010d));
            l27.put("is_streaming", java.lang.Boolean.valueOf(nVar.f41011e));
            cf5.m mVar = nVar.f41012f;
            l27.put("bold_count", new java.lang.Integer(mVar.f40989a));
            l27.put("code_block_count", new java.lang.Integer(mVar.f40990b));
            l27.put("inline_code_count", new java.lang.Integer(mVar.f40991c));
            l27.put("table_count", new java.lang.Integer(mVar.f40992d));
            l27.put("table_cell_count", new java.lang.Integer(mVar.f40993e));
            l27.put("heading_count", new java.lang.Integer(mVar.f40994f));
            l27.put("ordered_list_count", new java.lang.Integer(mVar.f40995g));
            l27.put("unordered_list_count", new java.lang.Integer(mVar.f40996h));
            l27.put("list_item_count", new java.lang.Integer(mVar.f40997i));
            l27.put("blockquote_count", new java.lang.Integer(mVar.f40998j));
            l27.put("math_block_count", new java.lang.Integer(mVar.f40999k));
            l27.put("hr_count", new java.lang.Integer(mVar.f41000l));
            l27.put("link_count", new java.lang.Integer(mVar.f41001m));
            l27.put("italic_count", new java.lang.Integer(mVar.f41002n));
            l27.put("strikethrough_count", new java.lang.Integer(mVar.f41003o));
            l27.put("inline_math_count", new java.lang.Integer(mVar.f41004p));
            l27.put("code_block_char_count", new java.lang.Integer(mVar.f41005q));
            l27.put("table_cell_char_count", new java.lang.Integer(mVar.f41006r));
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
        cf5.t tVar = cf5.t.f41027a;
        try {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                ((cy1.a) rVar).Ej("markdown_perf", linkedHashMap, 38006);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownPerfReporter", "reportEvent: event=%s, params=%s", "markdown_perf", linkedHashMap);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MarkdownPerfReporter", e17, "reportEvent failed", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
