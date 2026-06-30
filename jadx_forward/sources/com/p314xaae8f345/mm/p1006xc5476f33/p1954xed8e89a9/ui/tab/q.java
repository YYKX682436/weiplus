package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f f236048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f236049e;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.f fVar, java.util.ArrayList arrayList) {
        this.f236048d = fVar;
        this.f236049e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it;
        r45.l5 l5Var;
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.tj6 tj6Var;
        r45.gl glVar;
        r45.tj6 tj6Var2;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.tj6 tj6Var3;
        r45.gl glVar4;
        r45.tj6 tj6Var4;
        r45.gl glVar5;
        r45.tj6 tj6Var5;
        r45.gl glVar6;
        r45.tj6 tj6Var6;
        r45.gl glVar7;
        r45.gl glVar8;
        r45.gl glVar9;
        java.util.ArrayList messages = this.f236049e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(messages, "$messages");
        vr3.t tVar = (vr3.t) this.f236048d;
        tVar.getClass();
        if (messages.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: messages is null or empty");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Received " + messages.size() + " messages");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = tVar.f521183a;
        r45.wl c17 = c16893x570516c7.c((r45.wl) c16893x570516c7.f235815m.mo3195x754a37bb());
        r45.wl c18 = c16893x570516c7.c((r45.wl) c16893x570516c7.f235816n.mo3195x754a37bb());
        r45.wl c19 = c16893x570516c7.c((r45.wl) c16893x570516c7.f235819q.mo3195x754a37bb());
        r45.wl c27 = c16893x570516c7.c((r45.wl) c16893x570516c7.f235818p.mo3195x754a37bb());
        int i17 = 0;
        for (java.util.Iterator it6 = messages.iterator(); it6.hasNext(); it6 = it) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.s5 s5Var = (r45.s5) next;
            try {
                p5Var = s5Var.f467047i;
                linkedList = p5Var != null ? p5Var.f464287e : null;
            } catch (java.lang.Exception e17) {
                e = e17;
                it = it6;
            }
            if (p5Var != null && linkedList != null && !linkedList.isEmpty()) {
                r45.o5 o5Var = (r45.o5) linkedList.getFirst();
                r45.z5 z5Var = o5Var.R;
                int i19 = z5Var != null ? z5Var.f473251e : 0;
                if (i19 == 0) {
                    r45.l5 l5Var2 = p5Var.f464286d;
                    i19 = l5Var2 != null ? l5Var2.f460671d : 0;
                }
                if (i19 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileDataFetcher", '[' + i17 + "] appMsgId is 0, skip");
                    it = it6;
                } else {
                    if (c17 == null || (glVar9 = c17.f470768f) == null) {
                        it = it6;
                        linkedList2 = null;
                    } else {
                        linkedList2 = glVar9.f456856d;
                        it = it6;
                    }
                    try {
                        vr3.t.a(linkedList2, o5Var, i19, "profileInitRespData.Msg", arrayList);
                        vr3.t.a((c17 == null || (glVar8 = c17.f470768f) == null) ? null : glVar8.f456860h, o5Var, i19, "profileInitRespData.FeaturedList", arrayList);
                        vr3.t.a((c17 == null || (tj6Var6 = c17.D) == null || (glVar7 = tj6Var6.f468042e) == null) ? null : glVar7.f456856d, o5Var, i19, "profileInitRespData.PicTab", arrayList2);
                        vr3.t.a((c17 == null || (tj6Var5 = c17.D) == null || (glVar6 = tj6Var5.f468042e) == null) ? null : glVar6.f456860h, o5Var, i19, "profileInitRespData.PicTab.FeaturedList", arrayList2);
                        vr3.t.a((c17 == null || (tj6Var4 = c17.C) == null || (glVar5 = tj6Var4.f468042e) == null) ? null : glVar5.f456856d, o5Var, i19, "profileInitRespData.ArticleTab", arrayList3);
                        vr3.t.a((c17 == null || (tj6Var3 = c17.C) == null || (glVar4 = tj6Var3.f468042e) == null) ? null : glVar4.f456860h, o5Var, i19, "profileInitRespData.ArticleTab.FeaturedList", arrayList3);
                        vr3.t.a((c18 == null || (glVar3 = c18.f470768f) == null) ? null : glVar3.f456856d, o5Var, i19, "bizProfileMsgResp.Msg", arrayList);
                        vr3.t.a((c19 == null || (tj6Var2 = c19.D) == null || (glVar2 = tj6Var2.f468042e) == null) ? null : glVar2.f456856d, o5Var, i19, "bizPicProfile.PicTab", arrayList2);
                        vr3.t.a((c27 == null || (tj6Var = c27.C) == null || (glVar = tj6Var.f468042e) == null) ? null : glVar.f456856d, o5Var, i19, "bizPicProfile.ArticleTab", arrayList3);
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Exception processing message[");
                        sb6.append(i17);
                        sb6.append("]: ");
                        sb6.append(e);
                        sb6.append(", updateMsg=");
                        r45.p5 p5Var2 = s5Var.f467047i;
                        sb6.append((p5Var2 == null || (l5Var = p5Var2.f464286d) == null) ? null : java.lang.Integer.valueOf(l5Var.f460671d));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileDataFetcher", sb6.toString(), e);
                        i17 = i18;
                    }
                }
                i17 = i18;
            }
            it = it6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizProfileDataFetcher", '[' + i17 + "] updateMsg appMsg or detailInfo is null/empty");
            i17 = i18;
        }
        ik1.h0.b(new vr3.s(arrayList, c16893x570516c7, arrayList3, arrayList2));
        if (c17 != null) {
            try {
                qr3.c0.c(c17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Saved profileInitRespData to cache");
            } catch (java.io.IOException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Failed to save profileInitRespData: " + e19, e19);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileDataFetcher", "subscribeProfileUpdateMessages: End.");
    }
}
