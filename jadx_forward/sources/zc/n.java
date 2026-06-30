package zc;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f552891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, boolean z17) {
        super(1);
        this.f552890d = c3646xcf902238;
        this.f552891e = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zc.x c17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "setForbidRightGestureEnable result: " + booleanValue + '}', new java.lang.Object[0]);
        if (!booleanValue && (c17 = this.f552890d.c()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950 activityC15553x533c7950 = (com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) c17;
            f03.a aVar = activityC15553x533c7950.f218851s;
            boolean z17 = this.f552891e;
            if (aVar != null) {
                aVar.f339951c = z17;
            }
            if (z17) {
                activityC15553x533c7950.S5(false);
            } else {
                activityC15553x533c7950.S5(aVar != null ? aVar.f339950b : true);
            }
        }
        return jz5.f0.f384359a;
    }
}
