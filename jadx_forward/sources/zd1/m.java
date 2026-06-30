package zd1;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f553078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f553079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd1.o f553080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, zd1.o oVar) {
        super(1);
        this.f553078d = yVar;
        this.f553079e = i17;
        this.f553080f = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        zd1.j result = (zd1.j) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        boolean z17 = result instanceof zd1.i;
        zd1.o oVar = this.f553080f;
        int i17 = this.f553079e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f553078d;
        if (z17) {
            zd1.i iVar = (zd1.i) result;
            yVar.a(i17, oVar.x(yVar, jc1.f.f380445a, kz5.c1.k(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, iVar.f553066a), new jz5.l("width", java.lang.Integer.valueOf(iVar.f553067b)), new jz5.l("height", java.lang.Integer.valueOf(iVar.f553068c)))));
        } else if (result instanceof zd1.h) {
            java.lang.String str2 = ((zd1.h) result).f553065a;
            if (str2 == null || str2.length() == 0) {
                str = "fail";
            } else {
                str = "fail: " + str2;
            }
            yVar.a(i17, oVar.o(str));
        }
        return jz5.f0.f384359a;
    }
}
