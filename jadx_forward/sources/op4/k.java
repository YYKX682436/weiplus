package op4;

/* loaded from: classes10.dex */
public abstract class k implements ju3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public jx3.a f428824d;

    public abstract void a(android.content.Intent intent);

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "report:" + g());
        jx3.a aVar = this.f428824d;
        if (aVar != null) {
            aVar.k();
        }
    }

    public abstract java.lang.String g();

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "reportOnce:" + g());
        jx3.a aVar = this.f428824d;
        if (aVar != null) {
            aVar.k();
        }
        this.f428824d = null;
    }

    public final java.lang.String i() {
        return "MicroMsg.TimelineEditorReportBasePlugin" + g();
    }
}
