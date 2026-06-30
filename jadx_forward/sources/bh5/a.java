package bh5;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh5.c f102451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bh5.c cVar) {
        super(0);
        this.f102451d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenActivityHelper", "showHalfScreenDirectly() onDismiss called");
        if (vk5.a.f519307d) {
            oVar = new jz5.o(java.lang.Integer.valueOf(vk5.a.f519304a), vk5.a.f519305b, java.lang.Integer.valueOf(vk5.a.f519306c));
            vk5.a.f519304a = 0;
            vk5.a.f519305b = null;
            vk5.a.f519306c = -1;
            vk5.a.f519307d = false;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showHalfScreenDirectly() onActivityResult called code:");
            java.lang.Number number = (java.lang.Number) oVar.f384374d;
            sb6.append(number.intValue());
            sb6.append(" callback is null:");
            bh5.c cVar = this.f102451d;
            sb6.append(cVar.f102455a.f102458b == null);
            sb6.append(" requestCode:");
            bh5.d dVar = cVar.f102455a;
            sb6.append(dVar.f102460d.p());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenActivityHelper", sb6.toString());
            int p17 = dVar.f102460d.p();
            java.lang.Object obj = oVar.f384375e;
            if (p17 != -1) {
                android.content.Context context = dVar.f102457a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    abstractActivityC21394xb3d2c0cf.m78606xf64f9fe4(((java.lang.Number) oVar.f384376f).intValue(), number.intValue(), (android.content.Intent) obj);
                }
            }
            com.p314xaae8f345.mm.ui.zc zcVar = dVar.f102458b;
            if (zcVar != null) {
                zcVar.a(number.intValue(), (android.content.Intent) obj);
            }
        }
        return jz5.f0.f384359a;
    }
}
