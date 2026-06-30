package sf3;

/* loaded from: classes10.dex */
public final class a implements sf3.h {
    @Override // sf3.h
    public boolean a(sf3.g param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.graphics.BitmapFactory.Options a17 = rq5.a.a(param.c());
        if (((float) a17.outHeight) / ((float) a17.outWidth) > ((com.p314xaae8f345.mm.ui.bh.a(context).f278669b <= 0 || com.p314xaae8f345.mm.ui.bh.a(context).f278668a <= 0 || ((((float) com.p314xaae8f345.mm.ui.bh.a(context).f278669b) / ((float) com.p314xaae8f345.mm.ui.bh.a(context).f278668a)) > 1.5f ? 1 : ((((float) com.p314xaae8f345.mm.ui.bh.a(context).f278669b) / ((float) com.p314xaae8f345.mm.ui.bh.a(context).f278668a)) == 1.5f ? 0 : -1)) >= 0) ? 2.2f : 2.5f)) {
            return false;
        }
        return rq5.a.c(param.c());
    }
}
