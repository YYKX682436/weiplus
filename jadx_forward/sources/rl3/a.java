package rl3;

/* loaded from: classes10.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rl3.b f478758a;

    public a(rl3.b bVar) {
        this.f478758a = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public void a(int i17) {
        rl3.b bVar = this.f478758a;
        if (i17 == 0) {
            if (bVar.f478759a) {
                bVar.f478759a = false;
                bVar.mo67221xc84dc82d();
                return;
            }
            return;
        }
        if ((i17 == 1 || i17 == 2) && bVar.i()) {
            bVar.f478759a = true;
            bVar.mo67220x65825f6();
        }
    }
}
