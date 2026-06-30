package j33;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final j33.s f378989a = new j33.s();

    /* renamed from: b, reason: collision with root package name */
    public static j33.r f378990b = j33.r.f378985d;

    public final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        if (!(mediaItem instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0)) {
            java.lang.String mOriginalPath = mediaItem.f219963e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mOriginalPath, "mOriginalPath");
            return mOriginalPath;
        }
        return mediaItem.f219963e + '_' + ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) mediaItem).A;
    }

    public final long b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 mediaItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaItem, "mediaItem");
        return mediaItem instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0) mediaItem).A == 1 ? com.p314xaae8f345.mm.vfs.w6.k(mediaItem.f219963e) + com.p314xaae8f345.mm.vfs.w6.k(mediaItem.f219966h) : com.p314xaae8f345.mm.vfs.w6.k(mediaItem.f219966h) : com.p314xaae8f345.mm.vfs.w6.k(mediaItem.f219963e);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (d17 == null) {
            d17 = new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b();
        }
        if (d17.f243918d <= 0 || d17.f243917c <= 0) {
            try {
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                d17.f243917c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(18), 0);
                d17.f243918d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(19), 0);
                d17.f243916b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(20), 0);
                d17.f243915a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mediaMetadataRetriever.extractMetadata(9), 0);
                mediaMetadataRetriever.release();
            } catch (java.lang.Exception unused) {
            }
        }
        int m69179x9787f6ed = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaUtil", "width %d, height %d, rotate %d", java.lang.Integer.valueOf(d17.f243917c), java.lang.Integer.valueOf(d17.f243918d), java.lang.Integer.valueOf(m69179x9787f6ed));
        if (m69179x9787f6ed == 90 || m69179x9787f6ed == 270) {
            int i17 = d17.f243918d;
            d17.f243918d = d17.f243917c;
            d17.f243917c = i17;
        }
        return d17;
    }

    public final jz5.l d(java.lang.String str) {
        int i17;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        gp.d dVar = new gp.d();
        try {
            dVar.setDataSource(str);
            java.lang.String extractMetadata = dVar.extractMetadata(23);
            dVar.release();
            if (!android.text.TextUtils.isEmpty(extractMetadata)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(extractMetadata);
                char[] charArray = extractMetadata.toCharArray();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (char c17 : charArray) {
                    if (c17 != '+' && c17 != '-' && c17 != '.') {
                        i17 = android.text.TextUtils.isDigitsOnly(c17 + "") ? 0 : i17 + 1;
                    }
                    sb6.append(c17);
                }
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                int O = r26.n0.O(sb7, '+', 0, false, 6, null);
                if (-1 == O) {
                    O = r26.n0.O(sb7, '-', 0, false, 6, null);
                }
                java.lang.String substring = sb7.substring(0, O);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                double parseDouble = java.lang.Double.parseDouble(substring);
                java.lang.String substring2 = sb7.substring(O);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                return new jz5.l(java.lang.Double.valueOf(parseDouble), java.lang.Double.valueOf(java.lang.Double.parseDouble(substring2)));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public final boolean e(java.lang.String dirPath, java.util.List targetNameList, java.util.Map cacheResult) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetNameList, "targetNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheResult, "cacheResult");
        java.util.Set set = (java.util.Set) cacheResult.get(dirPath);
        java.lang.Object obj2 = null;
        if (set != null) {
            java.util.Iterator it = targetNameList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (set.contains((java.lang.String) obj)) {
                    break;
                }
            }
            java.lang.String str = (java.lang.String) obj;
            if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(targetNameList, 10));
        java.util.Iterator it6 = targetNameList.iterator();
        while (it6.hasNext()) {
            arrayList.add(new r26.t((java.lang.String) it6.next()));
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next = it7.next();
            if (((r26.t) next).a(dirPath)) {
                obj2 = next;
                break;
            }
        }
        r26.t tVar = (r26.t) obj2;
        java.lang.String valueOf = java.lang.String.valueOf(tVar);
        if (tVar != null) {
            if (!cacheResult.containsKey(dirPath)) {
                cacheResult.put(dirPath, new java.util.LinkedHashSet());
            }
            java.util.Set set2 = (java.util.Set) cacheResult.get(dirPath);
            if (set2 != null) {
                set2.add(valueOf);
            }
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(java.lang.String.valueOf(tVar));
    }

    public final boolean f(java.lang.String tempPath, java.io.FileDescriptor fileDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tempPath, "tempPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileDescriptor, "fileDescriptor");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileDescriptor);
        com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(tempPath)));
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        fileInputStream.close();
                        y6Var.close();
                        return true;
                    }
                    y6Var.write(bArr, 0, read);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaUtil", "saveFdToPath exception:" + e17.getMessage());
                fileInputStream.close();
                y6Var.close();
                return false;
            }
        } catch (java.lang.Throwable th6) {
            fileInputStream.close();
            y6Var.close();
            throw th6;
        }
    }
}
