package dz4;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f326908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f326909f;

    public q(dz4.j0 j0Var, long j17, java.util.List list) {
        this.f326907d = j0Var;
        this.f326908e = j17;
        this.f326909f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<dz4.m> list = this.f326909f;
        dz4.j0 j0Var = this.f326907d;
        j0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            for (dz4.m mVar : list) {
                int i17 = mVar.f326878a;
                if (i17 != 1) {
                    android.net.Uri uri = mVar.f326880c;
                    if (i17 == 2) {
                        java.lang.String valueOf = java.lang.String.valueOf(uri);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j c17 = j0Var.c(valueOf);
                        if (c17 != null) {
                            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v();
                            vVar.f298406d = 2;
                            boolean[] zArr = vVar.f298411i;
                            zArr[1] = true;
                            vVar.f298410h = c17;
                            zArr[5] = true;
                            arrayList.add(vVar);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: image buildImageMediaInfoResp failed, imgPath=" + valueOf);
                        }
                    } else if (i17 == 3) {
                        java.lang.String valueOf2 = java.lang.String.valueOf(uri);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j d17 = j0Var.d(valueOf2);
                        if (d17 != null) {
                            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v vVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v();
                            vVar2.f298406d = 3;
                            boolean[] zArr2 = vVar2.f298411i;
                            zArr2[1] = true;
                            vVar2.f298410h = d17;
                            zArr2[5] = true;
                            arrayList.add(vVar2);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: video buildVideoMediaInfoResp failed, importPath=" + valueOf2);
                        }
                    } else if (i17 == 4) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uri);
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.c b17 = j0Var.b(uri, mVar.f326881d);
                        if (b17 != null) {
                            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v vVar3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v();
                            vVar3.f298406d = 4;
                            boolean[] zArr3 = vVar3.f298411i;
                            zArr3[1] = true;
                            vVar3.f298409g = b17;
                            zArr3[4] = true;
                            arrayList.add(vVar3);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: file buildFileInfoResp failed, uri=" + uri);
                        }
                    }
                } else {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v vVar4 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.v();
                    vVar4.f298406d = 1;
                    boolean[] zArr4 = vVar4.f298411i;
                    zArr4[1] = true;
                    vVar4.f298407e = mVar.f326879b;
                    zArr4[2] = true;
                    arrayList.add(vVar4);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "processClipBoardItems: error " + e17);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.i iVar = j0Var.f326843b;
        if (iVar != null) {
            iVar.q0(this.f326908e, arrayList);
        }
    }
}
