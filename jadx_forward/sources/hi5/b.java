package hi5;

/* loaded from: classes8.dex */
public final class b implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 f363093a;

    public b(com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 c22452xfeb68e00) {
        this.f363093a = c22452xfeb68e00;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewCardPackageTipPreference", "settings_mm_cardpackage_new_view eventId:" + str);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_exp");
        com.p314xaae8f345.mm.ui.p2721x33323e.C22452xfeb68e00 c22452xfeb68e00 = this.f363093a;
        if (b17) {
            c22452xfeb68e00.f290682m3 = true;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_unexp")) {
            c22452xfeb68e00.f290682m3 = false;
            c22452xfeb68e00.f290683n3 = "";
            c22452xfeb68e00.f290684o3 = "";
        }
    }
}
