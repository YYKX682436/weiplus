package lt3;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final lt3.n f402793a = new lt3.n();

    /* renamed from: b, reason: collision with root package name */
    public static final lt3.h f402794b = ((pc0.s2) i95.n0.c(pc0.s2.class)).Ai();

    /* renamed from: c, reason: collision with root package name */
    public static final android.graphics.Rect f402795c = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);

    /* renamed from: d, reason: collision with root package name */
    public static final android.graphics.Rect f402796d = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);

    /* renamed from: e, reason: collision with root package name */
    public static final android.graphics.Rect f402797e = new android.graphics.Rect(0, 0, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x, com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y);

    /* renamed from: f, reason: collision with root package name */
    public static final int f402798f = 54;

    public final java.lang.String a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet;
        if (bundle == null || (keySet = bundle.keySet()) == null) {
            return "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : keySet) {
            java.lang.Object obj = bundle.get(str);
            if (obj instanceof java.util.List) {
                jSONObject.put(str, new org.json.JSONArray((java.util.Collection) obj));
            } else {
                jSONObject.put(str, bundle.get(str));
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final lt3.g b(java.lang.String taskId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        return f402794b.y0(taskId);
    }

    public final java.util.ArrayList c(java.util.LinkedList baseItemData, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseItemData, "baseItemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "get the editor data which is waiting for run mixing");
        java.util.Iterator it = baseItemData.iterator();
        while (it.hasNext()) {
            r45.de deVar = (r45.de) it.next();
            int i17 = deVar.f453871d;
            zu3.e eVar = zu3.e.f557329e;
            if (i17 == 1) {
                arrayList.add(new zu3.b0(context).d(new zu3.a0(deVar)));
            } else if (i17 == 2) {
                zu3.j jVar = new zu3.j(deVar);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = jVar.f557343g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC4987x84e327cb);
                av3.e eVar2 = new av3.e(interfaceC4987x84e327cb, jVar.f557296f);
                r45.bi0 bi0Var = new r45.bi0();
                bv3.d dVar = jVar.f557293c;
                bi0Var.f452305d = dVar.c();
                bi0Var.f452306e = dVar.b();
                eVar2.f95746c = bi0Var;
                arrayList.add(eVar2);
            } else if (i17 == 3) {
                zu3.z zVar = new zu3.z(context);
                zu3.s sVar = new zu3.s(deVar);
                arrayList.add(new av3.c(zVar.c(sVar), sVar.f557296f));
            } else if (i17 == 4) {
                zu3.c0 c0Var = new zu3.c0(context);
                zu3.a0 a0Var = new zu3.a0(deVar);
                arrayList.add(new av3.c(c0Var.c(a0Var), a0Var.f557296f));
            } else if (i17 == 5) {
                zu3.v vVar = new zu3.v(context);
                zu3.t tVar = new zu3.t(deVar);
                vVar.n(tVar.f557363g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it6 = vVar.f557367d.iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.Object obj = vVar.f557366J.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    arrayList2.add(new av3.g((r45.ge4) next, (android.graphics.Bitmap) obj));
                    i18 = i19;
                }
                arrayList.add(new av3.h(arrayList2, tVar.f557296f));
            } else {
                zu3.e eVar3 = zu3.e.f557334m;
                if (i17 == 6) {
                    byte[] bArr = deVar.f453872e.f453374f.f273689a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
                    arrayList.add(new av3.d(new zu3.d(eVar3, bArr)));
                } else {
                    zu3.e eVar4 = zu3.e.f557335n;
                    if (i17 == 7) {
                        byte[] bArr2 = deVar.f453872e.f453374f.f273689a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr2, "getBytes(...)");
                        arrayList.add(new av3.d(new zu3.d(eVar4, bArr2)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final r45.se6 d(r45.hi0 storyEditorProtoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyEditorProtoData, "storyEditorProtoData");
        r45.se6 se6Var = new r45.se6();
        se6Var.f467191f = com.p314xaae8f345.mm.vfs.w6.p(storyEditorProtoData.f457716g);
        se6Var.f467190e = com.p314xaae8f345.mm.vfs.w6.p(storyEditorProtoData.f457719m);
        java.util.LinkedList linkedList = storyEditorProtoData.D;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            se6Var.f467189d = com.p314xaae8f345.mm.vfs.w6.p(storyEditorProtoData.f457713d);
            se6Var.f467193h = "";
        } else {
            se6Var.f467189d = "";
            se6Var.f467193h = "";
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                se6Var.f467193h += com.p314xaae8f345.mm.vfs.w6.p((java.lang.String) it.next());
            }
        }
        if (lj.f.f(se6Var.f467189d)) {
            se6Var.f467189d = "";
        }
        se6Var.f467192g = com.p314xaae8f345.mm.vfs.w6.p(storyEditorProtoData.f457718i);
        return se6Var;
    }

    public final java.lang.String e(lt3.f0 videoMixer, java.util.List editorData, r45.on0 extraConfig, long j17, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMixer, "videoMixer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorData, "editorData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraConfig, "extraConfig");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            lt3.g gVar = new lt3.g();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(gVar.hashCode() & Integer.MAX_VALUE);
            sb6.append('#');
            sb6.append(currentTimeMillis);
            gVar.f68213x11522065 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(sb6.toString());
            gVar.f68214x9c2463f1 = currentTimeMillis;
            gVar.f68208x2277e5be = 0;
            gVar.f68200xeed4d673 = h(videoMixer, currentTimeMillis, editorData);
            gVar.f68210x10a0fed7 = 1;
            long j18 = 2592000000L;
            if (j17 <= 2592000000L) {
                j18 = j17;
            }
            gVar.f68202x663babcd = j18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1985xb098552e.C16989x37a4afe8 h17 = videoMixer.h();
            gVar.f68212xef0976f0 = h17.f237174d;
            gVar.f68211xd8566d3d = h17.f237175e;
            gVar.f68216xfd4dbd97 = h17.f237176f;
            gVar.f68197xa78549dc = h17.f237177g;
            gVar.f68199xf7a138db = h17.f237178h;
            gVar.f68198x89da6cbd = h17.f237179i;
            gVar.f68204xbb1b16e8 = h17.f237180m;
            gVar.f68217xa7eeadf1 = h17.f237181n;
            gVar.f68203xa1900fad = extraConfig.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 l17 = nu3.i.f421751a.l();
            l17.getClass();
            gVar.f68209x2c40a867 = new org.json.JSONObject(l17.f237222d).toString();
            gVar.f68215xdd97bba = a(ut3.f.f512709c.f512711b);
            gVar.f68201x490461b6 = str == null ? "" : str;
            gVar.f68205x9ebc75fd = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "insertRemuxTask:" + h17 + ", ret:" + f402794b.mo880xb970c2b9(gVar));
            lt3.e eVar = lt3.e.f402742a;
            java.lang.String field_taskId = gVar.f68213x11522065;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_taskId, "field_taskId");
            eVar.b(i17, field_taskId);
            return gVar.f68213x11522065;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.mix_background.VideoEditStorageUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final float[] f(r45.hi0 storyEditorProtoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyEditorProtoData, "storyEditorProtoData");
        return new float[]{storyEditorProtoData.f457724r, storyEditorProtoData.f457726t, storyEditorProtoData.f457725s, storyEditorProtoData.f457727u};
    }

    public final float[] g(r45.hi0 storyEditorProtoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyEditorProtoData, "storyEditorProtoData");
        return new float[]{storyEditorProtoData.F, storyEditorProtoData.H, storyEditorProtoData.G, storyEditorProtoData.I};
    }

    public final byte[] h(lt3.f0 f0Var, long j17, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "is running serialize the videoEditorInfo to bytearray");
        r45.hi0 hi0Var = new r45.hi0();
        mt3.a aVar = f0Var.f402745a;
        st3.f fVar = aVar.f412822a;
        float[] fArr = aVar.f412824c;
        float[] fArr2 = aVar.f412825d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "input the timeStamp is " + j17);
        if (fVar.f494071i == 3) {
            ls0.c1 c1Var = ls0.d1.f402349a;
            if (com.p314xaae8f345.mm.vfs.w6.j(c1Var.a(fVar.f494066d))) {
                hi0Var.f457716g = c1Var.a(fVar.f494066d);
            }
        }
        hi0Var.f457729w = j17;
        long j18 = fVar.f494068f;
        if (j18 == -1) {
            j18 = 0;
        }
        hi0Var.f457714e = j18;
        hi0Var.f457715f = fVar.f494069g;
        hi0Var.f457718i = fVar.f494067e;
        java.lang.String str = fVar.f494066d;
        hi0Var.f457713d = str;
        hi0Var.f457731y = fVar.f494070h;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true) != null) {
            long j19 = fVar.f494069g;
            if (j19 == -1 || j19 == 0) {
                hi0Var.f457715f = r0.f243915a;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(fVar.f494074o)) {
            hi0Var.f457715f = 15000;
        }
        long j27 = hi0Var.f457715f;
        hi0Var.f457715f = j27 > 0 ? j27 : 0L;
        hi0Var.D.addAll(fVar.f494074o);
        hi0Var.f457717h = fVar.f494071i;
        hi0Var.f457724r = (int) fArr[0];
        hi0Var.f457726t = (int) fArr[1];
        hi0Var.f457725s = (int) fArr[2];
        hi0Var.f457727u = (int) fArr[3];
        hi0Var.f457728v = new java.util.LinkedList();
        if (fArr2 != null) {
            hi0Var.F = (int) fArr2[0];
            hi0Var.H = (int) fArr2[1];
            hi0Var.G = (int) fArr2[2];
            hi0Var.I = (int) fArr2[3];
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = fVar.f494072m;
        if (c16997xb0aa383a != null) {
            hi0Var.f457719m = c16997xb0aa383a.f237248i;
            hi0Var.f457720n = c16997xb0aa383a.f237244e;
            hi0Var.f457721o = c16997xb0aa383a.f237245f;
            hi0Var.f457722p = c16997xb0aa383a.f237249m;
            hi0Var.f457723q = c16997xb0aa383a.f237250n;
            hi0Var.B = c16997xb0aa383a.f237259w;
            hi0Var.C = c16997xb0aa383a.f237260x;
        }
        hi0Var.A = f402793a.d(hi0Var);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zu3.a aVar2 = (zu3.a) it.next();
            r45.de deVar = new r45.de();
            deVar.f453871d = aVar2.f557291a.f557338d;
            deVar.f453872e = x51.j1.a(aVar2.mo179488xc3d7db06().mo14344x5f01b1f6());
            hi0Var.f457728v.add(deVar);
        }
        byte[] mo14344x5f01b1f6 = hi0Var.mo14344x5f01b1f6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoEditStorageUtil", "storyEditorItem " + hi0Var.f457713d + " thumb " + hi0Var.f457718i + " and result " + com.p314xaae8f345.mm.vfs.w6.j(hi0Var.f457718i) + " music " + hi0Var.f457719m + " ret " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(mo14344x5f01b1f6.length * 1) + '}');
        return mo14344x5f01b1f6;
    }
}
