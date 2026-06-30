package ea1;

/* loaded from: classes12.dex */
public class c extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f332042n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ea1.g f332043o;

    public c(ea1.g gVar, java.lang.String str) {
        this.f332043o = gVar;
        this.f332042n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "DeleteWeAppTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f332042n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "delete we app info id=%s", str);
        ea1.h hVar = this.f332043o.f332051f;
        int[] iArr = o13.d.f423751d;
        hVar.m0(iArr, str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(1).m0(iArr, str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{id: %s}", this.f332042n);
    }
}
