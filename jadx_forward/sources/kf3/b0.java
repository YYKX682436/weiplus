package kf3;

/* loaded from: classes4.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final zy2.i f388853d;

    public b0(zy2.i iVar, kf3.v vVar) {
        this.f388853d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnClickFinderFeedListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.i iVar = this.f388853d;
        if (iVar != null) {
            android.content.Intent intent = new android.content.Intent();
            if ((iVar.f558944b.m75939xb282bd08(25) & 4) > 0) {
                intent.putExtra("member_username", iVar.f558944b.m75945x2fec8307(1));
            }
            intent.putExtra("feed_object_id", pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)));
            intent.putExtra("feed_object_nonceId", iVar.f558944b.m75945x2fec8307(8));
            intent.putExtra("business_type", 0);
            intent.putExtra("finder_user_name", iVar.f558944b.m75945x2fec8307(1));
            intent.putExtra("key_ec_source", iVar.f558944b.m75945x2fec8307(24));
            if (iVar.f558944b.m75934xbce7f2f(26) != null) {
                intent.putExtra("key_share_byp_data", iVar.f558944b.m75934xbce7f2f(26).f273689a);
            }
            intent.putExtra("tab_type", 6);
            boolean Ak = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ak();
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (Ak) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 2, 162, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.t(view.getContext(), intent);
            } else {
                intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(((b92.s2) ((zy2.db) i95.n0.c(zy2.db.class))).wi(iVar.f558944b), null, null));
                intent.putExtra("KEY_FINDER_FORWARD_SOURCE", iVar.f558944b.m75945x2fec8307(22));
                intent.putExtra("key_finder_teen_mode_scene", 1);
                intent.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                intent.putExtra("key_finder_teen_mode_user_name", iVar.g());
                intent.putExtra("key_finder_teen_mode_user_id", iVar.f558944b.m75945x2fec8307(1));
                intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)));
                ((wa2.u) ((xa2.e) i95.n0.c(xa2.e.class))).hj(intent, view, 280L);
                zy2.eb ebVar = (zy2.eb) i95.n0.c(zy2.eb.class);
                new r45.md5().set(0, java.lang.Long.valueOf(pm0.v.Z(iVar.f558944b.m75945x2fec8307(0))));
                vr2.f fVar = (vr2.f) ebVar;
                if (fVar.wi() && fVar.Ai()) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(2, 2, 20, intent);
                    intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                    intent.putExtra("KEY_OBJECT_ID", pm0.v.Z(iVar.f558944b.m75945x2fec8307(0)));
                    intent.putExtra("KEY_OBJECT_NONCE_ID", iVar.f558944b.m75945x2fec8307(8));
                    intent.putExtra("FROM_SCENE_KEY", 6);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.C(view.getContext(), intent);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(2, 2, 25, intent);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.A(view.getContext(), intent, false);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnClickFinderFeedListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
