package mi5;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.q f408424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x05.c f408426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fc5.g f408427g;

    public p(mi5.q qVar, android.content.Context context, x05.c cVar, fc5.g gVar) {
        this.f408424d = qVar;
        this.f408425e = context;
        this.f408426f = cVar;
        this.f408427g = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f408425e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        this.f408424d.getClass();
        android.content.Intent intent = new android.content.Intent();
        fc5.g gVar = this.f408427g;
        java.lang.String m75945x2fec8307 = gVar.m75945x2fec8307(gVar.f125235d + 1);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        int i17 = gVar.f125235d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = e0Var.k(gVar.m75945x2fec8307(i17 + 1), gVar.m75942xfb822ef2(i17 + 0));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m75945x2fec8307)) {
            intent.putExtra("key_finder_teen_mode_scene", 2);
            intent.putExtra("report_scene", 2);
        } else {
            intent.putExtra("key_finder_teen_mode_scene", 1);
            intent.putExtra("report_scene", 1);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(m75945x2fec8307) ? 3 : 2, 3, 32, intent);
        intent.putExtra("key_enter_profile_type", 4);
        intent.putExtra("key_entrance_type", 0);
        intent.putExtra("key_from_comment_scene", 11);
        intent.putExtra("from_user", m75945x2fec8307);
        x05.c cVar = this.f408426f;
        intent.putExtra("key_ec_source", cVar.n());
        intent.putExtra("finder_username", cVar.m174810x6c03c64c());
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_user_name", cVar.m174809x8010e5e4());
        intent.putExtra("key_finder_teen_mode_user_id", cVar.m174810x6c03c64c());
        if (k17 != null) {
            intent.putExtra("key_from_user_name", ki0.a.a(k17));
            intent.putExtra("key_to_user_name", ki0.a.b(k17));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bj(intent, k17, new r45.md5());
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f542005a.w(context, intent);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderNameCardView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
