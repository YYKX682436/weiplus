package yv3;

/* loaded from: classes5.dex */
public final class a extends sr.e {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f547740d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f547741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, android.view.ViewGroup parent, boolean z17) {
        super(context, parent, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f547740d = z17;
        this.f492925c.setBackgroundColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560448ko));
    }

    @Override // sr.e
    public void a() {
        this.f492925c.animate().translationY(r0.getLayoutParams().height).withEndAction(new sr.d(this));
        yz5.l lVar = this.f547741e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
    }

    public void b(boolean z17) {
        if (!z17) {
            a();
            return;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(this.f492923a);
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 abstractC4989x9e6071f3 = this.f492925c;
        abstractC4989x9e6071f3.setPadding(0, 0, 0, c17);
        this.f492924b.setVisibility(0);
        abstractC4989x9e6071f3.setVisibility(0);
        abstractC4989x9e6071f3.animate().translationY(0.0f).start();
        yz5.l lVar = this.f547741e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
    }
}
