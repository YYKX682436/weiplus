package bu2;

/* loaded from: classes2.dex */
public abstract class z {

    /* renamed from: a */
    public static final kk.l f24578a = new kk.l(200);

    public static final int a(android.util.Size size, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(size, "<this>");
        if (i17 <= 0) {
            return 0;
        }
        int height = (z17 || size.getWidth() <= 0) ? (int) ((i17 * 3.5d) / 3) : (size.getHeight() * i17) / size.getWidth();
        float f17 = height;
        float f18 = i17;
        float f19 = 1.3166667f * f18;
        if (f17 > f19) {
            return (int) f19;
        }
        float f27 = f18 * 0.95f;
        if (f17 >= f27) {
            return height;
        }
        int i18 = (int) f27;
        com.tencent.mars.xlog.Log.i("FinderExt", "calculateStaggeredLayoutParams: originWidth:" + i17 + " targetHeightL:" + i18);
        return i18;
    }

    public static final long b(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
            return 0L;
        }
        return finderMedia.getVideoDuration() * 1000;
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.Object obj;
        if (str == null) {
            return "";
        }
        kk.l lVar = f24578a;
        synchronized (lVar) {
            obj = lVar.get(str);
        }
        if (obj == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            obj = com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
            synchronized (lVar) {
                lVar.j(str, obj);
            }
        }
        java.lang.String str2 = (java.lang.String) obj;
        return str2 == null ? "" : str2;
    }

    public static final bu2.h0 d(java.util.List list, java.lang.String source, boolean z17) {
        r45.mb4 mb4Var;
        int i17;
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(list);
        if (mb4Var2 == null) {
            return new bu2.h0(0.75f, 0, 0, null, list);
        }
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            mb4Var = mb4Var2;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                mb4Var2 = (r45.mb4) it.next();
                if (!(mb4Var2.getFloat(4) == 0.0f)) {
                    if ((mb4Var.getFloat(4) == 0.0f ? 1 : 0) != 0) {
                        continue;
                    } else {
                        if ((mb4Var.getFloat(5) * 1.0f) / mb4Var.getFloat(4) < (mb4Var2.getFloat(5) * 1.0f) / mb4Var2.getFloat(4)) {
                            break;
                        }
                    }
                }
            }
        }
        if (z17) {
            r45.gn2 gn2Var = (r45.gn2) mb4Var.getCustom(45);
            if (gn2Var != null && gn2Var.getBoolean(1)) {
                float f19 = mb4Var.getFloat(5);
                r45.gn2 gn2Var2 = (r45.gn2) mb4Var.getCustom(45);
                float f27 = f19 * (gn2Var2 != null ? gn2Var2.getFloat(3) : 1.0f);
                float f28 = mb4Var.getFloat(5);
                r45.gn2 gn2Var3 = (r45.gn2) mb4Var.getCustom(45);
                float f29 = f28 * (gn2Var3 != null ? gn2Var3.getFloat(4) : 1.0f);
                com.tencent.mars.xlog.Log.i("FinderExt", "getMaxMediaHWRadio: top=" + f27 + ", bottom=" + f29 + ", mediaWidth=" + mb4Var.getFloat(4) + ", mediaHeight=" + mb4Var.getFloat(5) + ", source=" + source);
                f17 = f29 - f27;
                i17 = 1;
                f18 = (1.0f * f17) / mb4Var.getFloat(4);
                com.tencent.mars.xlog.Log.i("FinderExt", "getMaxMediaHWRadio: source=" + source + ", checkScaleInfo=" + z17 + ", case=" + i17 + ", resultRadio=" + f18);
                return new bu2.h0(f18, (int) f17, (int) mb4Var.getFloat(4), mb4Var, list);
            }
        }
        f17 = mb4Var.getFloat(5);
        f18 = (mb4Var.getFloat(5) * 1.0f) / mb4Var.getFloat(4);
        com.tencent.mars.xlog.Log.i("FinderExt", "getMaxMediaHWRadio: source=" + source + ", checkScaleInfo=" + z17 + ", case=" + i17 + ", resultRadio=" + f18);
        return new bu2.h0(f18, (int) f17, (int) mb4Var.getFloat(4), mb4Var, list);
    }

    public static final float e(java.util.List list, java.lang.String source, boolean z17) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        return d(list, source, z17).f24516a;
    }

    public static /* synthetic */ float f(java.util.List list, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return e(list, str, z17);
    }

    public static final android.util.Size g(r45.mb4 mb4Var) {
        kotlin.jvm.internal.o.g(mb4Var, "<this>");
        return new android.util.Size((int) mb4Var.getFloat(4), (int) mb4Var.getFloat(5));
    }

    public static final java.util.LinkedList h(java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(i((com.tencent.mm.protocal.protobuf.FinderMedia) it.next()));
        }
        return linkedList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02b4, code lost:
    
        if (r2 != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.mb4 i(com.tencent.mm.protocal.protobuf.FinderMedia r11) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.z.i(com.tencent.mm.protocal.protobuf.FinderMedia):r45.mb4");
    }
}
