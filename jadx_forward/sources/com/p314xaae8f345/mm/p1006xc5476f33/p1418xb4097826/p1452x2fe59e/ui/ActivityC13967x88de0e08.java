package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameSelectUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLiveBaseUI;", "Landroid/view/View;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "root", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGameSelectUI */
/* loaded from: classes3.dex */
public final class ActivityC13967x88de0e08 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13962x42207ca9 {
    public static final /* synthetic */ int F = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public android.view.View root;
    public android.widget.EditText B;
    public android.widget.RelativeLayout C;
    public boolean D;

    /* renamed from: y, reason: collision with root package name */
    public cm2.m f190823y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f190824z;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f190821w = "Finder.FinderGameSelectUI";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f190822x = new java.util.ArrayList();
    public final jz5.g E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.y4(this));

    public static final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08 activityC13967x88de0e08, r45.n73 n73Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        activityC13967x88de0e08.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("go postui, game:");
        r45.z53 z53Var = (r45.z53) n73Var.m75936x14adae67(1);
        sb6.append(z53Var != null ? z53Var.m75945x2fec8307(1) : null);
        sb6.append(", ");
        r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
        sb6.append(z53Var2 != null ? z53Var2.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13967x88de0e08.f190821w, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        r45.s63 s63Var = (r45.s63) n73Var.m75936x14adae67(3);
        java.lang.String str3 = "";
        if (s63Var == null || (str = s63Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        intent.putExtra("COVER_URL", str);
        r45.s63 s63Var2 = (r45.s63) n73Var.m75936x14adae67(3);
        if (s63Var2 == null || (str2 = s63Var2.m75945x2fec8307(0)) == null) {
            str2 = "";
        }
        intent.putExtra("DESC", str2);
        intent.putExtra("TICKET", "");
        r45.z53 z53Var3 = (r45.z53) n73Var.m75936x14adae67(1);
        if (z53Var3 != null && (m75945x2fec8307 = z53Var3.m75945x2fec8307(0)) != null) {
            str3 = m75945x2fec8307;
        }
        intent.putExtra("APPID", str3);
        intent.putExtra("POST_FROM_SCENE", 0);
        intent.putExtra("GameUserInfo", n73Var.mo14344x5f01b1f6());
        intent.putExtra("MINI_GAME_SCENE", 1);
    }

    public static final void e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08 activityC13967x88de0e08) {
        activityC13967x88de0e08.getClass();
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13967x88de0e08.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        android.content.Intent intent = new android.content.Intent();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityRouter", "enterFinderGameLiveSearchUI");
        intent.setClass(mo55332x76847179, (java.lang.Class) ((jz5.n) jz2.x0.F).mo141623x754a37bb());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGameSearchUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f7() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f190824z;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rv");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getCustomBounceId */
    public int mo56571xc86d394a() {
        return com.p314xaae8f345.mm.R.id.goj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ajx;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df A[LOOP:1: B:16:0x00d9->B:18:0x00df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.AbstractActivityC13962x42207ca9, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13967x88de0e08.onCreate(android.os.Bundle):void");
    }

    /* renamed from: setRoot */
    public final void m56572x764fb064(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.root = view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(d92.b1.class);
    }
}
