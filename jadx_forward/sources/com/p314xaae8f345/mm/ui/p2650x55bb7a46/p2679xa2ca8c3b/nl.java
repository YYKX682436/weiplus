package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class nl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f286466s = "ChattingItemFinderLiveSubscriptionNotifyTmpl";

    /* renamed from: t, reason: collision with root package name */
    public yb5.d f286467t;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view == null || view.getTag() == null) {
            view = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.cnf);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kl klVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kl();
            klVar.f285884b = view.findViewById(com.p314xaae8f345.mm.R.id.bkn);
            klVar.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
            klVar.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
            klVar.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
            android.view.View view2 = klVar.f285884b;
            if (view2 != null) {
                klVar.f285885c = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.qmn);
                klVar.f285886d = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.qmt);
                klVar.f285887e = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.qmm);
                klVar.f285888f = view2.findViewById(com.p314xaae8f345.mm.R.id.qms);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.i0j);
                klVar.f285889g = textView;
                com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
                klVar.f285890h = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.qmq);
                klVar.f285891i = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.qmw);
                klVar.f285892j = view2.findViewById(com.p314xaae8f345.mm.R.id.qmu);
                klVar.f285893k = view2.findViewById(com.p314xaae8f345.mm.R.id.kgg);
            }
            view.setTag(klVar);
        }
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        java.lang.Object tag = v17.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        boolean z17 = false;
        if (erVar == null) {
            return false;
        }
        int d17 = erVar.d();
        yb5.d dVar = this.f286467t;
        if (dVar != null && !dVar.F()) {
            z17 = true;
        }
        if (z17) {
            menu.c(d17, 100, 0, v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[LOOP:1: B:60:0x01b8->B:62:0x01be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r21, yb5.d r22, rd5.d r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nl.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
