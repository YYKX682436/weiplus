package hi3;

/* loaded from: classes10.dex */
public class a implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi3.b f363041d;

    public a(hi3.b bVar) {
        this.f363041d = bVar;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab c16557x646260ab = this.f363041d.f363043b;
        if (c16557x646260ab == null) {
            return false;
        }
        if (bArr == null) {
            c16557x646260ab.getClass();
            return false;
        }
        hi3.c cVar = c16557x646260ab.f230835d;
        if (cVar == null || cVar.f363049c) {
            return false;
        }
        cVar.a(bArr, c16557x646260ab.f230836e, c16557x646260ab.f230837f, c16557x646260ab.f230838g, false);
        c16557x646260ab.requestRender();
        return false;
    }
}
