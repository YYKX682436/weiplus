package v2;

/* loaded from: classes15.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public int f514268a;

    /* renamed from: b, reason: collision with root package name */
    public int f514269b;

    /* renamed from: c, reason: collision with root package name */
    public int f514270c;

    /* renamed from: d, reason: collision with root package name */
    public int f514271d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f514272e = new java.util.ArrayList();

    public s(v2.i iVar) {
        this.f514268a = iVar.I;
        this.f514269b = iVar.f514181J;
        this.f514270c = iVar.l();
        this.f514271d = iVar.h();
        java.util.ArrayList g17 = iVar.g();
        int size = g17.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f514272e.add(new v2.r((v2.g) g17.get(i17)));
        }
    }
}
