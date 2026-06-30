package al1;

/* loaded from: classes7.dex */
public final class p implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f87332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al1.q f87333e;

    public p(boolean z17, al1.q qVar) {
        this.f87332d = z17;
        this.f87333e = qVar;
    }

    @Override // l01.u
    public void b() {
        this.f87333e.m2258xa2f0e6ad().mo146xb9724478(null);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "AppBrandTradeOptionView";
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        boolean z17 = this.f87332d;
        al1.q qVar = this.f87333e;
        if (z17) {
            qVar.m2262x11597863(bitmap);
        } else {
            qVar.m2263x5062df5b(bitmap);
        }
        qVar.b(qVar.m2259xbcd54749());
        if (qVar.m2256xb505b7ef() != null) {
            if (qVar.m2257xf40f1ee7() != null) {
                qVar.m2258xa2f0e6ad().mo146xb9724478(qVar);
            }
        }
    }
}
