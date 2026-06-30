package ju3;

/* loaded from: classes10.dex */
public final /* synthetic */ class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public b2(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e.class, "onStopRecord", "onStopRecord(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        ct0.b p07 = (ct0.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e) this.f72685xcfcbe9ef;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e.f237367x;
        c17025x1dde6f4e.getClass();
        java.util.Objects.toString(p07);
        nu3.i iVar = nu3.i.f421751a;
        at0.n nVar = c17025x1dde6f4e.recordController;
        boolean z17 = false;
        iVar.n("KEY_MEDIA_SOURCE_INT", java.lang.Integer.valueOf(nVar != null && nVar.f95131f ? 2 : 1));
        int i18 = p07.f303741e - p07.f303740d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c17025x1dde6f4e.configProvider;
        int i19 = c16993xacc19624 != null ? c16993xacc19624.f237219x : 0;
        if (c16993xacc19624 != null && c16993xacc19624.F == 14) {
            at0.n nVar2 = c17025x1dde6f4e.recordController;
            if (nVar2 != null) {
                ht0.b bVar = nVar2.f95128c;
                str = bVar != null ? bVar.mo127744x5000ed37() : null;
                if (str == null) {
                    str = "";
                }
            } else {
                str = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordPluginLayout", "music scene stop duration not enough, videoPath:" + str + ", fileExist:" + com.p314xaae8f345.mm.vfs.w6.j(str));
            dw3.c0.f325715a.s(str);
            if (i18 >= i19 || i19 <= 0) {
                it3.y yVar = c17025x1dde6f4e.f237377t;
                if (yVar != null) {
                    ((jt3.h) yVar).e(2, p07);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = c17025x1dde6f4e.configProvider;
                int i27 = c16993xacc196242 != null ? c16993xacc196242.f237219x : 1000;
                yt3.r3 r3Var = c17025x1dde6f4e.recordPlugin;
                android.content.Context context = r3Var.f547161f.getContext();
                db5.e1.y(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hu8, java.lang.Integer.valueOf((int) (i27 / 1000.0f))), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574314hu3), yt3.p3.f547130d);
                at0.n nVar3 = c17025x1dde6f4e.recordController;
                if (nVar3 != null) {
                    nVar3.e();
                }
                r3Var.mo9066x6761d4f();
            }
        } else {
            it3.y yVar2 = c17025x1dde6f4e.f237377t;
            if (yVar2 != null) {
                ((jt3.h) yVar2).e(2, p07);
            }
        }
        rs0.p pVar = rs0.p.f480843a;
        java.lang.String str2 = p07.f303737a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = c17025x1dde6f4e.configProvider;
        pVar.a(str2, c16993xacc196243 != null ? c16993xacc196243.f237205g : 1, c16993xacc196243 != null ? c16993xacc196243.f237204f : -1);
        java.lang.String str3 = p07.f303737a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = c17025x1dde6f4e.configProvider;
        di3.x.g(str3, c16993xacc196244 != null ? c16993xacc196244.f237205g : 1, c16993xacc196244 != null ? c16993xacc196244.F : -1);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d3564 = nu3.i.f421754d;
        c6927x849d3564.f142408j = p07.f303741e - p07.f303740d;
        at0.n nVar4 = c17025x1dde6f4e.recordController;
        if (nVar4 != null && nVar4.f95131f) {
            z17 = true;
        }
        c6927x849d3564.f142409k = z17 ? 2L : 1L;
        nu3.m.f421762a.d(nVar4 != null ? nVar4.f95145t : null);
        return jz5.f0.f384359a;
    }
}
