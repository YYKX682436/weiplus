package ic3;

/* loaded from: classes12.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 f371950d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7) {
        this.f371950d = activityC16419x510d00b7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7 activityC16419x510d00b7 = this.f371950d;
        java.lang.String str = activityC16419x510d00b7.f229383d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "force pull ads");
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        for (int i17 = 1; i17 < 11; i17++) {
            wj.t0 posId = activityC16419x510d00b7.f229384e;
            java.lang.String aid = java.lang.String.valueOf(i17);
            ((wj.j0) iVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
            posId.toString();
            gk.b.f353941a.e(posId.f528051d, ik.f.f373354a.e(posId, aid));
        }
        wj.t0 t0Var = activityC16419x510d00b7.f229384e;
        if (!t0Var.f528053f) {
            java.lang.String valueOf = java.lang.String.valueOf(activityC16419x510d00b7.f229388i.g(100000L));
            r45.e5 e5Var = new r45.e5();
            e5Var.set(6, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(valueOf));
            e5Var.set(5, activityC16419x510d00b7.f229384e.f528051d);
            e5Var.set(8, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(valueOf));
            e5Var.set(23, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c("ad desc"));
            e5Var.set(9, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c("https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png"));
            e5Var.set(10, "https://dldir1v6.qq.com/weixin/checkresupdate/shopicon_51fca260daa5429ca68962e278c6eef5.png");
            byte[] mo14344x5f01b1f6 = e5Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            ((wj.j0) iVar).qj(t0Var, mo14344x5f01b1f6, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.ad.ActivityC16419x510d00b7.U6(activityC16419x510d00b7, "don't click this button, if you click it, please click FORCE CLEAN");
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
