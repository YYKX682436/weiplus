package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f94209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f94210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.util.List list, int i17) {
        super(2);
        this.f94209d = list;
        this.f94210e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0 result = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.y0) obj;
        r45.cf response = (r45.cf) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(response, "response");
        boolean z17 = result.f94478a;
        boolean z18 = true;
        java.util.List list = this.f94209d;
        boolean z19 = result.f94481d;
        if (z17) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.AppMsgContextList size:");
            java.util.LinkedList<r45.i9> linkedList = response.f371515d;
            sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", sb6.toString());
            ax4.c cVar = new ax4.c();
            cVar.f15118d = result.f94479b;
            cVar.f15115a = list.size();
            if (linkedList != null) {
                for (r45.i9 i9Var : linkedList) {
                    if ((i9Var == null || (str = i9Var.f376822d) == null || hy4.i.p(str) != z18) ? false : z18) {
                        kotlin.jvm.internal.o.d(i9Var);
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var2 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("appMsgContext url:");
                        sb7.append(i9Var.f376822d);
                        sb7.append(" content:");
                        java.lang.String str2 = i9Var.f376823e;
                        sb7.append(str2 != null ? str2.length() : 0);
                        sb7.append(" clientCacheTime:");
                        sb7.append(i9Var.f376824f);
                        sb7.append(" forceUrl:");
                        sb7.append(i9Var.f376825g);
                        sb7.append(" lastModifyTime:");
                        sb7.append(i9Var.f376826h);
                        sb7.append(" noNeedUpdate:");
                        sb7.append(i9Var.f376827i);
                        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", sb7.toString());
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.v0 v0Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94443i;
                        java.lang.String Url = i9Var.f376822d;
                        kotlin.jvm.internal.o.f(Url, "Url");
                        v0Var.c(Url, i9Var);
                        lr1.c0 c0Var = lr1.c0.f320643a;
                        java.lang.String Url2 = i9Var.f376822d;
                        kotlin.jvm.internal.o.f(Url2, "Url");
                        if (c0Var.c(Url2)) {
                            java.lang.String Url3 = i9Var.f376822d;
                            kotlin.jvm.internal.o.f(Url3, "Url");
                            int i17 = i9Var.f376829n;
                            int i18 = i9Var.f376830o;
                            int i19 = i9Var.f376831p;
                            java.lang.String str3 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + '/';
                            java.lang.String str4 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + '/';
                            try {
                                byte[] bytes = jz5.u.a(i17).getBytes(r26.c.f368865a);
                                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
                                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
                                str4 = hy4.i.b(hy4.i.b(hy4.i.b(str3, "__biz", encodeToString), "mid", jz5.u.a(i18)), "idx", java.lang.String.valueOf(i19));
                            } catch (java.lang.Exception unused) {
                            }
                            com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.s(Url3, str4);
                        }
                        if (!z19) {
                            if (i9Var.f376827i) {
                                cVar.f15117c++;
                                ax4.a.a(31);
                            } else {
                                cVar.f15116b++;
                                ax4.a.a(32);
                            }
                            cVar.f15120f += i9Var.computeSize();
                        }
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var3 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.PreloadLogic", "terry trace: preloaded " + i9Var.f376822d);
                        int i27 = i9Var.f376833r;
                        java.util.LinkedList linkedList2 = i9Var.f376836u;
                        int i28 = this.f94210e;
                        if (i27 == 8) {
                            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).z(i28, !(linkedList2 == null || linkedList2.isEmpty()) ? 10 : 11, 0, 0);
                        }
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.c2.f94203a.c(linkedList2, i28);
                    } else {
                        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var4 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.PreloadLogic", "batchSyncAppMsgContext no Url response");
                    }
                    z18 = true;
                }
            }
            cVar.a();
        } else {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
            com.tencent.mars.xlog.Log.w("MicroMsg.PreloadLogic", "terry trace: preloaded fail");
        }
        if (!z19) {
            ax4.a.a(23);
            ax4.a.b(908, 26, list.size(), true);
            ax4.a.a(result.f94478a ? 24 : 25);
        }
        return jz5.f0.f302826a;
    }
}
