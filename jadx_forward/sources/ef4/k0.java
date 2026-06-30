package ef4;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef4.k0 f333992a = new ef4.k0();

    public final java.lang.String a(int i17, java.lang.String str) {
        java.lang.String b17;
        if (str == null) {
            b17 = "story_local_video_" + i17;
        } else {
            b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("storyvideo", i17, "story", str);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return null;
        }
        return b17;
    }

    public final nf4.o b(if4.h videoItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoItem, "videoItem");
        boolean a17 = videoItem.a();
        long j17 = videoItem.f372787b;
        if (a17) {
            nf4.o oVar = new nf4.o();
            oVar.f66551x44346ab = j17;
            oVar.f66553x4b6e88aa = "";
            oVar.f66549x799e9d9e = 0;
            oVar.f66552x78351860 = 0;
            oVar.f66550xf1e9b966 = "";
            return oVar;
        }
        java.lang.String c17 = c(videoItem.f372791f, videoItem.f372789d);
        java.lang.String str = c17 != null ? c17 : "";
        if (!(str.length() == 0)) {
            java.lang.String r17 = com.p314xaae8f345.mm.vfs.w6.r(str);
            com.p314xaae8f345.mm.vfs.w6.u(r17);
            com.p314xaae8f345.mm.vfs.w6.t(r17);
        }
        ef4.v vVar = ef4.w.f334001t;
        nf4.p k17 = vVar.k();
        nf4.o oVar2 = null;
        if (j17 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Test get mediaId error ");
            sb6.append(j17);
            sb6.append(' ');
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nf4.p.f418412f, sb6.toString());
        } else {
            android.database.Cursor B = k17.f418413d.B("select * from StoryVideoCacheInfo  where storyId = '" + j17 + "' ", null);
            if (B != null) {
                if (B.moveToFirst()) {
                    nf4.o oVar3 = new nf4.o();
                    oVar3.mo9015xbf5d97fd(B);
                    oVar2 = oVar3;
                }
                B.close();
            }
        }
        if (oVar2 == null) {
            oVar2 = new nf4.o();
            oVar2.f66551x44346ab = j17;
            oVar2.f66553x4b6e88aa = videoItem.f372791f.f471556f;
            oVar2.f66549x799e9d9e = 0;
            oVar2.f66552x78351860 = 0;
            oVar2.f66550xf1e9b966 = c17;
            vVar.k().mo880xb970c2b9(oVar2);
        }
        java.lang.String str2 = oVar2.f66550xf1e9b966;
        if (str2 == null || str2.length() == 0) {
            oVar2.f66550xf1e9b966 = c17;
        }
        return oVar2;
    }

    public final java.lang.String c(r45.xe6 xe6Var, java.lang.String str) {
        if (xe6Var == null) {
            return null;
        }
        ef4.c0 c0Var = ef4.c0.f333971a;
        java.lang.String str2 = xe6Var.f471556f;
        java.lang.String str3 = "";
        if (str2 != null) {
            java.lang.String concat = c0Var.a(str).concat("video/");
            byte[] bytes = str2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            if (g17 != null) {
                str3 = com.p314xaae8f345.mm.vfs.w6.i(concat + g17 + ".v", true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoLogic", "get story video path %s", str3);
        return str3;
    }

    public final java.lang.String d(r45.xe6 xe6Var) {
        if (xe6Var == null) {
            return null;
        }
        java.lang.String str = xe6Var.f471554d;
        if (str == null) {
            return "";
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(ef4.w.f334001t.b() + str + ".v", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
        return i17.concat(".u");
    }
}
