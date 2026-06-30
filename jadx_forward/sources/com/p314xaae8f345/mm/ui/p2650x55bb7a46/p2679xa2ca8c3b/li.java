package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class li implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f286016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286017f;

    public li(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, boolean z17) {
        this.f286017f = c21908xb66fd105;
        this.f286015d = str;
        this.f286016e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286017f;
        android.content.Intent intent = new android.content.Intent(c21908xb66fd105.f284708s.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7.class);
        java.lang.String str = this.f286015d;
        intent.putExtra("key_biz_username", str);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("key_biz_nickname", c01.a2.e(str));
        boolean z17 = this.f286016e;
        if (z17) {
            intent.putExtra("key_biz_presenter_class", i31.i.class.getName());
        } else {
            intent.putExtra("key_biz_presenter_class", com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3.class.getName());
            intent.putExtra("key_need_update", false);
            intent.putExtra("key_need_load_from_remote", true);
        }
        intent.putExtra("key_enter_scene", 2);
        j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) c21908xb66fd105.f284708s.g(), "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent, z17 ? 100 : 101, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ki(this));
    }
}
