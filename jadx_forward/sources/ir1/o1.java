package ir1;

/* loaded from: classes11.dex */
public final class o1 implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 f375561a;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1) {
        this.f375561a = activityC12973x51f8d2d1;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c result = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (result.f90575d == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1 = this.f375561a;
            android.content.Intent intent = result.f90576e;
            java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("key_ori_scope_type", activityC12973x51f8d2d1.f175494g)) : null;
            if (valueOf != null) {
                if (valueOf.intValue() != activityC12973x51f8d2d1.f175494g) {
                    activityC12973x51f8d2d1.d7(valueOf.intValue());
                    activityC12973x51f8d2d1.b7("biz_fans_private_msg_scope_pref");
                }
            }
        }
    }
}
