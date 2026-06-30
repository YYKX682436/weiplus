package c01;

/* loaded from: classes14.dex */
public class j implements fp.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.k f37266d;

    public j(c01.k kVar, c01.h hVar) {
        this.f37266d = kVar;
    }

    @Override // fp.c
    public void onChange(int i17) {
        c01.i iVar;
        c01.k kVar = this.f37266d;
        if (i17 == -3) {
            c01.i iVar2 = kVar.f37276d;
            if (iVar2 != null) {
                iVar2.P0();
                return;
            }
            return;
        }
        if (i17 == -2) {
            c01.i iVar3 = kVar.f37276d;
            if (iVar3 != null) {
                iVar3.U5();
                return;
            }
            return;
        }
        if (i17 != -1) {
            if (i17 == 1 && (iVar = kVar.f37276d) != null) {
                iVar.V3();
                return;
            }
            return;
        }
        c01.i iVar4 = kVar.f37276d;
        if (iVar4 != null) {
            iVar4.g3();
        }
    }
}
