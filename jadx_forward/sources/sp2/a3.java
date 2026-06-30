package sp2;

/* loaded from: classes2.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(sp2.d3 d3Var) {
        super(0);
        this.f492504d = d3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sp2.d3 d3Var = this.f492504d;
        d3Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_router_to_profile", false);
        intent.putExtra("key_create_scene", 3);
        intent.putExtra("KEY_ENTRANCE_ID", d3Var.f492544e);
        intent.putExtra("KEY_ENTRANCE_TYPE", d3Var.f492545f);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = d3Var.f492540a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        intent.addFlags(67108864);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2.class);
        com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5 = context.m78751x5dc77fb5(intent);
        if (m78751x5dc77fb5 != null) {
            ((com.p314xaae8f345.mm.ui.bd) m78751x5dc77fb5).f279410a = new sp2.c3(d3Var);
        }
        return jz5.f0.f384359a;
    }
}
