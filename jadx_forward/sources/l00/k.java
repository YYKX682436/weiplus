package l00;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00.m f396261d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l00.m mVar) {
        super(0);
        this.f396261d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init with viewGroupId: ");
        l00.m mVar = this.f396261d;
        sb6.append(mVar.f396263d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        java.lang.String str = "open_animation_" + ((int) (java.lang.System.currentTimeMillis() / 1000));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        mVar.f396265f = str;
        l00.h hVar = new l00.h(new xq0.c("MagicEcsGiftEasterEgg", null, kz5.c0.i(new vd3.f(), new l00.e()), null, null, 0.0d, new l00.j(mVar), null, false, null, 904, null));
        hVar.f396259y = mVar;
        return hVar;
    }
}
