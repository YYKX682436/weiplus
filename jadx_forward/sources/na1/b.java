package na1;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417477b;

    public b(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f417476a = str;
        this.f417477b = e9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11567x4f93c04a) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11567x4f93c04a) obj).f156525d;
            java.lang.String str2 = this.f417476a;
            if (str2.equals(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.F(str2, this);
                new na1.d().x(this.f417477b, na1.c.BeforeIdentifyQRCode, 0);
            }
        }
    }
}
