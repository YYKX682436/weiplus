package zc;

/* loaded from: classes11.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f552876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, android.content.Intent intent) {
        super(1);
        this.f552875d = c3646xcf902238;
        this.f552876e = intent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "closeWindow result: " + booleanValue + '}', new java.lang.Object[0]);
        if (!booleanValue) {
            com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552875d;
            c3646xcf902238.f127508q.setResult(-1, this.f552876e);
            c3646xcf902238.f127508q.finish();
        }
        return jz5.f0.f384359a;
    }
}
