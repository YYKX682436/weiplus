package pk4;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 f438044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78) {
        super(1);
        this.f438044d = c18690x34c5bc78;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int mo100929x8d5c7601;
        kk4.b it = (kk4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        kk4.v vVar = (kk4.v) it;
        kk4.c cVar = vVar.f390110b;
        long mo100924x2d67b867 = cVar != null ? ((kk4.f0) cVar).mo100924x2d67b867(205) : 0L;
        int i17 = 0;
        boolean z17 = mo100924x2d67b867 == 90 || mo100924x2d67b867 == 270;
        if (z17) {
            kk4.c cVar2 = vVar.f390110b;
            if (cVar2 != null) {
                mo100929x8d5c7601 = ((kk4.f0) cVar2).mo100928x463504c();
            }
            mo100929x8d5c7601 = 0;
        } else {
            kk4.c cVar3 = vVar.f390110b;
            if (cVar3 != null) {
                mo100929x8d5c7601 = ((kk4.f0) cVar3).mo100929x8d5c7601();
            }
            mo100929x8d5c7601 = 0;
        }
        if (z17) {
            kk4.c cVar4 = vVar.f390110b;
            if (cVar4 != null) {
                i17 = ((kk4.f0) cVar4).mo100929x8d5c7601();
            }
        } else {
            kk4.c cVar5 = vVar.f390110b;
            if (cVar5 != null) {
                i17 = ((kk4.f0) cVar5).mo100928x463504c();
            }
        }
        this.f438044d.f256071m.a(mo100929x8d5c7601, i17, (int) mo100924x2d67b867);
        return jz5.f0.f384359a;
    }
}
