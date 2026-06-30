package cc3;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.model.e {
    @Override // com.tencent.mm.wallet_core.model.e
    public r45.js5 a() {
        java.lang.String str = ((cc3.a) this.f213885c).f40480q;
        dc3.a aVar = new dc3.a();
        aVar.field_packet_id = str;
        if (!hb3.o.Ni().Vi().get(aVar, new java.lang.String[0])) {
            return null;
        }
        r45.nm5 t07 = dc3.a.t0(aVar);
        t07.f381503i.addAll(hb3.o.Ni().aj().y0(((cc3.a) this.f213885c).f40480q));
        r45.vm3 vm3Var = new r45.vm3();
        vm3Var.BaseResponse = new r45.ie();
        vm3Var.f388358d = t07;
        return vm3Var;
    }

    @Override // com.tencent.mm.wallet_core.model.e
    public void b(com.tencent.mm.modelbase.f fVar) {
        int delete;
        com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketStoryInfoAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70616b), java.lang.Integer.valueOf(fVar.f70615a));
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && ((r45.vm3) fVar.f70618d).f388358d != null) {
            dc3.a aVar = new dc3.a();
            aVar.field_packet_id = ((cc3.a) this.f213885c).f40480q;
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            ((r45.vm3) fVar2).f388358d.G = ((r45.vm3) fVar2).f388359e;
            boolean z17 = hb3.o.Ni().Vi().get(aVar, new java.lang.String[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketStoryInfoAsyncLoader", "get story info: %s, %s", ((cc3.a) this.f213885c).f40480q, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.protobuf.f fVar3 = fVar.f70618d;
            r45.nm5 nm5Var = ((r45.vm3) fVar3).f388358d;
            java.lang.String str = ((cc3.a) this.f213885c).f40480q;
            int i17 = ((r45.vm3) fVar3).f388359e;
            if (nm5Var != null) {
                aVar.field_title = nm5Var.f381498d;
                aVar.field_corp_name = nm5Var.f381502h;
                aVar.field_action_app_nickname = nm5Var.f381507p;
                aVar.field_action_app_username = nm5Var.f381506o;
                aVar.field_action_emotion_designer_uin = nm5Var.f381511t;
                aVar.field_action_type = nm5Var.f381504m;
                aVar.field_action_url = nm5Var.f381505n;
                aVar.field_description = nm5Var.f381501g;
                aVar.field_logo_url = nm5Var.f381499e;
                aVar.field_logo_md5 = nm5Var.f381500f;
                aVar.field_action_jump_text = nm5Var.f381514w;
                aVar.field_joint_label_text = nm5Var.f381516y;
                aVar.field_same_receive_link = nm5Var.f381515x;
                aVar.field_action_before_jump_text = nm5Var.f381517z;
                aVar.field_action_normal_icon_url = nm5Var.A;
                aVar.field_action_dark_icon_url = nm5Var.B;
                aVar.field_packet_id = str;
                aVar.field_subtype_id = i17;
                r45.eg7 eg7Var = nm5Var.D;
                if (eg7Var != null) {
                    aVar.field_wxapp_info_app_name = eg7Var.f373466d;
                    aVar.field_wxapp_info_app_path = eg7Var.f373467e;
                    aVar.field_wxapp_info_wording = eg7Var.f373468f;
                    aVar.field_wxapp_info_icon_url = eg7Var.f373469g;
                }
                r45.jm5 jm5Var = nm5Var.f381509r;
                if (jm5Var != null) {
                    aVar.field_detail_dynamic_url = jm5Var.f377934J;
                    aVar.field_detail_atmosphere_pag_url = jm5Var.Q;
                    aVar.field_detail_image_url = jm5Var.f377941m;
                    aVar.field_detail_image_url_md5 = jm5Var.f377942n;
                }
                r45.f34 f34Var = nm5Var.E;
                if (f34Var != null) {
                    aVar.field_outer_jump_action_type = f34Var.f373983d;
                    aVar.field_outer_jump_action_jump_text = f34Var.f373984e;
                    aVar.field_outer_jump_action_app_username = f34Var.f373985f;
                    aVar.field_outer_jump_action_jump_newlife = f34Var.f373986g;
                }
                bw5.x7 x7Var = nm5Var.F;
                if (x7Var != null) {
                    try {
                        aVar.field_ecs_jump_info_str = new java.lang.String(x7Var.toByteArray(), java.nio.charset.StandardCharsets.ISO_8859_1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LocalRedPacketStoryInfo", "[convertFromProto] ecs_jump_info success");
                    } catch (java.io.IOException e17) {
                        aVar.field_ecs_jump_info_str = "";
                        com.tencent.mars.xlog.Log.e("MicroMsg.LocalRedPacketStoryInfo", "[convertFromProto] ecs_jump_info failed :%s", e17.getMessage());
                    }
                } else {
                    aVar.field_ecs_jump_info_str = "";
                }
            }
            aVar.field_update_time = java.lang.System.currentTimeMillis();
            if (z17) {
                hb3.o.Ni().Vi().update(aVar, new java.lang.String[0]);
            } else {
                hb3.o.Ni().Vi().insert(aVar);
            }
            dc3.d aj6 = hb3.o.Ni().aj();
            java.lang.String str2 = ((cc3.a) this.f213885c).f40480q;
            aj6.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                delete = -1;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LocalRedPacketStoryInfoStorage", "delete story detail: %s", str2);
                delete = aj6.f228711d.delete("LocalStoryDetail", "packet_id=?", new java.lang.String[]{str2});
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RedPacketStoryInfoAsyncLoader", "delete story detail: %s", java.lang.Integer.valueOf(delete));
            com.tencent.mm.protobuf.f fVar4 = fVar.f70618d;
            if (((r45.vm3) fVar4).f388358d.f381503i == null || ((r45.vm3) fVar4).f388358d.f381503i.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RedPacketStoryInfoAsyncLoader", "story detail is empty!!");
                return;
            }
            l75.k0 k0Var = hb3.o.Ni().aj().f228711d;
            long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
            java.util.Iterator it = ((r45.vm3) fVar.f70618d).f388358d.f381503i.iterator();
            while (it.hasNext()) {
                r45.re6 re6Var = (r45.re6) it.next();
                java.lang.String str3 = ((cc3.a) this.f213885c).f40480q;
                dc3.c cVar = new dc3.c();
                if (re6Var != null) {
                    cVar.field_packet_id = str3;
                    cVar.field_height = re6Var.f384777g;
                    cVar.field_width = re6Var.f384778h;
                    cVar.field_media_type = re6Var.f384774d;
                    cVar.field_media_md5 = re6Var.f384776f;
                    cVar.field_media_url = re6Var.f384775e;
                    cVar.field_media_fuzzy_thumbnail_url = re6Var.f384779i;
                    cVar.field_media_fuzzy_thumbnail_md5 = re6Var.f384780m;
                }
                hb3.o.Ni().aj().insert(cVar);
            }
            l75.k0 k0Var2 = hb3.o.Ni().aj().f228711d;
            if (k0Var2 != null) {
                k0Var2.w(java.lang.Long.valueOf(F));
            }
        }
    }
}
