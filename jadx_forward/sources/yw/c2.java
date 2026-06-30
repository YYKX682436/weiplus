package yw;

/* loaded from: classes.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f547819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.lang.ref.WeakReference weakReference, com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a) {
        super(1);
        this.f547819d = weakReference;
        this.f547820e = c23232x91bb1d7a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            java.lang.ref.WeakReference weakReference = this.f547819d;
            if (weakReference.get() != null) {
                yw.q2 q2Var = yw.q2.f547967a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference.get();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Ksnsupload_width", 640);
                intent.putExtra("Ksnsupload_height", 640);
                com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a = this.f547820e;
                c01.l2 c17 = c01.n2.d().c(c01.n2.a(c23232x91bb1d7a.m85531x74d37ac6()), true);
                java.lang.Long m85530x7235c680 = c23232x91bb1d7a.m85530x7235c680();
                c17.i("_DATA_CENTER_ITEM_SHOW_TYPE", m85530x7235c680 != null ? java.lang.Integer.valueOf((int) m85530x7235c680.longValue()) : null);
                c17.i("_tmpl_webview_transfer_scene", 10);
                com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractActivityC21394xb3d2c0cf);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC21394xb3d2c0cf.mo55332x76847179();
                y7Var.getClass();
                intent.putExtra("Ksnsupload_type", 0);
                intent.putExtra("sns_kemdia_path", str);
                j45.l.j(mo55332x76847179, "sns", ".ui.SnsUploadUI", intent, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
