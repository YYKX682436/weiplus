package bn4;

/* loaded from: classes15.dex */
public final class a extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f22923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f22923d = "MicroMsg.TopStory.TopStoryMultiTaskUIC";
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        java.lang.String str = this.f22923d;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        byte[] bArr = info.field_data;
        r45.wn6 wn6Var = new r45.wn6();
        try {
            wn6Var.parseFrom(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "handleBallInfoClicked exception:%s", e17);
        }
        java.util.LinkedList linkedList = wn6Var.f389324r;
        if (linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e(str, "handleBallInfoClicked, cache video list size == 0");
            return;
        }
        r45.un6 un6Var = new r45.un6();
        un6Var.f387506i = wn6Var.f389322p;
        un6Var.f387510p = wn6Var.f389317h;
        r45.xn6 xn6Var = (r45.xn6) linkedList.get(0);
        un6Var.f387509o = xn6Var;
        un6Var.f387501d = xn6Var != null ? xn6Var.f390259h : null;
        un6Var.f387503f = wn6Var.f389315f;
        un6Var.f387502e = wn6Var.f389314e;
        un6Var.f387504g = wn6Var.f389316g;
        un6Var.f387505h = wn6Var.f389318i;
        java.lang.String str2 = wn6Var.f389319m;
        un6Var.f387512r = str2;
        un6Var.A = wn6Var.f389321o;
        un6Var.f387513s = wn6Var.f389320n;
        un6Var.f387508n = wn6Var.f389323q;
        un6Var.f387511q = wn6Var.f389325s;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str2;
        objArr[1] = xn6Var != null ? xn6Var.f390259h : null;
        com.tencent.mars.xlog.Log.i(str, "handleBallInfoClicked, contextId:%s videoId:%s", objArr);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(activity);
        } else {
            android.content.Intent intent = new android.content.Intent();
            try {
                intent.putExtra("key_context", un6Var.toByteArray());
                r45.w60 w60Var = new r45.w60();
                w60Var.set(0, animateData);
                intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
            } catch (java.io.IOException unused) {
            }
            if (un6Var.f387505h == 100203) {
                com.tencent.mm.plugin.websearch.l2.i(activity, ".ui.video.fs.TopStoryMultiTaskFSVideoUI", intent);
            } else {
                com.tencent.mm.plugin.websearch.l2.i(activity, ".ui.video.list.TopStoryMultiTaskListVideoUI", intent);
            }
        }
        getActivity().overridePendingTransition(0, 0);
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f22923d = "MicroMsg.TopStory.TopStoryMultiTaskUIC";
    }
}
