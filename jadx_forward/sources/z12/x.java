package z12;

/* loaded from: classes12.dex */
public class x implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z12.y f550913a;

    public x(z12.y yVar) {
        this.f550913a = yVar;
    }

    @Override // qr.i
    /* renamed from: onResult */
    public void mo44657x57429edc(int i17, java.lang.String str) {
        z12.y yVar = this.f550913a;
        if (i17 != 0) {
            yVar.f550915e.mo815x76e0bfae(4, -2, "", yVar);
            return;
        }
        yVar.f550918h = true;
        yVar.f550917g = true;
        if (yVar.mo807x6c193ac1(yVar.m47995xb7ba1aa7(), yVar.f550915e) < 0) {
            yVar.f550915e.mo815x76e0bfae(3, -1, "", yVar);
        }
    }
}
