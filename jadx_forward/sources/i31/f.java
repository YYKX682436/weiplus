package i31;

/* loaded from: classes9.dex */
public final class f implements m31.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i31.i f369634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f369635b;

    public f(i31.i iVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f369634a = iVar;
        this.f369635b = abstractActivityC21394xb3d2c0cf;
    }

    @Override // m31.d
    public void a(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        i31.i iVar = this.f369634a;
        iVar.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f369635b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        j31.a aVar = iVar.f369645f;
        aVar.getClass();
        java.lang.String str = item.f153336f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        aVar.f378893g = str;
        java.lang.String str2 = item.f153335e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        aVar.f378894h = str2;
        aVar.f378892f = item.f153353z;
        iVar.i(2);
        activity.m78545xde66c1f2(new i31.g(iVar, i17));
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11167x3e42f9bc.class);
        intent.putExtra("key_data", item);
        intent.putExtra("key_status_subscribed", item.f153340m == 1);
        j45.l.v(activity, "com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI", intent, iVar.f369641b);
    }

    @Override // m31.d
    public boolean b(com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f369634a.getClass();
        return item.f153340m == 1;
    }
}
