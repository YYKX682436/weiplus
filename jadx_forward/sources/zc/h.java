package zc;

/* loaded from: classes11.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238) {
        super(1);
        this.f552881d = c3646xcf902238;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "flutter ui handle navigate back.", new java.lang.Object[0]);
        } else {
            this.f552881d.f127508q.finish();
        }
        return jz5.f0.f384359a;
    }
}
