package za3;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za3.s f552539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(za3.s sVar) {
        super(1);
        this.f552539d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = item.f226343b;
        za3.s sVar = this.f552539d;
        if (z17) {
            xj.m mVar = sVar.f552543i;
            if (mVar != null) {
                if (sVar.f552552u) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 4, "com.tencent.map");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 5);
                }
                z80.p0 p0Var = sVar.f552541g;
                java.lang.String str = p0Var.f552188a.f226127p;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    if (r26.i0.y(str, "qqmap_", false)) {
                        str = str.substring(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
                    }
                }
                wj.r0 r0Var = wj.r0.f528033f;
                jz5.l lVar = new jz5.l("type", "drive");
                jz5.l lVar2 = new jz5.l("touid", str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = p0Var.f552188a;
                sb6.append(c16279x64cea23.f226119e);
                sb6.append(',');
                sb6.append(c16279x64cea23.f226120f);
                xj.n nVar = new xj.n(r0Var, null, null, kz5.c1.k(lVar, lVar2, new jz5.l("tocoord", sb6.toString()), new jz5.l("to", c16279x64cea23.f226124m), new jz5.l("referer", "wx_client")), 6, null);
                i95.m c17 = i95.n0.c(xj.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                xj.i.y3((xj.i) c17, mVar.f536286a, nVar, null, 4, null);
                sVar.G(false, true);
                za3.s.D(sVar, "com.tencent.map", sVar.f552552u);
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map t17 = kz5.c1.t(sVar.f552542h);
                t17.put("view_id", "tencent_maps_promote_btn");
                ((cy1.a) rVar).Ej("view_clk", t17, 27051);
                sVar.cancel();
            }
        } else if (item.f226342a) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", va3.w.b(sVar.f552541g.f552188a));
            z80.p0 p0Var2 = sVar.f552541g;
            intent.putExtra("Retr_Msg_Id", p0Var2.f552190c);
            intent.putExtra("Retr_Msg_Type", 48);
            intent.putExtra("Retr_MsgTalker", p0Var2.f552191d);
            intent.putExtra("exdevice_open_certain_device", true);
            intent.putExtra("exdevice_open_certain_device_info", item.f226349h);
            j45.l.u(sVar.f552540f, ".ui.chatting.ChattingSendDataToDeviceUI", intent, null);
        } else {
            java.lang.String str2 = item.f226346e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "com.tencent.map") || sVar.f552552u) {
                za3.d dVar = sVar.f552549r;
                z80.p0 p0Var3 = sVar.f552541g;
                dVar.g(p0Var3.f552188a, p0Var3.f552189b, item.f226346e, false, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 4, str2);
                if (str2 == null) {
                    str2 = "";
                }
                za3.s.D(sVar, str2, true);
            } else {
                gw4.f fVar = new gw4.f(sVar.f552540f);
                fVar.f357690b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
                ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 5);
                if (str2 == null) {
                    str2 = "";
                }
                za3.s.D(sVar, str2, false);
            }
            sVar.cancel();
        }
        return jz5.f0.f384359a;
    }
}
