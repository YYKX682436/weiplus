package rr3;

/* loaded from: classes3.dex */
public final class h implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr3.k f480723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480724b;

    public h(rr3.k kVar, java.lang.String str) {
        this.f480723a = kVar;
        this.f480724b = str;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        rr3.k kVar = this.f480723a;
        if (!z17) {
            ((android.widget.TextView) ((jz5.n) kVar.f480728e).mo141623x754a37bb()).setText(this.f480724b);
        } else {
            ((android.widget.TextView) ((jz5.n) kVar.f480728e).mo141623x754a37bb()).setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).P0());
        }
    }
}
