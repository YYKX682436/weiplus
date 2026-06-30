package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 f269057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f269058e;

    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f269057d = z5Var;
        this.f269058e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var = this.f269057d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = z5Var.m74886x86b9ebe3().T2;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (z5Var.m74885xb93408ad().get() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var2 = z5Var.m74885xb93408ad().get();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(z5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var3 = z5Var2;
            com.p314xaae8f345.mm.p944x882e457a.o rr6 = this.f269058e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rr6, "$rr");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = rr6.f152243a.f152217a;
            if (fVar instanceof r45.g9) {
                com.p314xaae8f345.mm.p944x882e457a.n nVar = rr6.f152244b;
                if (nVar.f152233a instanceof r45.h9) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListReq");
                    r45.g9 g9Var = (r45.g9) fVar;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = nVar.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListResp");
                    r45.h9 h9Var = (r45.h9) fVar2;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url_info size is ");
                    java.util.LinkedList linkedList = h9Var.f457478d;
                    sb6.append(linkedList != null ? linkedList.size() : 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPWriteCommentLayout", sb6.toString());
                    if (g9Var.f456532f == 2) {
                        int i17 = z5Var3.f269166y0;
                        z5Var3.f269166y0 = h9Var.f457482h;
                        boolean z17 = i17 == 0;
                        boolean z18 = z5Var3.K;
                        java.util.LinkedList comment = h9Var.f457478d;
                        if (!z18) {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(comment)) {
                                z5Var3.u();
                            } else {
                                z5Var3.E.setBackgroundColor(z5Var3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748));
                                z5Var3.F.setVisibility(0);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var = z5Var3.I;
                                if (l5Var == null) {
                                    android.content.Context context = z5Var3.getContext();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(comment, "comment");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5(context, comment, z5Var3, z5Var3.f269162w);
                                    z5Var3.I = l5Var2;
                                    z5Var3.C.setAdapter((android.widget.ListAdapter) l5Var2);
                                } else {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(comment, "comment");
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPMyCommentItemAdapter", "update: " + comment.size());
                                    java.util.LinkedList linkedList2 = l5Var.f268916e;
                                    if (z17) {
                                        linkedList2.clear();
                                        linkedList2.addAll(comment);
                                    } else {
                                        linkedList2.addAll(comment);
                                    }
                                    l5Var.notifyDataSetChanged();
                                }
                            }
                        }
                        if (comment == null || comment.size() <= 0 || z5Var3.M != 0) {
                            z5Var3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x5(z5Var3), 10L);
                        }
                    }
                }
            }
        }
    }
}
