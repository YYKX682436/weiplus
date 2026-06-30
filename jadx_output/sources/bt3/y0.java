package bt3;

/* loaded from: classes9.dex */
public final class y0 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f24460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f24460f = jz5.h.b(bt3.v0.f24429d);
    }

    public final boolean T6(oc0.a aVar) {
        java.lang.String Y6 = Y6(aVar);
        s15.h hVar = aVar.f344112a;
        boolean z17 = aVar.f344113b;
        if (z17 && com.tencent.mm.vfs.w6.j(Y6) && com.tencent.mm.vfs.w6.k(Y6) == hVar.getLong(hVar.f303422d + 7)) {
            aVar.f344121j = Y6;
            return true;
        }
        if (z17 || !com.tencent.mm.vfs.w6.j(Y6) || com.tencent.mm.vfs.w6.k(Y6) != hVar.getLong(hVar.f303422d + 11)) {
            return false;
        }
        aVar.f344121j = Y6;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:15:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0179 -> B:11:0x0182). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U6(java.util.List r18, java.lang.String r19, java.util.List r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.y0.U6(java.util.List, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void V6(v05.b bVar, java.util.List list, java.util.List list2, int i17, com.tencent.mm.vfs.r6 r6Var, oc0.b bVar2, oc0.a aVar) {
        s15.w j17;
        java.util.LinkedList j18;
        int i18 = 0;
        for (java.lang.Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            s15.h hVar = (s15.h) obj;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.getString(hVar.f303422d + 4))) {
                list2.add(new oc0.a(hVar, true, false, i17, i18, r6Var, bVar, bVar2, aVar));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.c0())) {
                list2.add(new oc0.a(hVar, true, true, i17, i18, r6Var, bVar, bVar2, aVar));
            }
            int i27 = hVar.f303422d;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.getString(i27 + 8))) {
                list2.add(new oc0.a(hVar, false, false, i17, i18, r6Var, bVar, bVar2, aVar));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(hVar.a0())) {
                list2.add(new oc0.a(hVar, false, true, i17, i18, r6Var, bVar, bVar2, aVar));
            }
            if (hVar.getInteger(i27 + 2) == 17 || hVar.getInteger(i27 + 2) == 21) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordAttachUploadFSC", "need embedded check dataItem dataId:" + hVar.getString(i27 + 3) + " dataType:" + hVar.getInteger(i27 + 2));
                s15.i0 H = hVar.H();
                if (H != null && (j17 = H.j()) != null && (j18 = j17.j()) != null) {
                    V6(bVar, j18, list2, i17 + 1, r6Var, bVar2, new oc0.a(hVar, false, false, i17, i18, r6Var, bVar, bVar2, aVar));
                }
            }
            i18 = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02dc, code lost:
    
        kz5.c0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02e0, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0128 -> B:10:0x012b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W6(java.util.List r19, java.util.List r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.y0.W6(java.util.List, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X6(oc0.a r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.y0.X6(oc0.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String Y6(oc0.a aVar) {
        java.lang.String o17 = new com.tencent.mm.vfs.r6(aVar.f344117f, Z6(aVar, true)).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    public final java.lang.String Z6(oc0.a aVar, boolean z17) {
        java.lang.String valueOf = java.lang.String.valueOf(aVar.f344116e);
        oc0.a aVar2 = aVar;
        while (true) {
            java.lang.Integer num = null;
            if ((aVar2 != null ? aVar2.f344120i : null) == null) {
                break;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            oc0.a aVar3 = aVar2.f344120i;
            if (aVar3 != null) {
                num = java.lang.Integer.valueOf(aVar3.f344116e);
            }
            sb6.append(num);
            sb6.append('_');
            sb6.append(valueOf);
            valueOf = sb6.toString();
            aVar2 = aVar2.f344120i;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        s15.h hVar = aVar.f344112a;
        sb7.append(hVar.getString(hVar.f303422d + 3));
        sb7.append('_');
        sb7.append(aVar.f344113b ? "thumb" : com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        sb7.append('_');
        sb7.append(z17 ? "upload" : "download");
        sb7.append('_');
        sb7.append(valueOf);
        return sb7.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a7(oc0.b r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.y0.a7(oc0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x047b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0846 -> B:14:0x085c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x05e8 -> B:75:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(oc0.b r48, kotlin.coroutines.Continuation r49) {
        /*
            Method dump skipped, instructions count: 2551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.y0.b7(oc0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
