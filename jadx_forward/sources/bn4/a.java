package bn4;

/* loaded from: classes15.dex */
public final class a extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f104456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f104456d = "MicroMsg.TopStory.TopStoryMultiTaskUIC";
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        java.lang.String str = this.f104456d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        byte[] bArr = info.f66790x225a93cf;
        r45.wn6 wn6Var = new r45.wn6();
        try {
            wn6Var.mo11468x92b714fd(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "handleBallInfoClicked exception:%s", e17);
        }
        java.util.LinkedList linkedList = wn6Var.f470857r;
        if (linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleBallInfoClicked, cache video list size == 0");
            return;
        }
        r45.un6 un6Var = new r45.un6();
        un6Var.f469039i = wn6Var.f470855p;
        un6Var.f469043p = wn6Var.f470850h;
        r45.xn6 xn6Var = (r45.xn6) linkedList.get(0);
        un6Var.f469042o = xn6Var;
        un6Var.f469034d = xn6Var != null ? xn6Var.f471792h : null;
        un6Var.f469036f = wn6Var.f470848f;
        un6Var.f469035e = wn6Var.f470847e;
        un6Var.f469037g = wn6Var.f470849g;
        un6Var.f469038h = wn6Var.f470851i;
        java.lang.String str2 = wn6Var.f470852m;
        un6Var.f469045r = str2;
        un6Var.A = wn6Var.f470854o;
        un6Var.f469046s = wn6Var.f470853n;
        un6Var.f469041n = wn6Var.f470856q;
        un6Var.f469044q = wn6Var.f470858s;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str2;
        objArr[1] = xn6Var != null ? xn6Var.f471792h : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleBallInfoClicked, contextId:%s videoId:%s", objArr);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(m158354x19263085);
        } else {
            android.content.Intent intent = new android.content.Intent();
            try {
                intent.putExtra("key_context", un6Var.mo14344x5f01b1f6());
                r45.w60 w60Var = new r45.w60();
                w60Var.set(0, animateData);
                intent.putExtra("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
            } catch (java.io.IOException unused) {
            }
            if (un6Var.f469038h == 100203) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(m158354x19263085, ".ui.video.fs.TopStoryMultiTaskFSVideoUI", intent);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.i(m158354x19263085, ".ui.video.list.TopStoryMultiTaskListVideoUI", intent);
            }
        }
        m158354x19263085().overridePendingTransition(0, 0);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f104456d = "MicroMsg.TopStory.TopStoryMultiTaskUIC";
    }
}
