package dt0;

/* loaded from: classes10.dex */
public final class a extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt0.b f324651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gt0.a f324652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dt0.b bVar, gt0.a aVar, android.content.Context context) {
        super(context, 3);
        this.f324651a = bVar;
        this.f324652b = aVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        ts0.c cVar;
        dt0.b bVar = this.f324651a;
        android.content.Context context = bVar.f324654b;
        char c17 = 0;
        if (context != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            int rotation = ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getRotation();
            if (rotation == bVar.f324653a) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreviewOrientationFit", "last rotation :" + bVar.f324653a + " ,current rotation:" + rotation);
            bVar.f324653a = rotation;
            if (rotation != 0) {
                if (rotation == 1) {
                    c17 = 'Z';
                } else if (rotation == 2) {
                    c17 = 180;
                } else if (rotation == 3) {
                    c17 = 270;
                }
            }
            gt0.a aVar = this.f324652b;
            if (c17 != 0) {
                if (c17 == 180 && (cVar = bVar.f324655c) != null) {
                    ts0.c.f503077d = 90;
                    aVar.mo54891x9333e172().w(cVar);
                    ms0.c cVar2 = at0.t.f95163b;
                    if (cVar2 != null) {
                        cVar2.r(ts0.c.f503077d);
                        return;
                    }
                    return;
                }
                return;
            }
            ts0.c cVar3 = bVar.f324655c;
            if (cVar3 != null) {
                ts0.c.f503077d = 270;
                aVar.mo54891x9333e172().w(cVar3);
                ms0.c cVar4 = at0.t.f95163b;
                if (cVar4 != null) {
                    cVar4.r(ts0.c.f503077d);
                }
            }
        }
    }
}
