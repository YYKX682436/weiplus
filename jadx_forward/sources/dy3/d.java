package dy3;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy3.n f326109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dy3.n nVar) {
        super(0);
        this.f326109d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return new xm3.t0(this.f326109d.K(), new in5.s() { // from class: com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneDialog$buildItemConvertFactory$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return type == 1 ? new dy3.s() : new dy3.o();
            }
        }, false, 4, null);
    }
}
