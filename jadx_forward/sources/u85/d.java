package u85;

/* loaded from: classes10.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u85.e f507230d;

    public d(u85.e eVar) {
        this.f507230d = eVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        u85.e eVar = this.f507230d;
        java.lang.String str2 = eVar.f507231h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback: ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(i17);
        sb6.append("; progress ");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69500x8ab84c59) : null);
        sb6.append(", ");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69496x83ec3dd) : null);
        sb6.append("; result ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (i17 != 0) {
            eVar.e(false);
        } else if (hVar != null) {
            if (hVar.f69553xb5f54fe9 == 0) {
                java.lang.String str3 = eVar.f507237q;
                com.p314xaae8f345.mm.vfs.w6.u(str3);
                java.lang.String str4 = eVar.f507238r;
                if (com.p314xaae8f345.mm.vfs.w6.Q(str4, str3) == 0) {
                    com.p314xaae8f345.mm.vfs.w6.h(str4);
                    t85.j jVar = new t85.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                    jVar.f498009c = str3;
                    java.lang.String str5 = eVar.f507252f.f275223e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
                    jVar.f498007a = str5;
                    jVar.c(str3);
                    z18 = true;
                } else {
                    com.p314xaae8f345.mm.vfs.w6.h(str4);
                    com.p314xaae8f345.mm.vfs.w6.f(str3);
                    z18 = false;
                }
                if (z18) {
                    eVar.e(true);
                }
            }
            eVar.e(false);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
