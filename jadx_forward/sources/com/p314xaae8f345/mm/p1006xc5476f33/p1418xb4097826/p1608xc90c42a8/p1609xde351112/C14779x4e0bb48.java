package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReplyWithSecurityCheck$1 */
/* loaded from: classes10.dex */
final class C14779x4e0bb48 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 f204521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f204522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14779x4e0bb48(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 c14770x86109c20, so2.o3 o3Var) {
        super(0);
        this.f204520d = list;
        this.f204521e = c14770x86109c20;
        this.f204522f = o3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.gb4 gb4Var;
        java.lang.Object obj;
        java.lang.String O6 = ((ey2.w) ((xy2.f) pf5.u.f435469a.e(zy2.b6.class).c(xy2.f.class))).O6();
        boolean z17 = false;
        if (O6.length() > 0) {
            java.util.List list = this.f204520d;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.gb4) obj).m75945x2fec8307(2), O6)) {
                        break;
                    }
                }
                gb4Var = (r45.gb4) obj;
            } else {
                gb4Var = null;
            }
            if (gb4Var != null) {
                z17 = true;
            }
        }
        final so2.o3 o3Var = this.f204522f;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 c14770x86109c20 = this.f204521e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = c14770x86109c20.f204504c;
            if (c15270x6d877a34 != null) {
                c15270x6d877a34.m61918xcd569a2(true);
            }
            vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
            android.content.Context context = c14770x86109c20.f204502a;
            java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
            if (a17 == null) {
                a17 = "";
            }
            ((vh0.f3) n1Var).bj(context, "wxid_wi_1d142z0zdj03", 5, a17, new vh0.i1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM$onReplyWithSecurityCheck$1.1
                @Override // vh0.i1
                /* renamed from: onResult */
                public void mo56534x57429edc(java.lang.Object obj2) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentFooterVm", "onReply privacy result " + bool);
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 c14770x86109c202 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a342 = c14770x86109c202.f204504c;
                    if (c15270x6d877a342 != null) {
                        c15270x6d877a342.m61918xcd569a2(false);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
                    if (!bool.booleanValue()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a343 = c14770x86109c202.f204504c;
                        if (c15270x6d877a343 != null) {
                            c15270x6d877a343.D(true);
                            return;
                        }
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a344 = c14770x86109c202.f204504c;
                    if (c15270x6d877a344 != null) {
                        final so2.o3 o3Var2 = o3Var;
                        c15270x6d877a344.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.onReplyWithSecurityCheck.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20 c14770x86109c203 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20.this;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20.b(c14770x86109c203, c14770x86109c203.f204503b, o3Var2.f491944d);
                                c14770x86109c203.d(null);
                            }
                        }, 300L);
                    }
                }
            });
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14770x86109c20.b(c14770x86109c20, c14770x86109c20.f204503b, o3Var.f491944d);
            c14770x86109c20.d(null);
        }
        return jz5.f0.f384359a;
    }
}
