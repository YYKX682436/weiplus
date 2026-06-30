package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 f231837d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f3) {
        this.f231837d = activityC16583xfeb834f3;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f231837d.F);
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ",");
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f3 = this.f231837d;
            if (activityC16583xfeb834f3.H) {
                int size = activityC16583xfeb834f3.F.size();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f32 = this.f231837d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f(size, activityC16583xfeb834f32.L, 1, "", activityC16583xfeb834f32.I.f490227p);
                if (((jp5.o) i95.n0.c(jp5.o.class)).ib()) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).Jh(c01.z1.r(), new java.util.ArrayList(linkedList), this.f231837d.C);
                } else {
                    linkedList.add(c01.z1.r());
                    java.lang.String c18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ",");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f33 = this.f231837d;
                    java.lang.String str = activityC16583xfeb834f33.C;
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = java.lang.Boolean.valueOf(Ri.f231695e);
                    objArr[1] = java.lang.Boolean.valueOf(Ri.f231696f);
                    objArr[2] = java.lang.Boolean.valueOf(Ri.f231699i);
                    objArr[3] = Ri.f231709s.toString();
                    objArr[4] = java.lang.Boolean.valueOf(Ri.f231710t == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk All Var Value:\n isMute: %b isHandsFree: %b isCameraFace: %b multiTalkStatus: %s groupIsNull: %b", objArr);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(220L, 0L, 1L, false);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
                        db5.e1.i(activityC16583xfeb834f33, com.p314xaae8f345.mm.R.C30867xcad56011.f573852g14, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    } else if (vq4.p0.c()) {
                        db5.e1.i(activityC16583xfeb834f33, com.p314xaae8f345.mm.R.C30867xcad56011.g19, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    } else if (vq4.p0.d()) {
                        db5.e1.i(activityC16583xfeb834f33, com.p314xaae8f345.mm.R.C30867xcad56011.g18, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    } else if (p21.i.a()) {
                        db5.e1.i(activityC16583xfeb834f33, com.p314xaae8f345.mm.R.C30867xcad56011.f573851g13, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    } else if (Ri.x()) {
                        p21.i.b(activityC16583xfeb834f33, com.p314xaae8f345.mm.R.C30867xcad56011.h1r, null);
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - Ri.A;
                        if (!Ri.f231720z || currentTimeMillis >= Ri.B) {
                            Ri.f231720z = false;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                            i4Var.Z = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u4() { // from class: com.tencent.mm.plugin.multitalk.model.v0$$a
                                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u4
                                public final void a(int i17, java.lang.String str2) {
                                    android.app.Activity activity = activityC16583xfeb834f33;
                                    if (i17 != 92006 || str2 == null) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().N(activity);
                                        return;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
                                    Ri2.getClass();
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("rawUrl", str2);
                                    intent.putExtra("showShare", false);
                                    intent.putExtra("show_bottom", false);
                                    intent.putExtra("needRedirect", false);
                                    intent.putExtra("neverGetA8Key", true);
                                    intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                                    intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                                    j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.Z = null;
                                    if (activity != null) {
                                        activity.finish();
                                        Ri2.K();
                                    }
                                    Ri2.f(false, false);
                                }
                            };
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(c18.split(","));
                            sj3.e4 e4Var = Ri.f231709s;
                            if (e4Var != sj3.e4.Init) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "already in multitalk! cannot start again, status:%s", e4Var.toString());
                                i4Var.Z = null;
                            } else {
                                Ri.D(sj3.e4.Creating);
                                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(c18.split(","));
                                synchronized (Ri.T) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.util.Iterator it = P1.iterator();
                                    while (it.hasNext()) {
                                        java.lang.String str2 = (java.lang.String) it.next();
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.w();
                                        wVar.f231375c = str2;
                                        wVar.f231377e = 2;
                                        arrayList.add(wVar);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
                                    i4Var2.N(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().f354681a.a(1)), c01.z1.r());
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve:  enter newMultiTalkInvite. %s, %s", arrayList, str);
                                    i4Var2.f231176p1 = str;
                                    i4Var2.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.n1(i4Var2, arrayList, str));
                                    Ri.O(str, 2);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12722, 1);
                                    zj3.i.f554861a.d();
                                }
                            }
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5717xbe50c723 c5717xbe50c723 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5717xbe50c723();
                            c5717xbe50c723.f136039g.f88007a = true;
                            c5717xbe50c723.e();
                            gi.q0 q0Var = new gi.q0("MultiTalk");
                            Ri.Y = q0Var;
                            q0Var.b();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "createMultiTalk, isOverLoadFail is true! elapsedWaitMs:" + currentTimeMillis + ", overLoadFailTimeLimit:" + Ri.B);
                            int ceil = (int) java.lang.Math.ceil(((double) (Ri.B - currentTimeMillis)) / 1000.0d);
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2n, java.lang.Integer.valueOf(ceil)), 0).show();
                        }
                    }
                }
                this.f231837d.finish();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f(activityC16583xfeb834f3.F.size(), this.f231837d.L, 2, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.o2.e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t), 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f34 = this.f231837d;
                activityC16583xfeb834f34.setResult(-1, activityC16583xfeb834f34.getIntent().putExtra("Select_Contact", c17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ActivityC16583xfeb834f3 activityC16583xfeb834f35 = this.f231837d;
                activityC16583xfeb834f35.D = false;
                activityC16583xfeb834f35.finish();
            }
        } else {
            p21.i.b(this.f231837d, com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu, null);
        }
        this.f231837d.mo48674x36654fab();
        return true;
    }
}
