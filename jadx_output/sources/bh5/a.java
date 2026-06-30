package bh5;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bh5.c f20918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bh5.c cVar) {
        super(0);
        this.f20918d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenActivityHelper", "showHalfScreenDirectly() onDismiss called");
        if (vk5.a.f437774d) {
            oVar = new jz5.o(java.lang.Integer.valueOf(vk5.a.f437771a), vk5.a.f437772b, java.lang.Integer.valueOf(vk5.a.f437773c));
            vk5.a.f437771a = 0;
            vk5.a.f437772b = null;
            vk5.a.f437773c = -1;
            vk5.a.f437774d = false;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showHalfScreenDirectly() onActivityResult called code:");
            java.lang.Number number = (java.lang.Number) oVar.f302841d;
            sb6.append(number.intValue());
            sb6.append(" callback is null:");
            bh5.c cVar = this.f20918d;
            sb6.append(cVar.f20922a.f20925b == null);
            sb6.append(" requestCode:");
            bh5.d dVar = cVar.f20922a;
            sb6.append(dVar.f20927d.p());
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenActivityHelper", sb6.toString());
            int p17 = dVar.f20927d.p();
            java.lang.Object obj = oVar.f302842e;
            if (p17 != -1) {
                android.content.Context context = dVar.f20924a;
                com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                if (mMActivity != null) {
                    mMActivity.triggerActivityResult(((java.lang.Number) oVar.f302843f).intValue(), number.intValue(), (android.content.Intent) obj);
                }
            }
            com.tencent.mm.ui.zc zcVar = dVar.f20925b;
            if (zcVar != null) {
                zcVar.a(number.intValue(), (android.content.Intent) obj);
            }
        }
        return jz5.f0.f302826a;
    }
}
