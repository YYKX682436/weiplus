package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296509d;

    /* renamed from: e, reason: collision with root package name */
    public int f296510e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f296511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 f296512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yq5.m f296513h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var, yq5.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f296512g = v1Var;
        this.f296513h = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.k1 k1Var = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.k1(this.f296512g, this.f296513h, interfaceC29045xdcb5ca57);
        k1Var.f296511f = obj;
        return k1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.k1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.lang.Object g17;
        java.lang.String key;
        yq5.p pVar;
        int i17;
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f296510e;
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.v1 v1Var = this.f296512g;
        yq5.m mVar = this.f296513h;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f296511f;
            java.lang.String key2 = "tile_" + ((yq5.e) v1Var.f296657b.f546133a).f546129b + "_rect=" + zq5.f.b(mVar.f546140b) + "_sampleSize=" + mVar.f546141c;
            v1Var.f296659d.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key2, "key");
            mVar.a();
            mVar.f546145g = 1;
            v1Var.d("loadTile:loading");
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.j1 j1Var = new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.j1(v1Var, mVar, null);
            this.f296511f = y0Var;
            this.f296509d = key2;
            this.f296510e = 2;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(v1Var.f296666k, j1Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            key = key2;
        } else {
            if (i18 == 1) {
                yq5.p pVar2 = (yq5.p) this.f296511f;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yq5.p pVar3 = (yq5.p) obj;
                if (pVar3 != null) {
                    pVar2 = pVar3;
                }
                mVar.b(pVar2, 1, true);
                mVar.f546145g = 2;
                v1Var.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.g1(mVar, v1Var));
                v1Var.d("loadTile:fromMemory");
                return jz5.f0.f384359a;
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (yq5.p) this.f296511f;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yq5.p pVar4 = (yq5.p) obj;
                if (pVar4 != null) {
                    i17 = 2;
                    z17 = true;
                    mVar.b(pVar4, i17, z17);
                    mVar.f546145g = i17;
                    v1Var.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.h1(mVar, v1Var));
                    v1Var.d("loadTile:successful");
                    return jz5.f0.f384359a;
                }
                pVar4 = pVar;
                i17 = 2;
                z17 = true;
                mVar.b(pVar4, i17, z17);
                mVar.f546145g = i17;
                v1Var.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.h1(mVar, v1Var));
                v1Var.d("loadTile:successful");
                return jz5.f0.f384359a;
            }
            key = (java.lang.String) this.f296509d;
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f296511f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) g17).getValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value) ? null : value);
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value)) {
            mVar.a();
            mVar.f546145g = 3;
            zq5.k kVar = v1Var.f296656a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. loadTile. failed, ");
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
            sb6.append(m143898xd4a2fc34 != null ? m143898xd4a2fc34.getMessage() : null);
            sb6.append(". ");
            sb6.append(mVar);
            sb6.append(". '");
            sb6.append(v1Var.f296657b.a());
            sb6.append('\'');
            java.lang.String msg = sb6.toString();
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            kVar.b(zq5.i.f556605h, msg);
            v1Var.d("loadTile:failed");
        } else if (bitmap == null) {
            mVar.a();
            mVar.f546145g = 3;
            zq5.k kVar2 = v1Var.f296656a;
            java.lang.String msg2 = "TileManager. loadTile. failed, bitmap null. " + mVar + ". '" + v1Var.f296657b.a() + '\'';
            kVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
            kVar2.b(zq5.i.f556605h, msg2);
            v1Var.d("loadTile:failed");
        } else {
            if (mVar.f546141c == 1) {
                zq5.e eVar = mVar.f546140b;
                if (eVar.f556596c - eVar.f556594a != bitmap.getWidth() || eVar.f556597d - eVar.f556595b != bitmap.getHeight()) {
                    mVar.a();
                    mVar.f546145g = 3;
                    zq5.k kVar3 = v1Var.f296656a;
                    java.lang.String msg3 = "TileManager. loadTile. failed, size is different. " + mVar + ". " + bitmap + ". '" + v1Var.f296657b.a() + '\'';
                    kVar3.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg3, "msg");
                    kVar3.b(zq5.i.f556605h, msg3);
                    bitmap.recycle();
                    v1Var.d("loadTile:failed");
                }
            }
            if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                yq5.a aVar2 = new yq5.a(bitmap);
                com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.w0 w0Var = v1Var.f296659d;
                java.lang.String imageUrl = ((yq5.e) v1Var.f296657b.f546133a).f546129b;
                w0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageUrl, "imageUrl");
                yq5.c imageInfo = v1Var.f296660e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageInfo, "imageInfo");
                pVar = aVar2;
                pVar4 = pVar;
                i17 = 2;
                z17 = true;
                mVar.b(pVar4, i17, z17);
                mVar.f546145g = i17;
                v1Var.f296656a.d(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.h1(mVar, v1Var));
                v1Var.d("loadTile:successful");
            } else {
                v1Var.f296656a.a(new com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.i1(bitmap, mVar, v1Var));
                mVar.a();
                mVar.f546145g = 3;
                bitmap.recycle();
                v1Var.d("loadTile:canceled");
            }
        }
        return jz5.f0.f384359a;
    }
}
