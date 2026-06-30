package l53;

/* loaded from: classes8.dex */
public final class h implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l53.i f398191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398192e;

    public h(l53.i iVar, android.content.Context context) {
        this.f398191d = iVar;
        this.f398192e = context;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        l53.i iVar = this.f398191d;
        iVar.getClass();
        if (gVar != null) {
            gVar.m125797x9616526c();
        }
        if (hVar != null) {
            hVar.m125799x9616526c();
        }
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "duplicate request, ignore this request, media id is %s", str);
        } else if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            l53.a aVar = iVar.f398195c;
            if (aVar != null) {
                aVar.a("upload start failed");
            }
        } else if (gVar == null && hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, java.lang.Integer.valueOf(i18), hVar);
                l53.a aVar2 = iVar.f398195c;
                if (aVar2 != null) {
                    aVar2.a("upload failed");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,sceneResult.videoUrl =  " + hVar.f69524x419c440e + " sceneResult.thumbUrl =  " + hVar.f69560x7b284d5e);
                java.lang.String str2 = hVar.f69524x419c440e;
                java.lang.String str3 = hVar.f69560x7b284d5e;
                if (!iVar.f398197e) {
                    if (str2 == null || str2.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed videoUrl is null");
                        l53.a aVar3 = iVar.f398195c;
                        if (aVar3 != null) {
                            aVar3.a("videoUrl is null upload failed");
                        }
                    } else {
                        if (str3 == null || str3.length() == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed thumbUrl is null");
                            l53.a aVar4 = iVar.f398195c;
                            if (aVar4 != null) {
                                aVar4.a("thumbUrl is null upload failed");
                            }
                        } else {
                            java.lang.String t17 = (!r26.i0.y(str3, "https", false) && r26.i0.y(str3, "http", false)) ? r26.i0.t(str3, "http", "https", false) : str3;
                            com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
                            m33.k1 k1Var = iVar.f398193a;
                            java.lang.String str4 = k1Var.f404838c;
                            ((be0.e) oVar).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str4, true);
                            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(k1Var.f404838c);
                            java.lang.String str5 = a17.f294812f;
                            if (str5 != null) {
                                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                                if (!str5.equals(l17)) {
                                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                                }
                            }
                            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                            int i19 = (int) ((m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi appid = " + k1Var.f404836a + " videoUrl = " + str2 + " thumbUrl = " + str3 + "  duration = " + d17.f243915a + "width = " + d17.f243917c + "   height = " + d17.f243918d + "  size= " + i19);
                            q33.a aVar5 = new q33.a();
                            q33.f fVar = new q33.f();
                            fVar.f441479d = k1Var.f404836a;
                            fVar.f441481f = str2;
                            fVar.f441482g = t17;
                            fVar.f441483h = (int) ((float) java.lang.Math.ceil((double) (((float) d17.f243915a) / ((float) 1000))));
                            fVar.f441484i = d17.f243917c;
                            fVar.f441485m = d17.f243918d;
                            fVar.f441486n = i19;
                            java.lang.String str6 = k1Var.f404840e;
                            if (str6 == null) {
                                str6 = "";
                            }
                            fVar.f441487o = str6;
                            java.lang.String str7 = k1Var.f404841f;
                            fVar.f441488p = str7 != null ? str7 : "";
                            fVar.f441489q = k1Var.f404839d;
                            aVar5.f441465d = fVar;
                            aVar5.f441466e = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(k1Var.f404838c + java.lang.System.currentTimeMillis());
                            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                            lVar.f152197a = aVar5;
                            lVar.f152198b = new q33.b();
                            lVar.f152199c = "/cgi-bin/mmgame-bin/addwxagvideo";
                            lVar.f152200d = 20452;
                            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new l53.d(iVar, t17, this.f398192e));
                        }
                    }
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
