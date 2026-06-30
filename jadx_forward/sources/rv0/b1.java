package rv0;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481465e = n1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.b1(this.f481465e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f481464d;
        rv0.n1 n1Var = this.f481465e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf p76 = n1Var.p7();
            this.f481464d = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yy0.m7 m7Var = (yy0.m7) n1Var.R6().O6();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.b3(m7Var, null), 3, null);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(n1Var.m80379x76847179(), "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        intent.putExtra("key_can_select_video_and_pic", false);
        intent.putExtra("is_hide_album_footer", true);
        intent.putExtra("show_header_view", false);
        intent.putExtra("max_select_count", 99);
        intent.putExtra("query_source_type", 38);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("album_video_max_duration", 300);
        intent.putExtra("album_video_min_duration", 1);
        intent.putExtra("key_max_video_duration", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj() - 1);
        android.app.Activity m80379x76847179 = n1Var.m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(2222);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(m80379x76847179, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanelUIC$onAppendAssetsButtonClicked$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return jz5.f0.f384359a;
    }
}
