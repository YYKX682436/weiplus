package hk2;

/* loaded from: classes3.dex */
public final class f implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs2.m0 f363420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f363422c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f363423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f363424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f363425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp.i f363426g;

    public f(xs2.m0 m0Var, java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var, int i17, boolean z17, gk2.e eVar, wp.i iVar) {
        this.f363420a = m0Var;
        this.f363421b = str;
        this.f363422c = f0Var;
        this.f363423d = i17;
        this.f363424e = z17;
        this.f363425f = eVar;
        this.f363426g = iVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        xs2.m0 m0Var = this.f363420a;
        java.lang.Object tag = m0Var.f537885d.getTag();
        java.lang.String str = this.f363421b;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, str);
        android.view.View view = m0Var.f537885d;
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DanmakuItemGift", "loadGift error tag:" + view.getTag() + ",request id:" + str);
            return;
        }
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuItemGift", "loadGift resource is null!");
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), bitmap);
        jz5.g gVar = hk2.j.f363437a;
        jz5.g gVar2 = hk2.j.f363437a;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue(), ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        int i17 = this.f363423d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = this.f363422c;
        f0Var.c(wVar, i17, i17 + 1, 33);
        m0Var.f537889h.setText(f0Var);
        if (this.f363424e) {
            mm2.j2 j2Var = (mm2.j2) this.f363425f.a(mm2.j2.class);
            wp.i obj2 = this.f363426g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "obj");
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) j2Var.f410711z).e(obj2);
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }
}
