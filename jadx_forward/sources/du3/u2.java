package du3;

/* loaded from: classes10.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f325275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f325277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f325278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f325279i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f325280m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(android.graphics.Bitmap bitmap, du3.t3 t3Var, long j17, java.util.ArrayList arrayList, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325275e = bitmap;
        this.f325276f = t3Var;
        this.f325277g = j17;
        this.f325278h = arrayList;
        this.f325279i = z17;
        this.f325280m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.u2(this.f325275e, this.f325276f, this.f325277g, this.f325278h, this.f325279i, this.f325280m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.u2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325274d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nu3.i iVar = nu3.i.f421751a;
            android.graphics.Bitmap bitmap = this.f325275e;
            iVar.n("KEY_CROP_MEDIA_WIDTH_INT", new java.lang.Integer(bitmap.getWidth()));
            iVar.n("KEY_CROP_MEDIA_HEIGHT_INT", new java.lang.Integer(bitmap.getHeight()));
            iVar.h();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            du3.t3 t3Var = this.f325276f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = t3Var.f325257n;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, compressFormat, c16993xacc19624 != null ? c16993xacc19624.E : null, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveBitmapToImage  cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - this.f325277g);
            sb6.append("  path:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = t3Var.f325257n;
            sb6.append(c16993xacc196242 != null ? c16993xacc196242.E : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", sb6.toString());
            boolean z17 = false;
            t3Var.A = false;
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            for (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb : this.f325278h) {
                if (interfaceC4987x84e327cb != null && interfaceC4987x84e327cb.o0() != null) {
                    arrayList.add(interfaceC4987x84e327cb.o0());
                }
            }
            ut3.f.f512709c.f512711b.putParcelableArrayList("key_edit_safe_strategy_emotion_info_list", arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = t3Var.f325257n;
            java.lang.String str = c16993xacc196243 != null ? c16993xacc196243.E : null;
            if (str == null) {
                str = "";
            }
            qk.e0.b(str, arrayList);
            dw3.c0 c0Var = dw3.c0.f325715a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = t3Var.f325257n;
            ct0.b bVar = t3Var.f325258o;
            boolean z18 = bVar != null && bVar.f303739c;
            boolean z19 = this.f325279i;
            c0Var.u(c16993xacc196244, z18, z19);
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20505x421cf3ba()) == 1) {
                l45.q qVar = t3Var.f325259p;
                if (qVar instanceof l45.n) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(qVar, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
                    java.lang.String str2 = ((l45.n) qVar).f398011s;
                    if (str2 != null && !str2.isEmpty()) {
                        z17 = true;
                    }
                    if (z17) {
                        l45.q qVar2 = t3Var.f325259p;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(qVar2, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
                        java.lang.String str3 = ((l45.n) qVar2).f398011s;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196245 = t3Var.f325257n;
                        java.lang.String str4 = c16993xacc196245 != null ? c16993xacc196245.E : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(str4, true);
                        if (i18 != null) {
                            android.media.ExifInterface exifInterface = new android.media.ExifInterface(i18);
                            exifInterface.setAttribute(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3310x158f2670, str3);
                            exifInterface.saveAttributes();
                        }
                    }
                }
            }
            nu3.e eVar = nu3.e.f421731a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196246 = t3Var.f325257n;
            java.lang.String str5 = c16993xacc196246 != null ? c16993xacc196246.D : null;
            if (str5 == null) {
                str5 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[parseImageOriginMediaInfo]");
            nu3.b b17 = eVar.b(str5);
            nu3.e.f421735e = b17;
            ((java.util.ArrayList) nu3.e.f421738h).add(b17.g());
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196247 = t3Var.f325257n;
            java.lang.String str6 = c16993xacc196247 != null ? c16993xacc196247.E : null;
            java.lang.String str7 = str6 != null ? str6 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[parseImageEditedMediaInfo]");
            nu3.b b18 = eVar.b(str7);
            nu3.e.f421736f = b18;
            ((java.util.ArrayList) nu3.e.f421739i).add(b18.g());
            android.os.Bundle bundle = new android.os.Bundle();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196248 = t3Var.f325257n;
            bundle.putString("PARAM_1_STRING", c16993xacc196248 != null ? c16993xacc196248.E : null);
            t3Var.f546865d.w(ju3.c0.Z1, bundle);
            android.os.SystemClock.elapsedRealtime();
            arrayList.size();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            du3.t2 t2Var = new du3.t2(t3Var, z19, this.f325280m, null);
            this.f325274d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, t2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
