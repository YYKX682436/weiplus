package yt3;

/* loaded from: classes10.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f547004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f547005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f547006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f547007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f547008h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f547009i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547010m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.graphics.Bitmap bitmap, yt3.p0 p0Var, long j17, java.util.ArrayList arrayList, boolean z17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547005e = bitmap;
        this.f547006f = p0Var;
        this.f547007g = j17;
        this.f547008h = arrayList;
        this.f547009i = z17;
        this.f547010m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yt3.h0(this.f547005e, this.f547006f, this.f547007g, this.f547008h, this.f547009i, this.f547010m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yt3.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547004d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nu3.i iVar = nu3.i.f421751a;
            android.graphics.Bitmap bitmap = this.f547005e;
            iVar.n("KEY_CROP_MEDIA_WIDTH_INT", new java.lang.Integer(bitmap.getWidth()));
            iVar.n("KEY_CROP_MEDIA_HEIGHT_INT", new java.lang.Integer(bitmap.getHeight()));
            iVar.h();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            yt3.p0 p0Var = this.f547006f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = p0Var.f547117i;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, compressFormat, c16993xacc19624 != null ? c16993xacc19624.E : null, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveBitmapToImage  cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - this.f547007g);
            sb6.append("  path:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = p0Var.f547117i;
            sb6.append(c16993xacc196242 != null ? c16993xacc196242.E : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
            boolean z17 = false;
            p0Var.f547122q = false;
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            for (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb : this.f547008h) {
                if (interfaceC4987x84e327cb != null && interfaceC4987x84e327cb.o0() != null) {
                    arrayList.add(interfaceC4987x84e327cb.o0());
                }
            }
            ut3.f.f512709c.f512711b.putParcelableArrayList("key_edit_safe_strategy_emotion_info_list", arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = p0Var.f547117i;
            java.lang.String str = c16993xacc196243 != null ? c16993xacc196243.E : null;
            if (str == null) {
                str = "";
            }
            qk.e0.b(str, arrayList);
            dw3.c0 c0Var = dw3.c0.f325715a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = p0Var.f547117i;
            ct0.b bVar = p0Var.f547118m;
            if (bVar != null && bVar.f303739c) {
                z17 = true;
            }
            boolean z18 = this.f547009i;
            c0Var.u(c16993xacc196244, z17, z18);
            android.os.SystemClock.elapsedRealtime();
            arrayList.size();
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            yt3.g0 g0Var = new yt3.g0(p0Var, z18, this.f547010m, null);
            this.f547004d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, g0Var, this) == aVar) {
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
