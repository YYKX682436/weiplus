package w24;

/* loaded from: classes15.dex */
public final class v implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w24.w f524175a;

    public v(w24.w wVar) {
        this.f524175a = wVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        w24.w wVar = this.f524175a;
        wVar.f524176e = z17;
        yz5.l lVar = wVar.f524179h;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
    }
}
