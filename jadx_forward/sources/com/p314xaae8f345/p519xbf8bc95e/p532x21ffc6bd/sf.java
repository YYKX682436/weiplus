package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sf implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se {
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(byte[] bArr) {
        return (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(new java.lang.String(bArr), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em.class, new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar, java.lang.String str) {
        boolean z17 = elVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar2 = elVar;
        if (z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em emVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em) elVar;
            com.tencent.mapsdk.internal.el.a.C30897a.c cVar = (com.tencent.mapsdk.internal.el.a.C30897a.c) emVar.f130861a.f130827c.f130829b.get(0);
            java.lang.String str2 = str + "/model/";
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "# 2次处理数据缓存根目录: [" + str2 + "]");
            java.lang.String str3 = str2 + cVar.f130840i;
            java.io.File file = new java.io.File(str3, cVar.f130839h);
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "# 2次处理数据缓存目标文件: [" + file.getAbsolutePath() + "]");
            if (!file.exists()) {
                if (!android.text.TextUtils.isEmpty(cVar.f130835d) && !cVar.f130835d.equals("null")) {
                    cVar.f130834c = cVar.f130835d;
                }
                if (!android.text.TextUtils.isEmpty(cVar.f130836e) && !cVar.f130836e.equals("null")) {
                    cVar.f130834c = cVar.f130836e;
                }
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "2次处理数据请求url: [" + cVar.f130834c + "]");
                com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(cVar.f130834c).m35995x5b4bacb();
                if (m35995x5b4bacb.mo36017xd4418ac9()) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.f(new java.io.File(str2));
                    byte[] bArr = m35995x5b4bacb.f16977x2eefaa;
                    java.io.File file2 = new java.io.File(str2, cVar.f130838g + ".tmp");
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file2, bArr);
                    try {
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kv.a(new java.io.FileInputStream(file2), new java.io.File(str3));
                    } catch (java.lang.Exception unused) {
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("# 2次下载处理数据大小: {");
                    sb6.append(cVar.f130838g);
                    sb6.append("} [");
                    byte[] bArr2 = m35995x5b4bacb.f16977x2eefaa;
                    sb6.append(bArr2 != null ? bArr2.length : 0);
                    sb6.append("]");
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, sb6.toString());
                    ((com.tencent.mapsdk.internal.el.a.C30897a.c) emVar.f130861a.f130827c.f130829b.get(0)).f130831b = file.getAbsolutePath();
                    elVar2 = emVar;
                } else {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "2次处理数据请求失败");
                    ((com.tencent.mapsdk.internal.el.a.C30897a.c) emVar.f130861a.f130827c.f130829b.get(0)).f130831b = "";
                    elVar2 = emVar;
                }
            } else {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131757y, "2次处理数据已存在缓存中");
                ((com.tencent.mapsdk.internal.el.a.C30897a.c) emVar.f130861a.f130827c.f130829b.get(0)).f130831b = file.getAbsolutePath();
                elVar2 = emVar;
            }
        }
        return elVar2;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.se
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.el elVar) {
        if (!(elVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em) || !elVar.c()) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em emVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.em) elVar;
        com.tencent.mapsdk.internal.el.a.C30897a.c cVar = (com.tencent.mapsdk.internal.el.a.C30897a.c) emVar.f130861a.f130827c.f130829b.get(0);
        if (android.text.TextUtils.isEmpty(cVar.f130831b)) {
            return null;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130866a;
        com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d c4294x45fc1c7d = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d(cVar.f130831b, new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(c26041x873d1d26.f49501xaa2bac6c, c26041x873d1d26.f49502x83009af, c26041x873d1d26.f49500x79634aa2));
        java.util.List<java.lang.Double> list = emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130867b;
        if (list != null && list.size() == 3) {
            c4294x45fc1c7d.m35699xb588e09a(list.get(0).floatValue() + 90.0f).m35700xb588e09b(list.get(1).floatValue()).m35701xb588e09c(list.get(2).floatValue());
        }
        c4294x45fc1c7d.m35695xc187b75b(emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130871f);
        if (emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130869d) {
            c4294x45fc1c7d.m35679x191ebbcf(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.GeoGraphicType);
            c4294x45fc1c7d.m35702x683094a(emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130868c);
        } else {
            c4294x45fc1c7d.m35679x191ebbcf(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.PixelType);
            java.util.List<java.lang.Integer> list2 = emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130870e;
            if (list2 != null && list2.size() == 2) {
                c4294x45fc1c7d.m35697x9a2c38db(list2.get(0).intValue(), list2.get(1).intValue());
            }
        }
        int i17 = emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130872g.f130860a;
        if (i17 == 0) {
            c4294x45fc1c7d.m35678x440dddbb(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.AnimationType.None);
        } else if (i17 == 1) {
            c4294x45fc1c7d.m35678x440dddbb(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.AnimationType.FlattenRise);
        }
        c4294x45fc1c7d.m35705x3c61b89((float) emVar.f130861a.f130862a.f130863a.f130865a.f130874a.f130873h);
        com.tencent.mapsdk.internal.em.a.C30900a.C30901a c30901a = emVar.f130861a.f130862a.f130864b;
        c4294x45fc1c7d.m35708x61c4912a(c30901a.f130853k, c30901a.f130852j);
        c4294x45fc1c7d.mo35601xd4677478(emVar.f130861a.f130862a.f130864b.f130849g);
        c4294x45fc1c7d.mo35583x5f34bbe2(emVar.f130861a.f130862a.f130864b.f130848f);
        c4294x45fc1c7d.mo35596xb477f80b((float) emVar.f130861a.f130862a.f130864b.f130851i);
        c4294x45fc1c7d.mo35600x73b66312(!emVar.f130861a.f130862a.f130864b.f130850h);
        return c4294x45fc1c7d;
    }
}
