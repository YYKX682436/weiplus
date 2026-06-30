package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        super(1);
        this.f183439d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f it = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183439d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1.P6(c1Var);
        long m75942xfb822ef2 = ((r45.lq2) it.f152151d).m75942xfb822ef2(1);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POST_ACTIVITY_READ_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c1Var.f183376e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        java.lang.String obj2 = c22621x7603e017.getText().toString();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c1Var.f183377f;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        java.lang.String obj3 = c22621x7603e0172.getText().toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_id", m75942xfb822ef2);
        intent.putExtra("key_activity_name", obj2);
        intent.putExtra("key_activity_desc", obj3);
        intent.putExtra("key_nick_name", c1Var.A);
        intent.putExtra("key_activity_local_cover_url", c1Var.H);
        intent.putExtra("key_cover_url", c1Var.G);
        intent.putExtra("key_activity_type", 101);
        intent.putExtra("key_activity_end_time", c1Var.f183391w);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityPostUI", "eventTopicId:" + m75942xfb822ef2 + "  name:" + obj2 + "  desc:" + obj3);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c1Var.m158354x19263085();
        m158354x19263085.setResult(-1, intent);
        if (!m158354x19263085.isFinishing()) {
            m158354x19263085.finish();
        }
        return jz5.f0.f384359a;
    }
}
