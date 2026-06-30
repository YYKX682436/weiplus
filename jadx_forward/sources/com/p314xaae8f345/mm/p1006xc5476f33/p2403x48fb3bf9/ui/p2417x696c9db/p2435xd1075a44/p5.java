package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 f269029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f269030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f269033h;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f269029d = z5Var;
        this.f269030e = i17;
        this.f269031f = i18;
        this.f269032g = str;
        this.f269033h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var = this.f269029d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = z5Var.m74886x86b9ebe3().T2;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (z5Var.m74885xb93408ad().get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var2 = z5Var.m74885xb93408ad().get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var3 = z5Var2;
            com.p314xaae8f345.mm.p944x882e457a.o rr6 = this.f269033h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rr6, "$rr");
            int i17 = this.f269031f;
            java.lang.String str = null;
            if (i17 != 0) {
                java.lang.String str2 = this.f269032g;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    db5.e1.y(z5Var3.getContext(), str2, "", z5Var3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
                    z5Var3.A.setEnabled(i17 != 60005);
                    return;
                }
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgOperateCommentReq");
            r45.m9 m9Var = (r45.m9) fVar;
            int i18 = this.f269030e;
            if (i18 != 0 || i17 != 0) {
                if (m9Var.f461795g == 1) {
                    db5.e1.T(z5Var3.getContext(), z5Var3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ant, java.lang.Integer.valueOf(i17)));
                    if (i18 == 2) {
                        cx4.a.c(11);
                        return;
                    } else {
                        cx4.a.c(12);
                        return;
                    }
                }
                db5.e1.T(z5Var3.getContext(), z5Var3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.anm, java.lang.Integer.valueOf(i17)));
                if (i18 == 2) {
                    cx4.a.c(14);
                    return;
                } else {
                    cx4.a.c(15);
                    return;
                }
            }
            int i19 = m9Var.f461795g;
            if (i19 == 1) {
                db5.t7.h(z5Var3.getContext(), z5Var3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.anv));
                z5Var3.B.setText("");
                z5Var3.f269166y0 = 0;
                z5Var3.m74873xf133c127();
            } else if (i19 != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = z5Var3.f269161v;
                if (i19 != 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var = z5Var3.I;
                    if (l5Var != null) {
                        java.util.LinkedList linkedList = l5Var.f268916e;
                        java.util.Iterator it = linkedList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            r45.ck ckVar = (r45.ck) it.next();
                            if (m9Var.f461796h == ckVar.f453134e) {
                                str = ckVar.f453135f;
                                linkedList.remove(ckVar);
                                l5Var.notifyDataSetChanged();
                                break;
                            }
                        }
                    }
                    java.lang.String str3 = str;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var2 = z5Var3.I;
                    if (l5Var2 != null && l5Var2.getCount() == 0) {
                        r4 = true;
                    }
                    if (r4) {
                        z5Var3.u();
                    }
                    nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
                    if (nVar != null) {
                        nVar.S("deleteComment", m9Var.f461796h, str3, 0, 0);
                    }
                    z5Var3.p(true);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var3 = z5Var3.I;
                    if (l5Var3 != null) {
                        java.util.Iterator it6 = l5Var3.f268916e.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            r45.ck ckVar2 = (r45.ck) it6.next();
                            if (m9Var.f461796h == ckVar2.f453134e) {
                                java.lang.String str4 = ckVar2.f453135f;
                                java.util.LinkedList<r45.q60> reply_list = ckVar2.f453143q.f466102d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(reply_list, "reply_list");
                                for (r45.q60 q60Var : reply_list) {
                                    if (q60Var.f465237g == m9Var.f461804s) {
                                        q60Var.f465242o = 1;
                                    }
                                }
                                str = str4;
                            }
                        }
                        l5Var3.notifyDataSetChanged();
                    }
                    java.lang.String str5 = str;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var4 = z5Var3.I;
                    if (l5Var4 != null && l5Var4.getCount() == 0) {
                        r4 = true;
                    }
                    if (r4) {
                        z5Var3.u();
                    }
                    nw4.n nVar2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
                    if (nVar2 != null) {
                        nVar2.S("deleteCommentReply", m9Var.f461796h, str5, m9Var.f461804s, 0);
                    }
                    z5Var3.p(true);
                }
            } else {
                db5.t7.h(z5Var3.getContext(), z5Var3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.anw));
                z5Var3.p(true);
                z5Var3.B.setText("");
                z5Var3.f269166y0 = 0;
                z5Var3.m74873xf133c127();
            }
            z5Var3.B.clearFocus();
        }
    }
}
