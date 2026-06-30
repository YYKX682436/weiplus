package zd2;

/* loaded from: classes5.dex */
public final class b implements yd2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zd2.b f553125a = new zd2.b();

    @Override // yd2.a
    public long a() {
        return 15000L;
    }

    @Override // yd2.a
    public void b(yd2.l lVar, yd2.b context, yz5.q completion) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14173x5fbb5638 params = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14173x5fbb5638) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        in0.q e17 = dk2.ef.f314905a.e();
        if (e17 == null) {
            completion.mo147xb9724478(java.lang.Boolean.FALSE, "{\"success\": false, \"error\": \"no anchor core\"}", 2002);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolFlipCamera", "flipCamera: switching from backCamera=" + e17.W() + ", toolCallId=" + context.f542566e);
        hn0.h.h(e17, 0, null, 3, null);
        boolean W = e17.W() ^ true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolFlipCamera", "flipCamera: done, isFront=" + W);
        completion.mo147xb9724478(java.lang.Boolean.TRUE, "{\"is_front\": " + W + '}', 0);
    }

    @Override // yd2.a
    public boolean c(yd2.b context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (dk2.ef.f314905a.e() != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.Live.AiAssistant.ToolFlipCamera", "flipCamera: no anchorCore");
        return false;
    }
}
