package bc4;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f100695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f100698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f100699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str, int i17, int i18, android.widget.ImageView imageView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100696e = str;
        this.f100697f = i17;
        this.f100698g = i18;
        this.f100699h = imageView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        bc4.b bVar = new bc4.b(this.f100696e, this.f100697f, this.f100698g, this.f100699h, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        return bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        java.lang.Object mo150x989b7ca4 = ((bc4.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f100695d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f100696e;
            int i18 = this.f100697f;
            int i19 = this.f100698g;
            android.graphics.Bitmap L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(str, i18, i19);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("targetViewWidth: ");
            sb6.append(i18);
            sb6.append(" targetViewHeight: ");
            sb6.append(i19);
            sb6.append(",bitmapWidth: ");
            sb6.append(L != null ? new java.lang.Integer(L.getWidth()) : null);
            sb6.append(" bitmapHeight: ");
            sb6.append(L != null ? new java.lang.Integer(L.getHeight()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtFooterImageLoader", sb6.toString());
            if (L != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                bc4.a aVar2 = new bc4.a(this.f100699h, L, null);
                this.f100695d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, aVar2, this) == aVar) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
                throw illegalStateException;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader$loadImage$1$1");
        return f0Var;
    }
}
