package zk3;

/* loaded from: classes8.dex */
public final class e extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 28 || i17 == 29;
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info, r45.fr4 animateData, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateData, "animateData");
        r45.p74 p74Var = new r45.p74();
        try {
            p74Var.mo11468x92b714fd(info.f66790x225a93cf);
            q80.d0 d0Var = new q80.d0();
            d0Var.f442182a = p74Var.m75945x2fec8307(0);
            d0Var.f442183b = p74Var.m75945x2fec8307(1);
            java.lang.String m75945x2fec8307 = p74Var.m75945x2fec8307(2);
            d0Var.f442184c = m75945x2fec8307 != null ? new org.json.JSONObject(m75945x2fec8307).toString() : null;
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
            c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.STAR;
            c3708xc1f46f80.f14312x721f2ec7 = p74Var.m75945x2fec8307(0);
            java.lang.String m75945x2fec83072 = p74Var.m75945x2fec8307(3);
            c3708xc1f46f80.f14309xf0df6fda = m75945x2fec83072 != null ? new org.json.JSONObject(m75945x2fec83072) : null;
            d0Var.f442207z = c3708xc1f46f80;
            r45.w60 w60Var = new r45.w60();
            w60Var.set(2, java.lang.Boolean.TRUE);
            w60Var.set(0, animateData);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("key_multi_task_common_info", w60Var.mo14344x5f01b1f6());
            bundle.putString("coverBitmapPath", com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.u0.f232039a.c(info));
            d0Var.f442188g = bundle;
            d0Var.f442197p = com.p314xaae8f345.mm.R.C30854x2dc211.f559261p;
            d0Var.f442198q = com.p314xaae8f345.mm.R.C30854x2dc211.f559261p;
            d0Var.A = 180;
            d0Var.C = 1;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(m80379x76847179(), d0Var, new zk3.d());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppMultiTaskUIC", e17.getMessage());
        }
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f437968e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
