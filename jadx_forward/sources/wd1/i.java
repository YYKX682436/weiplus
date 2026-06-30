package wd1;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f526340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd1.k f526341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, wd1.k kVar, java.lang.String str) {
        super(0);
        this.f526340d = context;
        this.f526341e = kVar;
        this.f526342f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnapshotWebViewService", "open context:" + this.f526340d + " runtime:" + this.f526341e.f526355d);
        wd1.k kVar = this.f526341e;
        if (kVar.f526357f == null) {
            int width = kVar.f526355d.f156343s.getWidth();
            int height = this.f526341e.f526355d.f156343s.getHeight();
            wd1.k kVar2 = this.f526341e;
            kVar2.f526357f = new wl1.h(this.f526340d, new wd1.f(kVar2));
            wd1.k kVar3 = this.f526341e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = kVar3.f526355d;
            wl1.h hVar = kVar3.f526357f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = hVar.f528576c;
            c22633x83752a59.setLayoutParams(new android.widget.FrameLayout.LayoutParams(width, height));
            o6Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ef.SnapshotWebView.a(o6Var, c22633x83752a59);
            this.f526341e.f526355d.N.a(new wd1.h(this.f526341e));
        }
        wl1.h hVar2 = this.f526341e.f526357f;
        if (hVar2 != null) {
            hVar2.c(this.f526342f);
        }
        return jz5.f0.f384359a;
    }
}
