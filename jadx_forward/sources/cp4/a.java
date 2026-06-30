package cp4;

/* loaded from: classes8.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.b f302501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302502e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(cp4.b bVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f302501d = bVar;
        this.f302502e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cp4.a(this.f302501d, this.f302502e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cp4.a aVar = (cp4.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        gp.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        cp4.b bVar = this.f302501d;
        if (!bVar.f302513n) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.nio.ByteBuffer byteBuffer = bVar.f302510h;
            if (byteBuffer != null) {
                byteBuffer.clear();
            }
            java.nio.ByteBuffer byteBuffer2 = bVar.f302510h;
            if (byteBuffer2 != null) {
                byteBuffer2.position(0);
            }
            while (!bVar.f302520u && (cVar = bVar.f302508f) != null && cVar.c() >= 0) {
                try {
                    java.nio.ByteBuffer byteBuffer3 = bVar.f302510h;
                    if (byteBuffer3 != null) {
                        gp.c cVar2 = bVar.f302508f;
                        int f17 = cVar2 != null ? cVar2.f(byteBuffer3, bVar.f302512m + 7) : -1;
                        if (f17 > 2) {
                            int i17 = f17 + 7;
                            di3.a.a(byteBuffer3, bVar.f302512m, i17, bVar.f302517r, bVar.f302518s, bVar.f302519t);
                            bVar.f302512m += i17;
                        }
                        gp.c cVar3 = bVar.f302508f;
                        if (cVar3 != null) {
                            cVar3.a();
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EditCaptionDataManager", e17, "loadAudioTrackData error:" + e17.getMessage(), new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", "[" + bVar.hashCode() + "]load audio track size:" + bVar.f302512m + " cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            bVar.f302513n = true;
        }
        cp4.b bVar2 = this.f302501d;
        int i18 = this.f302502e;
        bVar2.getClass();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        int i19 = 1;
        int i27 = 0;
        while (true) {
            int i28 = bVar2.f302512m;
            if (i27 >= i28) {
                break;
            }
            int i29 = 167116 + i27;
            if (i29 <= i28) {
                i28 = i29;
            }
            java.nio.ByteBuffer byteBuffer4 = bVar2.f302510h;
            if (byteBuffer4 != null) {
                byteBuffer4.position(i27);
            }
            int i37 = i28 - i27;
            byte[] bArr = new byte[i37];
            java.nio.ByteBuffer byteBuffer5 = bVar2.f302510h;
            if (byteBuffer5 != null) {
                byteBuffer5.get(bArr);
            }
            bVar2.a(i18, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, i37), i19, i27);
            i19++;
            i27 = i28;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditCaptionDataManager", "[" + bVar2.hashCode() + "]do net cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        java.nio.ByteBuffer byteBuffer6 = bVar2.f302510h;
        if (byteBuffer6 != null) {
            byteBuffer6.clear();
        }
        return jz5.f0.f384359a;
    }
}
