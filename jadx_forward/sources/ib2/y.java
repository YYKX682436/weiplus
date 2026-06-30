package ib2;

/* loaded from: classes2.dex */
public final class y implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f371712d;

    public y(ib2.i0 i0Var) {
        this.f371712d = i0Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) holder.f374658i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionPresenter", "onItemClick: position:" + i17 + ", item:" + z1Var.mo2128x1ed62e84());
        android.content.Intent intent = new android.content.Intent();
        ib2.i0 i0Var = this.f371712d;
        r45.vx0 vx0Var = i0Var.f371657f;
        int m75939xb282bd08 = vx0Var != null ? vx0Var.m75939xb282bd08(21) : 0;
        if (m75939xb282bd08 <= 0) {
            m75939xb282bd08 = 16;
        }
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1) j5Var;
            if (z1Var2.getFeedObject().getMediaType() != 15) {
                intent.putExtra("key_ref_object_id", z1Var2.getFeedObject().m59251x5db1b11());
                intent.putExtra("key_ref_object_dup_flag", z1Var2.w());
                intent.putExtra("key_topic_type", m75939xb282bd08);
                r45.vx0 vx0Var2 = i0Var.f371657f;
                if (vx0Var2 == null || (str = vx0Var2.m75945x2fec8307(1)) == null) {
                    str = "";
                }
                intent.putExtra("key_topic_title", str);
                r45.vx0 vx0Var3 = i0Var.f371657f;
                intent.putExtra("KEY_TOPIC_ID", vx0Var3 != null ? vx0Var3.m75942xfb822ef2(0) : 0L);
                intent.putExtra("KEY_CLICK_FEED_ID", z1Var.mo2128x1ed62e84());
                intent.putExtra("KEY_CLICK_FEED_POSITION", i17);
                r45.vx0 vx0Var4 = i0Var.f371657f;
                intent.putExtra("KEY_COLLECTION_INFO", vx0Var4 != null ? vx0Var4.mo14344x5f01b1f6() : null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, i0Var.f371652a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).il(i0Var.f371652a, intent);
            }
        }
    }
}
