package lz2;

/* loaded from: classes14.dex */
public class u implements lz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f403887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lz2.w f403888b;

    public u(lz2.w wVar, int i17) {
        this.f403888b = wVar;
        this.f403887a = i17;
    }

    @Override // lz2.c
    /* renamed from: onStart */
    public void mo146545xb05099c3() {
    }

    @Override // lz2.c
    /* renamed from: onStop */
    public void mo146546xc39f8281() {
        lz2.w wVar = this.f403888b;
        lz2.a aVar = wVar.f403892f;
        if (aVar != null) {
            aVar.mo11327x833155dc(this.f403887a, wVar.f403894h);
            wVar.f403892f = null;
        }
        wVar.f403890d.dismiss();
    }
}
