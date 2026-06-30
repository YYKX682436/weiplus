package hr3;

/* loaded from: classes9.dex */
public final class ud implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 f365620d;

    public ud(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 activityC16870x8255eb46) {
        this.f365620d = activityC16870x8255eb46;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUI$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46.f235340h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16870x8255eb46 activityC16870x8255eb46 = this.f365620d;
        java.lang.String X6 = activityC16870x8255eb46.X6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X6, "access$getTalkerUserName(...)");
        if (r26.n0.N(X6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiPictureUI", "talkerUserName isBlank");
            activityC16870x8255eb46.finish();
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUI$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String obj = activityC16870x8255eb46.U6().m79028xfb85ada3().toString();
        if (!r26.n0.N(obj)) {
            w11.r1 b17 = w11.s1.b(activityC16870x8255eb46.X6(), null, 2, null);
            b17.e(obj);
            b17.g(activityC16870x8255eb46.X6());
            w11.r1.d(b17, null, 1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUI", "send text");
        }
        java.lang.String str = ((hr3.pf) activityC16870x8255eb46.m80391xac8f1cfd(hr3.pf.class)).f365431q;
        if (str != null) {
            if (r26.n0.N(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiPictureUI", "localPath isBlank or not exists");
            } else {
                k70.i0 i0Var = new k70.i0();
                i0Var.f386175a = 6;
                java.lang.String r17 = c01.z1.r();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (r17 == null) {
                    r17 = "";
                }
                java.lang.String X62 = activityC16870x8255eb46.X6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X62, "access$getTalkerUserName(...)");
                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(new r70.g(str, 0, r17, X62, i0Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUI", "send image");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUI", "send say hi finish");
        activityC16870x8255eb46.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUI$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
