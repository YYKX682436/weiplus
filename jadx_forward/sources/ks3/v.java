package ks3;

/* loaded from: classes8.dex */
public class v implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.z f393287d;

    public v(ks3.z zVar) {
        this.f393287d = zVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ks3.u uVar = (ks3.u) obj;
        ks3.u uVar2 = (ks3.u) obj2;
        java.lang.String str = uVar.f393286h;
        ks3.z zVar = this.f393287d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(ks3.z.a(zVar, str)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(ks3.z.a(zVar, uVar2.f393286h))) {
            return uVar.f393286h.compareTo(uVar2.f393286h);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(ks3.z.a(zVar, uVar.f393286h))) {
            return -1;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y0(ks3.z.a(zVar, uVar2.f393286h))) {
            return 1;
        }
        return uVar.f393286h.compareTo(uVar2.f393286h);
    }
}
