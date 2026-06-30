package com.tencent.mm.plugin.announcement;

@j95.b
/* loaded from: classes12.dex */
public class x extends i95.w implements d81.e {
    public static void wi(long j17) {
        com.tencent.mm.plugin.announcement.s sVar = com.tencent.mm.plugin.announcement.s.f74705e;
        l75.k0 Q4 = sVar.Q4();
        p75.i0 i17 = dm.a2.f235564i.i();
        i17.f352657d = dm.a2.f235565m.i(java.lang.Long.valueOf(j17));
        i17.f352656c = "MicroMsg.SDK.BaseChatroomNoticeAttachIndex";
        java.util.ArrayList arrayList = (java.util.ArrayList) i17.a().k(Q4, dm.a2.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginAnnouncement", "del msg. msgId%d, index size:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dm.a2 a2Var = (dm.a2) it.next();
            new m75.b(a2Var, null, null, "MicroMsg.SDK.BaseChatroomNoticeAttachIndex").a(sVar.Q4());
            java.lang.String str = a2Var.field_dataId;
            p75.i0 i18 = dm.a2.f235564i.i();
            i18.f352657d = dm.a2.f235566n.j(str);
            i18.f352656c = "MicroMsg.SDK.BaseChatroomNoticeAttachIndex";
            if (((java.util.ArrayList) i18.a().k(Q4, dm.a2.class)).size() < 1) {
                com.tencent.mm.vfs.w6.h(a2Var.field_dataPath);
                com.tencent.mm.vfs.w6.h(a2Var.field_thumbPath);
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginAnnouncement", "del attach:%s, dataPath:%s, thumbPath:%s", a2Var.field_dataId, a2Var.field_dataPath, a2Var.field_thumbPath);
            }
        }
    }

    public java.lang.String[] Ai(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        o72.r2 B = o72.x1.B(str.replaceAll("group_notice_item", "favitem"), 18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.bq0 bq0Var = B.field_favProto;
        if (bq0Var != null && (linkedList = bq0Var.f370964f) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375412h)) {
                    arrayList.add(hx1.b.e(gp0Var));
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.f375434s)) {
                    arrayList.add(hx1.b.c(gp0Var));
                }
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public void Bi(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        boolean equals = com.tencent.mm.sdk.platformtools.t8.K0(z07.field_roomowner) ? false : z07.field_roomowner.equals(c01.z1.r());
        boolean G0 = z07.G0(c01.z1.r());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("RoomInfo_Id", str);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msg", null);
        intent.putExtra("room_notice", (java.lang.String) d17.get(".msg.appmsg.textannouncement"));
        intent.putExtra("room_notice_xml", (java.lang.String) d17.get(".msg.appmsg.announcement"));
        java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d((java.lang.String) d17.get(".msg.appmsg.announcement"), "group_notice_item", null);
        if (d18 != null) {
            intent.putExtra("room_notice_publish_time", com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d18.get(".group_notice_item.edittime"), 0L));
        }
        intent.putExtra("room_notice_editor", (java.lang.String) d17.get(".msg.fromusername"));
        intent.putExtra("from_scene", 5);
        intent.putExtra("Is_RoomOwner", equals);
        intent.putExtra("Is_RoomManager", G0);
        intent.putExtra("room_member_count", z07.field_memberCount);
        intent.putExtra("room_notice_reedit", z17);
        Di(context, intent);
    }

    public void Di(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.announcement.ChatroomNoticeUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/announcement/PluginAnnouncement", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/announcement/PluginAnnouncement", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
