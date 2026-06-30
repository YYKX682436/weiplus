package j03;

/* loaded from: classes.dex */
public final class b implements com.p314xaae8f345.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j03.d f378556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f378557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f378558c;

    public b(j03.d dVar, com.p314xaae8f345.mm.vfs.r6 r6Var, yz5.l lVar) {
        this.f378556a = dVar;
        this.f378557b = r6Var;
        this.f378558c = lVar;
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void a(java.lang.String str) {
        j03.d.a(this.f378556a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterUploadPlugin", "Upload failed");
        d(str);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f378558c.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Failed to upload file: " + str)))));
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void b(int i17, java.lang.String str) {
        j03.d.a(this.f378556a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterUploadPlugin", "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f378558c.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("Upload canceled: " + str)))));
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        j03.d.a(this.f378556a);
        if (i17 == 100) {
            long C = this.f378557b.C();
            d(str);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f378558c.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Long.valueOf(C))));
        }
    }

    public final void d(java.lang.String str) {
        if (str != null) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            boolean z17 = false;
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() && m17.f294799a.d(m17.f294800b)) {
                z17 = true;
            }
            j03.d.a(this.f378556a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterUploadPlugin", "Delete file %s, res: %s", str, java.lang.Boolean.valueOf(z17));
        }
    }
}
