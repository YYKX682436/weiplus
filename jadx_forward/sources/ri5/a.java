package ri5;

/* loaded from: classes.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.el6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f477644f;
        int hashCode = str.hashCode();
        android.content.Context context = holder.f374654e;
        switch (hashCode) {
            case -1140598940:
                if (str.equals("fake_user_create_chatroom_choose_open_im")) {
                    java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
                    ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571885sk) + Ni);
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) holder.p(com.p314xaae8f345.mm.R.id.t1c)).setVisibility(item.f477651o ? 0 : 8);
                    break;
                }
                break;
            case -181849474:
                if (str.equals("fake_user_create_chatroom_select_contact_in_chatroom")) {
                    ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oca));
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) holder.p(com.p314xaae8f345.mm.R.id.t1c)).setVisibility(item.f477651o ? 0 : 8);
                    break;
                }
                break;
            case 434583587:
                if (str.equals("fake_user_create_chatroom_select_chatroom")) {
                    ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oc_));
                    ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.n0e)).setVisibility(0);
                    break;
                }
                break;
            case 1914591481:
                if (str.equals("fake_user_create_chatroom_face_2_face")) {
                    ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565464ci2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oc9));
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) holder.p(com.p314xaae8f345.mm.R.id.t1c)).setVisibility(item.f477651o ? 0 : 8);
                    break;
                }
                break;
        }
        super.h(holder, item, i17, i18, z17, list);
    }
}
