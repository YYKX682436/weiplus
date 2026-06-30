package op4;

/* loaded from: classes10.dex */
public final class l extends yt3.a implements ju3.d0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Intent f428825f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f428826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ju3.d0 status, android.content.Intent intent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f428825f = intent;
        this.f428826g = new java.util.HashMap();
    }

    public final op4.k A(java.lang.String reportId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportId, "reportId");
        java.util.HashMap hashMap = this.f428826g;
        if (hashMap.get(reportId) == null) {
            return null;
        }
        java.lang.Object obj = hashMap.get(reportId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.plugin.vlog.ui.timelineeditor.report.TimelineEditorReportPlugin.getReportInfo");
        return (op4.k) obj;
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        java.util.Iterator it = this.f428826g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        java.util.Iterator it = this.f428826g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).c();
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        this.f428826g.clear();
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.util.Iterator it = this.f428826g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).w(status, bundle);
        }
    }

    public final void z(op4.k info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f428826g.put(info.g(), info);
        info.a(this.f428825f);
    }
}
