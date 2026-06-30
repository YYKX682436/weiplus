package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes4.dex */
public class oa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282780d;

    public oa(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar) {
        this.f282780d = taVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f9)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) view.getTag();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.a aVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.a.EnterCompleteVideo;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd0812 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081();
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.b(f9Var, c19772x1c2cd081, c19772x1c2cd0812)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.a(aVar, f9Var, c19772x1c2cd081.f38869x6ac9171, c19772x1c2cd0812.f38869x6ac9171);
            }
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            r45.uf6 uf6Var = h17.E;
            if (uf6Var != null && !x51.t1.b(uf6Var.f468866d)) {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KFromTimeLine", false);
                intent.putExtra("KStremVideoUrl", uf6Var.f468866d);
                intent.putExtra("KThumUrl", uf6Var.f468871i);
                intent.putExtra("KThumbPath", tj6);
                intent.putExtra("KMediaId", "fakeid_" + f9Var.m124847x74d37ac6());
                intent.putExtra("KMediaVideoTime", uf6Var.f468867e);
                intent.putExtra("KMediaTitle", uf6Var.f468870h);
                intent.putExtra("StreamWording", uf6Var.f468868f);
                intent.putExtra("StremWebUrl", uf6Var.f468869g);
                java.lang.String Q0 = f9Var.Q0();
                boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Q0);
                java.lang.String s17 = R4 ? c01.w9.s(f9Var.j()) : Q0;
                intent.putExtra("KSta_StremVideoAduxInfo", uf6Var.f468872m);
                intent.putExtra("KSta_StremVideoPublishId", uf6Var.f468873n);
                intent.putExtra("KSta_SourceType", 1);
                intent.putExtra("KSta_Scene", (R4 ? com.p314xaae8f345.mm.ui.p2650x55bb7a46.b.TalkChat : com.p314xaae8f345.mm.ui.p2650x55bb7a46.b.Chat).f280015d);
                intent.putExtra("KSta_FromUserName", s17);
                intent.putExtra("KSta_ChatName", Q0);
                intent.putExtra("KSta_MsgId", f9Var.I0());
                intent.putExtra("KSta_SnsStatExtStr", h17.F);
                if (R4) {
                    intent.putExtra("KSta_ChatroomMembercount", ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(Q0));
                }
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = this.f282780d;
                if (Ni > 0) {
                    j45.l.j(taVar.f282957b.f282625g.mo55332x76847179(), "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryViewHolder", "use new stream video play UI");
                } else {
                    j45.l.j(taVar.f282957b.f282625g.mo55332x76847179(), "sns", ".ui.VideoAdPlayerUI", intent, null);
                }
            } else if (uf6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468868f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uf6Var.f468869g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryViewHolder", "moreBtn click,opening " + uf6Var.f468869g);
                android.content.Intent intent2 = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key_snsad_statextstr", h17.F);
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("rawUrl", uf6Var.f468869g);
                intent2.putExtra("useJs", true);
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.na(this, intent2));
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
