package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f249820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 f249821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f249822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 h2Var, android.widget.ImageView imageView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f249821e = h2Var;
        this.f249822f = imageView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f2 f2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f2(this.f249821e, this.f249822f, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        return f2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        java.lang.Object mo150x989b7ca4 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f249820d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 h2Var = this.f249821e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e2(h2Var, null);
            this.f249820d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, e2Var, this);
            if (obj == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "withContext(...)");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBitmapContainer$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.util.HashMap hashMap = h2Var.f250018q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBitmapContainer$p", "com.tencent.mm.plugin.sns.ui.ExceprtWidget");
        java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2.o(h2Var);
        if (o17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        hashMap.put(o17, bitmap);
        if (ca4.z0.f(bitmap)) {
            android.widget.ImageView imageView = this.f249822f;
            if ((imageView != null ? imageView.getTag() : null) != null && (imageView.getTag() instanceof java.lang.String)) {
                java.lang.Object tag = imageView.getTag();
                java.lang.String o18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2.o(h2Var);
                if (o18 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    throw null;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, o18)) {
                    imageView.setImageBitmap(bitmap);
                }
            }
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$1");
        return f0Var;
    }
}
