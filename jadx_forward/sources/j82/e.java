package j82;

/* loaded from: classes8.dex */
public class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j82.g f379687d;

    public e(j82.g gVar) {
        this.f379687d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        j82.g gVar = this.f379687d;
        if (itemId == 2) {
            new java.util.LinkedList().add(gVar.f379689d.f181790f);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("select_fav_local_id", gVar.f379689d.f181790f.f67645x88be67a1);
            intent.putExtra("Retr_Msg_Type", 2);
            j45.l.v(gVar.f379689d, ".ui.transmit.SelectConversationUI", intent, 1);
            return;
        }
        if (itemId != 3) {
            return;
        }
        r45.bq0 bq0Var = gVar.f379689d.f181790f.f67640x5ab01132;
        r45.tq0 tq0Var = bq0Var.f452501m;
        if (tq0Var != null) {
            str = bq0Var.f452505q;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var.f468197d)) {
                str = tq0Var.f468197d;
            }
            str2 = tq0Var.f468203m;
        } else {
            str = "";
            str2 = "";
        }
        intent.putExtra("Ksnsupload_link", gVar.f379689d.f181789e);
        intent.putExtra("Ksnsupload_title", str);
        intent.putExtra("Ksnsupload_imgurl", str2);
        intent.putExtra("Ksnsupload_imgbuf", com.p314xaae8f345.mm.vfs.w6.N(o72.x1.X(o72.x1.J(gVar.f379689d.f181790f)), 0, -1));
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        j45.l.o(gVar.f379689d, "sns", ".ui.SnsUploadUI", intent, 2, false);
    }
}
