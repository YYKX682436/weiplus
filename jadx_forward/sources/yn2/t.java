package yn2;

/* loaded from: classes2.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn2.u f545543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f545544e;

    public t(yn2.u uVar, in5.s0 s0Var) {
        this.f545543d = uVar;
        this.f545544e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/SeeLaterTitleConvert$setDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = this.f545543d.f545545e;
        if (eVar != null) {
            int m8183xf806b362 = this.f545544e.m8183xf806b362();
            xn2.p0 p0Var = (xn2.p0) eVar;
            android.app.Activity context = p0Var.f537076a;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
            if (activityC21401x6ce6f73f != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_context_id", p0Var.f537077b);
                wn2.f fVar = (wn2.f) i95.n0.c(wn2.f.class);
                fVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = fVar.f529055f;
                if (i0Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "enterFinderLongVideoSeeLaterUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar = i0Var.f202472h;
                    if (jVar != null) {
                        jVar.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i.f202464g);
                    }
                }
                vn2.u0 u0Var = vn2.u0.f519920a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca loader = p0Var.j();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.b1) ((jz5.n) p0Var.f537091p).mo141623x754a37bb();
                java.lang.String tag = p0Var.f537078c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                vn2.u0.f519925f = new jz5.l(java.lang.Long.valueOf(elapsedRealtime), loader.c().c());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "click position=" + m8183xf806b362 + " SeeLaterEntranceFeed:null,data key=" + elapsedRealtime);
                intent.putExtra("key_see_later_data_key", elapsedRealtime);
                intent.putExtra("KEY_FINDER_PROCESS_ID", 1);
                intent.addFlags(67108864);
                intent.setClass(activityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14084xd75edc24.class);
                ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(intent)).f279410a = new vn2.q0(b1Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/SeeLaterTitleConvert$setDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
