package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.fa f105985a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105986b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f105987c;

    /* renamed from: d, reason: collision with root package name */
    public r45.ws2 f105988d;

    public x3(zy2.fa redDotManager) {
        kotlin.jvm.internal.o.g(redDotManager, "redDotManager");
        this.f105985a = redDotManager;
        this.f105986b = "Finder.RedDotExposeBufferHandler";
    }

    public final java.util.LinkedList a(java.lang.String source) {
        java.util.LinkedList<java.lang.String> list;
        jz5.f0 f0Var;
        boolean z17;
        boolean z18;
        boolean z19;
        kotlin.jvm.internal.o.g(source, "source");
        r45.ws2 ws2Var = this.f105988d;
        java.lang.String str = this.f105986b;
        if (ws2Var == null || this.f105987c) {
            this.f105987c = false;
            r45.ws2 ws2Var2 = new r45.ws2();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(ws2Var2.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_EXPOSE_INFO_CONFIG_STRING_SYNC, ""))));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            com.tencent.mars.xlog.Log.i(str, "init redDotExposeInfo " + pm0.b0.g(ws2Var2));
            this.f105988d = ws2Var2;
        }
        r45.ws2 ws2Var3 = this.f105988d;
        if (ws2Var3 == null || (list = ws2Var3.getList(0)) == null) {
            return null;
        }
        java.util.LinkedList linkedList = null;
        for (java.lang.String str2 : list) {
            kotlin.jvm.internal.o.d(str2);
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = this.f105985a.L0(str2);
            boolean z27 = true;
            if (L0 != null) {
                com.tencent.mm.protobuf.g gVar = L0.field_ctrInfo.B;
                if ((gVar != null ? gVar.f192156a.length : 0) > 0) {
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                    }
                    r45.zs2 zs2Var = new r45.zs2();
                    zs2Var.set(2, gVar);
                    linkedList.add(zs2Var);
                }
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                    z18 = true;
                } else {
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z18 = false;
                }
                if (z18 || z65.c.a()) {
                    z19 = true;
                } else {
                    kb2.b bVar = kb2.b.f306225a;
                    z19 = false;
                }
                if (z19) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(source);
                    sb6.append(" getRedDotExposeListInfo redDotExposeInfo ");
                    sb6.append(str2);
                    sb6.append(" exposeBuff size=");
                    sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f192156a.length) : null);
                    sb6.append(" content=");
                    sb6.append(gVar != null ? gVar.g() : null);
                    sb6.append('!');
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                    z17 = true;
                } else {
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    z17 = false;
                }
                if (!z17 && !z65.c.a()) {
                    kb2.b bVar2 = kb2.b.f306225a;
                    z27 = false;
                }
                if (z27) {
                    com.tencent.mars.xlog.Log.w(str, source + " getRedDotExposeListInfo redDotExposeInfo " + str2 + " have not ctrl info!");
                }
            }
        }
        return linkedList;
    }

    public final void b(r45.xb1 resp) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList list = resp.getList(30);
        kotlin.jvm.internal.o.f(list, "getFinder_config_item(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "reddot_expose_info_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            r45.ws2 ws2Var = new r45.ws2();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.protobuf.g byteString = yy0Var.getByteString(1);
                ws2Var.parseFrom(byteString != null ? byteString.g() : null);
                r45.ws2 ws2Var2 = this.f105988d;
                if (!kotlin.jvm.internal.o.b(ws2Var2 != null ? ws2Var2.getList(0) : null, ws2Var.getList(0))) {
                    this.f105987c = true;
                }
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_EXPOSE_INFO_CONFIG_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(ws2Var.toByteArray()));
            com.tencent.mars.xlog.Log.i(this.f105986b, "reddot_expose_info_config " + yy0Var.getByteString(1) + ",needUpdateConfig=" + this.f105987c + ", redDotExposeInfo=" + pm0.b0.g(ws2Var));
        }
    }
}
