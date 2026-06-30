package ya2;

/* loaded from: classes.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f541964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context) {
        super(1);
        this.f541964d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.au2 resp = (r45.au2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "type " + resp.m75939xb282bd08(1) + " qrcode_generator_version " + resp.m75939xb282bd08(2));
        int m75939xb282bd08 = resp.m75939xb282bd08(1);
        android.content.Context context = this.f541964d;
        if (m75939xb282bd08 == 1) {
            android.content.Intent intent = new android.content.Intent();
            r45.ry0 ry0Var = (r45.ry0) resp.m75936x14adae67(3);
            intent.putExtra("feed_object_id", ry0Var != null ? java.lang.Long.valueOf(ry0Var.m75942xfb822ef2(0)) : null);
            r45.ry0 ry0Var2 = (r45.ry0) resp.m75936x14adae67(3);
            intent.putExtra("key_share_open_image_source_ref_comment_id", ry0Var2 != null ? java.lang.Long.valueOf(ry0Var2.m75942xfb822ef2(1)) : null);
            intent.putExtra("key_need_related_list", false);
            intent.putExtra("business_type", 0);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(55, 45, 25, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f542005a.A(context, intent, false);
        } else {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
