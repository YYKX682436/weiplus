package un0;

/* loaded from: classes13.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510936g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510937h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var5) {
        super(1);
        this.f510933d = h0Var;
        this.f510934e = h0Var2;
        this.f510935f = h0Var3;
        this.f510936g = h0Var4;
        this.f510937h = h0Var5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list;
        java.util.Iterator it;
        java.lang.String from = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#invokeToStop call. from=".concat(from));
        ((android.media.projection.MediaProjection) this.f510933d.f391656d).stop();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f510934e;
        un0.h hVar = (un0.h) h0Var.f391656d;
        if (hVar != null && (list = hVar.f510896l) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).mo152xb9724478();
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f510935f;
        android.hardware.display.VirtualDisplay virtualDisplay = (android.hardware.display.VirtualDisplay) h0Var2.f391656d;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        h0Var2.f391656d = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = this.f510936g;
        android.media.AudioRecord audioRecord = (android.media.AudioRecord) h0Var3.f391656d;
        if (audioRecord != null) {
            audioRecord.release();
        }
        h0Var3.f391656d = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4 = this.f510937h;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) h0Var4.f391656d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        h0Var4.f391656d = null;
        h0Var.f391656d = null;
        un0.s.f510951b = null;
        return jz5.f0.f384359a;
    }
}
