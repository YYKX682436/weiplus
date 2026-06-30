package sf4;

/* loaded from: classes4.dex */
public final class t1 implements dn.k {
    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        boolean z19 = true;
        if (hVar != null && hVar.f69553xb5f54fe9 == -21112) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreload, mediaId:" + str + ", video source change!");
            sf4.u1.a(sf4.u1.f489116a, str);
            return 0;
        }
        if (gVar != null && gVar.f69500x8ab84c59 > 0) {
            if4.h hVar2 = (if4.h) sf4.u1.f489121f.get(str);
            java.util.Set set = sf4.u1.f489123h;
            boolean O = kz5.n0.O(set, str);
            int i18 = (int) ((((float) gVar.f69496x83ec3dd) / ((float) gVar.f69500x8ab84c59)) * 100);
            java.lang.Integer num = (java.lang.Integer) sf4.u1.f489122g.get(str);
            int intValue = num != null ? num.intValue() : 0;
            java.lang.String str2 = hashCode() + " onPreload, mediaId:" + str + ", startRet:" + i17 + ", preloadOffset:" + gVar.f69496x83ec3dd + ", totalLength: " + gVar.f69500x8ab84c59 + " desiredPreloadPercent:" + intValue + ", preloadPercent:" + i18 + " isFinish:" + O;
            if (intValue <= 0 || i18 < intValue) {
                z18 = false;
            } else {
                str2 = str2 + " exceed:true ";
                z18 = true;
            }
            if (hVar2 != null) {
                nf4.o b17 = ef4.k0.f333992a.b(hVar2);
                b17.f66549x799e9d9e = (int) gVar.f69496x83ec3dd;
                b17.f66552x78351860 = (int) gVar.f69500x8ab84c59;
                ef4.v vVar = ef4.w.f334001t;
                vVar.k().D0(b17);
                nf4.f y07 = vVar.g().y0(hVar2.f372789d);
                long j17 = y07.f66294x10ed17fb;
                long j18 = hVar2.f372787b;
                if (j17 == j18 && y07.m149512x7b953cf2()) {
                    java.lang.String Id = hVar2.f372791f.f471554d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
                    int i19 = b17.f66549x799e9d9e;
                    if (j18 == y07.f66294x10ed17fb) {
                        y07.f66289x3194108c = j18;
                        y07.f66288xd9f687bb = Id;
                        y07.f66287x90029412 = i19;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        str2 = str2 + " * ext pre update * ";
                        nf4.g g17 = vVar.g();
                        if (g17.d1((int) y07.f72763xa3c65b86, y07) >= 0) {
                            g17.mo142179xf35bbb4("notify_story_preload", 3, y07);
                        }
                    }
                }
                if (z18 && str != null) {
                    set.add(str);
                }
                str2 = str2 + "update cacheSize done";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", str2 + ", currentSpeed:" + sf4.u1.f489116a.g());
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
